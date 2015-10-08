/**
 */
package at.bestsolution.typescript.service.spec.tSSpec.impl;

import at.bestsolution.typescript.service.spec.tSSpec.Attribute;
import at.bestsolution.typescript.service.spec.tSSpec.CommandDef;
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
 * An implementation of the model object '<em><b>Command Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.CommandDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.CommandDefImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.CommandDefImpl#getReturnVal <em>Return Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandDefImpl extends MinimalEObjectImpl.Container implements CommandDef
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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getReturnVal() <em>Return Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnVal()
   * @generated
   * @ordered
   */
  protected GenericTypeArgument returnVal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandDefImpl()
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
    return TSSpecPackage.Literals.COMMAND_DEF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.COMMAND_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, TSSpecPackage.COMMAND_DEF__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericTypeArgument getReturnVal()
  {
    return returnVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnVal(GenericTypeArgument newReturnVal, NotificationChain msgs)
  {
    GenericTypeArgument oldReturnVal = returnVal;
    returnVal = newReturnVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TSSpecPackage.COMMAND_DEF__RETURN_VAL, oldReturnVal, newReturnVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnVal(GenericTypeArgument newReturnVal)
  {
    if (newReturnVal != returnVal)
    {
      NotificationChain msgs = null;
      if (returnVal != null)
        msgs = ((InternalEObject)returnVal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TSSpecPackage.COMMAND_DEF__RETURN_VAL, null, msgs);
      if (newReturnVal != null)
        msgs = ((InternalEObject)newReturnVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TSSpecPackage.COMMAND_DEF__RETURN_VAL, null, msgs);
      msgs = basicSetReturnVal(newReturnVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.COMMAND_DEF__RETURN_VAL, newReturnVal, newReturnVal));
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
      case TSSpecPackage.COMMAND_DEF__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case TSSpecPackage.COMMAND_DEF__RETURN_VAL:
        return basicSetReturnVal(null, msgs);
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
      case TSSpecPackage.COMMAND_DEF__NAME:
        return getName();
      case TSSpecPackage.COMMAND_DEF__ATTRIBUTES:
        return getAttributes();
      case TSSpecPackage.COMMAND_DEF__RETURN_VAL:
        return getReturnVal();
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
      case TSSpecPackage.COMMAND_DEF__NAME:
        setName((String)newValue);
        return;
      case TSSpecPackage.COMMAND_DEF__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case TSSpecPackage.COMMAND_DEF__RETURN_VAL:
        setReturnVal((GenericTypeArgument)newValue);
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
      case TSSpecPackage.COMMAND_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TSSpecPackage.COMMAND_DEF__ATTRIBUTES:
        getAttributes().clear();
        return;
      case TSSpecPackage.COMMAND_DEF__RETURN_VAL:
        setReturnVal((GenericTypeArgument)null);
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
      case TSSpecPackage.COMMAND_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TSSpecPackage.COMMAND_DEF__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case TSSpecPackage.COMMAND_DEF__RETURN_VAL:
        return returnVal != null;
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
    result.append(')');
    return result.toString();
  }

} //CommandDefImpl
