/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaracao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.Declaracao#getName <em>Name</em>}</li>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.Declaracao#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getDeclaracao()
 * @model
 * @generated
 */
public interface Declaracao extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getDeclaracao_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.Declaracao#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' attribute.
   * @see #setTipo(String)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getDeclaracao_Tipo()
   * @model
   * @generated
   */
  String getTipo();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.Declaracao#getTipo <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' attribute.
   * @see #getTipo()
   * @generated
   */
  void setTipo(String value);

} // Declaracao
