/**
 */
package org.swtbot.memoria.model;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.swtbot.memoria.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.swtbot.memoria'"
 * @generated
 */
public interface ModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "model";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.swtbot.memoria.model";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "model";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelPackage eINSTANCE = org.swtbot.memoria.model.impl.ModelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.swtbot.memoria.model.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.swtbot.memoria.model.impl.EventImpl
   * @see org.swtbot.memoria.model.impl.ModelPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Numevent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NUMEVENT = 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__X = 2;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__Y = 3;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__WIDTH = 4;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__HEIGHT = 5;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__TIME = 6;

  /**
   * The feature id for the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__BUTTON = 7;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__KEY = 8;

  /**
   * The feature id for the '<em><b>Widget</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__WIDGET = 9;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 10;

  /**
   * The number of operations of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.swtbot.memoria.model.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.swtbot.memoria.model.impl.WidgetImpl
   * @see org.swtbot.memoria.model.impl.ModelPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__NAME = 0;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.swtbot.memoria.model.impl.TestRecordProjectImpl <em>Test Record Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.swtbot.memoria.model.impl.TestRecordProjectImpl
   * @see org.swtbot.memoria.model.impl.ModelPackageImpl#getTestRecordProject()
   * @generated
   */
  int TEST_RECORD_PROJECT = 2;

  /**
   * The feature id for the '<em><b>Eventos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RECORD_PROJECT__EVENTOS = 0;

  /**
   * The number of structural features of the '<em>Test Record Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RECORD_PROJECT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Test Record Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RECORD_PROJECT_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.swtbot.memoria.model.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.swtbot.memoria.model.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.swtbot.memoria.model.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Event#getNumevent <em>Numevent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numevent</em>'.
   * @see org.swtbot.memoria.model.Event#getNumevent()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Numevent();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Event#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.swtbot.memoria.model.Event#getX()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_X();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Event#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.swtbot.memoria.model.Event#getY()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Y();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Event#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.swtbot.memoria.model.Event#getWidth()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Width();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Event#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.swtbot.memoria.model.Event#getHeight()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Height();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Event#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see org.swtbot.memoria.model.Event#getTime()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Time();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Event#getButton <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Button</em>'.
   * @see org.swtbot.memoria.model.Event#getButton()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Button();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Event#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.swtbot.memoria.model.Event#getKey()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Key();

  /**
   * Returns the meta object for the containment reference list '{@link org.swtbot.memoria.model.Event#getWidget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Widget</em>'.
   * @see org.swtbot.memoria.model.Event#getWidget()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Widget();

  /**
   * Returns the meta object for class '{@link org.swtbot.memoria.model.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see org.swtbot.memoria.model.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for the attribute '{@link org.swtbot.memoria.model.Widget#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.swtbot.memoria.model.Widget#getName()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Name();

  /**
   * Returns the meta object for class '{@link org.swtbot.memoria.model.TestRecordProject <em>Test Record Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Record Project</em>'.
   * @see org.swtbot.memoria.model.TestRecordProject
   * @generated
   */
  EClass getTestRecordProject();

  /**
   * Returns the meta object for the containment reference list '{@link org.swtbot.memoria.model.TestRecordProject#getEventos <em>Eventos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Eventos</em>'.
   * @see org.swtbot.memoria.model.TestRecordProject#getEventos()
   * @see #getTestRecordProject()
   * @generated
   */
  EReference getTestRecordProject_Eventos();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelFactory getModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.swtbot.memoria.model.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.swtbot.memoria.model.impl.EventImpl
     * @see org.swtbot.memoria.model.impl.ModelPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Numevent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NUMEVENT = eINSTANCE.getEvent_Numevent();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__X = eINSTANCE.getEvent_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__Y = eINSTANCE.getEvent_Y();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__WIDTH = eINSTANCE.getEvent_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__HEIGHT = eINSTANCE.getEvent_Height();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

    /**
     * The meta object literal for the '<em><b>Button</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__BUTTON = eINSTANCE.getEvent_Button();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__KEY = eINSTANCE.getEvent_Key();

    /**
     * The meta object literal for the '<em><b>Widget</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__WIDGET = eINSTANCE.getEvent_Widget();

    /**
     * The meta object literal for the '{@link org.swtbot.memoria.model.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.swtbot.memoria.model.impl.WidgetImpl
     * @see org.swtbot.memoria.model.impl.ModelPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

    /**
     * The meta object literal for the '{@link org.swtbot.memoria.model.impl.TestRecordProjectImpl <em>Test Record Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.swtbot.memoria.model.impl.TestRecordProjectImpl
     * @see org.swtbot.memoria.model.impl.ModelPackageImpl#getTestRecordProject()
     * @generated
     */
    EClass TEST_RECORD_PROJECT = eINSTANCE.getTestRecordProject();

    /**
     * The meta object literal for the '<em><b>Eventos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_RECORD_PROJECT__EVENTOS = eINSTANCE.getTestRecordProject_Eventos();

  }

} //ModelPackage
