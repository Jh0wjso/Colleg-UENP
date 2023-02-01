/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comando Atibuicao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoAtibuicao#getExp <em>Exp</em>}</li>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoAtibuicao#getVariavel <em>Variavel</em>}</li>
 * </ul>
 *
 * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getComandoAtibuicao()
 * @model
 * @generated
 */
public interface ComandoAtibuicao extends Comando
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(ExpressaoAritmetica)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getComandoAtibuicao_Exp()
   * @model containment="true"
   * @generated
   */
  ExpressaoAritmetica getExp();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoAtibuicao#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ExpressaoAritmetica value);

  /**
   * Returns the value of the '<em><b>Variavel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variavel</em>' reference.
   * @see #setVariavel(Declaracao)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getComandoAtibuicao_Variavel()
   * @model
   * @generated
   */
  Declaracao getVariavel();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoAtibuicao#getVariavel <em>Variavel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variavel</em>' reference.
   * @see #getVariavel()
   * @generated
   */
  void setVariavel(Declaracao value);

} // ComandoAtibuicao
