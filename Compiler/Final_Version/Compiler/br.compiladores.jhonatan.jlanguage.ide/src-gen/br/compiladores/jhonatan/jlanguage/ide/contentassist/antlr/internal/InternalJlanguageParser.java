package br.compiladores.jhonatan.jlanguage.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.compiladores.jhonatan.jlanguage.services.JlanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJlanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INTEIRO'", "'REAL'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'<>'", "'='", "'E'", "'OU'", "':'", "'DECLARACOES'", "'ALGORITMO'", "'('", "')'", "'['", "']'", "'ATRIBUIR'", "'A'", "'LER'", "'IMPRIMIR'", "'SE'", "'ENTAO'", "'SENAO'", "'ENQUANTO'", "'INICIO'", "'FIM'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJlanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJlanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJlanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJlanguage.g"; }


    	private JlanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(JlanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePrograma"
    // InternalJlanguage.g:53:1: entryRulePrograma : rulePrograma EOF ;
    public final void entryRulePrograma() throws RecognitionException {
        try {
            // InternalJlanguage.g:54:1: ( rulePrograma EOF )
            // InternalJlanguage.g:55:1: rulePrograma EOF
            {
             before(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_1);
            rulePrograma();

            state._fsp--;

             after(grammarAccess.getProgramaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // InternalJlanguage.g:62:1: rulePrograma : ( ( rule__Programa__Group__0 ) ) ;
    public final void rulePrograma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:66:2: ( ( ( rule__Programa__Group__0 ) ) )
            // InternalJlanguage.g:67:2: ( ( rule__Programa__Group__0 ) )
            {
            // InternalJlanguage.g:67:2: ( ( rule__Programa__Group__0 ) )
            // InternalJlanguage.g:68:3: ( rule__Programa__Group__0 )
            {
             before(grammarAccess.getProgramaAccess().getGroup()); 
            // InternalJlanguage.g:69:3: ( rule__Programa__Group__0 )
            // InternalJlanguage.g:69:4: rule__Programa__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Programa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleDeclaracao"
    // InternalJlanguage.g:78:1: entryRuleDeclaracao : ruleDeclaracao EOF ;
    public final void entryRuleDeclaracao() throws RecognitionException {
        try {
            // InternalJlanguage.g:79:1: ( ruleDeclaracao EOF )
            // InternalJlanguage.g:80:1: ruleDeclaracao EOF
            {
             before(grammarAccess.getDeclaracaoRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaracao();

            state._fsp--;

             after(grammarAccess.getDeclaracaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaracao"


    // $ANTLR start "ruleDeclaracao"
    // InternalJlanguage.g:87:1: ruleDeclaracao : ( ( rule__Declaracao__Group__0 ) ) ;
    public final void ruleDeclaracao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:91:2: ( ( ( rule__Declaracao__Group__0 ) ) )
            // InternalJlanguage.g:92:2: ( ( rule__Declaracao__Group__0 ) )
            {
            // InternalJlanguage.g:92:2: ( ( rule__Declaracao__Group__0 ) )
            // InternalJlanguage.g:93:3: ( rule__Declaracao__Group__0 )
            {
             before(grammarAccess.getDeclaracaoAccess().getGroup()); 
            // InternalJlanguage.g:94:3: ( rule__Declaracao__Group__0 )
            // InternalJlanguage.g:94:4: rule__Declaracao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaracao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaracao"


    // $ANTLR start "entryRuleExpressaoAritmetica"
    // InternalJlanguage.g:103:1: entryRuleExpressaoAritmetica : ruleExpressaoAritmetica EOF ;
    public final void entryRuleExpressaoAritmetica() throws RecognitionException {
        try {
            // InternalJlanguage.g:104:1: ( ruleExpressaoAritmetica EOF )
            // InternalJlanguage.g:105:1: ruleExpressaoAritmetica EOF
            {
             before(grammarAccess.getExpressaoAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getExpressaoAritmeticaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressaoAritmetica"


    // $ANTLR start "ruleExpressaoAritmetica"
    // InternalJlanguage.g:112:1: ruleExpressaoAritmetica : ( ( rule__ExpressaoAritmetica__Group__0 ) ) ;
    public final void ruleExpressaoAritmetica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:116:2: ( ( ( rule__ExpressaoAritmetica__Group__0 ) ) )
            // InternalJlanguage.g:117:2: ( ( rule__ExpressaoAritmetica__Group__0 ) )
            {
            // InternalJlanguage.g:117:2: ( ( rule__ExpressaoAritmetica__Group__0 ) )
            // InternalJlanguage.g:118:3: ( rule__ExpressaoAritmetica__Group__0 )
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getGroup()); 
            // InternalJlanguage.g:119:3: ( rule__ExpressaoAritmetica__Group__0 )
            // InternalJlanguage.g:119:4: rule__ExpressaoAritmetica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoAritmetica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAritmeticaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressaoAritmetica"


    // $ANTLR start "entryRuleOutroTermoAritmetico"
    // InternalJlanguage.g:128:1: entryRuleOutroTermoAritmetico : ruleOutroTermoAritmetico EOF ;
    public final void entryRuleOutroTermoAritmetico() throws RecognitionException {
        try {
            // InternalJlanguage.g:129:1: ( ruleOutroTermoAritmetico EOF )
            // InternalJlanguage.g:130:1: ruleOutroTermoAritmetico EOF
            {
             before(grammarAccess.getOutroTermoAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            ruleOutroTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getOutroTermoAritmeticoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutroTermoAritmetico"


    // $ANTLR start "ruleOutroTermoAritmetico"
    // InternalJlanguage.g:137:1: ruleOutroTermoAritmetico : ( ( rule__OutroTermoAritmetico__Group__0 ) ) ;
    public final void ruleOutroTermoAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:141:2: ( ( ( rule__OutroTermoAritmetico__Group__0 ) ) )
            // InternalJlanguage.g:142:2: ( ( rule__OutroTermoAritmetico__Group__0 ) )
            {
            // InternalJlanguage.g:142:2: ( ( rule__OutroTermoAritmetico__Group__0 ) )
            // InternalJlanguage.g:143:3: ( rule__OutroTermoAritmetico__Group__0 )
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getGroup()); 
            // InternalJlanguage.g:144:3: ( rule__OutroTermoAritmetico__Group__0 )
            // InternalJlanguage.g:144:4: rule__OutroTermoAritmetico__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutroTermoAritmeticoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutroTermoAritmetico"


    // $ANTLR start "entryRuleTermoAritmetico"
    // InternalJlanguage.g:153:1: entryRuleTermoAritmetico : ruleTermoAritmetico EOF ;
    public final void entryRuleTermoAritmetico() throws RecognitionException {
        try {
            // InternalJlanguage.g:154:1: ( ruleTermoAritmetico EOF )
            // InternalJlanguage.g:155:1: ruleTermoAritmetico EOF
            {
             before(grammarAccess.getTermoAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            ruleTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getTermoAritmeticoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermoAritmetico"


    // $ANTLR start "ruleTermoAritmetico"
    // InternalJlanguage.g:162:1: ruleTermoAritmetico : ( ( rule__TermoAritmetico__Group__0 ) ) ;
    public final void ruleTermoAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:166:2: ( ( ( rule__TermoAritmetico__Group__0 ) ) )
            // InternalJlanguage.g:167:2: ( ( rule__TermoAritmetico__Group__0 ) )
            {
            // InternalJlanguage.g:167:2: ( ( rule__TermoAritmetico__Group__0 ) )
            // InternalJlanguage.g:168:3: ( rule__TermoAritmetico__Group__0 )
            {
             before(grammarAccess.getTermoAritmeticoAccess().getGroup()); 
            // InternalJlanguage.g:169:3: ( rule__TermoAritmetico__Group__0 )
            // InternalJlanguage.g:169:4: rule__TermoAritmetico__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermoAritmetico__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermoAritmeticoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermoAritmetico"


    // $ANTLR start "entryRuleOutroFatorAritmetico"
    // InternalJlanguage.g:178:1: entryRuleOutroFatorAritmetico : ruleOutroFatorAritmetico EOF ;
    public final void entryRuleOutroFatorAritmetico() throws RecognitionException {
        try {
            // InternalJlanguage.g:179:1: ( ruleOutroFatorAritmetico EOF )
            // InternalJlanguage.g:180:1: ruleOutroFatorAritmetico EOF
            {
             before(grammarAccess.getOutroFatorAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            ruleOutroFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getOutroFatorAritmeticoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutroFatorAritmetico"


    // $ANTLR start "ruleOutroFatorAritmetico"
    // InternalJlanguage.g:187:1: ruleOutroFatorAritmetico : ( ( rule__OutroFatorAritmetico__Group__0 ) ) ;
    public final void ruleOutroFatorAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:191:2: ( ( ( rule__OutroFatorAritmetico__Group__0 ) ) )
            // InternalJlanguage.g:192:2: ( ( rule__OutroFatorAritmetico__Group__0 ) )
            {
            // InternalJlanguage.g:192:2: ( ( rule__OutroFatorAritmetico__Group__0 ) )
            // InternalJlanguage.g:193:3: ( rule__OutroFatorAritmetico__Group__0 )
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getGroup()); 
            // InternalJlanguage.g:194:3: ( rule__OutroFatorAritmetico__Group__0 )
            // InternalJlanguage.g:194:4: rule__OutroFatorAritmetico__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutroFatorAritmeticoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutroFatorAritmetico"


    // $ANTLR start "entryRuleFatorAritmetico"
    // InternalJlanguage.g:203:1: entryRuleFatorAritmetico : ruleFatorAritmetico EOF ;
    public final void entryRuleFatorAritmetico() throws RecognitionException {
        try {
            // InternalJlanguage.g:204:1: ( ruleFatorAritmetico EOF )
            // InternalJlanguage.g:205:1: ruleFatorAritmetico EOF
            {
             before(grammarAccess.getFatorAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            ruleFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getFatorAritmeticoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFatorAritmetico"


    // $ANTLR start "ruleFatorAritmetico"
    // InternalJlanguage.g:212:1: ruleFatorAritmetico : ( ( rule__FatorAritmetico__Alternatives ) ) ;
    public final void ruleFatorAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:216:2: ( ( ( rule__FatorAritmetico__Alternatives ) ) )
            // InternalJlanguage.g:217:2: ( ( rule__FatorAritmetico__Alternatives ) )
            {
            // InternalJlanguage.g:217:2: ( ( rule__FatorAritmetico__Alternatives ) )
            // InternalJlanguage.g:218:3: ( rule__FatorAritmetico__Alternatives )
            {
             before(grammarAccess.getFatorAritmeticoAccess().getAlternatives()); 
            // InternalJlanguage.g:219:3: ( rule__FatorAritmetico__Alternatives )
            // InternalJlanguage.g:219:4: rule__FatorAritmetico__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FatorAritmetico__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFatorAritmeticoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFatorAritmetico"


    // $ANTLR start "entryRuleFatorNumero"
    // InternalJlanguage.g:228:1: entryRuleFatorNumero : ruleFatorNumero EOF ;
    public final void entryRuleFatorNumero() throws RecognitionException {
        try {
            // InternalJlanguage.g:229:1: ( ruleFatorNumero EOF )
            // InternalJlanguage.g:230:1: ruleFatorNumero EOF
            {
             before(grammarAccess.getFatorNumeroRule()); 
            pushFollow(FOLLOW_1);
            ruleFatorNumero();

            state._fsp--;

             after(grammarAccess.getFatorNumeroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFatorNumero"


    // $ANTLR start "ruleFatorNumero"
    // InternalJlanguage.g:237:1: ruleFatorNumero : ( ( rule__FatorNumero__NumeroAssignment ) ) ;
    public final void ruleFatorNumero() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:241:2: ( ( ( rule__FatorNumero__NumeroAssignment ) ) )
            // InternalJlanguage.g:242:2: ( ( rule__FatorNumero__NumeroAssignment ) )
            {
            // InternalJlanguage.g:242:2: ( ( rule__FatorNumero__NumeroAssignment ) )
            // InternalJlanguage.g:243:3: ( rule__FatorNumero__NumeroAssignment )
            {
             before(grammarAccess.getFatorNumeroAccess().getNumeroAssignment()); 
            // InternalJlanguage.g:244:3: ( rule__FatorNumero__NumeroAssignment )
            // InternalJlanguage.g:244:4: rule__FatorNumero__NumeroAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FatorNumero__NumeroAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFatorNumeroAccess().getNumeroAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFatorNumero"


    // $ANTLR start "entryRuleFatorVariavel"
    // InternalJlanguage.g:253:1: entryRuleFatorVariavel : ruleFatorVariavel EOF ;
    public final void entryRuleFatorVariavel() throws RecognitionException {
        try {
            // InternalJlanguage.g:254:1: ( ruleFatorVariavel EOF )
            // InternalJlanguage.g:255:1: ruleFatorVariavel EOF
            {
             before(grammarAccess.getFatorVariavelRule()); 
            pushFollow(FOLLOW_1);
            ruleFatorVariavel();

            state._fsp--;

             after(grammarAccess.getFatorVariavelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFatorVariavel"


    // $ANTLR start "ruleFatorVariavel"
    // InternalJlanguage.g:262:1: ruleFatorVariavel : ( ( rule__FatorVariavel__VariavelAssignment ) ) ;
    public final void ruleFatorVariavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:266:2: ( ( ( rule__FatorVariavel__VariavelAssignment ) ) )
            // InternalJlanguage.g:267:2: ( ( rule__FatorVariavel__VariavelAssignment ) )
            {
            // InternalJlanguage.g:267:2: ( ( rule__FatorVariavel__VariavelAssignment ) )
            // InternalJlanguage.g:268:3: ( rule__FatorVariavel__VariavelAssignment )
            {
             before(grammarAccess.getFatorVariavelAccess().getVariavelAssignment()); 
            // InternalJlanguage.g:269:3: ( rule__FatorVariavel__VariavelAssignment )
            // InternalJlanguage.g:269:4: rule__FatorVariavel__VariavelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FatorVariavel__VariavelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFatorVariavelAccess().getVariavelAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFatorVariavel"


    // $ANTLR start "entryRuleFatorSubExpressao"
    // InternalJlanguage.g:278:1: entryRuleFatorSubExpressao : ruleFatorSubExpressao EOF ;
    public final void entryRuleFatorSubExpressao() throws RecognitionException {
        try {
            // InternalJlanguage.g:279:1: ( ruleFatorSubExpressao EOF )
            // InternalJlanguage.g:280:1: ruleFatorSubExpressao EOF
            {
             before(grammarAccess.getFatorSubExpressaoRule()); 
            pushFollow(FOLLOW_1);
            ruleFatorSubExpressao();

            state._fsp--;

             after(grammarAccess.getFatorSubExpressaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFatorSubExpressao"


    // $ANTLR start "ruleFatorSubExpressao"
    // InternalJlanguage.g:287:1: ruleFatorSubExpressao : ( ( rule__FatorSubExpressao__Group__0 ) ) ;
    public final void ruleFatorSubExpressao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:291:2: ( ( ( rule__FatorSubExpressao__Group__0 ) ) )
            // InternalJlanguage.g:292:2: ( ( rule__FatorSubExpressao__Group__0 ) )
            {
            // InternalJlanguage.g:292:2: ( ( rule__FatorSubExpressao__Group__0 ) )
            // InternalJlanguage.g:293:3: ( rule__FatorSubExpressao__Group__0 )
            {
             before(grammarAccess.getFatorSubExpressaoAccess().getGroup()); 
            // InternalJlanguage.g:294:3: ( rule__FatorSubExpressao__Group__0 )
            // InternalJlanguage.g:294:4: rule__FatorSubExpressao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FatorSubExpressao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFatorSubExpressaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFatorSubExpressao"


    // $ANTLR start "entryRuleExpressaoRelacional"
    // InternalJlanguage.g:303:1: entryRuleExpressaoRelacional : ruleExpressaoRelacional EOF ;
    public final void entryRuleExpressaoRelacional() throws RecognitionException {
        try {
            // InternalJlanguage.g:304:1: ( ruleExpressaoRelacional EOF )
            // InternalJlanguage.g:305:1: ruleExpressaoRelacional EOF
            {
             before(grammarAccess.getExpressaoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressaoRelacional();

            state._fsp--;

             after(grammarAccess.getExpressaoRelacionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressaoRelacional"


    // $ANTLR start "ruleExpressaoRelacional"
    // InternalJlanguage.g:312:1: ruleExpressaoRelacional : ( ( rule__ExpressaoRelacional__Group__0 ) ) ;
    public final void ruleExpressaoRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:316:2: ( ( ( rule__ExpressaoRelacional__Group__0 ) ) )
            // InternalJlanguage.g:317:2: ( ( rule__ExpressaoRelacional__Group__0 ) )
            {
            // InternalJlanguage.g:317:2: ( ( rule__ExpressaoRelacional__Group__0 ) )
            // InternalJlanguage.g:318:3: ( rule__ExpressaoRelacional__Group__0 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getGroup()); 
            // InternalJlanguage.g:319:3: ( rule__ExpressaoRelacional__Group__0 )
            // InternalJlanguage.g:319:4: rule__ExpressaoRelacional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoRelacionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressaoRelacional"


    // $ANTLR start "entryRuleOutroTermoRelacional"
    // InternalJlanguage.g:328:1: entryRuleOutroTermoRelacional : ruleOutroTermoRelacional EOF ;
    public final void entryRuleOutroTermoRelacional() throws RecognitionException {
        try {
            // InternalJlanguage.g:329:1: ( ruleOutroTermoRelacional EOF )
            // InternalJlanguage.g:330:1: ruleOutroTermoRelacional EOF
            {
             before(grammarAccess.getOutroTermoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            ruleOutroTermoRelacional();

            state._fsp--;

             after(grammarAccess.getOutroTermoRelacionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutroTermoRelacional"


    // $ANTLR start "ruleOutroTermoRelacional"
    // InternalJlanguage.g:337:1: ruleOutroTermoRelacional : ( ( rule__OutroTermoRelacional__Group__0 ) ) ;
    public final void ruleOutroTermoRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:341:2: ( ( ( rule__OutroTermoRelacional__Group__0 ) ) )
            // InternalJlanguage.g:342:2: ( ( rule__OutroTermoRelacional__Group__0 ) )
            {
            // InternalJlanguage.g:342:2: ( ( rule__OutroTermoRelacional__Group__0 ) )
            // InternalJlanguage.g:343:3: ( rule__OutroTermoRelacional__Group__0 )
            {
             before(grammarAccess.getOutroTermoRelacionalAccess().getGroup()); 
            // InternalJlanguage.g:344:3: ( rule__OutroTermoRelacional__Group__0 )
            // InternalJlanguage.g:344:4: rule__OutroTermoRelacional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoRelacional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutroTermoRelacionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutroTermoRelacional"


    // $ANTLR start "entryRuleTermoRelacional"
    // InternalJlanguage.g:353:1: entryRuleTermoRelacional : ruleTermoRelacional EOF ;
    public final void entryRuleTermoRelacional() throws RecognitionException {
        try {
            // InternalJlanguage.g:354:1: ( ruleTermoRelacional EOF )
            // InternalJlanguage.g:355:1: ruleTermoRelacional EOF
            {
             before(grammarAccess.getTermoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            ruleTermoRelacional();

            state._fsp--;

             after(grammarAccess.getTermoRelacionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermoRelacional"


    // $ANTLR start "ruleTermoRelacional"
    // InternalJlanguage.g:362:1: ruleTermoRelacional : ( ( rule__TermoRelacional__Alternatives ) ) ;
    public final void ruleTermoRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:366:2: ( ( ( rule__TermoRelacional__Alternatives ) ) )
            // InternalJlanguage.g:367:2: ( ( rule__TermoRelacional__Alternatives ) )
            {
            // InternalJlanguage.g:367:2: ( ( rule__TermoRelacional__Alternatives ) )
            // InternalJlanguage.g:368:3: ( rule__TermoRelacional__Alternatives )
            {
             before(grammarAccess.getTermoRelacionalAccess().getAlternatives()); 
            // InternalJlanguage.g:369:3: ( rule__TermoRelacional__Alternatives )
            // InternalJlanguage.g:369:4: rule__TermoRelacional__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TermoRelacional__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermoRelacionalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermoRelacional"


    // $ANTLR start "entryRuleTermoComparacaoRelacional"
    // InternalJlanguage.g:378:1: entryRuleTermoComparacaoRelacional : ruleTermoComparacaoRelacional EOF ;
    public final void entryRuleTermoComparacaoRelacional() throws RecognitionException {
        try {
            // InternalJlanguage.g:379:1: ( ruleTermoComparacaoRelacional EOF )
            // InternalJlanguage.g:380:1: ruleTermoComparacaoRelacional EOF
            {
             before(grammarAccess.getTermoComparacaoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            ruleTermoComparacaoRelacional();

            state._fsp--;

             after(grammarAccess.getTermoComparacaoRelacionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermoComparacaoRelacional"


    // $ANTLR start "ruleTermoComparacaoRelacional"
    // InternalJlanguage.g:387:1: ruleTermoComparacaoRelacional : ( ( rule__TermoComparacaoRelacional__Group__0 ) ) ;
    public final void ruleTermoComparacaoRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:391:2: ( ( ( rule__TermoComparacaoRelacional__Group__0 ) ) )
            // InternalJlanguage.g:392:2: ( ( rule__TermoComparacaoRelacional__Group__0 ) )
            {
            // InternalJlanguage.g:392:2: ( ( rule__TermoComparacaoRelacional__Group__0 ) )
            // InternalJlanguage.g:393:3: ( rule__TermoComparacaoRelacional__Group__0 )
            {
             before(grammarAccess.getTermoComparacaoRelacionalAccess().getGroup()); 
            // InternalJlanguage.g:394:3: ( rule__TermoComparacaoRelacional__Group__0 )
            // InternalJlanguage.g:394:4: rule__TermoComparacaoRelacional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermoComparacaoRelacional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermoComparacaoRelacionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermoComparacaoRelacional"


    // $ANTLR start "entryRuleTermoSubExpressaoRelacional"
    // InternalJlanguage.g:403:1: entryRuleTermoSubExpressaoRelacional : ruleTermoSubExpressaoRelacional EOF ;
    public final void entryRuleTermoSubExpressaoRelacional() throws RecognitionException {
        try {
            // InternalJlanguage.g:404:1: ( ruleTermoSubExpressaoRelacional EOF )
            // InternalJlanguage.g:405:1: ruleTermoSubExpressaoRelacional EOF
            {
             before(grammarAccess.getTermoSubExpressaoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            ruleTermoSubExpressaoRelacional();

            state._fsp--;

             after(grammarAccess.getTermoSubExpressaoRelacionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermoSubExpressaoRelacional"


    // $ANTLR start "ruleTermoSubExpressaoRelacional"
    // InternalJlanguage.g:412:1: ruleTermoSubExpressaoRelacional : ( ( rule__TermoSubExpressaoRelacional__Group__0 ) ) ;
    public final void ruleTermoSubExpressaoRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:416:2: ( ( ( rule__TermoSubExpressaoRelacional__Group__0 ) ) )
            // InternalJlanguage.g:417:2: ( ( rule__TermoSubExpressaoRelacional__Group__0 ) )
            {
            // InternalJlanguage.g:417:2: ( ( rule__TermoSubExpressaoRelacional__Group__0 ) )
            // InternalJlanguage.g:418:3: ( rule__TermoSubExpressaoRelacional__Group__0 )
            {
             before(grammarAccess.getTermoSubExpressaoRelacionalAccess().getGroup()); 
            // InternalJlanguage.g:419:3: ( rule__TermoSubExpressaoRelacional__Group__0 )
            // InternalJlanguage.g:419:4: rule__TermoSubExpressaoRelacional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermoSubExpressaoRelacional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermoSubExpressaoRelacionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermoSubExpressaoRelacional"


    // $ANTLR start "entryRuleComando"
    // InternalJlanguage.g:428:1: entryRuleComando : ruleComando EOF ;
    public final void entryRuleComando() throws RecognitionException {
        try {
            // InternalJlanguage.g:429:1: ( ruleComando EOF )
            // InternalJlanguage.g:430:1: ruleComando EOF
            {
             before(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalJlanguage.g:437:1: ruleComando : ( ( rule__Comando__Alternatives ) ) ;
    public final void ruleComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:441:2: ( ( ( rule__Comando__Alternatives ) ) )
            // InternalJlanguage.g:442:2: ( ( rule__Comando__Alternatives ) )
            {
            // InternalJlanguage.g:442:2: ( ( rule__Comando__Alternatives ) )
            // InternalJlanguage.g:443:3: ( rule__Comando__Alternatives )
            {
             before(grammarAccess.getComandoAccess().getAlternatives()); 
            // InternalJlanguage.g:444:3: ( rule__Comando__Alternatives )
            // InternalJlanguage.g:444:4: rule__Comando__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comando__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComandoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleComandoAtibuicao"
    // InternalJlanguage.g:453:1: entryRuleComandoAtibuicao : ruleComandoAtibuicao EOF ;
    public final void entryRuleComandoAtibuicao() throws RecognitionException {
        try {
            // InternalJlanguage.g:454:1: ( ruleComandoAtibuicao EOF )
            // InternalJlanguage.g:455:1: ruleComandoAtibuicao EOF
            {
             before(grammarAccess.getComandoAtibuicaoRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoAtibuicao();

            state._fsp--;

             after(grammarAccess.getComandoAtibuicaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComandoAtibuicao"


    // $ANTLR start "ruleComandoAtibuicao"
    // InternalJlanguage.g:462:1: ruleComandoAtibuicao : ( ( rule__ComandoAtibuicao__Group__0 ) ) ;
    public final void ruleComandoAtibuicao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:466:2: ( ( ( rule__ComandoAtibuicao__Group__0 ) ) )
            // InternalJlanguage.g:467:2: ( ( rule__ComandoAtibuicao__Group__0 ) )
            {
            // InternalJlanguage.g:467:2: ( ( rule__ComandoAtibuicao__Group__0 ) )
            // InternalJlanguage.g:468:3: ( rule__ComandoAtibuicao__Group__0 )
            {
             before(grammarAccess.getComandoAtibuicaoAccess().getGroup()); 
            // InternalJlanguage.g:469:3: ( rule__ComandoAtibuicao__Group__0 )
            // InternalJlanguage.g:469:4: rule__ComandoAtibuicao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoAtibuicao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoAtibuicaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoAtibuicao"


    // $ANTLR start "entryRuleComandoEntrada"
    // InternalJlanguage.g:478:1: entryRuleComandoEntrada : ruleComandoEntrada EOF ;
    public final void entryRuleComandoEntrada() throws RecognitionException {
        try {
            // InternalJlanguage.g:479:1: ( ruleComandoEntrada EOF )
            // InternalJlanguage.g:480:1: ruleComandoEntrada EOF
            {
             before(grammarAccess.getComandoEntradaRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoEntrada();

            state._fsp--;

             after(grammarAccess.getComandoEntradaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComandoEntrada"


    // $ANTLR start "ruleComandoEntrada"
    // InternalJlanguage.g:487:1: ruleComandoEntrada : ( ( rule__ComandoEntrada__Group__0 ) ) ;
    public final void ruleComandoEntrada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:491:2: ( ( ( rule__ComandoEntrada__Group__0 ) ) )
            // InternalJlanguage.g:492:2: ( ( rule__ComandoEntrada__Group__0 ) )
            {
            // InternalJlanguage.g:492:2: ( ( rule__ComandoEntrada__Group__0 ) )
            // InternalJlanguage.g:493:3: ( rule__ComandoEntrada__Group__0 )
            {
             before(grammarAccess.getComandoEntradaAccess().getGroup()); 
            // InternalJlanguage.g:494:3: ( rule__ComandoEntrada__Group__0 )
            // InternalJlanguage.g:494:4: rule__ComandoEntrada__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEntrada__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoEntradaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoEntrada"


    // $ANTLR start "entryRuleComandoSaida"
    // InternalJlanguage.g:503:1: entryRuleComandoSaida : ruleComandoSaida EOF ;
    public final void entryRuleComandoSaida() throws RecognitionException {
        try {
            // InternalJlanguage.g:504:1: ( ruleComandoSaida EOF )
            // InternalJlanguage.g:505:1: ruleComandoSaida EOF
            {
             before(grammarAccess.getComandoSaidaRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoSaida();

            state._fsp--;

             after(grammarAccess.getComandoSaidaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComandoSaida"


    // $ANTLR start "ruleComandoSaida"
    // InternalJlanguage.g:512:1: ruleComandoSaida : ( ( rule__ComandoSaida__Group__0 ) ) ;
    public final void ruleComandoSaida() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:516:2: ( ( ( rule__ComandoSaida__Group__0 ) ) )
            // InternalJlanguage.g:517:2: ( ( rule__ComandoSaida__Group__0 ) )
            {
            // InternalJlanguage.g:517:2: ( ( rule__ComandoSaida__Group__0 ) )
            // InternalJlanguage.g:518:3: ( rule__ComandoSaida__Group__0 )
            {
             before(grammarAccess.getComandoSaidaAccess().getGroup()); 
            // InternalJlanguage.g:519:3: ( rule__ComandoSaida__Group__0 )
            // InternalJlanguage.g:519:4: rule__ComandoSaida__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSaida__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoSaidaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoSaida"


    // $ANTLR start "entryRuleComandoCondicao"
    // InternalJlanguage.g:528:1: entryRuleComandoCondicao : ruleComandoCondicao EOF ;
    public final void entryRuleComandoCondicao() throws RecognitionException {
        try {
            // InternalJlanguage.g:529:1: ( ruleComandoCondicao EOF )
            // InternalJlanguage.g:530:1: ruleComandoCondicao EOF
            {
             before(grammarAccess.getComandoCondicaoRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoCondicao();

            state._fsp--;

             after(grammarAccess.getComandoCondicaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComandoCondicao"


    // $ANTLR start "ruleComandoCondicao"
    // InternalJlanguage.g:537:1: ruleComandoCondicao : ( ( rule__ComandoCondicao__Group__0 ) ) ;
    public final void ruleComandoCondicao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:541:2: ( ( ( rule__ComandoCondicao__Group__0 ) ) )
            // InternalJlanguage.g:542:2: ( ( rule__ComandoCondicao__Group__0 ) )
            {
            // InternalJlanguage.g:542:2: ( ( rule__ComandoCondicao__Group__0 ) )
            // InternalJlanguage.g:543:3: ( rule__ComandoCondicao__Group__0 )
            {
             before(grammarAccess.getComandoCondicaoAccess().getGroup()); 
            // InternalJlanguage.g:544:3: ( rule__ComandoCondicao__Group__0 )
            // InternalJlanguage.g:544:4: rule__ComandoCondicao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoCondicaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoCondicao"


    // $ANTLR start "entryRuleComandoRepeticao"
    // InternalJlanguage.g:553:1: entryRuleComandoRepeticao : ruleComandoRepeticao EOF ;
    public final void entryRuleComandoRepeticao() throws RecognitionException {
        try {
            // InternalJlanguage.g:554:1: ( ruleComandoRepeticao EOF )
            // InternalJlanguage.g:555:1: ruleComandoRepeticao EOF
            {
             before(grammarAccess.getComandoRepeticaoRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoRepeticao();

            state._fsp--;

             after(grammarAccess.getComandoRepeticaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComandoRepeticao"


    // $ANTLR start "ruleComandoRepeticao"
    // InternalJlanguage.g:562:1: ruleComandoRepeticao : ( ( rule__ComandoRepeticao__Group__0 ) ) ;
    public final void ruleComandoRepeticao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:566:2: ( ( ( rule__ComandoRepeticao__Group__0 ) ) )
            // InternalJlanguage.g:567:2: ( ( rule__ComandoRepeticao__Group__0 ) )
            {
            // InternalJlanguage.g:567:2: ( ( rule__ComandoRepeticao__Group__0 ) )
            // InternalJlanguage.g:568:3: ( rule__ComandoRepeticao__Group__0 )
            {
             before(grammarAccess.getComandoRepeticaoAccess().getGroup()); 
            // InternalJlanguage.g:569:3: ( rule__ComandoRepeticao__Group__0 )
            // InternalJlanguage.g:569:4: rule__ComandoRepeticao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoRepeticao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoRepeticaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoRepeticao"


    // $ANTLR start "entryRuleComandoSubAlgoritmo"
    // InternalJlanguage.g:578:1: entryRuleComandoSubAlgoritmo : ruleComandoSubAlgoritmo EOF ;
    public final void entryRuleComandoSubAlgoritmo() throws RecognitionException {
        try {
            // InternalJlanguage.g:579:1: ( ruleComandoSubAlgoritmo EOF )
            // InternalJlanguage.g:580:1: ruleComandoSubAlgoritmo EOF
            {
             before(grammarAccess.getComandoSubAlgoritmoRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoSubAlgoritmo();

            state._fsp--;

             after(grammarAccess.getComandoSubAlgoritmoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComandoSubAlgoritmo"


    // $ANTLR start "ruleComandoSubAlgoritmo"
    // InternalJlanguage.g:587:1: ruleComandoSubAlgoritmo : ( ( rule__ComandoSubAlgoritmo__Group__0 ) ) ;
    public final void ruleComandoSubAlgoritmo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:591:2: ( ( ( rule__ComandoSubAlgoritmo__Group__0 ) ) )
            // InternalJlanguage.g:592:2: ( ( rule__ComandoSubAlgoritmo__Group__0 ) )
            {
            // InternalJlanguage.g:592:2: ( ( rule__ComandoSubAlgoritmo__Group__0 ) )
            // InternalJlanguage.g:593:3: ( rule__ComandoSubAlgoritmo__Group__0 )
            {
             before(grammarAccess.getComandoSubAlgoritmoAccess().getGroup()); 
            // InternalJlanguage.g:594:3: ( rule__ComandoSubAlgoritmo__Group__0 )
            // InternalJlanguage.g:594:4: rule__ComandoSubAlgoritmo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSubAlgoritmo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoSubAlgoritmoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoSubAlgoritmo"


    // $ANTLR start "entryRuleTipoVar"
    // InternalJlanguage.g:603:1: entryRuleTipoVar : ruleTipoVar EOF ;
    public final void entryRuleTipoVar() throws RecognitionException {
        try {
            // InternalJlanguage.g:604:1: ( ruleTipoVar EOF )
            // InternalJlanguage.g:605:1: ruleTipoVar EOF
            {
             before(grammarAccess.getTipoVarRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoVar();

            state._fsp--;

             after(grammarAccess.getTipoVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoVar"


    // $ANTLR start "ruleTipoVar"
    // InternalJlanguage.g:612:1: ruleTipoVar : ( ( rule__TipoVar__Alternatives ) ) ;
    public final void ruleTipoVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:616:2: ( ( ( rule__TipoVar__Alternatives ) ) )
            // InternalJlanguage.g:617:2: ( ( rule__TipoVar__Alternatives ) )
            {
            // InternalJlanguage.g:617:2: ( ( rule__TipoVar__Alternatives ) )
            // InternalJlanguage.g:618:3: ( rule__TipoVar__Alternatives )
            {
             before(grammarAccess.getTipoVarAccess().getAlternatives()); 
            // InternalJlanguage.g:619:3: ( rule__TipoVar__Alternatives )
            // InternalJlanguage.g:619:4: rule__TipoVar__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoVar__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoVarAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoVar"


    // $ANTLR start "entryRuleOpArit1"
    // InternalJlanguage.g:628:1: entryRuleOpArit1 : ruleOpArit1 EOF ;
    public final void entryRuleOpArit1() throws RecognitionException {
        try {
            // InternalJlanguage.g:629:1: ( ruleOpArit1 EOF )
            // InternalJlanguage.g:630:1: ruleOpArit1 EOF
            {
             before(grammarAccess.getOpArit1Rule()); 
            pushFollow(FOLLOW_1);
            ruleOpArit1();

            state._fsp--;

             after(grammarAccess.getOpArit1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpArit1"


    // $ANTLR start "ruleOpArit1"
    // InternalJlanguage.g:637:1: ruleOpArit1 : ( ( rule__OpArit1__Alternatives ) ) ;
    public final void ruleOpArit1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:641:2: ( ( ( rule__OpArit1__Alternatives ) ) )
            // InternalJlanguage.g:642:2: ( ( rule__OpArit1__Alternatives ) )
            {
            // InternalJlanguage.g:642:2: ( ( rule__OpArit1__Alternatives ) )
            // InternalJlanguage.g:643:3: ( rule__OpArit1__Alternatives )
            {
             before(grammarAccess.getOpArit1Access().getAlternatives()); 
            // InternalJlanguage.g:644:3: ( rule__OpArit1__Alternatives )
            // InternalJlanguage.g:644:4: rule__OpArit1__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpArit1__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpArit1Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpArit1"


    // $ANTLR start "entryRuleOpArit2"
    // InternalJlanguage.g:653:1: entryRuleOpArit2 : ruleOpArit2 EOF ;
    public final void entryRuleOpArit2() throws RecognitionException {
        try {
            // InternalJlanguage.g:654:1: ( ruleOpArit2 EOF )
            // InternalJlanguage.g:655:1: ruleOpArit2 EOF
            {
             before(grammarAccess.getOpArit2Rule()); 
            pushFollow(FOLLOW_1);
            ruleOpArit2();

            state._fsp--;

             after(grammarAccess.getOpArit2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpArit2"


    // $ANTLR start "ruleOpArit2"
    // InternalJlanguage.g:662:1: ruleOpArit2 : ( ( rule__OpArit2__Alternatives ) ) ;
    public final void ruleOpArit2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:666:2: ( ( ( rule__OpArit2__Alternatives ) ) )
            // InternalJlanguage.g:667:2: ( ( rule__OpArit2__Alternatives ) )
            {
            // InternalJlanguage.g:667:2: ( ( rule__OpArit2__Alternatives ) )
            // InternalJlanguage.g:668:3: ( rule__OpArit2__Alternatives )
            {
             before(grammarAccess.getOpArit2Access().getAlternatives()); 
            // InternalJlanguage.g:669:3: ( rule__OpArit2__Alternatives )
            // InternalJlanguage.g:669:4: rule__OpArit2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpArit2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpArit2Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpArit2"


    // $ANTLR start "entryRuleOpRel"
    // InternalJlanguage.g:678:1: entryRuleOpRel : ruleOpRel EOF ;
    public final void entryRuleOpRel() throws RecognitionException {
        try {
            // InternalJlanguage.g:679:1: ( ruleOpRel EOF )
            // InternalJlanguage.g:680:1: ruleOpRel EOF
            {
             before(grammarAccess.getOpRelRule()); 
            pushFollow(FOLLOW_1);
            ruleOpRel();

            state._fsp--;

             after(grammarAccess.getOpRelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpRel"


    // $ANTLR start "ruleOpRel"
    // InternalJlanguage.g:687:1: ruleOpRel : ( ( rule__OpRel__Alternatives ) ) ;
    public final void ruleOpRel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:691:2: ( ( ( rule__OpRel__Alternatives ) ) )
            // InternalJlanguage.g:692:2: ( ( rule__OpRel__Alternatives ) )
            {
            // InternalJlanguage.g:692:2: ( ( rule__OpRel__Alternatives ) )
            // InternalJlanguage.g:693:3: ( rule__OpRel__Alternatives )
            {
             before(grammarAccess.getOpRelAccess().getAlternatives()); 
            // InternalJlanguage.g:694:3: ( rule__OpRel__Alternatives )
            // InternalJlanguage.g:694:4: rule__OpRel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpRel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpRelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpRel"


    // $ANTLR start "entryRuleOpBool"
    // InternalJlanguage.g:703:1: entryRuleOpBool : ruleOpBool EOF ;
    public final void entryRuleOpBool() throws RecognitionException {
        try {
            // InternalJlanguage.g:704:1: ( ruleOpBool EOF )
            // InternalJlanguage.g:705:1: ruleOpBool EOF
            {
             before(grammarAccess.getOpBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleOpBool();

            state._fsp--;

             after(grammarAccess.getOpBoolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpBool"


    // $ANTLR start "ruleOpBool"
    // InternalJlanguage.g:712:1: ruleOpBool : ( ( rule__OpBool__Alternatives ) ) ;
    public final void ruleOpBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:716:2: ( ( ( rule__OpBool__Alternatives ) ) )
            // InternalJlanguage.g:717:2: ( ( rule__OpBool__Alternatives ) )
            {
            // InternalJlanguage.g:717:2: ( ( rule__OpBool__Alternatives ) )
            // InternalJlanguage.g:718:3: ( rule__OpBool__Alternatives )
            {
             before(grammarAccess.getOpBoolAccess().getAlternatives()); 
            // InternalJlanguage.g:719:3: ( rule__OpBool__Alternatives )
            // InternalJlanguage.g:719:4: rule__OpBool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpBool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpBool"


    // $ANTLR start "rule__FatorAritmetico__Alternatives"
    // InternalJlanguage.g:727:1: rule__FatorAritmetico__Alternatives : ( ( ruleFatorNumero ) | ( ruleFatorVariavel ) | ( ruleFatorSubExpressao ) );
    public final void rule__FatorAritmetico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:731:1: ( ( ruleFatorNumero ) | ( ruleFatorVariavel ) | ( ruleFatorSubExpressao ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJlanguage.g:732:2: ( ruleFatorNumero )
                    {
                    // InternalJlanguage.g:732:2: ( ruleFatorNumero )
                    // InternalJlanguage.g:733:3: ruleFatorNumero
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getFatorNumeroParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFatorNumero();

                    state._fsp--;

                     after(grammarAccess.getFatorAritmeticoAccess().getFatorNumeroParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:738:2: ( ruleFatorVariavel )
                    {
                    // InternalJlanguage.g:738:2: ( ruleFatorVariavel )
                    // InternalJlanguage.g:739:3: ruleFatorVariavel
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getFatorVariavelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFatorVariavel();

                    state._fsp--;

                     after(grammarAccess.getFatorAritmeticoAccess().getFatorVariavelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJlanguage.g:744:2: ( ruleFatorSubExpressao )
                    {
                    // InternalJlanguage.g:744:2: ( ruleFatorSubExpressao )
                    // InternalJlanguage.g:745:3: ruleFatorSubExpressao
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getFatorSubExpressaoParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFatorSubExpressao();

                    state._fsp--;

                     after(grammarAccess.getFatorAritmeticoAccess().getFatorSubExpressaoParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Alternatives"


    // $ANTLR start "rule__TermoRelacional__Alternatives"
    // InternalJlanguage.g:754:1: rule__TermoRelacional__Alternatives : ( ( ruleTermoComparacaoRelacional ) | ( ruleTermoSubExpressaoRelacional ) );
    public final void rule__TermoRelacional__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:758:1: ( ( ruleTermoComparacaoRelacional ) | ( ruleTermoSubExpressaoRelacional ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJlanguage.g:759:2: ( ruleTermoComparacaoRelacional )
                    {
                    // InternalJlanguage.g:759:2: ( ruleTermoComparacaoRelacional )
                    // InternalJlanguage.g:760:3: ruleTermoComparacaoRelacional
                    {
                     before(grammarAccess.getTermoRelacionalAccess().getTermoComparacaoRelacionalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTermoComparacaoRelacional();

                    state._fsp--;

                     after(grammarAccess.getTermoRelacionalAccess().getTermoComparacaoRelacionalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:765:2: ( ruleTermoSubExpressaoRelacional )
                    {
                    // InternalJlanguage.g:765:2: ( ruleTermoSubExpressaoRelacional )
                    // InternalJlanguage.g:766:3: ruleTermoSubExpressaoRelacional
                    {
                     before(grammarAccess.getTermoRelacionalAccess().getTermoSubExpressaoRelacionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTermoSubExpressaoRelacional();

                    state._fsp--;

                     after(grammarAccess.getTermoRelacionalAccess().getTermoSubExpressaoRelacionalParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoRelacional__Alternatives"


    // $ANTLR start "rule__Comando__Alternatives"
    // InternalJlanguage.g:775:1: rule__Comando__Alternatives : ( ( ruleComandoAtibuicao ) | ( ruleComandoEntrada ) | ( ruleComandoSaida ) | ( ruleComandoCondicao ) | ( ruleComandoRepeticao ) | ( ruleComandoSubAlgoritmo ) );
    public final void rule__Comando__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:779:1: ( ( ruleComandoAtibuicao ) | ( ruleComandoEntrada ) | ( ruleComandoSaida ) | ( ruleComandoCondicao ) | ( ruleComandoRepeticao ) | ( ruleComandoSubAlgoritmo ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 36:
                {
                alt3=4;
                }
                break;
            case 39:
                {
                alt3=5;
                }
                break;
            case 40:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJlanguage.g:780:2: ( ruleComandoAtibuicao )
                    {
                    // InternalJlanguage.g:780:2: ( ruleComandoAtibuicao )
                    // InternalJlanguage.g:781:3: ruleComandoAtibuicao
                    {
                     before(grammarAccess.getComandoAccess().getComandoAtibuicaoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoAtibuicao();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoAtibuicaoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:786:2: ( ruleComandoEntrada )
                    {
                    // InternalJlanguage.g:786:2: ( ruleComandoEntrada )
                    // InternalJlanguage.g:787:3: ruleComandoEntrada
                    {
                     before(grammarAccess.getComandoAccess().getComandoEntradaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoEntrada();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoEntradaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJlanguage.g:792:2: ( ruleComandoSaida )
                    {
                    // InternalJlanguage.g:792:2: ( ruleComandoSaida )
                    // InternalJlanguage.g:793:3: ruleComandoSaida
                    {
                     before(grammarAccess.getComandoAccess().getComandoSaidaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoSaida();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoSaidaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJlanguage.g:798:2: ( ruleComandoCondicao )
                    {
                    // InternalJlanguage.g:798:2: ( ruleComandoCondicao )
                    // InternalJlanguage.g:799:3: ruleComandoCondicao
                    {
                     before(grammarAccess.getComandoAccess().getComandoCondicaoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoCondicao();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoCondicaoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJlanguage.g:804:2: ( ruleComandoRepeticao )
                    {
                    // InternalJlanguage.g:804:2: ( ruleComandoRepeticao )
                    // InternalJlanguage.g:805:3: ruleComandoRepeticao
                    {
                     before(grammarAccess.getComandoAccess().getComandoRepeticaoParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoRepeticao();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoRepeticaoParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJlanguage.g:810:2: ( ruleComandoSubAlgoritmo )
                    {
                    // InternalJlanguage.g:810:2: ( ruleComandoSubAlgoritmo )
                    // InternalJlanguage.g:811:3: ruleComandoSubAlgoritmo
                    {
                     before(grammarAccess.getComandoAccess().getComandoSubAlgoritmoParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoSubAlgoritmo();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoSubAlgoritmoParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comando__Alternatives"


    // $ANTLR start "rule__TipoVar__Alternatives"
    // InternalJlanguage.g:820:1: rule__TipoVar__Alternatives : ( ( 'INTEIRO' ) | ( 'REAL' ) );
    public final void rule__TipoVar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:824:1: ( ( 'INTEIRO' ) | ( 'REAL' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJlanguage.g:825:2: ( 'INTEIRO' )
                    {
                    // InternalJlanguage.g:825:2: ( 'INTEIRO' )
                    // InternalJlanguage.g:826:3: 'INTEIRO'
                    {
                     before(grammarAccess.getTipoVarAccess().getINTEIROKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTipoVarAccess().getINTEIROKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:831:2: ( 'REAL' )
                    {
                    // InternalJlanguage.g:831:2: ( 'REAL' )
                    // InternalJlanguage.g:832:3: 'REAL'
                    {
                     before(grammarAccess.getTipoVarAccess().getREALKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTipoVarAccess().getREALKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoVar__Alternatives"


    // $ANTLR start "rule__OpArit1__Alternatives"
    // InternalJlanguage.g:841:1: rule__OpArit1__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__OpArit1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:845:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJlanguage.g:846:2: ( '+' )
                    {
                    // InternalJlanguage.g:846:2: ( '+' )
                    // InternalJlanguage.g:847:3: '+'
                    {
                     before(grammarAccess.getOpArit1Access().getPlusSignKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOpArit1Access().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:852:2: ( '-' )
                    {
                    // InternalJlanguage.g:852:2: ( '-' )
                    // InternalJlanguage.g:853:3: '-'
                    {
                     before(grammarAccess.getOpArit1Access().getHyphenMinusKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOpArit1Access().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpArit1__Alternatives"


    // $ANTLR start "rule__OpArit2__Alternatives"
    // InternalJlanguage.g:862:1: rule__OpArit2__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__OpArit2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:866:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJlanguage.g:867:2: ( '*' )
                    {
                    // InternalJlanguage.g:867:2: ( '*' )
                    // InternalJlanguage.g:868:3: '*'
                    {
                     before(grammarAccess.getOpArit2Access().getAsteriskKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOpArit2Access().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:873:2: ( '/' )
                    {
                    // InternalJlanguage.g:873:2: ( '/' )
                    // InternalJlanguage.g:874:3: '/'
                    {
                     before(grammarAccess.getOpArit2Access().getSolidusKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOpArit2Access().getSolidusKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpArit2__Alternatives"


    // $ANTLR start "rule__OpRel__Alternatives"
    // InternalJlanguage.g:883:1: rule__OpRel__Alternatives : ( ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) | ( '<>' ) | ( '=' ) );
    public final void rule__OpRel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:887:1: ( ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) | ( '<>' ) | ( '=' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJlanguage.g:888:2: ( '>' )
                    {
                    // InternalJlanguage.g:888:2: ( '>' )
                    // InternalJlanguage.g:889:3: '>'
                    {
                     before(grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:894:2: ( '>=' )
                    {
                    // InternalJlanguage.g:894:2: ( '>=' )
                    // InternalJlanguage.g:895:3: '>='
                    {
                     before(grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJlanguage.g:900:2: ( '<' )
                    {
                    // InternalJlanguage.g:900:2: ( '<' )
                    // InternalJlanguage.g:901:3: '<'
                    {
                     before(grammarAccess.getOpRelAccess().getLessThanSignKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getLessThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJlanguage.g:906:2: ( '<=' )
                    {
                    // InternalJlanguage.g:906:2: ( '<=' )
                    // InternalJlanguage.g:907:3: '<='
                    {
                     before(grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJlanguage.g:912:2: ( '<>' )
                    {
                    // InternalJlanguage.g:912:2: ( '<>' )
                    // InternalJlanguage.g:913:3: '<>'
                    {
                     before(grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJlanguage.g:918:2: ( '=' )
                    {
                    // InternalJlanguage.g:918:2: ( '=' )
                    // InternalJlanguage.g:919:3: '='
                    {
                     before(grammarAccess.getOpRelAccess().getEqualsSignKeyword_5()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getEqualsSignKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpRel__Alternatives"


    // $ANTLR start "rule__OpBool__Alternatives"
    // InternalJlanguage.g:928:1: rule__OpBool__Alternatives : ( ( 'E' ) | ( 'OU' ) );
    public final void rule__OpBool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:932:1: ( ( 'E' ) | ( 'OU' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalJlanguage.g:933:2: ( 'E' )
                    {
                    // InternalJlanguage.g:933:2: ( 'E' )
                    // InternalJlanguage.g:934:3: 'E'
                    {
                     before(grammarAccess.getOpBoolAccess().getEKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOpBoolAccess().getEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJlanguage.g:939:2: ( 'OU' )
                    {
                    // InternalJlanguage.g:939:2: ( 'OU' )
                    // InternalJlanguage.g:940:3: 'OU'
                    {
                     before(grammarAccess.getOpBoolAccess().getOUKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOpBoolAccess().getOUKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBool__Alternatives"


    // $ANTLR start "rule__Programa__Group__0"
    // InternalJlanguage.g:949:1: rule__Programa__Group__0 : rule__Programa__Group__0__Impl rule__Programa__Group__1 ;
    public final void rule__Programa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:953:1: ( rule__Programa__Group__0__Impl rule__Programa__Group__1 )
            // InternalJlanguage.g:954:2: rule__Programa__Group__0__Impl rule__Programa__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Programa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__0"


    // $ANTLR start "rule__Programa__Group__0__Impl"
    // InternalJlanguage.g:961:1: rule__Programa__Group__0__Impl : ( ':' ) ;
    public final void rule__Programa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:965:1: ( ( ':' ) )
            // InternalJlanguage.g:966:1: ( ':' )
            {
            // InternalJlanguage.g:966:1: ( ':' )
            // InternalJlanguage.g:967:2: ':'
            {
             before(grammarAccess.getProgramaAccess().getColonKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgramaAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__0__Impl"


    // $ANTLR start "rule__Programa__Group__1"
    // InternalJlanguage.g:976:1: rule__Programa__Group__1 : rule__Programa__Group__1__Impl rule__Programa__Group__2 ;
    public final void rule__Programa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:980:1: ( rule__Programa__Group__1__Impl rule__Programa__Group__2 )
            // InternalJlanguage.g:981:2: rule__Programa__Group__1__Impl rule__Programa__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Programa__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__1"


    // $ANTLR start "rule__Programa__Group__1__Impl"
    // InternalJlanguage.g:988:1: rule__Programa__Group__1__Impl : ( 'DECLARACOES' ) ;
    public final void rule__Programa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:992:1: ( ( 'DECLARACOES' ) )
            // InternalJlanguage.g:993:1: ( 'DECLARACOES' )
            {
            // InternalJlanguage.g:993:1: ( 'DECLARACOES' )
            // InternalJlanguage.g:994:2: 'DECLARACOES'
            {
             before(grammarAccess.getProgramaAccess().getDECLARACOESKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProgramaAccess().getDECLARACOESKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__1__Impl"


    // $ANTLR start "rule__Programa__Group__2"
    // InternalJlanguage.g:1003:1: rule__Programa__Group__2 : rule__Programa__Group__2__Impl rule__Programa__Group__3 ;
    public final void rule__Programa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1007:1: ( rule__Programa__Group__2__Impl rule__Programa__Group__3 )
            // InternalJlanguage.g:1008:2: rule__Programa__Group__2__Impl rule__Programa__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Programa__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programa__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__2"


    // $ANTLR start "rule__Programa__Group__2__Impl"
    // InternalJlanguage.g:1015:1: rule__Programa__Group__2__Impl : ( ( ( rule__Programa__DeclaracoesAssignment_2 ) ) ( ( rule__Programa__DeclaracoesAssignment_2 )* ) ) ;
    public final void rule__Programa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1019:1: ( ( ( ( rule__Programa__DeclaracoesAssignment_2 ) ) ( ( rule__Programa__DeclaracoesAssignment_2 )* ) ) )
            // InternalJlanguage.g:1020:1: ( ( ( rule__Programa__DeclaracoesAssignment_2 ) ) ( ( rule__Programa__DeclaracoesAssignment_2 )* ) )
            {
            // InternalJlanguage.g:1020:1: ( ( ( rule__Programa__DeclaracoesAssignment_2 ) ) ( ( rule__Programa__DeclaracoesAssignment_2 )* ) )
            // InternalJlanguage.g:1021:2: ( ( rule__Programa__DeclaracoesAssignment_2 ) ) ( ( rule__Programa__DeclaracoesAssignment_2 )* )
            {
            // InternalJlanguage.g:1021:2: ( ( rule__Programa__DeclaracoesAssignment_2 ) )
            // InternalJlanguage.g:1022:3: ( rule__Programa__DeclaracoesAssignment_2 )
            {
             before(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_2()); 
            // InternalJlanguage.g:1023:3: ( rule__Programa__DeclaracoesAssignment_2 )
            // InternalJlanguage.g:1023:4: rule__Programa__DeclaracoesAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Programa__DeclaracoesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_2()); 

            }

            // InternalJlanguage.g:1026:2: ( ( rule__Programa__DeclaracoesAssignment_2 )* )
            // InternalJlanguage.g:1027:3: ( rule__Programa__DeclaracoesAssignment_2 )*
            {
             before(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_2()); 
            // InternalJlanguage.g:1028:3: ( rule__Programa__DeclaracoesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJlanguage.g:1028:4: rule__Programa__DeclaracoesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Programa__DeclaracoesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__2__Impl"


    // $ANTLR start "rule__Programa__Group__3"
    // InternalJlanguage.g:1037:1: rule__Programa__Group__3 : rule__Programa__Group__3__Impl rule__Programa__Group__4 ;
    public final void rule__Programa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1041:1: ( rule__Programa__Group__3__Impl rule__Programa__Group__4 )
            // InternalJlanguage.g:1042:2: rule__Programa__Group__3__Impl rule__Programa__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Programa__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programa__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__3"


    // $ANTLR start "rule__Programa__Group__3__Impl"
    // InternalJlanguage.g:1049:1: rule__Programa__Group__3__Impl : ( ':' ) ;
    public final void rule__Programa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1053:1: ( ( ':' ) )
            // InternalJlanguage.g:1054:1: ( ':' )
            {
            // InternalJlanguage.g:1054:1: ( ':' )
            // InternalJlanguage.g:1055:2: ':'
            {
             before(grammarAccess.getProgramaAccess().getColonKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgramaAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__3__Impl"


    // $ANTLR start "rule__Programa__Group__4"
    // InternalJlanguage.g:1064:1: rule__Programa__Group__4 : rule__Programa__Group__4__Impl rule__Programa__Group__5 ;
    public final void rule__Programa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1068:1: ( rule__Programa__Group__4__Impl rule__Programa__Group__5 )
            // InternalJlanguage.g:1069:2: rule__Programa__Group__4__Impl rule__Programa__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Programa__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programa__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__4"


    // $ANTLR start "rule__Programa__Group__4__Impl"
    // InternalJlanguage.g:1076:1: rule__Programa__Group__4__Impl : ( 'ALGORITMO' ) ;
    public final void rule__Programa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1080:1: ( ( 'ALGORITMO' ) )
            // InternalJlanguage.g:1081:1: ( 'ALGORITMO' )
            {
            // InternalJlanguage.g:1081:1: ( 'ALGORITMO' )
            // InternalJlanguage.g:1082:2: 'ALGORITMO'
            {
             before(grammarAccess.getProgramaAccess().getALGORITMOKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProgramaAccess().getALGORITMOKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__4__Impl"


    // $ANTLR start "rule__Programa__Group__5"
    // InternalJlanguage.g:1091:1: rule__Programa__Group__5 : rule__Programa__Group__5__Impl ;
    public final void rule__Programa__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1095:1: ( rule__Programa__Group__5__Impl )
            // InternalJlanguage.g:1096:2: rule__Programa__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Programa__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__5"


    // $ANTLR start "rule__Programa__Group__5__Impl"
    // InternalJlanguage.g:1102:1: rule__Programa__Group__5__Impl : ( ( ( rule__Programa__ComandosAssignment_5 ) ) ( ( rule__Programa__ComandosAssignment_5 )* ) ) ;
    public final void rule__Programa__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1106:1: ( ( ( ( rule__Programa__ComandosAssignment_5 ) ) ( ( rule__Programa__ComandosAssignment_5 )* ) ) )
            // InternalJlanguage.g:1107:1: ( ( ( rule__Programa__ComandosAssignment_5 ) ) ( ( rule__Programa__ComandosAssignment_5 )* ) )
            {
            // InternalJlanguage.g:1107:1: ( ( ( rule__Programa__ComandosAssignment_5 ) ) ( ( rule__Programa__ComandosAssignment_5 )* ) )
            // InternalJlanguage.g:1108:2: ( ( rule__Programa__ComandosAssignment_5 ) ) ( ( rule__Programa__ComandosAssignment_5 )* )
            {
            // InternalJlanguage.g:1108:2: ( ( rule__Programa__ComandosAssignment_5 ) )
            // InternalJlanguage.g:1109:3: ( rule__Programa__ComandosAssignment_5 )
            {
             before(grammarAccess.getProgramaAccess().getComandosAssignment_5()); 
            // InternalJlanguage.g:1110:3: ( rule__Programa__ComandosAssignment_5 )
            // InternalJlanguage.g:1110:4: rule__Programa__ComandosAssignment_5
            {
            pushFollow(FOLLOW_9);
            rule__Programa__ComandosAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProgramaAccess().getComandosAssignment_5()); 

            }

            // InternalJlanguage.g:1113:2: ( ( rule__Programa__ComandosAssignment_5 )* )
            // InternalJlanguage.g:1114:3: ( rule__Programa__ComandosAssignment_5 )*
            {
             before(grammarAccess.getProgramaAccess().getComandosAssignment_5()); 
            // InternalJlanguage.g:1115:3: ( rule__Programa__ComandosAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32||(LA10_0>=34 && LA10_0<=36)||(LA10_0>=39 && LA10_0<=40)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJlanguage.g:1115:4: rule__Programa__ComandosAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Programa__ComandosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramaAccess().getComandosAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__5__Impl"


    // $ANTLR start "rule__Declaracao__Group__0"
    // InternalJlanguage.g:1125:1: rule__Declaracao__Group__0 : rule__Declaracao__Group__0__Impl rule__Declaracao__Group__1 ;
    public final void rule__Declaracao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1129:1: ( rule__Declaracao__Group__0__Impl rule__Declaracao__Group__1 )
            // InternalJlanguage.g:1130:2: rule__Declaracao__Group__0__Impl rule__Declaracao__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Declaracao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaracao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group__0"


    // $ANTLR start "rule__Declaracao__Group__0__Impl"
    // InternalJlanguage.g:1137:1: rule__Declaracao__Group__0__Impl : ( ( rule__Declaracao__NameAssignment_0 ) ) ;
    public final void rule__Declaracao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1141:1: ( ( ( rule__Declaracao__NameAssignment_0 ) ) )
            // InternalJlanguage.g:1142:1: ( ( rule__Declaracao__NameAssignment_0 ) )
            {
            // InternalJlanguage.g:1142:1: ( ( rule__Declaracao__NameAssignment_0 ) )
            // InternalJlanguage.g:1143:2: ( rule__Declaracao__NameAssignment_0 )
            {
             before(grammarAccess.getDeclaracaoAccess().getNameAssignment_0()); 
            // InternalJlanguage.g:1144:2: ( rule__Declaracao__NameAssignment_0 )
            // InternalJlanguage.g:1144:3: rule__Declaracao__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Declaracao__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group__0__Impl"


    // $ANTLR start "rule__Declaracao__Group__1"
    // InternalJlanguage.g:1152:1: rule__Declaracao__Group__1 : rule__Declaracao__Group__1__Impl rule__Declaracao__Group__2 ;
    public final void rule__Declaracao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1156:1: ( rule__Declaracao__Group__1__Impl rule__Declaracao__Group__2 )
            // InternalJlanguage.g:1157:2: rule__Declaracao__Group__1__Impl rule__Declaracao__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Declaracao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaracao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group__1"


    // $ANTLR start "rule__Declaracao__Group__1__Impl"
    // InternalJlanguage.g:1164:1: rule__Declaracao__Group__1__Impl : ( ':' ) ;
    public final void rule__Declaracao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1168:1: ( ( ':' ) )
            // InternalJlanguage.g:1169:1: ( ':' )
            {
            // InternalJlanguage.g:1169:1: ( ':' )
            // InternalJlanguage.g:1170:2: ':'
            {
             before(grammarAccess.getDeclaracaoAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group__1__Impl"


    // $ANTLR start "rule__Declaracao__Group__2"
    // InternalJlanguage.g:1179:1: rule__Declaracao__Group__2 : rule__Declaracao__Group__2__Impl ;
    public final void rule__Declaracao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1183:1: ( rule__Declaracao__Group__2__Impl )
            // InternalJlanguage.g:1184:2: rule__Declaracao__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaracao__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group__2"


    // $ANTLR start "rule__Declaracao__Group__2__Impl"
    // InternalJlanguage.g:1190:1: rule__Declaracao__Group__2__Impl : ( ( rule__Declaracao__TipoAssignment_2 ) ) ;
    public final void rule__Declaracao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1194:1: ( ( ( rule__Declaracao__TipoAssignment_2 ) ) )
            // InternalJlanguage.g:1195:1: ( ( rule__Declaracao__TipoAssignment_2 ) )
            {
            // InternalJlanguage.g:1195:1: ( ( rule__Declaracao__TipoAssignment_2 ) )
            // InternalJlanguage.g:1196:2: ( rule__Declaracao__TipoAssignment_2 )
            {
             before(grammarAccess.getDeclaracaoAccess().getTipoAssignment_2()); 
            // InternalJlanguage.g:1197:2: ( rule__Declaracao__TipoAssignment_2 )
            // InternalJlanguage.g:1197:3: rule__Declaracao__TipoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Declaracao__TipoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoAccess().getTipoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group__2__Impl"


    // $ANTLR start "rule__ExpressaoAritmetica__Group__0"
    // InternalJlanguage.g:1206:1: rule__ExpressaoAritmetica__Group__0 : rule__ExpressaoAritmetica__Group__0__Impl rule__ExpressaoAritmetica__Group__1 ;
    public final void rule__ExpressaoAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1210:1: ( rule__ExpressaoAritmetica__Group__0__Impl rule__ExpressaoAritmetica__Group__1 )
            // InternalJlanguage.g:1211:2: rule__ExpressaoAritmetica__Group__0__Impl rule__ExpressaoAritmetica__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ExpressaoAritmetica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressaoAritmetica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__Group__0"


    // $ANTLR start "rule__ExpressaoAritmetica__Group__0__Impl"
    // InternalJlanguage.g:1218:1: rule__ExpressaoAritmetica__Group__0__Impl : ( ( rule__ExpressaoAritmetica__Termo1Assignment_0 ) ) ;
    public final void rule__ExpressaoAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1222:1: ( ( ( rule__ExpressaoAritmetica__Termo1Assignment_0 ) ) )
            // InternalJlanguage.g:1223:1: ( ( rule__ExpressaoAritmetica__Termo1Assignment_0 ) )
            {
            // InternalJlanguage.g:1223:1: ( ( rule__ExpressaoAritmetica__Termo1Assignment_0 ) )
            // InternalJlanguage.g:1224:2: ( rule__ExpressaoAritmetica__Termo1Assignment_0 )
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getTermo1Assignment_0()); 
            // InternalJlanguage.g:1225:2: ( rule__ExpressaoAritmetica__Termo1Assignment_0 )
            // InternalJlanguage.g:1225:3: rule__ExpressaoAritmetica__Termo1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoAritmetica__Termo1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAritmeticaAccess().getTermo1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__Group__0__Impl"


    // $ANTLR start "rule__ExpressaoAritmetica__Group__1"
    // InternalJlanguage.g:1233:1: rule__ExpressaoAritmetica__Group__1 : rule__ExpressaoAritmetica__Group__1__Impl ;
    public final void rule__ExpressaoAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1237:1: ( rule__ExpressaoAritmetica__Group__1__Impl )
            // InternalJlanguage.g:1238:2: rule__ExpressaoAritmetica__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoAritmetica__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__Group__1"


    // $ANTLR start "rule__ExpressaoAritmetica__Group__1__Impl"
    // InternalJlanguage.g:1244:1: rule__ExpressaoAritmetica__Group__1__Impl : ( ( rule__ExpressaoAritmetica__OutrosTermosAssignment_1 )* ) ;
    public final void rule__ExpressaoAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1248:1: ( ( ( rule__ExpressaoAritmetica__OutrosTermosAssignment_1 )* ) )
            // InternalJlanguage.g:1249:1: ( ( rule__ExpressaoAritmetica__OutrosTermosAssignment_1 )* )
            {
            // InternalJlanguage.g:1249:1: ( ( rule__ExpressaoAritmetica__OutrosTermosAssignment_1 )* )
            // InternalJlanguage.g:1250:2: ( rule__ExpressaoAritmetica__OutrosTermosAssignment_1 )*
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getOutrosTermosAssignment_1()); 
            // InternalJlanguage.g:1251:2: ( rule__ExpressaoAritmetica__OutrosTermosAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=13 && LA11_0<=14)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJlanguage.g:1251:3: rule__ExpressaoAritmetica__OutrosTermosAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ExpressaoAritmetica__OutrosTermosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExpressaoAritmeticaAccess().getOutrosTermosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__Group__1__Impl"


    // $ANTLR start "rule__OutroTermoAritmetico__Group__0"
    // InternalJlanguage.g:1260:1: rule__OutroTermoAritmetico__Group__0 : rule__OutroTermoAritmetico__Group__0__Impl rule__OutroTermoAritmetico__Group__1 ;
    public final void rule__OutroTermoAritmetico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1264:1: ( rule__OutroTermoAritmetico__Group__0__Impl rule__OutroTermoAritmetico__Group__1 )
            // InternalJlanguage.g:1265:2: rule__OutroTermoAritmetico__Group__0__Impl rule__OutroTermoAritmetico__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__OutroTermoAritmetico__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__Group__0"


    // $ANTLR start "rule__OutroTermoAritmetico__Group__0__Impl"
    // InternalJlanguage.g:1272:1: rule__OutroTermoAritmetico__Group__0__Impl : ( ( rule__OutroTermoAritmetico__OperadorAssignment_0 ) ) ;
    public final void rule__OutroTermoAritmetico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1276:1: ( ( ( rule__OutroTermoAritmetico__OperadorAssignment_0 ) ) )
            // InternalJlanguage.g:1277:1: ( ( rule__OutroTermoAritmetico__OperadorAssignment_0 ) )
            {
            // InternalJlanguage.g:1277:1: ( ( rule__OutroTermoAritmetico__OperadorAssignment_0 ) )
            // InternalJlanguage.g:1278:2: ( rule__OutroTermoAritmetico__OperadorAssignment_0 )
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getOperadorAssignment_0()); 
            // InternalJlanguage.g:1279:2: ( rule__OutroTermoAritmetico__OperadorAssignment_0 )
            // InternalJlanguage.g:1279:3: rule__OutroTermoAritmetico__OperadorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__OperadorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutroTermoAritmeticoAccess().getOperadorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__Group__0__Impl"


    // $ANTLR start "rule__OutroTermoAritmetico__Group__1"
    // InternalJlanguage.g:1287:1: rule__OutroTermoAritmetico__Group__1 : rule__OutroTermoAritmetico__Group__1__Impl ;
    public final void rule__OutroTermoAritmetico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1291:1: ( rule__OutroTermoAritmetico__Group__1__Impl )
            // InternalJlanguage.g:1292:2: rule__OutroTermoAritmetico__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__Group__1"


    // $ANTLR start "rule__OutroTermoAritmetico__Group__1__Impl"
    // InternalJlanguage.g:1298:1: rule__OutroTermoAritmetico__Group__1__Impl : ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) ) ;
    public final void rule__OutroTermoAritmetico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1302:1: ( ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) ) )
            // InternalJlanguage.g:1303:1: ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) )
            {
            // InternalJlanguage.g:1303:1: ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) )
            // InternalJlanguage.g:1304:2: ( rule__OutroTermoAritmetico__TermoAssignment_1 )
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getTermoAssignment_1()); 
            // InternalJlanguage.g:1305:2: ( rule__OutroTermoAritmetico__TermoAssignment_1 )
            // InternalJlanguage.g:1305:3: rule__OutroTermoAritmetico__TermoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__TermoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutroTermoAritmeticoAccess().getTermoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__Group__1__Impl"


    // $ANTLR start "rule__TermoAritmetico__Group__0"
    // InternalJlanguage.g:1314:1: rule__TermoAritmetico__Group__0 : rule__TermoAritmetico__Group__0__Impl rule__TermoAritmetico__Group__1 ;
    public final void rule__TermoAritmetico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1318:1: ( rule__TermoAritmetico__Group__0__Impl rule__TermoAritmetico__Group__1 )
            // InternalJlanguage.g:1319:2: rule__TermoAritmetico__Group__0__Impl rule__TermoAritmetico__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TermoAritmetico__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermoAritmetico__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__Group__0"


    // $ANTLR start "rule__TermoAritmetico__Group__0__Impl"
    // InternalJlanguage.g:1326:1: rule__TermoAritmetico__Group__0__Impl : ( ( rule__TermoAritmetico__Fator1Assignment_0 ) ) ;
    public final void rule__TermoAritmetico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1330:1: ( ( ( rule__TermoAritmetico__Fator1Assignment_0 ) ) )
            // InternalJlanguage.g:1331:1: ( ( rule__TermoAritmetico__Fator1Assignment_0 ) )
            {
            // InternalJlanguage.g:1331:1: ( ( rule__TermoAritmetico__Fator1Assignment_0 ) )
            // InternalJlanguage.g:1332:2: ( rule__TermoAritmetico__Fator1Assignment_0 )
            {
             before(grammarAccess.getTermoAritmeticoAccess().getFator1Assignment_0()); 
            // InternalJlanguage.g:1333:2: ( rule__TermoAritmetico__Fator1Assignment_0 )
            // InternalJlanguage.g:1333:3: rule__TermoAritmetico__Fator1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TermoAritmetico__Fator1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermoAritmeticoAccess().getFator1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__Group__0__Impl"


    // $ANTLR start "rule__TermoAritmetico__Group__1"
    // InternalJlanguage.g:1341:1: rule__TermoAritmetico__Group__1 : rule__TermoAritmetico__Group__1__Impl ;
    public final void rule__TermoAritmetico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1345:1: ( rule__TermoAritmetico__Group__1__Impl )
            // InternalJlanguage.g:1346:2: rule__TermoAritmetico__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermoAritmetico__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__Group__1"


    // $ANTLR start "rule__TermoAritmetico__Group__1__Impl"
    // InternalJlanguage.g:1352:1: rule__TermoAritmetico__Group__1__Impl : ( ( rule__TermoAritmetico__OutrosFatoresAssignment_1 )* ) ;
    public final void rule__TermoAritmetico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1356:1: ( ( ( rule__TermoAritmetico__OutrosFatoresAssignment_1 )* ) )
            // InternalJlanguage.g:1357:1: ( ( rule__TermoAritmetico__OutrosFatoresAssignment_1 )* )
            {
            // InternalJlanguage.g:1357:1: ( ( rule__TermoAritmetico__OutrosFatoresAssignment_1 )* )
            // InternalJlanguage.g:1358:2: ( rule__TermoAritmetico__OutrosFatoresAssignment_1 )*
            {
             before(grammarAccess.getTermoAritmeticoAccess().getOutrosFatoresAssignment_1()); 
            // InternalJlanguage.g:1359:2: ( rule__TermoAritmetico__OutrosFatoresAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=15 && LA12_0<=16)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJlanguage.g:1359:3: rule__TermoAritmetico__OutrosFatoresAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TermoAritmetico__OutrosFatoresAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTermoAritmeticoAccess().getOutrosFatoresAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__Group__1__Impl"


    // $ANTLR start "rule__OutroFatorAritmetico__Group__0"
    // InternalJlanguage.g:1368:1: rule__OutroFatorAritmetico__Group__0 : rule__OutroFatorAritmetico__Group__0__Impl rule__OutroFatorAritmetico__Group__1 ;
    public final void rule__OutroFatorAritmetico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1372:1: ( rule__OutroFatorAritmetico__Group__0__Impl rule__OutroFatorAritmetico__Group__1 )
            // InternalJlanguage.g:1373:2: rule__OutroFatorAritmetico__Group__0__Impl rule__OutroFatorAritmetico__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__OutroFatorAritmetico__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__Group__0"


    // $ANTLR start "rule__OutroFatorAritmetico__Group__0__Impl"
    // InternalJlanguage.g:1380:1: rule__OutroFatorAritmetico__Group__0__Impl : ( ( rule__OutroFatorAritmetico__OperadorAssignment_0 ) ) ;
    public final void rule__OutroFatorAritmetico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1384:1: ( ( ( rule__OutroFatorAritmetico__OperadorAssignment_0 ) ) )
            // InternalJlanguage.g:1385:1: ( ( rule__OutroFatorAritmetico__OperadorAssignment_0 ) )
            {
            // InternalJlanguage.g:1385:1: ( ( rule__OutroFatorAritmetico__OperadorAssignment_0 ) )
            // InternalJlanguage.g:1386:2: ( rule__OutroFatorAritmetico__OperadorAssignment_0 )
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getOperadorAssignment_0()); 
            // InternalJlanguage.g:1387:2: ( rule__OutroFatorAritmetico__OperadorAssignment_0 )
            // InternalJlanguage.g:1387:3: rule__OutroFatorAritmetico__OperadorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__OperadorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutroFatorAritmeticoAccess().getOperadorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__Group__0__Impl"


    // $ANTLR start "rule__OutroFatorAritmetico__Group__1"
    // InternalJlanguage.g:1395:1: rule__OutroFatorAritmetico__Group__1 : rule__OutroFatorAritmetico__Group__1__Impl ;
    public final void rule__OutroFatorAritmetico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1399:1: ( rule__OutroFatorAritmetico__Group__1__Impl )
            // InternalJlanguage.g:1400:2: rule__OutroFatorAritmetico__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__Group__1"


    // $ANTLR start "rule__OutroFatorAritmetico__Group__1__Impl"
    // InternalJlanguage.g:1406:1: rule__OutroFatorAritmetico__Group__1__Impl : ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) ) ;
    public final void rule__OutroFatorAritmetico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1410:1: ( ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) ) )
            // InternalJlanguage.g:1411:1: ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) )
            {
            // InternalJlanguage.g:1411:1: ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) )
            // InternalJlanguage.g:1412:2: ( rule__OutroFatorAritmetico__FatorAssignment_1 )
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getFatorAssignment_1()); 
            // InternalJlanguage.g:1413:2: ( rule__OutroFatorAritmetico__FatorAssignment_1 )
            // InternalJlanguage.g:1413:3: rule__OutroFatorAritmetico__FatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__FatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutroFatorAritmeticoAccess().getFatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__Group__1__Impl"


    // $ANTLR start "rule__FatorSubExpressao__Group__0"
    // InternalJlanguage.g:1422:1: rule__FatorSubExpressao__Group__0 : rule__FatorSubExpressao__Group__0__Impl rule__FatorSubExpressao__Group__1 ;
    public final void rule__FatorSubExpressao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1426:1: ( rule__FatorSubExpressao__Group__0__Impl rule__FatorSubExpressao__Group__1 )
            // InternalJlanguage.g:1427:2: rule__FatorSubExpressao__Group__0__Impl rule__FatorSubExpressao__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FatorSubExpressao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FatorSubExpressao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorSubExpressao__Group__0"


    // $ANTLR start "rule__FatorSubExpressao__Group__0__Impl"
    // InternalJlanguage.g:1434:1: rule__FatorSubExpressao__Group__0__Impl : ( '(' ) ;
    public final void rule__FatorSubExpressao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1438:1: ( ( '(' ) )
            // InternalJlanguage.g:1439:1: ( '(' )
            {
            // InternalJlanguage.g:1439:1: ( '(' )
            // InternalJlanguage.g:1440:2: '('
            {
             before(grammarAccess.getFatorSubExpressaoAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFatorSubExpressaoAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorSubExpressao__Group__0__Impl"


    // $ANTLR start "rule__FatorSubExpressao__Group__1"
    // InternalJlanguage.g:1449:1: rule__FatorSubExpressao__Group__1 : rule__FatorSubExpressao__Group__1__Impl rule__FatorSubExpressao__Group__2 ;
    public final void rule__FatorSubExpressao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1453:1: ( rule__FatorSubExpressao__Group__1__Impl rule__FatorSubExpressao__Group__2 )
            // InternalJlanguage.g:1454:2: rule__FatorSubExpressao__Group__1__Impl rule__FatorSubExpressao__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__FatorSubExpressao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FatorSubExpressao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorSubExpressao__Group__1"


    // $ANTLR start "rule__FatorSubExpressao__Group__1__Impl"
    // InternalJlanguage.g:1461:1: rule__FatorSubExpressao__Group__1__Impl : ( ( rule__FatorSubExpressao__ExpressaoAssignment_1 ) ) ;
    public final void rule__FatorSubExpressao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1465:1: ( ( ( rule__FatorSubExpressao__ExpressaoAssignment_1 ) ) )
            // InternalJlanguage.g:1466:1: ( ( rule__FatorSubExpressao__ExpressaoAssignment_1 ) )
            {
            // InternalJlanguage.g:1466:1: ( ( rule__FatorSubExpressao__ExpressaoAssignment_1 ) )
            // InternalJlanguage.g:1467:2: ( rule__FatorSubExpressao__ExpressaoAssignment_1 )
            {
             before(grammarAccess.getFatorSubExpressaoAccess().getExpressaoAssignment_1()); 
            // InternalJlanguage.g:1468:2: ( rule__FatorSubExpressao__ExpressaoAssignment_1 )
            // InternalJlanguage.g:1468:3: rule__FatorSubExpressao__ExpressaoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FatorSubExpressao__ExpressaoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFatorSubExpressaoAccess().getExpressaoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorSubExpressao__Group__1__Impl"


    // $ANTLR start "rule__FatorSubExpressao__Group__2"
    // InternalJlanguage.g:1476:1: rule__FatorSubExpressao__Group__2 : rule__FatorSubExpressao__Group__2__Impl ;
    public final void rule__FatorSubExpressao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1480:1: ( rule__FatorSubExpressao__Group__2__Impl )
            // InternalJlanguage.g:1481:2: rule__FatorSubExpressao__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FatorSubExpressao__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorSubExpressao__Group__2"


    // $ANTLR start "rule__FatorSubExpressao__Group__2__Impl"
    // InternalJlanguage.g:1487:1: rule__FatorSubExpressao__Group__2__Impl : ( ')' ) ;
    public final void rule__FatorSubExpressao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1491:1: ( ( ')' ) )
            // InternalJlanguage.g:1492:1: ( ')' )
            {
            // InternalJlanguage.g:1492:1: ( ')' )
            // InternalJlanguage.g:1493:2: ')'
            {
             before(grammarAccess.getFatorSubExpressaoAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFatorSubExpressaoAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorSubExpressao__Group__2__Impl"


    // $ANTLR start "rule__ExpressaoRelacional__Group__0"
    // InternalJlanguage.g:1503:1: rule__ExpressaoRelacional__Group__0 : rule__ExpressaoRelacional__Group__0__Impl rule__ExpressaoRelacional__Group__1 ;
    public final void rule__ExpressaoRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1507:1: ( rule__ExpressaoRelacional__Group__0__Impl rule__ExpressaoRelacional__Group__1 )
            // InternalJlanguage.g:1508:2: rule__ExpressaoRelacional__Group__0__Impl rule__ExpressaoRelacional__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ExpressaoRelacional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group__0"


    // $ANTLR start "rule__ExpressaoRelacional__Group__0__Impl"
    // InternalJlanguage.g:1515:1: rule__ExpressaoRelacional__Group__0__Impl : ( ( rule__ExpressaoRelacional__Termo1Assignment_0 ) ) ;
    public final void rule__ExpressaoRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1519:1: ( ( ( rule__ExpressaoRelacional__Termo1Assignment_0 ) ) )
            // InternalJlanguage.g:1520:1: ( ( rule__ExpressaoRelacional__Termo1Assignment_0 ) )
            {
            // InternalJlanguage.g:1520:1: ( ( rule__ExpressaoRelacional__Termo1Assignment_0 ) )
            // InternalJlanguage.g:1521:2: ( rule__ExpressaoRelacional__Termo1Assignment_0 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getTermo1Assignment_0()); 
            // InternalJlanguage.g:1522:2: ( rule__ExpressaoRelacional__Termo1Assignment_0 )
            // InternalJlanguage.g:1522:3: rule__ExpressaoRelacional__Termo1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__Termo1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoRelacionalAccess().getTermo1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group__0__Impl"


    // $ANTLR start "rule__ExpressaoRelacional__Group__1"
    // InternalJlanguage.g:1530:1: rule__ExpressaoRelacional__Group__1 : rule__ExpressaoRelacional__Group__1__Impl ;
    public final void rule__ExpressaoRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1534:1: ( rule__ExpressaoRelacional__Group__1__Impl )
            // InternalJlanguage.g:1535:2: rule__ExpressaoRelacional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group__1"


    // $ANTLR start "rule__ExpressaoRelacional__Group__1__Impl"
    // InternalJlanguage.g:1541:1: rule__ExpressaoRelacional__Group__1__Impl : ( ( rule__ExpressaoRelacional__OutrosTermosAssignment_1 )* ) ;
    public final void rule__ExpressaoRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1545:1: ( ( ( rule__ExpressaoRelacional__OutrosTermosAssignment_1 )* ) )
            // InternalJlanguage.g:1546:1: ( ( rule__ExpressaoRelacional__OutrosTermosAssignment_1 )* )
            {
            // InternalJlanguage.g:1546:1: ( ( rule__ExpressaoRelacional__OutrosTermosAssignment_1 )* )
            // InternalJlanguage.g:1547:2: ( rule__ExpressaoRelacional__OutrosTermosAssignment_1 )*
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getOutrosTermosAssignment_1()); 
            // InternalJlanguage.g:1548:2: ( rule__ExpressaoRelacional__OutrosTermosAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=24)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJlanguage.g:1548:3: rule__ExpressaoRelacional__OutrosTermosAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ExpressaoRelacional__OutrosTermosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExpressaoRelacionalAccess().getOutrosTermosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group__1__Impl"


    // $ANTLR start "rule__OutroTermoRelacional__Group__0"
    // InternalJlanguage.g:1557:1: rule__OutroTermoRelacional__Group__0 : rule__OutroTermoRelacional__Group__0__Impl rule__OutroTermoRelacional__Group__1 ;
    public final void rule__OutroTermoRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1561:1: ( rule__OutroTermoRelacional__Group__0__Impl rule__OutroTermoRelacional__Group__1 )
            // InternalJlanguage.g:1562:2: rule__OutroTermoRelacional__Group__0__Impl rule__OutroTermoRelacional__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__OutroTermoRelacional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutroTermoRelacional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoRelacional__Group__0"


    // $ANTLR start "rule__OutroTermoRelacional__Group__0__Impl"
    // InternalJlanguage.g:1569:1: rule__OutroTermoRelacional__Group__0__Impl : ( ( rule__OutroTermoRelacional__OperadorAssignment_0 ) ) ;
    public final void rule__OutroTermoRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1573:1: ( ( ( rule__OutroTermoRelacional__OperadorAssignment_0 ) ) )
            // InternalJlanguage.g:1574:1: ( ( rule__OutroTermoRelacional__OperadorAssignment_0 ) )
            {
            // InternalJlanguage.g:1574:1: ( ( rule__OutroTermoRelacional__OperadorAssignment_0 ) )
            // InternalJlanguage.g:1575:2: ( rule__OutroTermoRelacional__OperadorAssignment_0 )
            {
             before(grammarAccess.getOutroTermoRelacionalAccess().getOperadorAssignment_0()); 
            // InternalJlanguage.g:1576:2: ( rule__OutroTermoRelacional__OperadorAssignment_0 )
            // InternalJlanguage.g:1576:3: rule__OutroTermoRelacional__OperadorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoRelacional__OperadorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutroTermoRelacionalAccess().getOperadorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoRelacional__Group__0__Impl"


    // $ANTLR start "rule__OutroTermoRelacional__Group__1"
    // InternalJlanguage.g:1584:1: rule__OutroTermoRelacional__Group__1 : rule__OutroTermoRelacional__Group__1__Impl ;
    public final void rule__OutroTermoRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1588:1: ( rule__OutroTermoRelacional__Group__1__Impl )
            // InternalJlanguage.g:1589:2: rule__OutroTermoRelacional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoRelacional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoRelacional__Group__1"


    // $ANTLR start "rule__OutroTermoRelacional__Group__1__Impl"
    // InternalJlanguage.g:1595:1: rule__OutroTermoRelacional__Group__1__Impl : ( ( rule__OutroTermoRelacional__TermoAssignment_1 ) ) ;
    public final void rule__OutroTermoRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1599:1: ( ( ( rule__OutroTermoRelacional__TermoAssignment_1 ) ) )
            // InternalJlanguage.g:1600:1: ( ( rule__OutroTermoRelacional__TermoAssignment_1 ) )
            {
            // InternalJlanguage.g:1600:1: ( ( rule__OutroTermoRelacional__TermoAssignment_1 ) )
            // InternalJlanguage.g:1601:2: ( rule__OutroTermoRelacional__TermoAssignment_1 )
            {
             before(grammarAccess.getOutroTermoRelacionalAccess().getTermoAssignment_1()); 
            // InternalJlanguage.g:1602:2: ( rule__OutroTermoRelacional__TermoAssignment_1 )
            // InternalJlanguage.g:1602:3: rule__OutroTermoRelacional__TermoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoRelacional__TermoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutroTermoRelacionalAccess().getTermoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoRelacional__Group__1__Impl"


    // $ANTLR start "rule__TermoComparacaoRelacional__Group__0"
    // InternalJlanguage.g:1611:1: rule__TermoComparacaoRelacional__Group__0 : rule__TermoComparacaoRelacional__Group__0__Impl rule__TermoComparacaoRelacional__Group__1 ;
    public final void rule__TermoComparacaoRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1615:1: ( rule__TermoComparacaoRelacional__Group__0__Impl rule__TermoComparacaoRelacional__Group__1 )
            // InternalJlanguage.g:1616:2: rule__TermoComparacaoRelacional__Group__0__Impl rule__TermoComparacaoRelacional__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__TermoComparacaoRelacional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermoComparacaoRelacional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoComparacaoRelacional__Group__0"


    // $ANTLR start "rule__TermoComparacaoRelacional__Group__0__Impl"
    // InternalJlanguage.g:1623:1: rule__TermoComparacaoRelacional__Group__0__Impl : ( ( rule__TermoComparacaoRelacional__Expr1Assignment_0 ) ) ;
    public final void rule__TermoComparacaoRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1627:1: ( ( ( rule__TermoComparacaoRelacional__Expr1Assignment_0 ) ) )
            // InternalJlanguage.g:1628:1: ( ( rule__TermoComparacaoRelacional__Expr1Assignment_0 ) )
            {
            // InternalJlanguage.g:1628:1: ( ( rule__TermoComparacaoRelacional__Expr1Assignment_0 ) )
            // InternalJlanguage.g:1629:2: ( rule__TermoComparacaoRelacional__Expr1Assignment_0 )
            {
             before(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr1Assignment_0()); 
            // InternalJlanguage.g:1630:2: ( rule__TermoComparacaoRelacional__Expr1Assignment_0 )
            // InternalJlanguage.g:1630:3: rule__TermoComparacaoRelacional__Expr1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TermoComparacaoRelacional__Expr1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoComparacaoRelacional__Group__0__Impl"


    // $ANTLR start "rule__TermoComparacaoRelacional__Group__1"
    // InternalJlanguage.g:1638:1: rule__TermoComparacaoRelacional__Group__1 : rule__TermoComparacaoRelacional__Group__1__Impl rule__TermoComparacaoRelacional__Group__2 ;
    public final void rule__TermoComparacaoRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1642:1: ( rule__TermoComparacaoRelacional__Group__1__Impl rule__TermoComparacaoRelacional__Group__2 )
            // InternalJlanguage.g:1643:2: rule__TermoComparacaoRelacional__Group__1__Impl rule__TermoComparacaoRelacional__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__TermoComparacaoRelacional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermoComparacaoRelacional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoComparacaoRelacional__Group__1"


    // $ANTLR start "rule__TermoComparacaoRelacional__Group__1__Impl"
    // InternalJlanguage.g:1650:1: rule__TermoComparacaoRelacional__Group__1__Impl : ( ( rule__TermoComparacaoRelacional__OpRelAssignment_1 ) ) ;
    public final void rule__TermoComparacaoRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1654:1: ( ( ( rule__TermoComparacaoRelacional__OpRelAssignment_1 ) ) )
            // InternalJlanguage.g:1655:1: ( ( rule__TermoComparacaoRelacional__OpRelAssignment_1 ) )
            {
            // InternalJlanguage.g:1655:1: ( ( rule__TermoComparacaoRelacional__OpRelAssignment_1 ) )
            // InternalJlanguage.g:1656:2: ( rule__TermoComparacaoRelacional__OpRelAssignment_1 )
            {
             before(grammarAccess.getTermoComparacaoRelacionalAccess().getOpRelAssignment_1()); 
            // InternalJlanguage.g:1657:2: ( rule__TermoComparacaoRelacional__OpRelAssignment_1 )
            // InternalJlanguage.g:1657:3: rule__TermoComparacaoRelacional__OpRelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TermoComparacaoRelacional__OpRelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTermoComparacaoRelacionalAccess().getOpRelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoComparacaoRelacional__Group__1__Impl"


    // $ANTLR start "rule__TermoComparacaoRelacional__Group__2"
    // InternalJlanguage.g:1665:1: rule__TermoComparacaoRelacional__Group__2 : rule__TermoComparacaoRelacional__Group__2__Impl ;
    public final void rule__TermoComparacaoRelacional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1669:1: ( rule__TermoComparacaoRelacional__Group__2__Impl )
            // InternalJlanguage.g:1670:2: rule__TermoComparacaoRelacional__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermoComparacaoRelacional__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoComparacaoRelacional__Group__2"


    // $ANTLR start "rule__TermoComparacaoRelacional__Group__2__Impl"
    // InternalJlanguage.g:1676:1: rule__TermoComparacaoRelacional__Group__2__Impl : ( ( rule__TermoComparacaoRelacional__Expr2Assignment_2 ) ) ;
    public final void rule__TermoComparacaoRelacional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1680:1: ( ( ( rule__TermoComparacaoRelacional__Expr2Assignment_2 ) ) )
            // InternalJlanguage.g:1681:1: ( ( rule__TermoComparacaoRelacional__Expr2Assignment_2 ) )
            {
            // InternalJlanguage.g:1681:1: ( ( rule__TermoComparacaoRelacional__Expr2Assignment_2 ) )
            // InternalJlanguage.g:1682:2: ( rule__TermoComparacaoRelacional__Expr2Assignment_2 )
            {
             before(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr2Assignment_2()); 
            // InternalJlanguage.g:1683:2: ( rule__TermoComparacaoRelacional__Expr2Assignment_2 )
            // InternalJlanguage.g:1683:3: rule__TermoComparacaoRelacional__Expr2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TermoComparacaoRelacional__Expr2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoComparacaoRelacional__Group__2__Impl"


    // $ANTLR start "rule__TermoSubExpressaoRelacional__Group__0"
    // InternalJlanguage.g:1692:1: rule__TermoSubExpressaoRelacional__Group__0 : rule__TermoSubExpressaoRelacional__Group__0__Impl rule__TermoSubExpressaoRelacional__Group__1 ;
    public final void rule__TermoSubExpressaoRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1696:1: ( rule__TermoSubExpressaoRelacional__Group__0__Impl rule__TermoSubExpressaoRelacional__Group__1 )
            // InternalJlanguage.g:1697:2: rule__TermoSubExpressaoRelacional__Group__0__Impl rule__TermoSubExpressaoRelacional__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TermoSubExpressaoRelacional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermoSubExpressaoRelacional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoSubExpressaoRelacional__Group__0"


    // $ANTLR start "rule__TermoSubExpressaoRelacional__Group__0__Impl"
    // InternalJlanguage.g:1704:1: rule__TermoSubExpressaoRelacional__Group__0__Impl : ( '[' ) ;
    public final void rule__TermoSubExpressaoRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1708:1: ( ( '[' ) )
            // InternalJlanguage.g:1709:1: ( '[' )
            {
            // InternalJlanguage.g:1709:1: ( '[' )
            // InternalJlanguage.g:1710:2: '['
            {
             before(grammarAccess.getTermoSubExpressaoRelacionalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTermoSubExpressaoRelacionalAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoSubExpressaoRelacional__Group__0__Impl"


    // $ANTLR start "rule__TermoSubExpressaoRelacional__Group__1"
    // InternalJlanguage.g:1719:1: rule__TermoSubExpressaoRelacional__Group__1 : rule__TermoSubExpressaoRelacional__Group__1__Impl rule__TermoSubExpressaoRelacional__Group__2 ;
    public final void rule__TermoSubExpressaoRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1723:1: ( rule__TermoSubExpressaoRelacional__Group__1__Impl rule__TermoSubExpressaoRelacional__Group__2 )
            // InternalJlanguage.g:1724:2: rule__TermoSubExpressaoRelacional__Group__1__Impl rule__TermoSubExpressaoRelacional__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__TermoSubExpressaoRelacional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermoSubExpressaoRelacional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoSubExpressaoRelacional__Group__1"


    // $ANTLR start "rule__TermoSubExpressaoRelacional__Group__1__Impl"
    // InternalJlanguage.g:1731:1: rule__TermoSubExpressaoRelacional__Group__1__Impl : ( ( rule__TermoSubExpressaoRelacional__ExpRelAssignment_1 ) ) ;
    public final void rule__TermoSubExpressaoRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1735:1: ( ( ( rule__TermoSubExpressaoRelacional__ExpRelAssignment_1 ) ) )
            // InternalJlanguage.g:1736:1: ( ( rule__TermoSubExpressaoRelacional__ExpRelAssignment_1 ) )
            {
            // InternalJlanguage.g:1736:1: ( ( rule__TermoSubExpressaoRelacional__ExpRelAssignment_1 ) )
            // InternalJlanguage.g:1737:2: ( rule__TermoSubExpressaoRelacional__ExpRelAssignment_1 )
            {
             before(grammarAccess.getTermoSubExpressaoRelacionalAccess().getExpRelAssignment_1()); 
            // InternalJlanguage.g:1738:2: ( rule__TermoSubExpressaoRelacional__ExpRelAssignment_1 )
            // InternalJlanguage.g:1738:3: rule__TermoSubExpressaoRelacional__ExpRelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TermoSubExpressaoRelacional__ExpRelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTermoSubExpressaoRelacionalAccess().getExpRelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoSubExpressaoRelacional__Group__1__Impl"


    // $ANTLR start "rule__TermoSubExpressaoRelacional__Group__2"
    // InternalJlanguage.g:1746:1: rule__TermoSubExpressaoRelacional__Group__2 : rule__TermoSubExpressaoRelacional__Group__2__Impl ;
    public final void rule__TermoSubExpressaoRelacional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1750:1: ( rule__TermoSubExpressaoRelacional__Group__2__Impl )
            // InternalJlanguage.g:1751:2: rule__TermoSubExpressaoRelacional__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermoSubExpressaoRelacional__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoSubExpressaoRelacional__Group__2"


    // $ANTLR start "rule__TermoSubExpressaoRelacional__Group__2__Impl"
    // InternalJlanguage.g:1757:1: rule__TermoSubExpressaoRelacional__Group__2__Impl : ( ']' ) ;
    public final void rule__TermoSubExpressaoRelacional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1761:1: ( ( ']' ) )
            // InternalJlanguage.g:1762:1: ( ']' )
            {
            // InternalJlanguage.g:1762:1: ( ']' )
            // InternalJlanguage.g:1763:2: ']'
            {
             before(grammarAccess.getTermoSubExpressaoRelacionalAccess().getRightSquareBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTermoSubExpressaoRelacionalAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoSubExpressaoRelacional__Group__2__Impl"


    // $ANTLR start "rule__ComandoAtibuicao__Group__0"
    // InternalJlanguage.g:1773:1: rule__ComandoAtibuicao__Group__0 : rule__ComandoAtibuicao__Group__0__Impl rule__ComandoAtibuicao__Group__1 ;
    public final void rule__ComandoAtibuicao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1777:1: ( rule__ComandoAtibuicao__Group__0__Impl rule__ComandoAtibuicao__Group__1 )
            // InternalJlanguage.g:1778:2: rule__ComandoAtibuicao__Group__0__Impl rule__ComandoAtibuicao__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ComandoAtibuicao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoAtibuicao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__Group__0"


    // $ANTLR start "rule__ComandoAtibuicao__Group__0__Impl"
    // InternalJlanguage.g:1785:1: rule__ComandoAtibuicao__Group__0__Impl : ( 'ATRIBUIR' ) ;
    public final void rule__ComandoAtibuicao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1789:1: ( ( 'ATRIBUIR' ) )
            // InternalJlanguage.g:1790:1: ( 'ATRIBUIR' )
            {
            // InternalJlanguage.g:1790:1: ( 'ATRIBUIR' )
            // InternalJlanguage.g:1791:2: 'ATRIBUIR'
            {
             before(grammarAccess.getComandoAtibuicaoAccess().getATRIBUIRKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComandoAtibuicaoAccess().getATRIBUIRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__Group__0__Impl"


    // $ANTLR start "rule__ComandoAtibuicao__Group__1"
    // InternalJlanguage.g:1800:1: rule__ComandoAtibuicao__Group__1 : rule__ComandoAtibuicao__Group__1__Impl rule__ComandoAtibuicao__Group__2 ;
    public final void rule__ComandoAtibuicao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1804:1: ( rule__ComandoAtibuicao__Group__1__Impl rule__ComandoAtibuicao__Group__2 )
            // InternalJlanguage.g:1805:2: rule__ComandoAtibuicao__Group__1__Impl rule__ComandoAtibuicao__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ComandoAtibuicao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoAtibuicao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__Group__1"


    // $ANTLR start "rule__ComandoAtibuicao__Group__1__Impl"
    // InternalJlanguage.g:1812:1: rule__ComandoAtibuicao__Group__1__Impl : ( ( rule__ComandoAtibuicao__ExpAssignment_1 ) ) ;
    public final void rule__ComandoAtibuicao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1816:1: ( ( ( rule__ComandoAtibuicao__ExpAssignment_1 ) ) )
            // InternalJlanguage.g:1817:1: ( ( rule__ComandoAtibuicao__ExpAssignment_1 ) )
            {
            // InternalJlanguage.g:1817:1: ( ( rule__ComandoAtibuicao__ExpAssignment_1 ) )
            // InternalJlanguage.g:1818:2: ( rule__ComandoAtibuicao__ExpAssignment_1 )
            {
             before(grammarAccess.getComandoAtibuicaoAccess().getExpAssignment_1()); 
            // InternalJlanguage.g:1819:2: ( rule__ComandoAtibuicao__ExpAssignment_1 )
            // InternalJlanguage.g:1819:3: rule__ComandoAtibuicao__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoAtibuicao__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoAtibuicaoAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__Group__1__Impl"


    // $ANTLR start "rule__ComandoAtibuicao__Group__2"
    // InternalJlanguage.g:1827:1: rule__ComandoAtibuicao__Group__2 : rule__ComandoAtibuicao__Group__2__Impl rule__ComandoAtibuicao__Group__3 ;
    public final void rule__ComandoAtibuicao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1831:1: ( rule__ComandoAtibuicao__Group__2__Impl rule__ComandoAtibuicao__Group__3 )
            // InternalJlanguage.g:1832:2: rule__ComandoAtibuicao__Group__2__Impl rule__ComandoAtibuicao__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ComandoAtibuicao__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoAtibuicao__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__Group__2"


    // $ANTLR start "rule__ComandoAtibuicao__Group__2__Impl"
    // InternalJlanguage.g:1839:1: rule__ComandoAtibuicao__Group__2__Impl : ( 'A' ) ;
    public final void rule__ComandoAtibuicao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1843:1: ( ( 'A' ) )
            // InternalJlanguage.g:1844:1: ( 'A' )
            {
            // InternalJlanguage.g:1844:1: ( 'A' )
            // InternalJlanguage.g:1845:2: 'A'
            {
             before(grammarAccess.getComandoAtibuicaoAccess().getAKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComandoAtibuicaoAccess().getAKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__Group__2__Impl"


    // $ANTLR start "rule__ComandoAtibuicao__Group__3"
    // InternalJlanguage.g:1854:1: rule__ComandoAtibuicao__Group__3 : rule__ComandoAtibuicao__Group__3__Impl ;
    public final void rule__ComandoAtibuicao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1858:1: ( rule__ComandoAtibuicao__Group__3__Impl )
            // InternalJlanguage.g:1859:2: rule__ComandoAtibuicao__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoAtibuicao__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__Group__3"


    // $ANTLR start "rule__ComandoAtibuicao__Group__3__Impl"
    // InternalJlanguage.g:1865:1: rule__ComandoAtibuicao__Group__3__Impl : ( ( rule__ComandoAtibuicao__VariavelAssignment_3 ) ) ;
    public final void rule__ComandoAtibuicao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1869:1: ( ( ( rule__ComandoAtibuicao__VariavelAssignment_3 ) ) )
            // InternalJlanguage.g:1870:1: ( ( rule__ComandoAtibuicao__VariavelAssignment_3 ) )
            {
            // InternalJlanguage.g:1870:1: ( ( rule__ComandoAtibuicao__VariavelAssignment_3 ) )
            // InternalJlanguage.g:1871:2: ( rule__ComandoAtibuicao__VariavelAssignment_3 )
            {
             before(grammarAccess.getComandoAtibuicaoAccess().getVariavelAssignment_3()); 
            // InternalJlanguage.g:1872:2: ( rule__ComandoAtibuicao__VariavelAssignment_3 )
            // InternalJlanguage.g:1872:3: rule__ComandoAtibuicao__VariavelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComandoAtibuicao__VariavelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComandoAtibuicaoAccess().getVariavelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__Group__3__Impl"


    // $ANTLR start "rule__ComandoEntrada__Group__0"
    // InternalJlanguage.g:1881:1: rule__ComandoEntrada__Group__0 : rule__ComandoEntrada__Group__0__Impl rule__ComandoEntrada__Group__1 ;
    public final void rule__ComandoEntrada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1885:1: ( rule__ComandoEntrada__Group__0__Impl rule__ComandoEntrada__Group__1 )
            // InternalJlanguage.g:1886:2: rule__ComandoEntrada__Group__0__Impl rule__ComandoEntrada__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComandoEntrada__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEntrada__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEntrada__Group__0"


    // $ANTLR start "rule__ComandoEntrada__Group__0__Impl"
    // InternalJlanguage.g:1893:1: rule__ComandoEntrada__Group__0__Impl : ( 'LER' ) ;
    public final void rule__ComandoEntrada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1897:1: ( ( 'LER' ) )
            // InternalJlanguage.g:1898:1: ( 'LER' )
            {
            // InternalJlanguage.g:1898:1: ( 'LER' )
            // InternalJlanguage.g:1899:2: 'LER'
            {
             before(grammarAccess.getComandoEntradaAccess().getLERKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComandoEntradaAccess().getLERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEntrada__Group__0__Impl"


    // $ANTLR start "rule__ComandoEntrada__Group__1"
    // InternalJlanguage.g:1908:1: rule__ComandoEntrada__Group__1 : rule__ComandoEntrada__Group__1__Impl ;
    public final void rule__ComandoEntrada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1912:1: ( rule__ComandoEntrada__Group__1__Impl )
            // InternalJlanguage.g:1913:2: rule__ComandoEntrada__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEntrada__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEntrada__Group__1"


    // $ANTLR start "rule__ComandoEntrada__Group__1__Impl"
    // InternalJlanguage.g:1919:1: rule__ComandoEntrada__Group__1__Impl : ( ( rule__ComandoEntrada__VariavelAssignment_1 ) ) ;
    public final void rule__ComandoEntrada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1923:1: ( ( ( rule__ComandoEntrada__VariavelAssignment_1 ) ) )
            // InternalJlanguage.g:1924:1: ( ( rule__ComandoEntrada__VariavelAssignment_1 ) )
            {
            // InternalJlanguage.g:1924:1: ( ( rule__ComandoEntrada__VariavelAssignment_1 ) )
            // InternalJlanguage.g:1925:2: ( rule__ComandoEntrada__VariavelAssignment_1 )
            {
             before(grammarAccess.getComandoEntradaAccess().getVariavelAssignment_1()); 
            // InternalJlanguage.g:1926:2: ( rule__ComandoEntrada__VariavelAssignment_1 )
            // InternalJlanguage.g:1926:3: rule__ComandoEntrada__VariavelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEntrada__VariavelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoEntradaAccess().getVariavelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEntrada__Group__1__Impl"


    // $ANTLR start "rule__ComandoSaida__Group__0"
    // InternalJlanguage.g:1935:1: rule__ComandoSaida__Group__0 : rule__ComandoSaida__Group__0__Impl rule__ComandoSaida__Group__1 ;
    public final void rule__ComandoSaida__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1939:1: ( rule__ComandoSaida__Group__0__Impl rule__ComandoSaida__Group__1 )
            // InternalJlanguage.g:1940:2: rule__ComandoSaida__Group__0__Impl rule__ComandoSaida__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComandoSaida__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoSaida__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSaida__Group__0"


    // $ANTLR start "rule__ComandoSaida__Group__0__Impl"
    // InternalJlanguage.g:1947:1: rule__ComandoSaida__Group__0__Impl : ( 'IMPRIMIR' ) ;
    public final void rule__ComandoSaida__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1951:1: ( ( 'IMPRIMIR' ) )
            // InternalJlanguage.g:1952:1: ( 'IMPRIMIR' )
            {
            // InternalJlanguage.g:1952:1: ( 'IMPRIMIR' )
            // InternalJlanguage.g:1953:2: 'IMPRIMIR'
            {
             before(grammarAccess.getComandoSaidaAccess().getIMPRIMIRKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComandoSaidaAccess().getIMPRIMIRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSaida__Group__0__Impl"


    // $ANTLR start "rule__ComandoSaida__Group__1"
    // InternalJlanguage.g:1962:1: rule__ComandoSaida__Group__1 : rule__ComandoSaida__Group__1__Impl ;
    public final void rule__ComandoSaida__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1966:1: ( rule__ComandoSaida__Group__1__Impl )
            // InternalJlanguage.g:1967:2: rule__ComandoSaida__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSaida__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSaida__Group__1"


    // $ANTLR start "rule__ComandoSaida__Group__1__Impl"
    // InternalJlanguage.g:1973:1: rule__ComandoSaida__Group__1__Impl : ( ( rule__ComandoSaida__VariavelAssignment_1 ) ) ;
    public final void rule__ComandoSaida__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1977:1: ( ( ( rule__ComandoSaida__VariavelAssignment_1 ) ) )
            // InternalJlanguage.g:1978:1: ( ( rule__ComandoSaida__VariavelAssignment_1 ) )
            {
            // InternalJlanguage.g:1978:1: ( ( rule__ComandoSaida__VariavelAssignment_1 ) )
            // InternalJlanguage.g:1979:2: ( rule__ComandoSaida__VariavelAssignment_1 )
            {
             before(grammarAccess.getComandoSaidaAccess().getVariavelAssignment_1()); 
            // InternalJlanguage.g:1980:2: ( rule__ComandoSaida__VariavelAssignment_1 )
            // InternalJlanguage.g:1980:3: rule__ComandoSaida__VariavelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSaida__VariavelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoSaidaAccess().getVariavelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSaida__Group__1__Impl"


    // $ANTLR start "rule__ComandoCondicao__Group__0"
    // InternalJlanguage.g:1989:1: rule__ComandoCondicao__Group__0 : rule__ComandoCondicao__Group__0__Impl rule__ComandoCondicao__Group__1 ;
    public final void rule__ComandoCondicao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:1993:1: ( rule__ComandoCondicao__Group__0__Impl rule__ComandoCondicao__Group__1 )
            // InternalJlanguage.g:1994:2: rule__ComandoCondicao__Group__0__Impl rule__ComandoCondicao__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ComandoCondicao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__0"


    // $ANTLR start "rule__ComandoCondicao__Group__0__Impl"
    // InternalJlanguage.g:2001:1: rule__ComandoCondicao__Group__0__Impl : ( 'SE' ) ;
    public final void rule__ComandoCondicao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2005:1: ( ( 'SE' ) )
            // InternalJlanguage.g:2006:1: ( 'SE' )
            {
            // InternalJlanguage.g:2006:1: ( 'SE' )
            // InternalJlanguage.g:2007:2: 'SE'
            {
             before(grammarAccess.getComandoCondicaoAccess().getSEKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComandoCondicaoAccess().getSEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__0__Impl"


    // $ANTLR start "rule__ComandoCondicao__Group__1"
    // InternalJlanguage.g:2016:1: rule__ComandoCondicao__Group__1 : rule__ComandoCondicao__Group__1__Impl rule__ComandoCondicao__Group__2 ;
    public final void rule__ComandoCondicao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2020:1: ( rule__ComandoCondicao__Group__1__Impl rule__ComandoCondicao__Group__2 )
            // InternalJlanguage.g:2021:2: rule__ComandoCondicao__Group__1__Impl rule__ComandoCondicao__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ComandoCondicao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__1"


    // $ANTLR start "rule__ComandoCondicao__Group__1__Impl"
    // InternalJlanguage.g:2028:1: rule__ComandoCondicao__Group__1__Impl : ( ( rule__ComandoCondicao__ExpAssignment_1 ) ) ;
    public final void rule__ComandoCondicao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2032:1: ( ( ( rule__ComandoCondicao__ExpAssignment_1 ) ) )
            // InternalJlanguage.g:2033:1: ( ( rule__ComandoCondicao__ExpAssignment_1 ) )
            {
            // InternalJlanguage.g:2033:1: ( ( rule__ComandoCondicao__ExpAssignment_1 ) )
            // InternalJlanguage.g:2034:2: ( rule__ComandoCondicao__ExpAssignment_1 )
            {
             before(grammarAccess.getComandoCondicaoAccess().getExpAssignment_1()); 
            // InternalJlanguage.g:2035:2: ( rule__ComandoCondicao__ExpAssignment_1 )
            // InternalJlanguage.g:2035:3: rule__ComandoCondicao__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoCondicaoAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__1__Impl"


    // $ANTLR start "rule__ComandoCondicao__Group__2"
    // InternalJlanguage.g:2043:1: rule__ComandoCondicao__Group__2 : rule__ComandoCondicao__Group__2__Impl rule__ComandoCondicao__Group__3 ;
    public final void rule__ComandoCondicao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2047:1: ( rule__ComandoCondicao__Group__2__Impl rule__ComandoCondicao__Group__3 )
            // InternalJlanguage.g:2048:2: rule__ComandoCondicao__Group__2__Impl rule__ComandoCondicao__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ComandoCondicao__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__2"


    // $ANTLR start "rule__ComandoCondicao__Group__2__Impl"
    // InternalJlanguage.g:2055:1: rule__ComandoCondicao__Group__2__Impl : ( 'ENTAO' ) ;
    public final void rule__ComandoCondicao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2059:1: ( ( 'ENTAO' ) )
            // InternalJlanguage.g:2060:1: ( 'ENTAO' )
            {
            // InternalJlanguage.g:2060:1: ( 'ENTAO' )
            // InternalJlanguage.g:2061:2: 'ENTAO'
            {
             before(grammarAccess.getComandoCondicaoAccess().getENTAOKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComandoCondicaoAccess().getENTAOKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__2__Impl"


    // $ANTLR start "rule__ComandoCondicao__Group__3"
    // InternalJlanguage.g:2070:1: rule__ComandoCondicao__Group__3 : rule__ComandoCondicao__Group__3__Impl rule__ComandoCondicao__Group__4 ;
    public final void rule__ComandoCondicao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2074:1: ( rule__ComandoCondicao__Group__3__Impl rule__ComandoCondicao__Group__4 )
            // InternalJlanguage.g:2075:2: rule__ComandoCondicao__Group__3__Impl rule__ComandoCondicao__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ComandoCondicao__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__3"


    // $ANTLR start "rule__ComandoCondicao__Group__3__Impl"
    // InternalJlanguage.g:2082:1: rule__ComandoCondicao__Group__3__Impl : ( ( rule__ComandoCondicao__Cmd1Assignment_3 ) ) ;
    public final void rule__ComandoCondicao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2086:1: ( ( ( rule__ComandoCondicao__Cmd1Assignment_3 ) ) )
            // InternalJlanguage.g:2087:1: ( ( rule__ComandoCondicao__Cmd1Assignment_3 ) )
            {
            // InternalJlanguage.g:2087:1: ( ( rule__ComandoCondicao__Cmd1Assignment_3 ) )
            // InternalJlanguage.g:2088:2: ( rule__ComandoCondicao__Cmd1Assignment_3 )
            {
             before(grammarAccess.getComandoCondicaoAccess().getCmd1Assignment_3()); 
            // InternalJlanguage.g:2089:2: ( rule__ComandoCondicao__Cmd1Assignment_3 )
            // InternalJlanguage.g:2089:3: rule__ComandoCondicao__Cmd1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Cmd1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComandoCondicaoAccess().getCmd1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__3__Impl"


    // $ANTLR start "rule__ComandoCondicao__Group__4"
    // InternalJlanguage.g:2097:1: rule__ComandoCondicao__Group__4 : rule__ComandoCondicao__Group__4__Impl ;
    public final void rule__ComandoCondicao__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2101:1: ( rule__ComandoCondicao__Group__4__Impl )
            // InternalJlanguage.g:2102:2: rule__ComandoCondicao__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__4"


    // $ANTLR start "rule__ComandoCondicao__Group__4__Impl"
    // InternalJlanguage.g:2108:1: rule__ComandoCondicao__Group__4__Impl : ( ( rule__ComandoCondicao__Group_4__0 )? ) ;
    public final void rule__ComandoCondicao__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2112:1: ( ( ( rule__ComandoCondicao__Group_4__0 )? ) )
            // InternalJlanguage.g:2113:1: ( ( rule__ComandoCondicao__Group_4__0 )? )
            {
            // InternalJlanguage.g:2113:1: ( ( rule__ComandoCondicao__Group_4__0 )? )
            // InternalJlanguage.g:2114:2: ( rule__ComandoCondicao__Group_4__0 )?
            {
             before(grammarAccess.getComandoCondicaoAccess().getGroup_4()); 
            // InternalJlanguage.g:2115:2: ( rule__ComandoCondicao__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJlanguage.g:2115:3: rule__ComandoCondicao__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoCondicao__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComandoCondicaoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group__4__Impl"


    // $ANTLR start "rule__ComandoCondicao__Group_4__0"
    // InternalJlanguage.g:2124:1: rule__ComandoCondicao__Group_4__0 : rule__ComandoCondicao__Group_4__0__Impl rule__ComandoCondicao__Group_4__1 ;
    public final void rule__ComandoCondicao__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2128:1: ( rule__ComandoCondicao__Group_4__0__Impl rule__ComandoCondicao__Group_4__1 )
            // InternalJlanguage.g:2129:2: rule__ComandoCondicao__Group_4__0__Impl rule__ComandoCondicao__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__ComandoCondicao__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group_4__0"


    // $ANTLR start "rule__ComandoCondicao__Group_4__0__Impl"
    // InternalJlanguage.g:2136:1: rule__ComandoCondicao__Group_4__0__Impl : ( 'SENAO' ) ;
    public final void rule__ComandoCondicao__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2140:1: ( ( 'SENAO' ) )
            // InternalJlanguage.g:2141:1: ( 'SENAO' )
            {
            // InternalJlanguage.g:2141:1: ( 'SENAO' )
            // InternalJlanguage.g:2142:2: 'SENAO'
            {
             before(grammarAccess.getComandoCondicaoAccess().getSENAOKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComandoCondicaoAccess().getSENAOKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group_4__0__Impl"


    // $ANTLR start "rule__ComandoCondicao__Group_4__1"
    // InternalJlanguage.g:2151:1: rule__ComandoCondicao__Group_4__1 : rule__ComandoCondicao__Group_4__1__Impl ;
    public final void rule__ComandoCondicao__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2155:1: ( rule__ComandoCondicao__Group_4__1__Impl )
            // InternalJlanguage.g:2156:2: rule__ComandoCondicao__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group_4__1"


    // $ANTLR start "rule__ComandoCondicao__Group_4__1__Impl"
    // InternalJlanguage.g:2162:1: rule__ComandoCondicao__Group_4__1__Impl : ( ( rule__ComandoCondicao__Cmd2Assignment_4_1 ) ) ;
    public final void rule__ComandoCondicao__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2166:1: ( ( ( rule__ComandoCondicao__Cmd2Assignment_4_1 ) ) )
            // InternalJlanguage.g:2167:1: ( ( rule__ComandoCondicao__Cmd2Assignment_4_1 ) )
            {
            // InternalJlanguage.g:2167:1: ( ( rule__ComandoCondicao__Cmd2Assignment_4_1 ) )
            // InternalJlanguage.g:2168:2: ( rule__ComandoCondicao__Cmd2Assignment_4_1 )
            {
             before(grammarAccess.getComandoCondicaoAccess().getCmd2Assignment_4_1()); 
            // InternalJlanguage.g:2169:2: ( rule__ComandoCondicao__Cmd2Assignment_4_1 )
            // InternalJlanguage.g:2169:3: rule__ComandoCondicao__Cmd2Assignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCondicao__Cmd2Assignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoCondicaoAccess().getCmd2Assignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Group_4__1__Impl"


    // $ANTLR start "rule__ComandoRepeticao__Group__0"
    // InternalJlanguage.g:2178:1: rule__ComandoRepeticao__Group__0 : rule__ComandoRepeticao__Group__0__Impl rule__ComandoRepeticao__Group__1 ;
    public final void rule__ComandoRepeticao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2182:1: ( rule__ComandoRepeticao__Group__0__Impl rule__ComandoRepeticao__Group__1 )
            // InternalJlanguage.g:2183:2: rule__ComandoRepeticao__Group__0__Impl rule__ComandoRepeticao__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ComandoRepeticao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoRepeticao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRepeticao__Group__0"


    // $ANTLR start "rule__ComandoRepeticao__Group__0__Impl"
    // InternalJlanguage.g:2190:1: rule__ComandoRepeticao__Group__0__Impl : ( 'ENQUANTO' ) ;
    public final void rule__ComandoRepeticao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2194:1: ( ( 'ENQUANTO' ) )
            // InternalJlanguage.g:2195:1: ( 'ENQUANTO' )
            {
            // InternalJlanguage.g:2195:1: ( 'ENQUANTO' )
            // InternalJlanguage.g:2196:2: 'ENQUANTO'
            {
             before(grammarAccess.getComandoRepeticaoAccess().getENQUANTOKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComandoRepeticaoAccess().getENQUANTOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRepeticao__Group__0__Impl"


    // $ANTLR start "rule__ComandoRepeticao__Group__1"
    // InternalJlanguage.g:2205:1: rule__ComandoRepeticao__Group__1 : rule__ComandoRepeticao__Group__1__Impl rule__ComandoRepeticao__Group__2 ;
    public final void rule__ComandoRepeticao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2209:1: ( rule__ComandoRepeticao__Group__1__Impl rule__ComandoRepeticao__Group__2 )
            // InternalJlanguage.g:2210:2: rule__ComandoRepeticao__Group__1__Impl rule__ComandoRepeticao__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ComandoRepeticao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoRepeticao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRepeticao__Group__1"


    // $ANTLR start "rule__ComandoRepeticao__Group__1__Impl"
    // InternalJlanguage.g:2217:1: rule__ComandoRepeticao__Group__1__Impl : ( ( rule__ComandoRepeticao__ExpAssignment_1 ) ) ;
    public final void rule__ComandoRepeticao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2221:1: ( ( ( rule__ComandoRepeticao__ExpAssignment_1 ) ) )
            // InternalJlanguage.g:2222:1: ( ( rule__ComandoRepeticao__ExpAssignment_1 ) )
            {
            // InternalJlanguage.g:2222:1: ( ( rule__ComandoRepeticao__ExpAssignment_1 ) )
            // InternalJlanguage.g:2223:2: ( rule__ComandoRepeticao__ExpAssignment_1 )
            {
             before(grammarAccess.getComandoRepeticaoAccess().getExpAssignment_1()); 
            // InternalJlanguage.g:2224:2: ( rule__ComandoRepeticao__ExpAssignment_1 )
            // InternalJlanguage.g:2224:3: rule__ComandoRepeticao__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoRepeticao__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoRepeticaoAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRepeticao__Group__1__Impl"


    // $ANTLR start "rule__ComandoRepeticao__Group__2"
    // InternalJlanguage.g:2232:1: rule__ComandoRepeticao__Group__2 : rule__ComandoRepeticao__Group__2__Impl ;
    public final void rule__ComandoRepeticao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2236:1: ( rule__ComandoRepeticao__Group__2__Impl )
            // InternalJlanguage.g:2237:2: rule__ComandoRepeticao__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoRepeticao__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRepeticao__Group__2"


    // $ANTLR start "rule__ComandoRepeticao__Group__2__Impl"
    // InternalJlanguage.g:2243:1: rule__ComandoRepeticao__Group__2__Impl : ( ( rule__ComandoRepeticao__CmdAssignment_2 ) ) ;
    public final void rule__ComandoRepeticao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2247:1: ( ( ( rule__ComandoRepeticao__CmdAssignment_2 ) ) )
            // InternalJlanguage.g:2248:1: ( ( rule__ComandoRepeticao__CmdAssignment_2 ) )
            {
            // InternalJlanguage.g:2248:1: ( ( rule__ComandoRepeticao__CmdAssignment_2 ) )
            // InternalJlanguage.g:2249:2: ( rule__ComandoRepeticao__CmdAssignment_2 )
            {
             before(grammarAccess.getComandoRepeticaoAccess().getCmdAssignment_2()); 
            // InternalJlanguage.g:2250:2: ( rule__ComandoRepeticao__CmdAssignment_2 )
            // InternalJlanguage.g:2250:3: rule__ComandoRepeticao__CmdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComandoRepeticao__CmdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComandoRepeticaoAccess().getCmdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRepeticao__Group__2__Impl"


    // $ANTLR start "rule__ComandoSubAlgoritmo__Group__0"
    // InternalJlanguage.g:2259:1: rule__ComandoSubAlgoritmo__Group__0 : rule__ComandoSubAlgoritmo__Group__0__Impl rule__ComandoSubAlgoritmo__Group__1 ;
    public final void rule__ComandoSubAlgoritmo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2263:1: ( rule__ComandoSubAlgoritmo__Group__0__Impl rule__ComandoSubAlgoritmo__Group__1 )
            // InternalJlanguage.g:2264:2: rule__ComandoSubAlgoritmo__Group__0__Impl rule__ComandoSubAlgoritmo__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ComandoSubAlgoritmo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoSubAlgoritmo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSubAlgoritmo__Group__0"


    // $ANTLR start "rule__ComandoSubAlgoritmo__Group__0__Impl"
    // InternalJlanguage.g:2271:1: rule__ComandoSubAlgoritmo__Group__0__Impl : ( 'INICIO' ) ;
    public final void rule__ComandoSubAlgoritmo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2275:1: ( ( 'INICIO' ) )
            // InternalJlanguage.g:2276:1: ( 'INICIO' )
            {
            // InternalJlanguage.g:2276:1: ( 'INICIO' )
            // InternalJlanguage.g:2277:2: 'INICIO'
            {
             before(grammarAccess.getComandoSubAlgoritmoAccess().getINICIOKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComandoSubAlgoritmoAccess().getINICIOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSubAlgoritmo__Group__0__Impl"


    // $ANTLR start "rule__ComandoSubAlgoritmo__Group__1"
    // InternalJlanguage.g:2286:1: rule__ComandoSubAlgoritmo__Group__1 : rule__ComandoSubAlgoritmo__Group__1__Impl rule__ComandoSubAlgoritmo__Group__2 ;
    public final void rule__ComandoSubAlgoritmo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2290:1: ( rule__ComandoSubAlgoritmo__Group__1__Impl rule__ComandoSubAlgoritmo__Group__2 )
            // InternalJlanguage.g:2291:2: rule__ComandoSubAlgoritmo__Group__1__Impl rule__ComandoSubAlgoritmo__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ComandoSubAlgoritmo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoSubAlgoritmo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSubAlgoritmo__Group__1"


    // $ANTLR start "rule__ComandoSubAlgoritmo__Group__1__Impl"
    // InternalJlanguage.g:2298:1: rule__ComandoSubAlgoritmo__Group__1__Impl : ( ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 ) ) ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )* ) ) ;
    public final void rule__ComandoSubAlgoritmo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2302:1: ( ( ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 ) ) ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )* ) ) )
            // InternalJlanguage.g:2303:1: ( ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 ) ) ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )* ) )
            {
            // InternalJlanguage.g:2303:1: ( ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 ) ) ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )* ) )
            // InternalJlanguage.g:2304:2: ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 ) ) ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )* )
            {
            // InternalJlanguage.g:2304:2: ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 ) )
            // InternalJlanguage.g:2305:3: ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )
            {
             before(grammarAccess.getComandoSubAlgoritmoAccess().getComandosAssignment_1()); 
            // InternalJlanguage.g:2306:3: ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )
            // InternalJlanguage.g:2306:4: rule__ComandoSubAlgoritmo__ComandosAssignment_1
            {
            pushFollow(FOLLOW_9);
            rule__ComandoSubAlgoritmo__ComandosAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoSubAlgoritmoAccess().getComandosAssignment_1()); 

            }

            // InternalJlanguage.g:2309:2: ( ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )* )
            // InternalJlanguage.g:2310:3: ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )*
            {
             before(grammarAccess.getComandoSubAlgoritmoAccess().getComandosAssignment_1()); 
            // InternalJlanguage.g:2311:3: ( rule__ComandoSubAlgoritmo__ComandosAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32||(LA15_0>=34 && LA15_0<=36)||(LA15_0>=39 && LA15_0<=40)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJlanguage.g:2311:4: rule__ComandoSubAlgoritmo__ComandosAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComandoSubAlgoritmo__ComandosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComandoSubAlgoritmoAccess().getComandosAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSubAlgoritmo__Group__1__Impl"


    // $ANTLR start "rule__ComandoSubAlgoritmo__Group__2"
    // InternalJlanguage.g:2320:1: rule__ComandoSubAlgoritmo__Group__2 : rule__ComandoSubAlgoritmo__Group__2__Impl ;
    public final void rule__ComandoSubAlgoritmo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2324:1: ( rule__ComandoSubAlgoritmo__Group__2__Impl )
            // InternalJlanguage.g:2325:2: rule__ComandoSubAlgoritmo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSubAlgoritmo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSubAlgoritmo__Group__2"


    // $ANTLR start "rule__ComandoSubAlgoritmo__Group__2__Impl"
    // InternalJlanguage.g:2331:1: rule__ComandoSubAlgoritmo__Group__2__Impl : ( 'FIM' ) ;
    public final void rule__ComandoSubAlgoritmo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2335:1: ( ( 'FIM' ) )
            // InternalJlanguage.g:2336:1: ( 'FIM' )
            {
            // InternalJlanguage.g:2336:1: ( 'FIM' )
            // InternalJlanguage.g:2337:2: 'FIM'
            {
             before(grammarAccess.getComandoSubAlgoritmoAccess().getFIMKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComandoSubAlgoritmoAccess().getFIMKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSubAlgoritmo__Group__2__Impl"


    // $ANTLR start "rule__Programa__DeclaracoesAssignment_2"
    // InternalJlanguage.g:2347:1: rule__Programa__DeclaracoesAssignment_2 : ( ruleDeclaracao ) ;
    public final void rule__Programa__DeclaracoesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2351:1: ( ( ruleDeclaracao ) )
            // InternalJlanguage.g:2352:2: ( ruleDeclaracao )
            {
            // InternalJlanguage.g:2352:2: ( ruleDeclaracao )
            // InternalJlanguage.g:2353:3: ruleDeclaracao
            {
             before(grammarAccess.getProgramaAccess().getDeclaracoesDeclaracaoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaracao();

            state._fsp--;

             after(grammarAccess.getProgramaAccess().getDeclaracoesDeclaracaoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__DeclaracoesAssignment_2"


    // $ANTLR start "rule__Programa__ComandosAssignment_5"
    // InternalJlanguage.g:2362:1: rule__Programa__ComandosAssignment_5 : ( ruleComando ) ;
    public final void rule__Programa__ComandosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2366:1: ( ( ruleComando ) )
            // InternalJlanguage.g:2367:2: ( ruleComando )
            {
            // InternalJlanguage.g:2367:2: ( ruleComando )
            // InternalJlanguage.g:2368:3: ruleComando
            {
             before(grammarAccess.getProgramaAccess().getComandosComandoParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getProgramaAccess().getComandosComandoParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__ComandosAssignment_5"


    // $ANTLR start "rule__Declaracao__NameAssignment_0"
    // InternalJlanguage.g:2377:1: rule__Declaracao__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Declaracao__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2381:1: ( ( RULE_ID ) )
            // InternalJlanguage.g:2382:2: ( RULE_ID )
            {
            // InternalJlanguage.g:2382:2: ( RULE_ID )
            // InternalJlanguage.g:2383:3: RULE_ID
            {
             before(grammarAccess.getDeclaracaoAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__NameAssignment_0"


    // $ANTLR start "rule__Declaracao__TipoAssignment_2"
    // InternalJlanguage.g:2392:1: rule__Declaracao__TipoAssignment_2 : ( ruleTipoVar ) ;
    public final void rule__Declaracao__TipoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2396:1: ( ( ruleTipoVar ) )
            // InternalJlanguage.g:2397:2: ( ruleTipoVar )
            {
            // InternalJlanguage.g:2397:2: ( ruleTipoVar )
            // InternalJlanguage.g:2398:3: ruleTipoVar
            {
             before(grammarAccess.getDeclaracaoAccess().getTipoTipoVarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoVar();

            state._fsp--;

             after(grammarAccess.getDeclaracaoAccess().getTipoTipoVarParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__TipoAssignment_2"


    // $ANTLR start "rule__ExpressaoAritmetica__Termo1Assignment_0"
    // InternalJlanguage.g:2407:1: rule__ExpressaoAritmetica__Termo1Assignment_0 : ( ruleTermoAritmetico ) ;
    public final void rule__ExpressaoAritmetica__Termo1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2411:1: ( ( ruleTermoAritmetico ) )
            // InternalJlanguage.g:2412:2: ( ruleTermoAritmetico )
            {
            // InternalJlanguage.g:2412:2: ( ruleTermoAritmetico )
            // InternalJlanguage.g:2413:3: ruleTermoAritmetico
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getTermo1TermoAritmeticoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getExpressaoAritmeticaAccess().getTermo1TermoAritmeticoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__Termo1Assignment_0"


    // $ANTLR start "rule__ExpressaoAritmetica__OutrosTermosAssignment_1"
    // InternalJlanguage.g:2422:1: rule__ExpressaoAritmetica__OutrosTermosAssignment_1 : ( ruleOutroTermoAritmetico ) ;
    public final void rule__ExpressaoAritmetica__OutrosTermosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2426:1: ( ( ruleOutroTermoAritmetico ) )
            // InternalJlanguage.g:2427:2: ( ruleOutroTermoAritmetico )
            {
            // InternalJlanguage.g:2427:2: ( ruleOutroTermoAritmetico )
            // InternalJlanguage.g:2428:3: ruleOutroTermoAritmetico
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getOutrosTermosOutroTermoAritmeticoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutroTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getExpressaoAritmeticaAccess().getOutrosTermosOutroTermoAritmeticoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__OutrosTermosAssignment_1"


    // $ANTLR start "rule__OutroTermoAritmetico__OperadorAssignment_0"
    // InternalJlanguage.g:2437:1: rule__OutroTermoAritmetico__OperadorAssignment_0 : ( ruleOpArit1 ) ;
    public final void rule__OutroTermoAritmetico__OperadorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2441:1: ( ( ruleOpArit1 ) )
            // InternalJlanguage.g:2442:2: ( ruleOpArit1 )
            {
            // InternalJlanguage.g:2442:2: ( ruleOpArit1 )
            // InternalJlanguage.g:2443:3: ruleOpArit1
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getOperadorOpArit1ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpArit1();

            state._fsp--;

             after(grammarAccess.getOutroTermoAritmeticoAccess().getOperadorOpArit1ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__OperadorAssignment_0"


    // $ANTLR start "rule__OutroTermoAritmetico__TermoAssignment_1"
    // InternalJlanguage.g:2452:1: rule__OutroTermoAritmetico__TermoAssignment_1 : ( ruleTermoAritmetico ) ;
    public final void rule__OutroTermoAritmetico__TermoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2456:1: ( ( ruleTermoAritmetico ) )
            // InternalJlanguage.g:2457:2: ( ruleTermoAritmetico )
            {
            // InternalJlanguage.g:2457:2: ( ruleTermoAritmetico )
            // InternalJlanguage.g:2458:3: ruleTermoAritmetico
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getTermoTermoAritmeticoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getOutroTermoAritmeticoAccess().getTermoTermoAritmeticoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__TermoAssignment_1"


    // $ANTLR start "rule__TermoAritmetico__Fator1Assignment_0"
    // InternalJlanguage.g:2467:1: rule__TermoAritmetico__Fator1Assignment_0 : ( ruleFatorAritmetico ) ;
    public final void rule__TermoAritmetico__Fator1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2471:1: ( ( ruleFatorAritmetico ) )
            // InternalJlanguage.g:2472:2: ( ruleFatorAritmetico )
            {
            // InternalJlanguage.g:2472:2: ( ruleFatorAritmetico )
            // InternalJlanguage.g:2473:3: ruleFatorAritmetico
            {
             before(grammarAccess.getTermoAritmeticoAccess().getFator1FatorAritmeticoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getTermoAritmeticoAccess().getFator1FatorAritmeticoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__Fator1Assignment_0"


    // $ANTLR start "rule__TermoAritmetico__OutrosFatoresAssignment_1"
    // InternalJlanguage.g:2482:1: rule__TermoAritmetico__OutrosFatoresAssignment_1 : ( ruleOutroFatorAritmetico ) ;
    public final void rule__TermoAritmetico__OutrosFatoresAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2486:1: ( ( ruleOutroFatorAritmetico ) )
            // InternalJlanguage.g:2487:2: ( ruleOutroFatorAritmetico )
            {
            // InternalJlanguage.g:2487:2: ( ruleOutroFatorAritmetico )
            // InternalJlanguage.g:2488:3: ruleOutroFatorAritmetico
            {
             before(grammarAccess.getTermoAritmeticoAccess().getOutrosFatoresOutroFatorAritmeticoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutroFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getTermoAritmeticoAccess().getOutrosFatoresOutroFatorAritmeticoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__OutrosFatoresAssignment_1"


    // $ANTLR start "rule__OutroFatorAritmetico__OperadorAssignment_0"
    // InternalJlanguage.g:2497:1: rule__OutroFatorAritmetico__OperadorAssignment_0 : ( ruleOpArit2 ) ;
    public final void rule__OutroFatorAritmetico__OperadorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2501:1: ( ( ruleOpArit2 ) )
            // InternalJlanguage.g:2502:2: ( ruleOpArit2 )
            {
            // InternalJlanguage.g:2502:2: ( ruleOpArit2 )
            // InternalJlanguage.g:2503:3: ruleOpArit2
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getOperadorOpArit2ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpArit2();

            state._fsp--;

             after(grammarAccess.getOutroFatorAritmeticoAccess().getOperadorOpArit2ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__OperadorAssignment_0"


    // $ANTLR start "rule__OutroFatorAritmetico__FatorAssignment_1"
    // InternalJlanguage.g:2512:1: rule__OutroFatorAritmetico__FatorAssignment_1 : ( ruleFatorAritmetico ) ;
    public final void rule__OutroFatorAritmetico__FatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2516:1: ( ( ruleFatorAritmetico ) )
            // InternalJlanguage.g:2517:2: ( ruleFatorAritmetico )
            {
            // InternalJlanguage.g:2517:2: ( ruleFatorAritmetico )
            // InternalJlanguage.g:2518:3: ruleFatorAritmetico
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getFatorFatorAritmeticoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getOutroFatorAritmeticoAccess().getFatorFatorAritmeticoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__FatorAssignment_1"


    // $ANTLR start "rule__FatorNumero__NumeroAssignment"
    // InternalJlanguage.g:2527:1: rule__FatorNumero__NumeroAssignment : ( RULE_INT ) ;
    public final void rule__FatorNumero__NumeroAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2531:1: ( ( RULE_INT ) )
            // InternalJlanguage.g:2532:2: ( RULE_INT )
            {
            // InternalJlanguage.g:2532:2: ( RULE_INT )
            // InternalJlanguage.g:2533:3: RULE_INT
            {
             before(grammarAccess.getFatorNumeroAccess().getNumeroINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFatorNumeroAccess().getNumeroINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorNumero__NumeroAssignment"


    // $ANTLR start "rule__FatorVariavel__VariavelAssignment"
    // InternalJlanguage.g:2542:1: rule__FatorVariavel__VariavelAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FatorVariavel__VariavelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2546:1: ( ( ( RULE_ID ) ) )
            // InternalJlanguage.g:2547:2: ( ( RULE_ID ) )
            {
            // InternalJlanguage.g:2547:2: ( ( RULE_ID ) )
            // InternalJlanguage.g:2548:3: ( RULE_ID )
            {
             before(grammarAccess.getFatorVariavelAccess().getVariavelDeclaracaoCrossReference_0()); 
            // InternalJlanguage.g:2549:3: ( RULE_ID )
            // InternalJlanguage.g:2550:4: RULE_ID
            {
             before(grammarAccess.getFatorVariavelAccess().getVariavelDeclaracaoIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFatorVariavelAccess().getVariavelDeclaracaoIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getFatorVariavelAccess().getVariavelDeclaracaoCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorVariavel__VariavelAssignment"


    // $ANTLR start "rule__FatorSubExpressao__ExpressaoAssignment_1"
    // InternalJlanguage.g:2561:1: rule__FatorSubExpressao__ExpressaoAssignment_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__FatorSubExpressao__ExpressaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2565:1: ( ( ruleExpressaoAritmetica ) )
            // InternalJlanguage.g:2566:2: ( ruleExpressaoAritmetica )
            {
            // InternalJlanguage.g:2566:2: ( ruleExpressaoAritmetica )
            // InternalJlanguage.g:2567:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getFatorSubExpressaoAccess().getExpressaoExpressaoAritmeticaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getFatorSubExpressaoAccess().getExpressaoExpressaoAritmeticaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorSubExpressao__ExpressaoAssignment_1"


    // $ANTLR start "rule__ExpressaoRelacional__Termo1Assignment_0"
    // InternalJlanguage.g:2576:1: rule__ExpressaoRelacional__Termo1Assignment_0 : ( ruleTermoRelacional ) ;
    public final void rule__ExpressaoRelacional__Termo1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2580:1: ( ( ruleTermoRelacional ) )
            // InternalJlanguage.g:2581:2: ( ruleTermoRelacional )
            {
            // InternalJlanguage.g:2581:2: ( ruleTermoRelacional )
            // InternalJlanguage.g:2582:3: ruleTermoRelacional
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getTermo1TermoRelacionalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTermoRelacional();

            state._fsp--;

             after(grammarAccess.getExpressaoRelacionalAccess().getTermo1TermoRelacionalParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Termo1Assignment_0"


    // $ANTLR start "rule__ExpressaoRelacional__OutrosTermosAssignment_1"
    // InternalJlanguage.g:2591:1: rule__ExpressaoRelacional__OutrosTermosAssignment_1 : ( ruleOutroTermoRelacional ) ;
    public final void rule__ExpressaoRelacional__OutrosTermosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2595:1: ( ( ruleOutroTermoRelacional ) )
            // InternalJlanguage.g:2596:2: ( ruleOutroTermoRelacional )
            {
            // InternalJlanguage.g:2596:2: ( ruleOutroTermoRelacional )
            // InternalJlanguage.g:2597:3: ruleOutroTermoRelacional
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getOutrosTermosOutroTermoRelacionalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutroTermoRelacional();

            state._fsp--;

             after(grammarAccess.getExpressaoRelacionalAccess().getOutrosTermosOutroTermoRelacionalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__OutrosTermosAssignment_1"


    // $ANTLR start "rule__OutroTermoRelacional__OperadorAssignment_0"
    // InternalJlanguage.g:2606:1: rule__OutroTermoRelacional__OperadorAssignment_0 : ( ruleOpBool ) ;
    public final void rule__OutroTermoRelacional__OperadorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2610:1: ( ( ruleOpBool ) )
            // InternalJlanguage.g:2611:2: ( ruleOpBool )
            {
            // InternalJlanguage.g:2611:2: ( ruleOpBool )
            // InternalJlanguage.g:2612:3: ruleOpBool
            {
             before(grammarAccess.getOutroTermoRelacionalAccess().getOperadorOpBoolParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpBool();

            state._fsp--;

             after(grammarAccess.getOutroTermoRelacionalAccess().getOperadorOpBoolParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoRelacional__OperadorAssignment_0"


    // $ANTLR start "rule__OutroTermoRelacional__TermoAssignment_1"
    // InternalJlanguage.g:2621:1: rule__OutroTermoRelacional__TermoAssignment_1 : ( ruleTermoRelacional ) ;
    public final void rule__OutroTermoRelacional__TermoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2625:1: ( ( ruleTermoRelacional ) )
            // InternalJlanguage.g:2626:2: ( ruleTermoRelacional )
            {
            // InternalJlanguage.g:2626:2: ( ruleTermoRelacional )
            // InternalJlanguage.g:2627:3: ruleTermoRelacional
            {
             before(grammarAccess.getOutroTermoRelacionalAccess().getTermoTermoRelacionalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTermoRelacional();

            state._fsp--;

             after(grammarAccess.getOutroTermoRelacionalAccess().getTermoTermoRelacionalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoRelacional__TermoAssignment_1"


    // $ANTLR start "rule__TermoComparacaoRelacional__Expr1Assignment_0"
    // InternalJlanguage.g:2636:1: rule__TermoComparacaoRelacional__Expr1Assignment_0 : ( ruleExpressaoAritmetica ) ;
    public final void rule__TermoComparacaoRelacional__Expr1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2640:1: ( ( ruleExpressaoAritmetica ) )
            // InternalJlanguage.g:2641:2: ( ruleExpressaoAritmetica )
            {
            // InternalJlanguage.g:2641:2: ( ruleExpressaoAritmetica )
            // InternalJlanguage.g:2642:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr1ExpressaoAritmeticaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr1ExpressaoAritmeticaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoComparacaoRelacional__Expr1Assignment_0"


    // $ANTLR start "rule__TermoComparacaoRelacional__OpRelAssignment_1"
    // InternalJlanguage.g:2651:1: rule__TermoComparacaoRelacional__OpRelAssignment_1 : ( ruleOpRel ) ;
    public final void rule__TermoComparacaoRelacional__OpRelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2655:1: ( ( ruleOpRel ) )
            // InternalJlanguage.g:2656:2: ( ruleOpRel )
            {
            // InternalJlanguage.g:2656:2: ( ruleOpRel )
            // InternalJlanguage.g:2657:3: ruleOpRel
            {
             before(grammarAccess.getTermoComparacaoRelacionalAccess().getOpRelOpRelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOpRel();

            state._fsp--;

             after(grammarAccess.getTermoComparacaoRelacionalAccess().getOpRelOpRelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoComparacaoRelacional__OpRelAssignment_1"


    // $ANTLR start "rule__TermoComparacaoRelacional__Expr2Assignment_2"
    // InternalJlanguage.g:2666:1: rule__TermoComparacaoRelacional__Expr2Assignment_2 : ( ruleExpressaoAritmetica ) ;
    public final void rule__TermoComparacaoRelacional__Expr2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2670:1: ( ( ruleExpressaoAritmetica ) )
            // InternalJlanguage.g:2671:2: ( ruleExpressaoAritmetica )
            {
            // InternalJlanguage.g:2671:2: ( ruleExpressaoAritmetica )
            // InternalJlanguage.g:2672:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr2ExpressaoAritmeticaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getTermoComparacaoRelacionalAccess().getExpr2ExpressaoAritmeticaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoComparacaoRelacional__Expr2Assignment_2"


    // $ANTLR start "rule__TermoSubExpressaoRelacional__ExpRelAssignment_1"
    // InternalJlanguage.g:2681:1: rule__TermoSubExpressaoRelacional__ExpRelAssignment_1 : ( ruleExpressaoRelacional ) ;
    public final void rule__TermoSubExpressaoRelacional__ExpRelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2685:1: ( ( ruleExpressaoRelacional ) )
            // InternalJlanguage.g:2686:2: ( ruleExpressaoRelacional )
            {
            // InternalJlanguage.g:2686:2: ( ruleExpressaoRelacional )
            // InternalJlanguage.g:2687:3: ruleExpressaoRelacional
            {
             before(grammarAccess.getTermoSubExpressaoRelacionalAccess().getExpRelExpressaoRelacionalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoRelacional();

            state._fsp--;

             after(grammarAccess.getTermoSubExpressaoRelacionalAccess().getExpRelExpressaoRelacionalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoSubExpressaoRelacional__ExpRelAssignment_1"


    // $ANTLR start "rule__ComandoAtibuicao__ExpAssignment_1"
    // InternalJlanguage.g:2696:1: rule__ComandoAtibuicao__ExpAssignment_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ComandoAtibuicao__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2700:1: ( ( ruleExpressaoAritmetica ) )
            // InternalJlanguage.g:2701:2: ( ruleExpressaoAritmetica )
            {
            // InternalJlanguage.g:2701:2: ( ruleExpressaoAritmetica )
            // InternalJlanguage.g:2702:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getComandoAtibuicaoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getComandoAtibuicaoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__ExpAssignment_1"


    // $ANTLR start "rule__ComandoAtibuicao__VariavelAssignment_3"
    // InternalJlanguage.g:2711:1: rule__ComandoAtibuicao__VariavelAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ComandoAtibuicao__VariavelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2715:1: ( ( ( RULE_ID ) ) )
            // InternalJlanguage.g:2716:2: ( ( RULE_ID ) )
            {
            // InternalJlanguage.g:2716:2: ( ( RULE_ID ) )
            // InternalJlanguage.g:2717:3: ( RULE_ID )
            {
             before(grammarAccess.getComandoAtibuicaoAccess().getVariavelDeclaracaoCrossReference_3_0()); 
            // InternalJlanguage.g:2718:3: ( RULE_ID )
            // InternalJlanguage.g:2719:4: RULE_ID
            {
             before(grammarAccess.getComandoAtibuicaoAccess().getVariavelDeclaracaoIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComandoAtibuicaoAccess().getVariavelDeclaracaoIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getComandoAtibuicaoAccess().getVariavelDeclaracaoCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtibuicao__VariavelAssignment_3"


    // $ANTLR start "rule__ComandoEntrada__VariavelAssignment_1"
    // InternalJlanguage.g:2730:1: rule__ComandoEntrada__VariavelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComandoEntrada__VariavelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2734:1: ( ( ( RULE_ID ) ) )
            // InternalJlanguage.g:2735:2: ( ( RULE_ID ) )
            {
            // InternalJlanguage.g:2735:2: ( ( RULE_ID ) )
            // InternalJlanguage.g:2736:3: ( RULE_ID )
            {
             before(grammarAccess.getComandoEntradaAccess().getVariavelDeclaracaoCrossReference_1_0()); 
            // InternalJlanguage.g:2737:3: ( RULE_ID )
            // InternalJlanguage.g:2738:4: RULE_ID
            {
             before(grammarAccess.getComandoEntradaAccess().getVariavelDeclaracaoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComandoEntradaAccess().getVariavelDeclaracaoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComandoEntradaAccess().getVariavelDeclaracaoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEntrada__VariavelAssignment_1"


    // $ANTLR start "rule__ComandoSaida__VariavelAssignment_1"
    // InternalJlanguage.g:2749:1: rule__ComandoSaida__VariavelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComandoSaida__VariavelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2753:1: ( ( ( RULE_ID ) ) )
            // InternalJlanguage.g:2754:2: ( ( RULE_ID ) )
            {
            // InternalJlanguage.g:2754:2: ( ( RULE_ID ) )
            // InternalJlanguage.g:2755:3: ( RULE_ID )
            {
             before(grammarAccess.getComandoSaidaAccess().getVariavelDeclaracaoCrossReference_1_0()); 
            // InternalJlanguage.g:2756:3: ( RULE_ID )
            // InternalJlanguage.g:2757:4: RULE_ID
            {
             before(grammarAccess.getComandoSaidaAccess().getVariavelDeclaracaoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComandoSaidaAccess().getVariavelDeclaracaoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComandoSaidaAccess().getVariavelDeclaracaoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSaida__VariavelAssignment_1"


    // $ANTLR start "rule__ComandoCondicao__ExpAssignment_1"
    // InternalJlanguage.g:2768:1: rule__ComandoCondicao__ExpAssignment_1 : ( ruleExpressaoRelacional ) ;
    public final void rule__ComandoCondicao__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2772:1: ( ( ruleExpressaoRelacional ) )
            // InternalJlanguage.g:2773:2: ( ruleExpressaoRelacional )
            {
            // InternalJlanguage.g:2773:2: ( ruleExpressaoRelacional )
            // InternalJlanguage.g:2774:3: ruleExpressaoRelacional
            {
             before(grammarAccess.getComandoCondicaoAccess().getExpExpressaoRelacionalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoRelacional();

            state._fsp--;

             after(grammarAccess.getComandoCondicaoAccess().getExpExpressaoRelacionalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__ExpAssignment_1"


    // $ANTLR start "rule__ComandoCondicao__Cmd1Assignment_3"
    // InternalJlanguage.g:2783:1: rule__ComandoCondicao__Cmd1Assignment_3 : ( ruleComando ) ;
    public final void rule__ComandoCondicao__Cmd1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2787:1: ( ( ruleComando ) )
            // InternalJlanguage.g:2788:2: ( ruleComando )
            {
            // InternalJlanguage.g:2788:2: ( ruleComando )
            // InternalJlanguage.g:2789:3: ruleComando
            {
             before(grammarAccess.getComandoCondicaoAccess().getCmd1ComandoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoCondicaoAccess().getCmd1ComandoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Cmd1Assignment_3"


    // $ANTLR start "rule__ComandoCondicao__Cmd2Assignment_4_1"
    // InternalJlanguage.g:2798:1: rule__ComandoCondicao__Cmd2Assignment_4_1 : ( ruleComando ) ;
    public final void rule__ComandoCondicao__Cmd2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2802:1: ( ( ruleComando ) )
            // InternalJlanguage.g:2803:2: ( ruleComando )
            {
            // InternalJlanguage.g:2803:2: ( ruleComando )
            // InternalJlanguage.g:2804:3: ruleComando
            {
             before(grammarAccess.getComandoCondicaoAccess().getCmd2ComandoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoCondicaoAccess().getCmd2ComandoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCondicao__Cmd2Assignment_4_1"


    // $ANTLR start "rule__ComandoRepeticao__ExpAssignment_1"
    // InternalJlanguage.g:2813:1: rule__ComandoRepeticao__ExpAssignment_1 : ( ruleExpressaoRelacional ) ;
    public final void rule__ComandoRepeticao__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2817:1: ( ( ruleExpressaoRelacional ) )
            // InternalJlanguage.g:2818:2: ( ruleExpressaoRelacional )
            {
            // InternalJlanguage.g:2818:2: ( ruleExpressaoRelacional )
            // InternalJlanguage.g:2819:3: ruleExpressaoRelacional
            {
             before(grammarAccess.getComandoRepeticaoAccess().getExpExpressaoRelacionalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoRelacional();

            state._fsp--;

             after(grammarAccess.getComandoRepeticaoAccess().getExpExpressaoRelacionalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRepeticao__ExpAssignment_1"


    // $ANTLR start "rule__ComandoRepeticao__CmdAssignment_2"
    // InternalJlanguage.g:2828:1: rule__ComandoRepeticao__CmdAssignment_2 : ( ruleComando ) ;
    public final void rule__ComandoRepeticao__CmdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2832:1: ( ( ruleComando ) )
            // InternalJlanguage.g:2833:2: ( ruleComando )
            {
            // InternalJlanguage.g:2833:2: ( ruleComando )
            // InternalJlanguage.g:2834:3: ruleComando
            {
             before(grammarAccess.getComandoRepeticaoAccess().getCmdComandoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoRepeticaoAccess().getCmdComandoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRepeticao__CmdAssignment_2"


    // $ANTLR start "rule__ComandoSubAlgoritmo__ComandosAssignment_1"
    // InternalJlanguage.g:2843:1: rule__ComandoSubAlgoritmo__ComandosAssignment_1 : ( ruleComando ) ;
    public final void rule__ComandoSubAlgoritmo__ComandosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJlanguage.g:2847:1: ( ( ruleComando ) )
            // InternalJlanguage.g:2848:2: ( ruleComando )
            {
            // InternalJlanguage.g:2848:2: ( ruleComando )
            // InternalJlanguage.g:2849:3: ruleComando
            {
             before(grammarAccess.getComandoSubAlgoritmoAccess().getComandosComandoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoSubAlgoritmoAccess().getComandosComandoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSubAlgoritmo__ComandosAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000019D00000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000019D00000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000050000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});

}