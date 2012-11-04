/**
 */
package org.swtbot.memoria.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.swtbot.memoria.model.Event;
import org.swtbot.memoria.model.ModelPackage;
import org.swtbot.memoria.model.TestRecordProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Record Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.swtbot.memoria.model.impl.TestRecordProjectImpl#getEventos <em>Eventos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestRecordProjectImpl extends MinimalEObjectImpl.Container implements TestRecordProject
{
  /**
   * The cached value of the '{@link #getEventos() <em>Eventos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventos()
   * @generated
   * @ordered
   */
  protected EList<Event> eventos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestRecordProjectImpl()
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
    return ModelPackage.Literals.TEST_RECORD_PROJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEventos()
  {
    if (eventos == null)
    {
      eventos = new EObjectContainmentEList<Event>(Event.class, this, ModelPackage.TEST_RECORD_PROJECT__EVENTOS);
    }
    return eventos;
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
      case ModelPackage.TEST_RECORD_PROJECT__EVENTOS:
        return ((InternalEList<?>)getEventos()).basicRemove(otherEnd, msgs);
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
      case ModelPackage.TEST_RECORD_PROJECT__EVENTOS:
        return getEventos();
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
      case ModelPackage.TEST_RECORD_PROJECT__EVENTOS:
        getEventos().clear();
        getEventos().addAll((Collection<? extends Event>)newValue);
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
      case ModelPackage.TEST_RECORD_PROJECT__EVENTOS:
        getEventos().clear();
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
      case ModelPackage.TEST_RECORD_PROJECT__EVENTOS:
        return eventos != null && !eventos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TestRecordProjectImpl
