/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage.impl;

import br.compiladores.jhonatan.jlanguage.jlanguage.ComandoSaida;
import br.compiladores.jhonatan.jlanguage.jlanguage.Declaracao;
import br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comando Saida</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.impl.ComandoSaidaImpl#getVariavel <em>Variavel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComandoSaidaImpl extends ComandoImpl implements ComandoSaida
{
  /**
   * The cached value of the '{@link #getVariavel() <em>Variavel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariavel()
   * @generated
   * @ordered
   */
  protected Declaracao variavel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComandoSaidaImpl()
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
    return JlanguagePackage.Literals.COMANDO_SAIDA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaracao getVariavel()
  {
    if (variavel != null && variavel.eIsProxy())
    {
      InternalEObject oldVariavel = (InternalEObject)variavel;
      variavel = (Declaracao)eResolveProxy(oldVariavel);
      if (variavel != oldVariavel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, JlanguagePackage.COMANDO_SAIDA__VARIAVEL, oldVariavel, variavel));
      }
    }
    return variavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaracao basicGetVariavel()
  {
    return variavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariavel(Declaracao newVariavel)
  {
    Declaracao oldVariavel = variavel;
    variavel = newVariavel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlanguagePackage.COMANDO_SAIDA__VARIAVEL, oldVariavel, variavel));
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
      case JlanguagePackage.COMANDO_SAIDA__VARIAVEL:
        if (resolve) return getVariavel();
        return basicGetVariavel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JlanguagePackage.COMANDO_SAIDA__VARIAVEL:
        setVariavel((Declaracao)newValue);
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
      case JlanguagePackage.COMANDO_SAIDA__VARIAVEL:
        setVariavel((Declaracao)null);
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
      case JlanguagePackage.COMANDO_SAIDA__VARIAVEL:
        return variavel != null;
    }
    return super.eIsSet(featureID);
  }

} //ComandoSaidaImpl