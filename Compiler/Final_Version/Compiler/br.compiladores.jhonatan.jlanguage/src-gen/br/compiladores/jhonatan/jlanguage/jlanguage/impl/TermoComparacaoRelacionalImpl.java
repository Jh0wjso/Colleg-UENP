/**
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.jlanguage.impl;

import br.compiladores.jhonatan.jlanguage.jlanguage.ExpressaoAritmetica;
import br.compiladores.jhonatan.jlanguage.jlanguage.JlanguagePackage;
import br.compiladores.jhonatan.jlanguage.jlanguage.TermoComparacaoRelacional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termo Comparacao Relacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.impl.TermoComparacaoRelacionalImpl#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.impl.TermoComparacaoRelacionalImpl#getOpRel <em>Op Rel</em>}</li>
 *   <li>{@link br.compiladores.jhonatan.jlanguage.jlanguage.impl.TermoComparacaoRelacionalImpl#getExpr2 <em>Expr2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermoComparacaoRelacionalImpl extends TermoRelacionalImpl implements TermoComparacaoRelacional
{
  /**
   * The cached value of the '{@link #getExpr1() <em>Expr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr1()
   * @generated
   * @ordered
   */
  protected ExpressaoAritmetica expr1;

  /**
   * The default value of the '{@link #getOpRel() <em>Op Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpRel()
   * @generated
   * @ordered
   */
  protected static final String OP_REL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpRel() <em>Op Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpRel()
   * @generated
   * @ordered
   */
  protected String opRel = OP_REL_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr2() <em>Expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected ExpressaoAritmetica expr2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermoComparacaoRelacionalImpl()
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
    return JlanguagePackage.Literals.TERMO_COMPARACAO_RELACIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressaoAritmetica getExpr1()
  {
    return expr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr1(ExpressaoAritmetica newExpr1, NotificationChain msgs)
  {
    ExpressaoAritmetica oldExpr1 = expr1;
    expr1 = newExpr1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR1, oldExpr1, newExpr1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr1(ExpressaoAritmetica newExpr1)
  {
    if (newExpr1 != expr1)
    {
      NotificationChain msgs = null;
      if (expr1 != null)
        msgs = ((InternalEObject)expr1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR1, null, msgs);
      if (newExpr1 != null)
        msgs = ((InternalEObject)newExpr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR1, null, msgs);
      msgs = basicSetExpr1(newExpr1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR1, newExpr1, newExpr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOpRel()
  {
    return opRel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOpRel(String newOpRel)
  {
    String oldOpRel = opRel;
    opRel = newOpRel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__OP_REL, oldOpRel, opRel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressaoAritmetica getExpr2()
  {
    return expr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr2(ExpressaoAritmetica newExpr2, NotificationChain msgs)
  {
    ExpressaoAritmetica oldExpr2 = expr2;
    expr2 = newExpr2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR2, oldExpr2, newExpr2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr2(ExpressaoAritmetica newExpr2)
  {
    if (newExpr2 != expr2)
    {
      NotificationChain msgs = null;
      if (expr2 != null)
        msgs = ((InternalEObject)expr2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR2, null, msgs);
      if (newExpr2 != null)
        msgs = ((InternalEObject)newExpr2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR2, null, msgs);
      msgs = basicSetExpr2(newExpr2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR2, newExpr2, newExpr2));
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
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR1:
        return basicSetExpr1(null, msgs);
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR2:
        return basicSetExpr2(null, msgs);
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
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR1:
        return getExpr1();
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__OP_REL:
        return getOpRel();
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR2:
        return getExpr2();
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
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR1:
        setExpr1((ExpressaoAritmetica)newValue);
        return;
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__OP_REL:
        setOpRel((String)newValue);
        return;
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR2:
        setExpr2((ExpressaoAritmetica)newValue);
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
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR1:
        setExpr1((ExpressaoAritmetica)null);
        return;
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__OP_REL:
        setOpRel(OP_REL_EDEFAULT);
        return;
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR2:
        setExpr2((ExpressaoAritmetica)null);
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
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR1:
        return expr1 != null;
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__OP_REL:
        return OP_REL_EDEFAULT == null ? opRel != null : !OP_REL_EDEFAULT.equals(opRel);
      case JlanguagePackage.TERMO_COMPARACAO_RELACIONAL__EXPR2:
        return expr2 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (opRel: ");
    result.append(opRel);
    result.append(')');
    return result.toString();
  }

} //TermoComparacaoRelacionalImpl
