/**
 */
package lemma.adapted.xcore.technology;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Aspect Pointcut Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A selector of pointcuts for join points
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getPointcuts <em>Pointcuts</em>}</li>
 *   <li>{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getServiceAspect <em>Service Aspect</em>}</li>
 *   <li>{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getSelectorString <em>Selector String</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.technology.TechnologyPackage#getServiceAspectPointcutSelector()
 * @model
 * @generated
 */
public interface ServiceAspectPointcutSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Pointcuts</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.technology.ServiceAspectPointcut}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) Per pointcut type only one pointcut may be specified in a selector.
	 *          Ensured by: DSL validator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pointcuts</em>' containment reference list.
	 * @see lemma.adapted.xcore.technology.TechnologyPackage#getServiceAspectPointcutSelector_Pointcuts()
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut#getSelector
	 * @model opposite="selector" containment="true" required="true"
	 * @generated
	 */
	EList<ServiceAspectPointcut> getPointcuts();

	/**
	 * Returns the value of the '<em><b>Service Aspect</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.technology.ServiceAspect#getPointcutSelectors <em>Pointcut Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Aspect</em>' container reference.
	 * @see #setServiceAspect(ServiceAspect)
	 * @see lemma.adapted.xcore.technology.TechnologyPackage#getServiceAspectPointcutSelector_ServiceAspect()
	 * @see lemma.adapted.xcore.technology.ServiceAspect#getPointcutSelectors
	 * @model opposite="pointcutSelectors" transient="false"
	 * @generated
	 */
	ServiceAspect getServiceAspect();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector#getServiceAspect <em>Service Aspect</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Aspect</em>' container reference.
	 * @see #getServiceAspect()
	 * @generated
	 */
	void setServiceAspect(ServiceAspect value);

	/**
	 * Returns the value of the '<em><b>Selector String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the selector string of this pointcut based on the DSL's grammar
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector String</em>' attribute.
	 * @see lemma.adapted.xcore.technology.TechnologyPackage#getServiceAspectPointcutSelector_SelectorString()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSelectorString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return values of the selector's pointcuts ordered by their types. The return type is a map
	 * that preserves the insertion order and assigns a pointcut type to a list of values specified
	 * for it in the selector. The ordering of the types matches the ordering as returned by
	 * ServiceAspectPointcut.orderedPointcutTypes.
	 * <!-- end-model-doc -->
	 * @model dataType="lemma.adapted.xcore.technology.PointcutTypeStringsMap" unique="false"
	 * @generated
	 */
	Map<PointcutType, List<String>> orderedSelectorValues();

} // ServiceAspectPointcutSelector
