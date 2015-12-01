/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Belief;
import org.xtext.example.mydsl.myDsl.Fact;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Belief</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BeliefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BeliefImpl#getBeliefGoal <em>Belief Goal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BeliefImpl#getBeliefValidate <em>Belief Validate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BeliefImpl#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeliefImpl extends MinimalEObjectImpl.Container implements Belief
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBeliefGoal() <em>Belief Goal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeliefGoal()
   * @generated
   * @ordered
   */
  protected static final String BELIEF_GOAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBeliefGoal() <em>Belief Goal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeliefGoal()
   * @generated
   * @ordered
   */
  protected String beliefGoal = BELIEF_GOAL_EDEFAULT;

  /**
   * The default value of the '{@link #getBeliefValidate() <em>Belief Validate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeliefValidate()
   * @generated
   * @ordered
   */
  protected static final String BELIEF_VALIDATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBeliefValidate() <em>Belief Validate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeliefValidate()
   * @generated
   * @ordered
   */
  protected String beliefValidate = BELIEF_VALIDATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFact() <em>Fact</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFact()
   * @generated
   * @ordered
   */
  protected EList<Fact> fact;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BeliefImpl()
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
    return MyDslPackage.Literals.BELIEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BELIEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBeliefGoal()
  {
    return beliefGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeliefGoal(String newBeliefGoal)
  {
    String oldBeliefGoal = beliefGoal;
    beliefGoal = newBeliefGoal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BELIEF__BELIEF_GOAL, oldBeliefGoal, beliefGoal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBeliefValidate()
  {
    return beliefValidate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeliefValidate(String newBeliefValidate)
  {
    String oldBeliefValidate = beliefValidate;
    beliefValidate = newBeliefValidate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BELIEF__BELIEF_VALIDATE, oldBeliefValidate, beliefValidate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fact> getFact()
  {
    if (fact == null)
    {
      fact = new EObjectContainmentEList<Fact>(Fact.class, this, MyDslPackage.BELIEF__FACT);
    }
    return fact;
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
      case MyDslPackage.BELIEF__FACT:
        return ((InternalEList<?>)getFact()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.BELIEF__NAME:
        return getName();
      case MyDslPackage.BELIEF__BELIEF_GOAL:
        return getBeliefGoal();
      case MyDslPackage.BELIEF__BELIEF_VALIDATE:
        return getBeliefValidate();
      case MyDslPackage.BELIEF__FACT:
        return getFact();
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
      case MyDslPackage.BELIEF__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.BELIEF__BELIEF_GOAL:
        setBeliefGoal((String)newValue);
        return;
      case MyDslPackage.BELIEF__BELIEF_VALIDATE:
        setBeliefValidate((String)newValue);
        return;
      case MyDslPackage.BELIEF__FACT:
        getFact().clear();
        getFact().addAll((Collection<? extends Fact>)newValue);
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
      case MyDslPackage.BELIEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.BELIEF__BELIEF_GOAL:
        setBeliefGoal(BELIEF_GOAL_EDEFAULT);
        return;
      case MyDslPackage.BELIEF__BELIEF_VALIDATE:
        setBeliefValidate(BELIEF_VALIDATE_EDEFAULT);
        return;
      case MyDslPackage.BELIEF__FACT:
        getFact().clear();
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
      case MyDslPackage.BELIEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.BELIEF__BELIEF_GOAL:
        return BELIEF_GOAL_EDEFAULT == null ? beliefGoal != null : !BELIEF_GOAL_EDEFAULT.equals(beliefGoal);
      case MyDslPackage.BELIEF__BELIEF_VALIDATE:
        return BELIEF_VALIDATE_EDEFAULT == null ? beliefValidate != null : !BELIEF_VALIDATE_EDEFAULT.equals(beliefValidate);
      case MyDslPackage.BELIEF__FACT:
        return fact != null && !fact.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", beliefGoal: ");
    result.append(beliefGoal);
    result.append(", beliefValidate: ");
    result.append(beliefValidate);
    result.append(')');
    return result.toString();
  }

} //BeliefImpl
