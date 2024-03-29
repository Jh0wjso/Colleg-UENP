/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage.impl;

import br.compiladores.jhonatan.jlanguage.jlanguage.Comando;
import br.compiladores.jhonatan.jlanguage.jlanguage.ComandoSubAlgoritmo;
import br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comando Sub Algoritmo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.impl.ComandoSubAlgoritmoImpl#getComandos <em>Comandos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComandoSubAlgoritmoImpl extends ComandoImpl implements ComandoSubAlgoritmo
{
  /**
   * The cached value of the '{@link #getComandos() <em>Comandos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComandos()
   * @generated
   * @ordered
   */
  protected EList<Comando> comandos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComandoSubAlgoritmoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JlanguagePackage.Literals.COMANDO_SUB_ALGORITMO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Comando> getComandos()
  {
    if (comandos == null)
    {
      comandos = new EObjectContainmentEList<Comando>(Comando.class, this, JlanguagePackage.COMANDO_SUB_ALGORITMO__COMANDOS);
    }
    return comandos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JlanguagePackage.COMANDO_SUB_ALGORITMO__COMANDOS:
        return ((InternalEList<?>)getComandos()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JlanguagePackage.COMANDO_SUB_ALGORITMO__COMANDOS:
        return getComandos();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JlanguagePackage.COMANDO_SUB_ALGORITMO__COMANDOS:
        getComandos().clear();
        getComandos().addAll((Collection<? extends Comando>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JlanguagePackage.COMANDO_SUB_ALGORITMO__COMANDOS:
        getComandos().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JlanguagePackage.COMANDO_SUB_ALGORITMO__COMANDOS:
        return comandos != null && !comandos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComandoSubAlgoritmoImpl
