/**
 */
package org.swtbot.memoria.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Record Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.swtbot.memoria.model.TestRecordProject#getEventos <em>Eventos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.swtbot.memoria.model.ModelPackage#getTestRecordProject()
 * @model
 * @generated
 */
public interface TestRecordProject extends EObject
{
  /**
   * Returns the value of the '<em><b>Eventos</b></em>' containment reference list.
   * The list contents are of type {@link org.swtbot.memoria.model.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eventos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eventos</em>' containment reference list.
   * @see org.swtbot.memoria.model.ModelPackage#getTestRecordProject_Eventos()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEventos();

} // TestRecordProject
