/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outro Termo Aritmetico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.OutroTermoAritmetico#getOperador <em>Operador</em>}</li>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.OutroTermoAritmetico#getTermo <em>Termo</em>}</li>
 * </ul>
 *
 * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getOutroTermoAritmetico()
 * @model
 * @generated
 */
public interface OutroTermoAritmetico extends EObject
{
  /**
   * Returns the value of the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador</em>' attribute.
   * @see #setOperador(String)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getOutroTermoAritmetico_Operador()
   * @model
   * @generated
   */
  String getOperador();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.OutroTermoAritmetico#getOperador <em>Operador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador</em>' attribute.
   * @see #getOperador()
   * @generated
   */
  void setOperador(String value);

  /**
   * Returns the value of the '<em><b>Termo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Termo</em>' containment reference.
   * @see #setTermo(TermoAritmetico)
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getOutroTermoAritmetico_Termo()
   * @model containment="true"
   * @generated
   */
  TermoAritmetico getTermo();

  /**
   * Sets the value of the '{@link br.compiladores.jhonatan.jlanguage.jlanguage.OutroTermoAritmetico#getTermo <em>Termo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Termo</em>' containment reference.
   * @see #getTermo()
   * @generated
   */
  void setTermo(TermoAritmetico value);

} // OutroTermoAritmetico
