/**
 */
package at.bestsolution.typescript.service.spec.tSSpec.impl;

import at.bestsolution.typescript.service.spec.tSSpec.DomainElement;
import at.bestsolution.typescript.service.spec.tSSpec.ServiceDef;
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
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefsImpl#getServiceDefs <em>Service Defs</em>}</li>
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
   * The cached value of the '{@link #getServiceDefs() <em>Service Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceDefs()
   * @generated
   * @ordered
   */
  protected EList<ServiceDef> serviceDefs;

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
  public EList<ServiceDef> getServiceDefs()
  {
    if (serviceDefs == null)
    {
      serviceDefs = new EObjectContainmentEList<ServiceDef>(ServiceDef.class, this, TSSpecPackage.SERVICE_DEFS__SERVICE_DEFS);
    }
    return serviceDefs;
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
      case TSSpecPackage.SERVICE_DEFS__SERVICE_DEFS:
        return ((InternalEList<?>)getServiceDefs()).basicRemove(otherEnd, msgs);
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
      case TSSpecPackage.SERVICE_DEFS__SERVICE_DEFS:
        return getServiceDefs();
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
      case TSSpecPackage.SERVICE_DEFS__SERVICE_DEFS:
        getServiceDefs().clear();
        getServiceDefs().addAll((Collection<? extends ServiceDef>)newValue);
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
      case TSSpecPackage.SERVICE_DEFS__SERVICE_DEFS:
        getServiceDefs().clear();
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
      case TSSpecPackage.SERVICE_DEFS__SERVICE_DEFS:
        return serviceDefs != null && !serviceDefs.isEmpty();
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
