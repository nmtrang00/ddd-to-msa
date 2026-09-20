/**
 */
package dact.impl;

import dact.DactPackage;
import dact.DefinesIdentityObject;
import dact.IntegerType;
import dact.Property;
import dact.StringType;
import dact.Type;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defines Identity Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dact.impl.DefinesIdentityObjectImpl#isDefinesIdentity <em>Defines Identity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DefinesIdentityObjectImpl extends DiagnosticSupportedImpl implements DefinesIdentityObject {
	/**
	 * The default value of the '{@link #isDefinesIdentity() <em>Defines Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefinesIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFINES_IDENTITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefinesIdentity() <em>Defines Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefinesIdentity()
	 * @generated
	 * @ordered
	 */
	protected boolean definesIdentity = DEFINES_IDENTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinesIdentityObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DactPackage.eINSTANCE.getDefinesIdentityObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefinesIdentity() {
		return definesIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinesIdentity(boolean newDefinesIdentity) {
		boolean oldDefinesIdentity = definesIdentity;
		definesIdentity = newDefinesIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DactPackage.DEFINES_IDENTITY_OBJECT__DEFINES_IDENTITY, oldDefinesIdentity, definesIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SingleValuedPrimitiveProperty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if ((!(this instanceof Property))) {
			return true;
		}
		final Property property = ((Property) this);
		boolean _isDefinesIdentity = property.isDefinesIdentity();
		boolean _not = (!_isDefinesIdentity);
		if (_not) {
			return true;
		}
		Type _type = property.getType();
		boolean _tripleEquals = (_type == null);
		if (_tripleEquals) {
			return true;
		}
		Integer _upperBound = property.getUpperBound();
		final boolean singleValued = ((_upperBound).intValue() == 1);
		final boolean primitiveTyped = ((property.getType() instanceof IntegerType) || (property.getType() instanceof StringType));
		if ((singleValued && primitiveTyped)) {
			return true;
		}
		String _name = property.getName();
		String _plus = ("Identity-defining property \'" + _name);
		String _plus_1 = (_plus + 
			"\' must be single-valued and of a integer or string type.");
		return this.report(diagnostics, 
			"SingleValuedPrimitiveProperty", _plus_1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DactPackage.DEFINES_IDENTITY_OBJECT__DEFINES_IDENTITY:
				return isDefinesIdentity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DactPackage.DEFINES_IDENTITY_OBJECT__DEFINES_IDENTITY:
				setDefinesIdentity((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DactPackage.DEFINES_IDENTITY_OBJECT__DEFINES_IDENTITY:
				setDefinesIdentity(DEFINES_IDENTITY_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DactPackage.DEFINES_IDENTITY_OBJECT__DEFINES_IDENTITY:
				return definesIdentity != DEFINES_IDENTITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DactPackage.DEFINES_IDENTITY_OBJECT___SINGLE_VALUED_PRIMITIVE_PROPERTY__DIAGNOSTICCHAIN_MAP:
				return SingleValuedPrimitiveProperty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (definesIdentity: ");
		result.append(definesIdentity);
		result.append(')');
		return result.toString();
	}

} //DefinesIdentityObjectImpl
