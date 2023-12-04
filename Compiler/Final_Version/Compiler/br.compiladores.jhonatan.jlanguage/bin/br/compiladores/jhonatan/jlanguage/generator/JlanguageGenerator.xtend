/*
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import br.compiladores.jhonatan.jlanguage.jlanguage.Programa
import br.compiladores.jhonatan.jlanguage.jlanguage.Declaracao
import br.compiladores.jhonatan.jlanguage.jlanguage.ComandoAtibuicao
import br.compiladores.jhonatan.jlanguage.jlanguage.ComandoEntrada
import br.compiladores.jhonatan.jlanguage.jlanguage.ComandoSaida
import br.compiladores.jhonatan.jlanguage.jlanguage.Funcao
import br.compiladores.jhonatan.jlanguage.jlanguage.ComandoCondicao
import br.compiladores.jhonatan.jlanguage.jlanguage.ComandoRepeticao
import br.compiladores.jhonatan.jlanguage.jlanguage.ComandoSubAlgoritmo
import br.compiladores.jhonatan.jlanguage.jlanguage.ExpressaoAritmetica
import org.eclipse.xtend2.lib.StringConcatenation
import br.compiladores.jhonatan.jlanguage.jlanguage.TermoAritmetico
import br.compiladores.jhonatan.jlanguage.jlanguage.FatorNumero
import br.compiladores.jhonatan.jlanguage.jlanguage.FatorVariavel
import br.compiladores.jhonatan.jlanguage.jlanguage.FatorSubExpressao
import br.compiladores.jhonatan.jlanguage.jlanguage.ExpressaoRelacional
import br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional
import br.compiladores.jhonatan.jlanguage.jlanguage.TermoSubExpressaoRelacional

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JlanguageGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(p: resource.allContents.toIterable.filter(Programa)){
			fsa.generateFile("Programa.java", p.compilePrograma)
		}
	}
	
	def compilePrograma(Programa p) '''
		public class Programa{
			«FOR d:p.declaracoes»
			static «getTipo(d)» «d.name»;
			«ENDFOR»
			
			public static void main(String args[]){
				«FOR c : p.comandos»
					«c.compileComando»
				«ENDFOR»
			}
		}
	'''
	
	def getTipo(Declaracao d){
		if(d.tipo == "REAL") return "double";
		if(d.tipo == "TEXTO") return "string";
		if(d.tipo == "BOOLEANO") return "boolean";
		return "int";
	}
	
	def dispatch compileComando(ComandoAtibuicao c)'''
		«c.variavel.name» = «c.exp.compileExpressao»;
	'''
	
	def dispatch compileComando(ComandoEntrada c)'''
		«IF c.variavel.tipo == "INTEIRO"»
			«c.variavel.name» = Integer.parseInt(System.console().readLine());
		«ELSEIF c.variavel.tipo == "REAL"»
			«c.variavel.name» = Double.parseDouble(System.console().readLine());
		«ELSEIF c.variavel.tipo == "TEXTO"»
			«c.variavel.name» = System.console().readLine();
		«ELSEIF c.variavel.tipo == "BOOLEANO"»
			«c.variavel.name» = Boolean.parseBoolean(System.console().readLine());
		«ENDIF»
	'''
	
	def dispatch compileComando(ComandoSaida c)'''
		System.out.println(«c.variavel.name»);
	'''
	
	def dispatch compileComando(ComandoCondicao c)'''
		if(«c.exp.compileExpressaoRelacional») «c.cmd1.compileComando»
		«IF c.cmd2 !== null»else «c.cmd2.compileComando»«ENDIF»
	'''
	
	def dispatch compileComando(ComandoRepeticao c)'''
		while(«c.exp.compileExpressaoRelacional») «c.cmd.compileComando»
	'''
	
	def dispatch compileComando(ComandoSubAlgoritmo cs)'''
		{
			«FOR c:cs.comandos»
				«c.compileComando»
			«ENDFOR»
		}
	'''
	
	def compileExpressao(ExpressaoAritmetica e){
		val ret = new StringConcatenation
		
		ret.append(e.termo1.compileTermo)
		e.outrosTermos.forEach[ot | 
			ret.append(" "+ot.operador+" "+ot.termo.compileTermo)
		]
		
		return ret
	}
	
	def compileTermo(TermoAritmetico t){
		val ret = new StringConcatenation
		
		ret.append(t.fator1.compileFator)
		t.outrosFatores.forEach[of | 
			ret.append(" "+of.operador+" "+of.fator.compileFator)
		]
		
		return ret
	}
	
	def dispatch compileFator(FatorNumero fn)'''«fn.numero»'''
	def dispatch compileFator(FatorVariavel fv)'''«fv.variavel.name»'''
	def dispatch compileFator(FatorSubExpressao fse)'''«fse.expressao.compileExpressao»'''
	
	def compileExpressaoRelacional(ExpressaoRelacional e){
		val ret = new StringConcatenation
		
		ret.append(e.termo1.compileTermoRelacional)
		e.outrosTermos.forEach[ot | 
			ret.append(" "+ot.operador.compileOperadorBooleno+" "+ ot.termo.compileTermoRelacional)
		]
		
		return ret
	}
		
	
	def compileOperadorBooleno(String s){
		if(s == "E") return "&&"
		else return "||"
	}
	
	def dispatch compileTermoRelacional(TermoComparacaoRelacional tcr){
		return tcr.expr1.compileExpressao + " " + tcr.opRel.compileOperadorRelacional + " " + tcr.expr2.compileExpressao
	}
	
	def dispatch compileTermoRelacional(TermoSubExpressaoRelacional tser)'''(«tser.expRel»)'''
	
	def compileOperadorRelacional(String s){
		if(s == "<") return "<"
		else if(s == "<=") return "<="
		else if(s == ">") return ">"
		else if(s == ">=") return ">="
		else if(s == "<>") return "!=" 
		else if(s == "=") return "=="
	}
}
