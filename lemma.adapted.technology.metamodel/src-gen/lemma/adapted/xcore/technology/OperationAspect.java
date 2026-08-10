/**
 */
package lemma.adapted.xcore.technology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Metamodel concept for operation aspects
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.technology.OperationAspect#getPointcutSelectors <em>Pointcut Selectors</em>}</li>
 *   <li>{@link lemma.adapted.xcore.technology.OperationAspect#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.technology.TechnologyPackage#getOperationAspect()
 * @model
 * @generated
 */
public interface OperationAspect extends TechnologyAspect {
	/**
	 * Returns the value of the '<em><b>Pointcut Selectors</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.technology.OperationAspectPointcutSelector}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.technology.OperationAspectPointcutSelector#getOperationAspect <em>Operation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) Selectors must be unique.
	 *          Ensured by: DSL validator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pointcut Selectors</em>' containment reference list.
	 * @see lemma.adapted.xcore.technology.TechnologyPackage#getOperationAspect_PointcutSelectors()
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcutSelector#getOperationAspect
	 * @model opposite="operationAspect" containment="true"
	 * @generated
	 */
	EList<OperationAspectPointcutSelector> getPointcutSelectors();

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.technology.Technology#getOperationAspects <em>Operation Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' container reference.
	 * @see #setTechnology(Technology)
	 * @see lemma.adapted.xcore.technology.TechnologyPackage#getOperationAspect_Technology()
	 * @see lemma.adapted.xcore.technology.Technology#getOperationAspects
	 * @model opposite="operationAspects" transient="false"
	 * @generated
	 */
	Technology getTechnology();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.technology.OperationAspect#getTechnology <em>Technology</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' container reference.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Technology value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get parts of the technology aspect for creating a qualified name
	 * <!-- end-model-doc -->
	 * @model unique="false" withTechnologyNameUnique="false" withNamespaceUnique="false"
	 * @generated
	 */
	EList<String> getQualifiedNameParts(boolean withTechnologyName, boolean withNamespace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Build qualified name from qualified name parts
	 * <!-- end-model-doc -->
	 * @model unique="false" separatorUnique="false" withTechnologyNameUnique="false" withNamespaceUnique="false"
	 * @generated
	 */
	String buildQualifiedName(String separator, boolean withTechnologyName, boolean withNamespace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Check if the aspect has a matching selector for the given pointcuts and their values.
	 * Therefore, all pointcut values of a selector must be equal to the given values, i.e., the
	 * matching is based on the logical conjunction of all pointcuts ("AND" semantics) as long as
	 * their types differ. For pointcuts that receive more than one value in a selector (currently
	 * prevented on the language-level by the validator), logical disjunction ("OR" semantics) is
	 * applied. The pointcut values themselves are compared with the given values on the basis of
	 * identity matching ("equal" semantics).
	 * <!-- end-model-doc -->
	 * @model unique="false" forTechnologyUnique="false"
	 * @generated
	 */
	boolean hasMatchingSelector(EObject forTechnology);

} // OperationAspect
