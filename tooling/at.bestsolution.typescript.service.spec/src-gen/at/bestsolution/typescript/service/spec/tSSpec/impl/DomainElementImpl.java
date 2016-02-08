/**
 */
package at.bestsolution.typescript.service.spec.tSSpec.impl;

import at.bestsolution.typescript.service.spec.tSSpec.Attribute;
import at.bestsolution.typescript.service.spec.tSSpec.DomainElement;
import at.bestsolution.typescript.service.spec.tSSpec.EnumVal;
import at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl#isCust <em>Cust</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl#isIsEnum <em>Is Enum</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl#getEnumValues <em>Enum Values</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl#getRealType <em>Real Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainElementImpl extends MinimalEObjectImpl.Container implements DomainElement
{
  /**
   * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected EList<String> doc;

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
   * The default value of the '{@link #isCust() <em>Cust</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCust()
   * @generated
   * @ordered
   */
  protected static final boolean CUST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCust() <em>Cust</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCust()
   * @generated
   * @ordered
   */
  protected boolean cust = CUST_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected DomainElement superType;

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
   * The default value of the '{@link #isIsEnum() <em>Is Enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsEnum()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ENUM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsEnum() <em>Is Enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsEnum()
   * @generated
   * @ordered
   */
  protected boolean isEnum = IS_ENUM_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnumValues() <em>Enum Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumValues()
   * @generated
   * @ordered
   */
  protected EList<EnumVal> enumValues;

  /**
   * The default value of the '{@link #getRealType() <em>Real Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealType()
   * @generated
   * @ordered
   */
  protected static final String REAL_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRealType() <em>Real Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealType()
   * @generated
   * @ordered
   */
  protected String realType = REAL_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainElementImpl()
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
    return TSSpecPackage.Literals.DOMAIN_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDoc()
  {
    if (doc == null)
    {
      doc = new EDataTypeEList<String>(String.class, this, TSSpecPackage.DOMAIN_ELEMENT__DOC);
    }
    return doc;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.DOMAIN_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCust()
  {
    return cust;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCust(boolean newCust)
  {
    boolean oldCust = cust;
    cust = newCust;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.DOMAIN_ELEMENT__CUST, oldCust, cust));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainElement getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (DomainElement)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TSSpecPackage.DOMAIN_ELEMENT__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainElement basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(DomainElement newSuperType)
  {
    DomainElement oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.DOMAIN_ELEMENT__SUPER_TYPE, oldSuperType, superType));
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
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, TSSpecPackage.DOMAIN_ELEMENT__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsEnum()
  {
    return isEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsEnum(boolean newIsEnum)
  {
    boolean oldIsEnum = isEnum;
    isEnum = newIsEnum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.DOMAIN_ELEMENT__IS_ENUM, oldIsEnum, isEnum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumVal> getEnumValues()
  {
    if (enumValues == null)
    {
      enumValues = new EObjectContainmentEList<EnumVal>(EnumVal.class, this, TSSpecPackage.DOMAIN_ELEMENT__ENUM_VALUES);
    }
    return enumValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRealType()
  {
    return realType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealType(String newRealType)
  {
    String oldRealType = realType;
    realType = newRealType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSSpecPackage.DOMAIN_ELEMENT__REAL_TYPE, oldRealType, realType));
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
      case TSSpecPackage.DOMAIN_ELEMENT__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case TSSpecPackage.DOMAIN_ELEMENT__ENUM_VALUES:
        return ((InternalEList<?>)getEnumValues()).basicRemove(otherEnd, msgs);
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
      case TSSpecPackage.DOMAIN_ELEMENT__DOC:
        return getDoc();
      case TSSpecPackage.DOMAIN_ELEMENT__NAME:
        return getName();
      case TSSpecPackage.DOMAIN_ELEMENT__CUST:
        return isCust();
      case TSSpecPackage.DOMAIN_ELEMENT__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case TSSpecPackage.DOMAIN_ELEMENT__ATTRIBUTES:
        return getAttributes();
      case TSSpecPackage.DOMAIN_ELEMENT__IS_ENUM:
        return isIsEnum();
      case TSSpecPackage.DOMAIN_ELEMENT__ENUM_VALUES:
        return getEnumValues();
      case TSSpecPackage.DOMAIN_ELEMENT__REAL_TYPE:
        return getRealType();
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
      case TSSpecPackage.DOMAIN_ELEMENT__DOC:
        getDoc().clear();
        getDoc().addAll((Collection<? extends String>)newValue);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__CUST:
        setCust((Boolean)newValue);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__SUPER_TYPE:
        setSuperType((DomainElement)newValue);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__IS_ENUM:
        setIsEnum((Boolean)newValue);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__ENUM_VALUES:
        getEnumValues().clear();
        getEnumValues().addAll((Collection<? extends EnumVal>)newValue);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__REAL_TYPE:
        setRealType((String)newValue);
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
      case TSSpecPackage.DOMAIN_ELEMENT__DOC:
        getDoc().clear();
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__CUST:
        setCust(CUST_EDEFAULT);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__SUPER_TYPE:
        setSuperType((DomainElement)null);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__ATTRIBUTES:
        getAttributes().clear();
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__IS_ENUM:
        setIsEnum(IS_ENUM_EDEFAULT);
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__ENUM_VALUES:
        getEnumValues().clear();
        return;
      case TSSpecPackage.DOMAIN_ELEMENT__REAL_TYPE:
        setRealType(REAL_TYPE_EDEFAULT);
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
      case TSSpecPackage.DOMAIN_ELEMENT__DOC:
        return doc != null && !doc.isEmpty();
      case TSSpecPackage.DOMAIN_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TSSpecPackage.DOMAIN_ELEMENT__CUST:
        return cust != CUST_EDEFAULT;
      case TSSpecPackage.DOMAIN_ELEMENT__SUPER_TYPE:
        return superType != null;
      case TSSpecPackage.DOMAIN_ELEMENT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case TSSpecPackage.DOMAIN_ELEMENT__IS_ENUM:
        return isEnum != IS_ENUM_EDEFAULT;
      case TSSpecPackage.DOMAIN_ELEMENT__ENUM_VALUES:
        return enumValues != null && !enumValues.isEmpty();
      case TSSpecPackage.DOMAIN_ELEMENT__REAL_TYPE:
        return REAL_TYPE_EDEFAULT == null ? realType != null : !REAL_TYPE_EDEFAULT.equals(realType);
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
    result.append(" (doc: ");
    result.append(doc);
    result.append(", name: ");
    result.append(name);
    result.append(", cust: ");
    result.append(cust);
    result.append(", isEnum: ");
    result.append(isEnum);
    result.append(", realType: ");
    result.append(realType);
    result.append(')');
    return result.toString();
  }

} //DomainElementImpl
