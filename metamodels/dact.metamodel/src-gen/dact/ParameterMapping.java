/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.ParameterMapping#getType <em>Type</em>}</li>
 *   <li>{@link dact.ParameterMapping#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link dact.ParameterMapping#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dact.ParameterMapping#getVariable <em>Variable</em>}</li>
 *   <li>{@link dact.ParameterMapping#getActivityParameter <em>Activity Parameter</em>}</li>
 *   <li>{@link dact.ParameterMapping#getValue <em>Value</em>}</li>
 *   <li>{@link dact.ParameterMapping#getAction <em>Action</em>}</li>
 *   <li>{@link dact.ParameterMapping#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getParameterMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConformingActivityOperationParameter ExclusiveMappingSource ValueOnlyInAction'"
 * @generated
 */
public interface ParameterMapping extends DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dact.ParameterMappingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dact.ParameterMappingType
	 * @see #setType(ParameterMappingType)
	 * @see dact.DactPackage#getParameterMapping_Type()
	 * @model unique="false"
	 * @generated
	 */
	ParameterMappingType getType();

	/**
	 * Sets the value of the '{@link dact.ParameterMapping#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dact.ParameterMappingType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterMappingType value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Parameter</em>' reference.
	 * @see #setOperationParameter(Parameter)
	 * @see dact.DactPackage#getParameterMapping_OperationParameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getOperationParameter();

	/**
	 * Sets the value of the '{@link dact.ParameterMapping#getOperationParameter <em>Operation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter</em>' reference.
	 * @see #getOperationParameter()
	 * @generated
	 */
	void setOperationParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see dact.DactPackage#getParameterMapping_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link dact.ParameterMapping#getIdentifier <em>Identifier</em>}' containment reference.
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
	 * @see dact.DactPackage#getParameterMapping_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link dact.ParameterMapping#getVariable <em>Variable</em>}' reference.
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
	 * @see dact.DactPackage#getParameterMapping_ActivityParameter()
	 * @model
	 * @generated
	 */
	Parameter getActivityParameter();

	/**
	 * Sets the value of the '{@link dact.ParameterMapping#getActivityParameter <em>Activity Parameter</em>}' reference.
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
	 * @see dact.DactPackage#getParameterMapping_Value()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link dact.ParameterMapping#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.CallOperationAction#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' container reference.
	 * @see #setAction(CallOperationAction)
	 * @see dact.DactPackage#getParameterMapping_Action()
	 * @see dact.CallOperationAction#getParameterMappings
	 * @model opposite="parameterMappings" transient="false"
	 * @generated
	 */
	CallOperationAction getAction();

	/**
	 * Sets the value of the '{@link dact.ParameterMapping#getAction <em>Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' container reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CallOperationAction value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dact.Activity#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see dact.DactPackage#getParameterMapping_Activity()
	 * @see dact.Activity#getParameterMappings
	 * @model opposite="parameterMappings" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link dact.ParameterMapping#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean ConformingActivityOperationParameter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean ExclusiveMappingSource(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean ValueOnlyInAction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ParameterMapping
