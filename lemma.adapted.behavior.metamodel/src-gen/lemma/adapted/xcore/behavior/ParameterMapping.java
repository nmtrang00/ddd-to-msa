/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.ValueSpecification;

import lemma.adapted.xcore.service.Parameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.ParameterMapping#getType <em>Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ParameterMapping#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ParameterMapping#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ParameterMapping#getVariable <em>Variable</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ParameterMapping#getActivityParameter <em>Activity Parameter</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ParameterMapping#getValue <em>Value</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ParameterMapping#getAction <em>Action</em>}</li>
 *   <li>{@link lemma.adapted.xcore.behavior.ParameterMapping#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParameterMapping()
 * @model
 * @generated
 */
public interface ParameterMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lemma.adapted.xcore.behavior.ParameterMappingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see lemma.adapted.xcore.behavior.ParameterMappingType
	 * @see #setType(ParameterMappingType)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParameterMapping_Type()
	 * @model unique="false"
	 * @generated
	 */
	ParameterMappingType getType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ParameterMapping#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see lemma.adapted.xcore.behavior.ParameterMappingType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterMappingType value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Parameter</em>' containment reference.
	 * @see #setOperationParameter(ImportedParameter)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParameterMapping_OperationParameter()
	 * @model containment="true"
	 * @generated
	 */
	ImportedParameter getOperationParameter();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ParameterMapping#getOperationParameter <em>Operation Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter</em>' containment reference.
	 * @see #getOperationParameter()
	 * @generated
	 */
	void setOperationParameter(ImportedParameter value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParameterMapping_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ParameterMapping#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParameterMapping_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ParameterMapping#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Activity Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Parameter</em>' reference.
	 * @see #setActivityParameter(Parameter)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParameterMapping_ActivityParameter()
	 * @model
	 * @generated
	 */
	Parameter getActivityParameter();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ParameterMapping#getActivityParameter <em>Activity Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Parameter</em>' reference.
	 * @see #getActivityParameter()
	 * @generated
	 */
	void setActivityParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueSpecification)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParameterMapping_Value()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ParameterMapping#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.CallOperationAction#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' container reference.
	 * @see #setAction(CallOperationAction)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParameterMapping_Action()
	 * @see lemma.adapted.xcore.behavior.CallOperationAction#getParameterMappings
	 * @model opposite="parameterMappings" transient="false"
	 * @generated
	 */
	CallOperationAction getAction();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ParameterMapping#getAction <em>Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' container reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CallOperationAction value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.behavior.Activity#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getParameterMapping_Activity()
	 * @see lemma.adapted.xcore.behavior.Activity#getParameterMappings
	 * @model opposite="parameterMappings" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.behavior.ParameterMapping#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // ParameterMapping
