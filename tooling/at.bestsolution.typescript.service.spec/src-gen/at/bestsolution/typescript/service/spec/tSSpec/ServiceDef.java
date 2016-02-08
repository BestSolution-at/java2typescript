/**
 */
package at.bestsolution.typescript.service.spec.tSSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDef#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDef#getCommandList <em>Command List</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDef#getEventList <em>Event List</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getServiceDef()
 * @model
 * @generated
 */
public interface ServiceDef extends EObject
{
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
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getServiceDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.typescript.service.spec.tSSpec.ServiceDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getServiceDef_CommandList()
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
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getServiceDef_EventList()
   * @model containment="true"
   * @generated
   */
  EList<EventDef> getEventList();

} // ServiceDef
