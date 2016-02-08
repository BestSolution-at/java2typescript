/**
 */
package at.bestsolution.typescript.service.spec.tSSpec.util;

import at.bestsolution.typescript.service.spec.tSSpec.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage
 * @generated
 */
public class TSSpecAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TSSpecPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TSSpecAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TSSpecPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TSSpecSwitch<Adapter> modelSwitch =
    new TSSpecSwitch<Adapter>()
    {
      @Override
      public Adapter caseServiceDefs(ServiceDefs object)
      {
        return createServiceDefsAdapter();
      }
      @Override
      public Adapter caseDomainElement(DomainElement object)
      {
        return createDomainElementAdapter();
      }
      @Override
      public Adapter caseEnumVal(EnumVal object)
      {
        return createEnumValAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseGenericTypeArgument(GenericTypeArgument object)
      {
        return createGenericTypeArgumentAdapter();
      }
      @Override
      public Adapter caseServiceDef(ServiceDef object)
      {
        return createServiceDefAdapter();
      }
      @Override
      public Adapter caseCommandDef(CommandDef object)
      {
        return createCommandDefAdapter();
      }
      @Override
      public Adapter caseEventDef(EventDef object)
      {
        return createEventDefAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs <em>Service Defs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs
   * @generated
   */
  public Adapter createServiceDefsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement <em>Domain Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.typescript.service.spec.tSSpec.DomainElement
   * @generated
   */
  public Adapter createDomainElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal <em>Enum Val</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.typescript.service.spec.tSSpec.EnumVal
   * @generated
   */
  public Adapter createEnumValAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.typescript.service.spec.tSSpec.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.typescript.service.spec.tSSpec.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument <em>Generic Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.typescript.service.spec.tSSpec.GenericTypeArgument
   * @generated
   */
  public Adapter createGenericTypeArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDef <em>Service Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.typescript.service.spec.tSSpec.ServiceDef
   * @generated
   */
  public Adapter createServiceDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.typescript.service.spec.tSSpec.CommandDef <em>Command Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.typescript.service.spec.tSSpec.CommandDef
   * @generated
   */
  public Adapter createCommandDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.typescript.service.spec.tSSpec.EventDef <em>Event Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.typescript.service.spec.tSSpec.EventDef
   * @generated
   */
  public Adapter createEventDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TSSpecAdapterFactory
