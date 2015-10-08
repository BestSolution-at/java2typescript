/**
 */
package at.bestsolution.typescript.service.spec.tSSpec.impl;

import at.bestsolution.typescript.service.spec.tSSpec.DomainElement;
import at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument;
import at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.GenericTypeArgumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.GenericTypeArgumentImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.GenericTypeArgumentImpl#isList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericTypeArgumentImpl extends MinimalEObjectImpl.Container implements GenericTypeArgument
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DomainElement type;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<GenericTypeArgument> arguments;

  /**
   * The default value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected static final boolean LIST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected boolean list = LIST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericTypeArgumentImpl()
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
    return TSSpecPackage.Literals.GENERIC_TYPE_ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainElement getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (DomainElement)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TSSpecPackage.GENERIC_TYPE_ARGUMENT__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainElement basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DomainElement newType)
  {
    DomainElement oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.GENERIC_TYPE_ARGUMENT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GenericTypeArgument> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<GenericTypeArgument>(GenericTypeArgument.class, this, TSSpecPackage.GENERIC_TYPE_ARGUMENT__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(boolean newList)
  {
    boolean oldList = list;
    list = newList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.GENERIC_TYPE_ARGUMENT__LIST, oldList, list));
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
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__ARGUMENTS:
        return getArguments();
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__LIST:
        return isList();
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
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__TYPE:
        setType((DomainElement)newValue);
        return;
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends GenericTypeArgument>)newValue);
        return;
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__LIST:
        setList((Boolean)newValue);
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
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__TYPE:
        setType((DomainElement)null);
        return;
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__ARGUMENTS:
        getArguments().clear();
        return;
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__LIST:
        setList(LIST_EDEFAULT);
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
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__TYPE:
        return type != null;
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT__LIST:
        return list != LIST_EDEFAULT;
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
    result.append(" (list: ");
    result.append(list);
    result.append(')');
    return result.toString();
  }

} //GenericTypeArgumentImpl
