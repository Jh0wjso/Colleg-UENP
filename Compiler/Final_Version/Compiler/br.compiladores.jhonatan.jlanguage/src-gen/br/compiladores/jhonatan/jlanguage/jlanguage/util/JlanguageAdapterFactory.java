/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage.util;

import br.compiladores.jhonatan.jlanguage.jlanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage
 * @generated
 */
public class JlanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JlanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JlanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JlanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JlanguageSwitch<Adapter> modelSwitch =
    new JlanguageSwitch<Adapter>()
    {
      @Override
      public Adapter casePrograma(Programa object)
      {
        return createProgramaAdapter();
      }
      @Override
      public Adapter caseDeclaracao(Declaracao object)
      {
        return createDeclaracaoAdapter();
      }
      @Override
      public Adapter caseExpressaoAritmetica(ExpressaoAritmetica object)
      {
        return createExpressaoAritmeticaAdapter();
      }
      @Override
      public Adapter caseOutroTermoAritmetico(OutroTermoAritmetico object)
      {
        return createOutroTermoAritmeticoAdapter();
      }
      @Override
      public Adapter caseTermoAritmetico(TermoAritmetico object)
      {
        return createTermoAritmeticoAdapter();
      }
      @Override
      public Adapter caseOutroFatorAritmetico(OutroFatorAritmetico object)
      {
        return createOutroFatorAritmeticoAdapter();
      }
      @Override
      public Adapter caseFatorAritmetico(FatorAritmetico object)
      {
        return createFatorAritmeticoAdapter();
      }
      @Override
      public Adapter caseFatorNumero(FatorNumero object)
      {
        return createFatorNumeroAdapter();
      }
      @Override
      public Adapter caseFatorVariavel(FatorVariavel object)
      {
        return createFatorVariavelAdapter();
      }
      @Override
      public Adapter caseFatorSubExpressao(FatorSubExpressao object)
      {
        return createFatorSubExpressaoAdapter();
      }
      @Override
      public Adapter caseExpressaoRelacional(ExpressaoRelacional object)
      {
        return createExpressaoRelacionalAdapter();
      }
      @Override
      public Adapter caseOutroTermoRelacional(OutroTermoRelacional object)
      {
        return createOutroTermoRelacionalAdapter();
      }
      @Override
      public Adapter caseTermoRelacional(TermoRelacional object)
      {
        return createTermoRelacionalAdapter();
      }
      @Override
      public Adapter caseTermoComparacaoRelacional(TermoComparacaoRelacional object)
      {
        return createTermoComparacaoRelacionalAdapter();
      }
      @Override
      public Adapter caseTermoSubExpressaoRelacional(TermoSubExpressaoRelacional object)
      {
        return createTermoSubExpressaoRelacionalAdapter();
      }
      @Override
      public Adapter caseComando(Comando object)
      {
        return createComandoAdapter();
      }
      @Override
      public Adapter caseComandoAtibuicao(ComandoAtibuicao object)
      {
        return createComandoAtibuicaoAdapter();
      }
      @Override
      public Adapter caseComandoEntrada(ComandoEntrada object)
      {
        return createComandoEntradaAdapter();
      }
      @Override
      public Adapter caseComandoSaida(ComandoSaida object)
      {
        return createComandoSaidaAdapter();
      }
      @Override
      public Adapter caseComandoCondicao(ComandoCondicao object)
      {
        return createComandoCondicaoAdapter();
      }
      @Override
      public Adapter caseComandoRepeticao(ComandoRepeticao object)
      {
        return createComandoRepeticaoAdapter();
      }
      @Override
      public Adapter caseComandoSubAlgoritmo(ComandoSubAlgoritmo object)
      {
        return createComandoSubAlgoritmoAdapter();
      }
      @Override
      public Adapter caseChamadaFuncao(ChamadaFuncao object)
      {
        return createChamadaFuncaoAdapter();
      }
      @Override
      public Adapter caseFuncao(Funcao object)
      {
        return createFuncaoAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.Programa <em>Programa</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.Programa
   * @generated
   */
  public Adapter createProgramaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.Declaracao <em>Declaracao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.Declaracao
   * @generated
   */
  public Adapter createDeclaracaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ExpressaoAritmetica <em>Expressao Aritmetica</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.ExpressaoAritmetica
   * @generated
   */
  public Adapter createExpressaoAritmeticaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.OutroTermoAritmetico <em>Outro Termo Aritmetico</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.OutroTermoAritmetico
   * @generated
   */
  public Adapter createOutroTermoAritmeticoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoAritmetico <em>Termo Aritmetico</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.TermoAritmetico
   * @generated
   */
  public Adapter createTermoAritmeticoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.OutroFatorAritmetico <em>Outro Fator Aritmetico</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.OutroFatorAritmetico
   * @generated
   */
  public Adapter createOutroFatorAritmeticoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.FatorAritmetico <em>Fator Aritmetico</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.FatorAritmetico
   * @generated
   */
  public Adapter createFatorAritmeticoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.FatorNumero <em>Fator Numero</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.FatorNumero
   * @generated
   */
  public Adapter createFatorNumeroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.FatorVariavel <em>Fator Variavel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.FatorVariavel
   * @generated
   */
  public Adapter createFatorVariavelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.FatorSubExpressao <em>Fator Sub Expressao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.FatorSubExpressao
   * @generated
   */
  public Adapter createFatorSubExpressaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ExpressaoRelacional <em>Expressao Relacional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.ExpressaoRelacional
   * @generated
   */
  public Adapter createExpressaoRelacionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.OutroTermoRelacional <em>Outro Termo Relacional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.OutroTermoRelacional
   * @generated
   */
  public Adapter createOutroTermoRelacionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoRelacional <em>Termo Relacional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.TermoRelacional
   * @generated
   */
  public Adapter createTermoRelacionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional <em>Termo Comparacao Relacional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional
   * @generated
   */
  public Adapter createTermoComparacaoRelacionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoSubExpressaoRelacional <em>Termo Sub Expressao Relacional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.TermoSubExpressaoRelacional
   * @generated
   */
  public Adapter createTermoSubExpressaoRelacionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.Comando <em>Comando</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.Comando
   * @generated
   */
  public Adapter createComandoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoAtibuicao <em>Comando Atibuicao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.ComandoAtibuicao
   * @generated
   */
  public Adapter createComandoAtibuicaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoEntrada <em>Comando Entrada</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.ComandoEntrada
   * @generated
   */
  public Adapter createComandoEntradaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoSaida <em>Comando Saida</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.ComandoSaida
   * @generated
   */
  public Adapter createComandoSaidaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoCondicao <em>Comando Condicao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.ComandoCondicao
   * @generated
   */
  public Adapter createComandoCondicaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoRepeticao <em>Comando Repeticao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.ComandoRepeticao
   * @generated
   */
  public Adapter createComandoRepeticaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoSubAlgoritmo <em>Comando Sub Algoritmo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.ComandoSubAlgoritmo
   * @generated
   */
  public Adapter createComandoSubAlgoritmoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ChamadaFuncao <em>Chamada Funcao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.ChamadaFuncao
   * @generated
   */
  public Adapter createChamadaFuncaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.compiladores.jhonatan.jlanguage.jlanguage.Funcao <em>Funcao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.Funcao
   * @generated
   */
  public Adapter createFuncaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JlanguageAdapterFactory
