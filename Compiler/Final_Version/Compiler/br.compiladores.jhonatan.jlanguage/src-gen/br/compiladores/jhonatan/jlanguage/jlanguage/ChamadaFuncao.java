/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chamada Funcao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.ChamadaFuncao#getName <em>Name</em>}</li>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.ChamadaFuncao#getArgumentos <em>Argumentos</em>}</li>
 * </ul>
 *
 * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getChamadaFuncao()
 * @model
 * @generated
 */
public interface ChamadaFuncao extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getChamadaFuncao_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.ChamadaFuncao#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Argumentos</b></em>' containment reference list.
   * The list contents are of type {@link br.compiladores.jhonatan.jlanguage.jlanguage.ExpressaoAritmetica}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argumentos</em>' containment reference list.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getChamadaFuncao_Argumentos()
   * @model containment="true"
   * @generated
   */
  EList<ExpressaoAritmetica> getArgumentos();

} // ChamadaFuncao
