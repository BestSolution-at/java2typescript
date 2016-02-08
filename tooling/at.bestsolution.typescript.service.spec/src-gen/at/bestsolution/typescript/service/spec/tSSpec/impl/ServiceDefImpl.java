/**
 */
package at.bestsolution.typescript.service.spec.tSSpec.impl;

import at.bestsolution.typescript.service.spec.tSSpec.CommandDef;
import at.bestsolution.typescript.service.spec.tSSpec.EventDef;
import at.bestsolution.typescript.service.spec.tSSpec.ServiceDef;
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
 * An implementation of the model object '<em><b>Service Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefImpl#getCommandList <em>Command List</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefImpl#getEventList <em>Event List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDefImpl extends MinimalEObjectImpl.Container implements ServiceDef
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
   * The cached value of the '{@link #getCommandList() <em>Command List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandList()
   * @generated
   * @ordered
   */
  protected EList<CommandDef> commandList;

  /**
   * The cached value of the '{@link #getEventList() <em>Event List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventList()
   * @generated
   * @ordered
   */
  protected EList<EventDef> eventList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceDefImpl()
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
    return TSSpecPackage.Literals.SERVICE_DEF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.SERVICE_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CommandDef> getCommandList()
  {
    if (commandList == null)
    {
      commandList = new EObjectContainmentEList<CommandDef>(CommandDef.class, this, TSSpecPackage.SERVICE_DEF__COMMAND_LIST);
    }
    return commandList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventDef> getEventList()
  {
    if (eventList == null)
    {
      eventList = new EObjectContainmentEList<EventDef>(EventDef.class, this, TSSpecPackage.SERVICE_DEF__EVENT_LIST);
    }
    return eventList;
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
      case TSSpecPackage.SERVICE_DEF__COMMAND_LIST:
        return ((InternalEList<?>)getCommandList()).basicRemove(otherEnd, msgs);
      case TSSpecPackage.SERVICE_DEF__EVENT_LIST:
        return ((InternalEList<?>)getEventList()).basicRemove(otherEnd, msgs);
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
      case TSSpecPackage.SERVICE_DEF__NAME:
        return getName();
      case TSSpecPackage.SERVICE_DEF__COMMAND_LIST:
        return getCommandList();
      case TSSpecPackage.SERVICE_DEF__EVENT_LIST:
        return getEventList();
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
      case TSSpecPackage.SERVICE_DEF__NAME:
        setName((String)newValue);
        return;
      case TSSpecPackage.SERVICE_DEF__COMMAND_LIST:
        getCommandList().clear();
        getCommandList().addAll((Collection<? extends CommandDef>)newValue);
        return;
      case TSSpecPackage.SERVICE_DEF__EVENT_LIST:
        getEventList().clear();
        getEventList().addAll((Collection<? extends EventDef>)newValue);
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
      case TSSpecPackage.SERVICE_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TSSpecPackage.SERVICE_DEF__COMMAND_LIST:
        getCommandList().clear();
        return;
      case TSSpecPackage.SERVICE_DEF__EVENT_LIST:
        getEventList().clear();
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
      case TSSpecPackage.SERVICE_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TSSpecPackage.SERVICE_DEF__COMMAND_LIST:
        return commandList != null && !commandList.isEmpty();
      case TSSpecPackage.SERVICE_DEF__EVENT_LIST:
        return eventList != null && !eventList.isEmpty();
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

} //ServiceDefImpl
