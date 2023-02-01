/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termo Aritmetico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoAritmetico#getFator1 <em>Fator1</em>}</li>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoAritmetico#getOutrosFatores <em>Outros Fatores</em>}</li>
 * </ul>
 *
 * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getTermoAritmetico()
 * @model
 * @generated
 */
public interface TermoAritmetico extends EObject
{
  /**
   * Returns the value of the '<em><b>Fator1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fator1</em>' containment reference.
   * @see #setFator1(FatorAritmetico)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getTermoAritmetico_Fator1()
   * @model containment="true"
   * @generated
   */
  FatorAritmetico getFator1();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.TermoAritmetico#getFator1 <em>Fator1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fator1</em>' containment reference.
   * @see #getFator1()
   * @generated
   */
  void setFator1(FatorAritmetico value);

  /**
   * Returns the value of the '<em><b>Outros Fatores</b></em>' containment reference list.
   * The list contents are of type {@link br.compiladores.jhonatan.jlanguage.jlanguage.OutroFatorAritmetico}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outros Fatores</em>' containment reference list.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getTermoAritmetico_OutrosFatores()
   * @model containment="true"
   * @generated
   */
  EList<OutroFatorAritmetico> getOutrosFatores();

} // TermoAritmetico
