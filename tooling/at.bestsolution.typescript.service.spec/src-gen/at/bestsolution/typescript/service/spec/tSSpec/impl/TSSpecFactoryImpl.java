/**
 */
package at.bestsolution.typescript.service.spec.tSSpec.impl;

import at.bestsolution.typescript.service.spec.tSSpec.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TSSpecFactoryImpl extends EFactoryImpl implements TSSpecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TSSpecFactory init()
  {
    try
    {
      TSSpecFactory theTSSpecFactory = (TSSpecFactory)EPackage.Registry.INSTANCE.getEFactory(TSSpecPackage.eNS_URI);
      if (theTSSpecFactory != null)
      {
        return theTSSpecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TSSpecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TSSpecFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TSSpecPackage.SERVICE_DEFS: return createServiceDefs();
      case TSSpecPackage.DOMAIN_ELEMENT: return createDomainElement();
      case TSSpecPackage.ENUM_VAL: return createEnumVal();
      case TSSpecPackage.ATTRIBUTE: return createAttribute();
      case TSSpecPackage.GENERIC_TYPE_ARGUMENT: return createGenericTypeArgument();
      case TSSpecPackage.SERVICE_DEF: return createServiceDef();
      case TSSpecPackage.COMMAND_DEF: return createCommandDef();
      case TSSpecPackage.EVENT_DEF: return createEventDef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDefs createServiceDefs()
  {
    ServiceDefsImpl serviceDefs = new ServiceDefsImpl();
    return serviceDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainElement createDomainElement()
  {
    DomainElementImpl domainElement = new DomainElementImpl();
    return domainElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumVal createEnumVal()
  {
    EnumValImpl enumVal = new EnumValImpl();
    return enumVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericTypeArgument createGenericTypeArgument()
  {
    GenericTypeArgumentImpl genericTypeArgument = new GenericTypeArgumentImpl();
    return genericTypeArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDef createServiceDef()
  {
    ServiceDefImpl serviceDef = new ServiceDefImpl();
    return serviceDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandDef createCommandDef()
  {
    CommandDefImpl commandDef = new CommandDefImpl();
    return commandDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDef createEventDef()
  {
    EventDefImpl eventDef = new EventDefImpl();
    return eventDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TSSpecPackage getTSSpecPackage()
  {
    return (TSSpecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TSSpecPackage getPackage()
  {
    return TSSpecPackage.eINSTANCE;
  }

} //TSSpecFactoryImpl
