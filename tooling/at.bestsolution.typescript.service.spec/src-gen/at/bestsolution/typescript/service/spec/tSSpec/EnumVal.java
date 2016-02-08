/**
 */
package at.bestsolution.typescript.service.spec.tSSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getEnumVal()
 * @model
 * @generated
 */
public interface EnumVal extends EObject
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
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getEnumVal_Doc()
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
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getEnumVal_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see at.bestsolution.typescript.service.spec.tSSpec.TSSpecPackage#getEnumVal_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link at.bestsolution.typescript.service.spec.tSSpec.EnumVal#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // EnumVal
