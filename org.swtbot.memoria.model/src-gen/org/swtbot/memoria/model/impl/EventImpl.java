/**
 */
package org.swtbot.memoria.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.swtbot.memoria.model.Event;
import org.swtbot.memoria.model.ModelPackage;
import org.swtbot.memoria.model.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getNumevent <em>Numevent</em>}</li>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getX <em>X</em>}</li>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.swtbot.memoria.model.impl.EventImpl#getWidget <em>Widget</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNumevent() <em>Numevent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumevent()
   * @generated
   * @ordered
   */
  protected static final int NUMEVENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumevent() <em>Numevent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumevent()
   * @generated
   * @ordered
   */
  protected int numevent = NUMEVENT_EDEFAULT;

  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final int TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected int time = TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getButton() <em>Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButton()
   * @generated
   * @ordered
   */
  protected static final int BUTTON_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getButton() <em>Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButton()
   * @generated
   * @ordered
   */
  protected int button = BUTTON_EDEFAULT;

  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final char KEY_EDEFAULT = '\u0000';

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected char key = KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getWidget() <em>Widget</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidget()
   * @generated
   * @ordered
   */
  protected EList<Widget> widget;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return ModelPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumevent()
  {
    return numevent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumevent(int newNumevent)
  {
    int oldNumevent = numevent;
    numevent = newNumevent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__NUMEVENT, oldNumevent, numevent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(int newTime)
  {
    int oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__TIME, oldTime, time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getButton()
  {
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setButton(int newButton)
  {
    int oldButton = button;
    button = newButton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__BUTTON, oldButton, button));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public char getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(char newKey)
  {
    char oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Widget> getWidget()
  {
    if (widget == null)
    {
      widget = new EObjectContainmentEList<Widget>(Widget.class, this, ModelPackage.EVENT__WIDGET);
    }
    return widget;
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
      case ModelPackage.EVENT__WIDGET:
        return ((InternalEList<?>)getWidget()).basicRemove(otherEnd, msgs);
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
      case ModelPackage.EVENT__NAME:
        return getName();
      case ModelPackage.EVENT__NUMEVENT:
        return getNumevent();
      case ModelPackage.EVENT__X:
        return getX();
      case ModelPackage.EVENT__Y:
        return getY();
      case ModelPackage.EVENT__WIDTH:
        return getWidth();
      case ModelPackage.EVENT__HEIGHT:
        return getHeight();
      case ModelPackage.EVENT__TIME:
        return getTime();
      case ModelPackage.EVENT__BUTTON:
        return getButton();
      case ModelPackage.EVENT__KEY:
        return getKey();
      case ModelPackage.EVENT__WIDGET:
        return getWidget();
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
      case ModelPackage.EVENT__NAME:
        setName((String)newValue);
        return;
      case ModelPackage.EVENT__NUMEVENT:
        setNumevent((Integer)newValue);
        return;
      case ModelPackage.EVENT__X:
        setX((Integer)newValue);
        return;
      case ModelPackage.EVENT__Y:
        setY((Integer)newValue);
        return;
      case ModelPackage.EVENT__WIDTH:
        setWidth((Integer)newValue);
        return;
      case ModelPackage.EVENT__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case ModelPackage.EVENT__TIME:
        setTime((Integer)newValue);
        return;
      case ModelPackage.EVENT__BUTTON:
        setButton((Integer)newValue);
        return;
      case ModelPackage.EVENT__KEY:
        setKey((Character)newValue);
        return;
      case ModelPackage.EVENT__WIDGET:
        getWidget().clear();
        getWidget().addAll((Collection<? extends Widget>)newValue);
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
      case ModelPackage.EVENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelPackage.EVENT__NUMEVENT:
        setNumevent(NUMEVENT_EDEFAULT);
        return;
      case ModelPackage.EVENT__X:
        setX(X_EDEFAULT);
        return;
      case ModelPackage.EVENT__Y:
        setY(Y_EDEFAULT);
        return;
      case ModelPackage.EVENT__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case ModelPackage.EVENT__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case ModelPackage.EVENT__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case ModelPackage.EVENT__BUTTON:
        setButton(BUTTON_EDEFAULT);
        return;
      case ModelPackage.EVENT__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case ModelPackage.EVENT__WIDGET:
        getWidget().clear();
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
      case ModelPackage.EVENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelPackage.EVENT__NUMEVENT:
        return numevent != NUMEVENT_EDEFAULT;
      case ModelPackage.EVENT__X:
        return x != X_EDEFAULT;
      case ModelPackage.EVENT__Y:
        return y != Y_EDEFAULT;
      case ModelPackage.EVENT__WIDTH:
        return width != WIDTH_EDEFAULT;
      case ModelPackage.EVENT__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case ModelPackage.EVENT__TIME:
        return time != TIME_EDEFAULT;
      case ModelPackage.EVENT__BUTTON:
        return button != BUTTON_EDEFAULT;
      case ModelPackage.EVENT__KEY:
        return key != KEY_EDEFAULT;
      case ModelPackage.EVENT__WIDGET:
        return widget != null && !widget.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", numevent: ");
    result.append(numevent);
    result.append(", x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", width: ");
    result.append(width);
    result.append(", height: ");
    result.append(height);
    result.append(", time: ");
    result.append(time);
    result.append(", button: ");
    result.append(button);
    result.append(", key: ");
    result.append(key);
    result.append(')');
    return result.toString();
  }

} //EventImpl
