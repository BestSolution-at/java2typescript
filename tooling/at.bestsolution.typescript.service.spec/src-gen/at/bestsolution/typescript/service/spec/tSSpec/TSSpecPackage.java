/**
 */
package at.bestsolution.typescript.service.spec.tSSpec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecFactory
 * @model kind="package"
 * @generated
 */
public interface TSSpecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tSSpec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/typescript/service/spec/TSSpec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tSSpec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TSSpecPackage eINSTANCE = at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefsImpl <em>Service Defs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefsImpl
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getServiceDefs()
   * @generated
   */
  int SERVICE_DEFS = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEFS__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Domain Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEFS__DOMAIN_ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Command List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEFS__COMMAND_LIST = 2;

  /**
   * The feature id for the '<em><b>Event List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEFS__EVENT_LIST = 3;

  /**
   * The number of structural features of the '<em>Service Defs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEFS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl <em>Domain Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getDomainElement()
   * @generated
   */
  int DOMAIN_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Cust</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__CUST = 2;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__SUPER_TYPE = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__ATTRIBUTES = 4;

  /**
   * The feature id for the '<em><b>Enum Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__ENUM_VALUES = 5;

  /**
   * The feature id for the '<em><b>Real Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__REAL_TYPE = 6;

  /**
   * The number of structural features of the '<em>Domain Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.EnumValImpl <em>Enum Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.EnumValImpl
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getEnumVal()
   * @generated
   */
  int ENUM_VAL = 2;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VAL__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VAL__NAME = 1;

  /**
   * The number of structural features of the '<em>Enum Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.AttributeImpl
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OPTIONAL = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 4;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.GenericTypeArgumentImpl <em>Generic Type Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.GenericTypeArgumentImpl
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getGenericTypeArgument()
   * @generated
   */
  int GENERIC_TYPE_ARGUMENT = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE_ARGUMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE_ARGUMENT__ARGUMENTS = 1;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE_ARGUMENT__LIST = 2;

  /**
   * The number of structural features of the '<em>Generic Type Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE_ARGUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.CommandDefImpl <em>Command Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.CommandDefImpl
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getCommandDef()
   * @generated
   */
  int COMMAND_DEF = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_DEF__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Return Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_DEF__RETURN_VAL = 2;

  /**
   * The number of structural features of the '<em>Command Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.EventDefImpl <em>Event Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.EventDefImpl
   * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getEventDef()
   * @generated
   */
  int EVENT_DEF = 6;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEF__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEF__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEF__TYPE = 2;

  /**
   * The number of structural features of the '<em>Event Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEF_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs <em>Service Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Defs</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs
   * @generated
   */
  EClass getServiceDefs();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getPackageName()
   * @see #getServiceDefs()
   * @generated
   */
  EAttribute getServiceDefs_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getDomainElements <em>Domain Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domain Elements</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getDomainElements()
   * @see #getServiceDefs()
   * @generated
   */
  EReference getServiceDefs_DomainElements();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getCommandList <em>Command List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Command List</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getCommandList()
   * @see #getServiceDefs()
   * @generated
   */
  EReference getServiceDefs_CommandList();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getEventList <em>Event List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event List</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getEventList()
   * @see #getServiceDefs()
   * @generated
   */
  EReference getServiceDefs_EventList();

  /**
   * Returns the meta object for class '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement <em>Domain Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Element</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.DomainElement
   * @generated
   */
  EClass getDomainElement();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Doc</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getDoc()
   * @see #getDomainElement()
   * @generated
   */
  EAttribute getDomainElement_Doc();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getName()
   * @see #getDomainElement()
   * @generated
   */
  EAttribute getDomainElement_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#isCust <em>Cust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cust</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.DomainElement#isCust()
   * @see #getDomainElement()
   * @generated
   */
  EAttribute getDomainElement_Cust();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getSuperType()
   * @see #getDomainElement()
   * @generated
   */
  EReference getDomainElement_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getAttributes()
   * @see #getDomainElement()
   * @generated
   */
  EReference getDomainElement_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getEnumValues <em>Enum Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Values</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getEnumValues()
   * @see #getDomainElement()
   * @generated
   */
  EReference getDomainElement_EnumValues();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getRealType <em>Real Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real Type</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.DomainElement#getRealType()
   * @see #getDomainElement()
   * @generated
   */
  EAttribute getDomainElement_RealType();

  /**
   * Returns the meta object for class '{@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal <em>Enum Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Val</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.EnumVal
   * @generated
   */
  EClass getEnumVal();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Doc</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.EnumVal#getDoc()
   * @see #getEnumVal()
   * @generated
   */
  EAttribute getEnumVal_Doc();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.EnumVal#getName()
   * @see #getEnumVal()
   * @generated
   */
  EAttribute getEnumVal_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.typescript.service.spec.tSSpec.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.typescript.service.spec.tSSpec.Attribute#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Documentation</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.Attribute#getDocumentation()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Documentation();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.Attribute#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.Attribute#isOptional()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Optional();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.typescript.service.spec.tSSpec.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument <em>Generic Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Type Argument</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument
   * @generated
   */
  EClass getGenericTypeArgument();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument#getType()
   * @see #getGenericTypeArgument()
   * @generated
   */
  EReference getGenericTypeArgument_Type();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument#getArguments()
   * @see #getGenericTypeArgument()
   * @generated
   */
  EReference getGenericTypeArgument_Arguments();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument#isList()
   * @see #getGenericTypeArgument()
   * @generated
   */
  EAttribute getGenericTypeArgument_List();

  /**
   * Returns the meta object for class '{@link at.bestsolution.typescript.service.spec.tSSpec.CommandDef <em>Command Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command Def</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.CommandDef
   * @generated
   */
  EClass getCommandDef();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.CommandDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.CommandDef#getName()
   * @see #getCommandDef()
   * @generated
   */
  EAttribute getCommandDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.typescript.service.spec.tSSpec.CommandDef#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.CommandDef#getAttributes()
   * @see #getCommandDef()
   * @generated
   */
  EReference getCommandDef_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.typescript.service.spec.tSSpec.CommandDef#getReturnVal <em>Return Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Val</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.CommandDef#getReturnVal()
   * @see #getCommandDef()
   * @generated
   */
  EReference getCommandDef_ReturnVal();

  /**
   * Returns the meta object for class '{@link at.bestsolution.typescript.service.spec.tSSpec.EventDef <em>Event Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Def</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.EventDef
   * @generated
   */
  EClass getEventDef();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.typescript.service.spec.tSSpec.EventDef#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Documentation</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.EventDef#getDocumentation()
   * @see #getEventDef()
   * @generated
   */
  EAttribute getEventDef_Documentation();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.typescript.service.spec.tSSpec.EventDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.EventDef#getName()
   * @see #getEventDef()
   * @generated
   */
  EAttribute getEventDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.typescript.service.spec.tSSpec.EventDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bestsolution.typescript.service.spec.tSSpec.EventDef#getType()
   * @see #getEventDef()
   * @generated
   */
  EReference getEventDef_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TSSpecFactory getTSSpecFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefsImpl <em>Service Defs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.ServiceDefsImpl
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getServiceDefs()
     * @generated
     */
    EClass SERVICE_DEFS = eINSTANCE.getServiceDefs();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_DEFS__PACKAGE_NAME = eINSTANCE.getServiceDefs_PackageName();

    /**
     * The meta object literal for the '<em><b>Domain Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DEFS__DOMAIN_ELEMENTS = eINSTANCE.getServiceDefs_DomainElements();

    /**
     * The meta object literal for the '<em><b>Command List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DEFS__COMMAND_LIST = eINSTANCE.getServiceDefs_CommandList();

    /**
     * The meta object literal for the '<em><b>Event List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DEFS__EVENT_LIST = eINSTANCE.getServiceDefs_EventList();

    /**
     * The meta object literal for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl <em>Domain Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.DomainElementImpl
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getDomainElement()
     * @generated
     */
    EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ELEMENT__DOC = eINSTANCE.getDomainElement_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ELEMENT__NAME = eINSTANCE.getDomainElement_Name();

    /**
     * The meta object literal for the '<em><b>Cust</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ELEMENT__CUST = eINSTANCE.getDomainElement_Cust();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ELEMENT__SUPER_TYPE = eINSTANCE.getDomainElement_SuperType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ELEMENT__ATTRIBUTES = eINSTANCE.getDomainElement_Attributes();

    /**
     * The meta object literal for the '<em><b>Enum Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ELEMENT__ENUM_VALUES = eINSTANCE.getDomainElement_EnumValues();

    /**
     * The meta object literal for the '<em><b>Real Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ELEMENT__REAL_TYPE = eINSTANCE.getDomainElement_RealType();

    /**
     * The meta object literal for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.EnumValImpl <em>Enum Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.EnumValImpl
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getEnumVal()
     * @generated
     */
    EClass ENUM_VAL = eINSTANCE.getEnumVal();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VAL__DOC = eINSTANCE.getEnumVal_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VAL__NAME = eINSTANCE.getEnumVal_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.AttributeImpl
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DOCUMENTATION = eINSTANCE.getAttribute_Documentation();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__OPTIONAL = eINSTANCE.getAttribute_Optional();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.GenericTypeArgumentImpl <em>Generic Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.GenericTypeArgumentImpl
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getGenericTypeArgument()
     * @generated
     */
    EClass GENERIC_TYPE_ARGUMENT = eINSTANCE.getGenericTypeArgument();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_TYPE_ARGUMENT__TYPE = eINSTANCE.getGenericTypeArgument_Type();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_TYPE_ARGUMENT__ARGUMENTS = eINSTANCE.getGenericTypeArgument_Arguments();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_TYPE_ARGUMENT__LIST = eINSTANCE.getGenericTypeArgument_List();

    /**
     * The meta object literal for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.CommandDefImpl <em>Command Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.CommandDefImpl
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getCommandDef()
     * @generated
     */
    EClass COMMAND_DEF = eINSTANCE.getCommandDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_DEF__NAME = eINSTANCE.getCommandDef_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_DEF__ATTRIBUTES = eINSTANCE.getCommandDef_Attributes();

    /**
     * The meta object literal for the '<em><b>Return Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_DEF__RETURN_VAL = eINSTANCE.getCommandDef_ReturnVal();

    /**
     * The meta object literal for the '{@link at.bestsolution.typescript.service.spec.tSSpec.impl.EventDefImpl <em>Event Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.EventDefImpl
     * @see at.bestsolution.typescript.service.spec.tSSpec.impl.TSSpecPackageImpl#getEventDef()
     * @generated
     */
    EClass EVENT_DEF = eINSTANCE.getEventDef();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEF__DOCUMENTATION = eINSTANCE.getEventDef_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEF__NAME = eINSTANCE.getEventDef_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DEF__TYPE = eINSTANCE.getEventDef_Type();

  }

} //TSSpecPackage
