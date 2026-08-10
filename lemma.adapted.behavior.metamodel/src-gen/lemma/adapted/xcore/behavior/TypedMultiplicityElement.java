/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.ValueSpecification;

import lemma.adapted.xcore.service.ImportedType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getDefault <em>Default</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getType <em>Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getTypedMultiplicityElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedMultiplicityElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(ValueSpecification)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getTypedMultiplicityElement_Default()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getDefault();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ImportedType)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getTypedMultiplicityElement_Type()
	 * @model containment="true"
	 * @generated
	 */
	ImportedType getType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ImportedType value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getTypedMultiplicityElement_UpperBound()
	 * @model default="1" unique="false"
	 * @generated
	 */
	Integer getUpperBound();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getTypedMultiplicityElement_LowerBound()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getLowerBound();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.TypedMultiplicityElement#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Integer value);

} // TypedMultiplicityElement
