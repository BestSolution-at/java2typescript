/**
 */
package at.bestsolution.typescript.service.spec.tSSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Defs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getDomainElements <em>Domain Elements</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getCommandList <em>Command List</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getEventList <em>Event List</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getServiceDefs()
 * @model
 * @generated
 */
public interface ServiceDefs extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getServiceDefs_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDefs#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Domain Elements</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.typescript.service.spec.tSSpec.DomainElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Elements</em>' containment reference list.
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getServiceDefs_DomainElements()
   * @model containment="true"
   * @generated
   */
  EList<DomainElement> getDomainElements();

  /**
   * Returns the value of the '<em><b>Command List</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.typescript.service.spec.tSSpec.CommandDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command List</em>' containment reference list.
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getServiceDefs_CommandList()
   * @model containment="true"
   * @generated
   */
  EList<CommandDef> getCommandList();

  /**
   * Returns the value of the '<em><b>Event List</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.typescript.service.spec.tSSpec.EventDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event List</em>' containment reference list.
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getServiceDefs_EventList()
   * @model containment="true"
   * @generated
   */
  EList<EventDef> getEventList();

} // ServiceDefs
