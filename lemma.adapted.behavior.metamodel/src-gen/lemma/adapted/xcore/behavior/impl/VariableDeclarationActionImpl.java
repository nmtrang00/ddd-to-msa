/**
 */
package lemma.adapted.xcore.behavior.impl;

import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.VariableAssignment;
import lemma.adapted.xcore.behavior.VariableDeclarationAction;

import lemma.adapted.xcore.data.PrimitiveType;

import lemma.adapted.xcore.service.ImportedType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableDeclarationActionImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableDeclarationActionImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableDeclarationActionImpl#getImportedType <em>Imported Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableDeclarationActionImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.impl.VariableDeclarationActionImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationActionImpl extends ExecutableNodeImpl implements VariableDeclarationAction {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Integer upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportedType() <em>Imported Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedType()
	 * @generated
	 * @ordered
	 */
	protected ImportedType importedType;

	/**
	 * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType primitiveType;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected VariableAssignment declaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(Integer newLowerBound) {
		Integer oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_DECLARATION_ACTION__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(Integer newUpperBound) {
		Integer oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_DECLARATION_ACTION__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedType getImportedType() {
		return importedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedType(ImportedType newImportedType, NotificationChain msgs) {
		ImportedType oldImportedType = importedType;
		importedType = newImportedType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE, oldImportedType, newImportedType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedType(ImportedType newImportedType) {
		if (newImportedType != importedType) {
			NotificationChain msgs = null;
			if (importedType != null)
				msgs = ((InternalEObject)importedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE, null, msgs);
			if (newImportedType != null)
				msgs = ((InternalEObject)newImportedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE, null, msgs);
			msgs = basicSetImportedType(newImportedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE, newImportedType, newImportedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType getPrimitiveType() {
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveType(PrimitiveType newPrimitiveType, NotificationChain msgs) {
		PrimitiveType oldPrimitiveType = primitiveType;
		primitiveType = newPrimitiveType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE, oldPrimitiveType, newPrimitiveType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitiveType(PrimitiveType newPrimitiveType) {
		if (newPrimitiveType != primitiveType) {
			NotificationChain msgs = null;
			if (primitiveType != null)
				msgs = ((InternalEObject)primitiveType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE, null, msgs);
			if (newPrimitiveType != null)
				msgs = ((InternalEObject)newPrimitiveType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE, null, msgs);
			msgs = basicSetPrimitiveType(newPrimitiveType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE, newPrimitiveType, newPrimitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableAssignment getDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaration(VariableAssignment newDeclaration, NotificationChain msgs) {
		VariableAssignment oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION, oldDeclaration, newDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaration(VariableAssignment newDeclaration) {
		if (newDeclaration != declaration) {
			NotificationChain msgs = null;
			if (declaration != null)
				msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION, null, msgs);
			if (newDeclaration != null)
				msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION, null, msgs);
			msgs = basicSetDeclaration(newDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION, newDeclaration, newDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE:
				return basicSetImportedType(null, msgs);
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE:
				return basicSetPrimitiveType(null, msgs);
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION:
				return basicSetDeclaration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__LOWER_BOUND:
				return getLowerBound();
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__UPPER_BOUND:
				return getUpperBound();
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE:
				return getImportedType();
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE:
				return getPrimitiveType();
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION:
				return getDeclaration();
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
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE:
				setImportedType((ImportedType)newValue);
				return;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)newValue);
				return;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION:
				setDeclaration((VariableAssignment)newValue);
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
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE:
				setImportedType((ImportedType)null);
				return;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)null);
				return;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION:
				setDeclaration((VariableAssignment)null);
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
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE:
				return importedType != null;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE:
				return primitiveType != null;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION:
				return declaration != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //VariableDeclarationActionImpl
