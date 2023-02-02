/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comando Sub Algoritmo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.ComandoSubAlgoritmo#getComandos <em>Comandos</em>}</li>
 * </ul>
 *
 * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getComandoSubAlgoritmo()
 * @model
 * @generated
 */
public interface ComandoSubAlgoritmo extends Comando
{
  /**
   * Returns the value of the '<em><b>Comandos</b></em>' containment reference list.
   * The list contents are of type {@link br.compiladores.jhonatan.jlanguage.jlanguage.Comando}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comandos</em>' containment reference list.
   * @see br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage#getComandoSubAlgoritmo_Comandos()
   * @model containment="true"
   * @generated
   */
  EList<Comando> getComandos();

} // ComandoSubAlgoritmo