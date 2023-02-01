/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termo Comparacao Relacional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional#getOpRel <em>Op Rel</em>}</li>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional#getExpr2 <em>Expr2</em>}</li>
 * </ul>
 *
 * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getTermoComparacaoRelacional()
 * @model
 * @generated
 */
public interface TermoComparacaoRelacional extends TermoRelacional
{
  /**
   * Returns the value of the '<em><b>Expr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr1</em>' containment reference.
   * @see #setExpr1(ExpressaoAritmetica)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getTermoComparacaoRelacional_Expr1()
   * @model containment="true"
   * @generated
   */
  ExpressaoAritmetica getExpr1();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional#getExpr1 <em>Expr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr1</em>' containment reference.
   * @see #getExpr1()
   * @generated
   */
  void setExpr1(ExpressaoAritmetica value);

  /**
   * Returns the value of the '<em><b>Op Rel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Rel</em>' attribute.
   * @see #setOpRel(String)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getTermoComparacaoRelacional_OpRel()
   * @model
   * @generated
   */
  String getOpRel();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional#getOpRel <em>Op Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Rel</em>' attribute.
   * @see #getOpRel()
   * @generated
   */
  void setOpRel(String value);

  /**
   * Returns the value of the '<em><b>Expr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr2</em>' containment reference.
   * @see #setExpr2(ExpressaoAritmetica)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getTermoComparacaoRelacional_Expr2()
   * @model containment="true"
   * @generated
   */
  ExpressaoAritmetica getExpr2();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional#getExpr2 <em>Expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr2</em>' containment reference.
   * @see #getExpr2()
   * @generated
   */
  void setExpr2(ExpressaoAritmetica value);

} // TermoComparacaoRelacional
