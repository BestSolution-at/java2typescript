/**
 */
package at.bestsolution.typescript.service.spec.tSSpec.impl;

import at.bestsolution.typescript.service.spec.tSSpec.CommandDef;
import at.bestsolution.typescript.service.spec.tSSpec.DomainElement;
import at.bestsolution.typescript.service.spec.tSSpec.EventDef;
import at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs;
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
 * An implementation of the model object '<em><b>Service Defs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefsImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefsImpl#getDomainElements <em>Domain Elements</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefsImpl#getCommandList <em>Command List</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefsImpl#getEventList <em>Event List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDefsImpl extends MinimalEObjectImpl.Container implements ServiceDefs
{
  /**
   * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected String packageName = PACKAGE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDomainElements() <em>Domain Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainElements()
   * @generated
   * @ordered
   */
  protected EList<DomainElement> domainElements;

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
  protected ServiceDefsImpl()
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
    return TSSpecPackage.Literals.SERVICE_DEFS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(String newPackageName)
  {
    String oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.SERVICE_DEFS__PACKAGE_NAME, oldPackageName, packageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DomainElement> getDomainElements()
  {
    if (domainElements == null)
    {
      domainElements = new EObjectContainmentEList<DomainElement>(DomainElement.class, this, TSSpecPackage.SERVICE_DEFS__DOMAIN_ELEMENTS);
    }
    return domainElements;
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
      commandList = new EObjectContainmentEList<CommandDef>(CommandDef.class, this, TSSpecPackage.SERVICE_DEFS__COMMAND_LIST);
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
      eventList = new EObjectContainmentEList<EventDef>(EventDef.class, this, TSSpecPackage.SERVICE_DEFS__EVENT_LIST);
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
      case TSSpecPackage.SERVICE_DEFS__DOMAIN_ELEMENTS:
        return ((InternalEList<?>)getDomainElements()).basicRemove(otherEnd, msgs);
      case TSSpecPackage.SERVICE_DEFS__COMMAND_LIST:
        return ((InternalEList<?>)getCommandList()).basicRemove(otherEnd, msgs);
      case TSSpecPackage.SERVICE_DEFS__EVENT_LIST:
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
      case TSSpecPackage.SERVICE_DEFS__PACKAGE_NAME:
        return getPackageName();
      case TSSpecPackage.SERVICE_DEFS__DOMAIN_ELEMENTS:
        return getDomainElements();
      case TSSpecPackage.SERVICE_DEFS__COMMAND_LIST:
        return getCommandList();
      case TSSpecPackage.SERVICE_DEFS__EVENT_LIST:
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
      case TSSpecPackage.SERVICE_DEFS__PACKAGE_NAME:
        setPackageName((String)newValue);
        return;
      case TSSpecPackage.SERVICE_DEFS__DOMAIN_ELEMENTS:
        getDomainElements().clear();
        getDomainElements().addAll((Collection<? extends DomainElement>)newValue);
        return;
      case TSSpecPackage.SERVICE_DEFS__COMMAND_LIST:
        getCommandList().clear();
        getCommandList().addAll((Collection<? extends CommandDef>)newValue);
        return;
      case TSSpecPackage.SERVICE_DEFS__EVENT_LIST:
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
      case TSSpecPackage.SERVICE_DEFS__PACKAGE_NAME:
        setPackageName(PACKAGE_NAME_EDEFAULT);
        return;
      case TSSpecPackage.SERVICE_DEFS__DOMAIN_ELEMENTS:
        getDomainElements().clear();
        return;
      case TSSpecPackage.SERVICE_DEFS__COMMAND_LIST:
        getCommandList().clear();
        return;
      case TSSpecPackage.SERVICE_DEFS__EVENT_LIST:
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
      case TSSpecPackage.SERVICE_DEFS__PACKAGE_NAME:
        return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
      case TSSpecPackage.SERVICE_DEFS__DOMAIN_ELEMENTS:
        return domainElements != null && !domainElements.isEmpty();
      case TSSpecPackage.SERVICE_DEFS__COMMAND_LIST:
        return commandList != null && !commandList.isEmpty();
      case TSSpecPackage.SERVICE_DEFS__EVENT_LIST:
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
    result.append(" (packageName: ");
    result.append(packageName);
    result.append(')');
    return result.toString();
  }

} //ServiceDefsImpl
