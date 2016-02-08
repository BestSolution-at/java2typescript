/**
 */
package at.bestsolution.typescript.service.spec.tSSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#isCust <em>Cust</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#isIsEnum <em>Is Enum</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getEnumValues <em>Enum Values</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getRealType <em>Real Type</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getDomainElement()
 * @model
 * @generated
 */
public interface DomainElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Doc</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc</em>' attribute list.
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getDomainElement_Doc()
   * @model unique="false"
   * @generated
   */
  EList<String> getDoc();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getDomainElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cust</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cust</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cust</em>' attribute.
   * @see #setCust(boolean)
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getDomainElement_Cust()
   * @model
   * @generated
   */
  boolean isCust();

  /**
   * Sets the value of the '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#isCust <em>Cust</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cust</em>' attribute.
   * @see #isCust()
   * @generated
   */
  void setCust(boolean value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(DomainElement)
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getDomainElement_SuperType()
   * @model
   * @generated
   */
  DomainElement getSuperType();

  /**
   * Sets the value of the '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(DomainElement value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.typescript.service.spec.tSSpec.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getDomainElement_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Is Enum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Enum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Enum</em>' attribute.
   * @see #setIsEnum(boolean)
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getDomainElement_IsEnum()
   * @model
   * @generated
   */
  boolean isIsEnum();

  /**
   * Sets the value of the '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#isIsEnum <em>Is Enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Enum</em>' attribute.
   * @see #isIsEnum()
   * @generated
   */
  void setIsEnum(boolean value);

  /**
   * Returns the value of the '<em><b>Enum Values</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Values</em>' containment reference list.
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getDomainElement_EnumValues()
   * @model containment="true"
   * @generated
   */
  EList<EnumVal> getEnumValues();

  /**
   * Returns the value of the '<em><b>Real Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real Type</em>' attribute.
   * @see #setRealType(String)
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getDomainElement_RealType()
   * @model
   * @generated
   */
  String getRealType();

  /**
   * Sets the value of the '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getRealType <em>Real Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Real Type</em>' attribute.
   * @see #getRealType()
   * @generated
   */
  void setRealType(String value);

} // DomainElement
