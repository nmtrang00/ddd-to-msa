/**
 */
package lemma.adapted.xcore.technology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Technology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Abstract superclass of technologies specific to service operation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.technology.OperationTechnology#getName <em>Name</em>}</li>
 *   <li>{@link lemma.adapted.xcore.technology.OperationTechnology#getOperationEnvironments <em>Operation Environments</em>}</li>
 *   <li>{@link lemma.adapted.xcore.technology.OperationTechnology#getServiceProperties <em>Service Properties</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.technology.TechnologyPackage#getOperationTechnology()
 * @model abstract="true"
 * @generated
 */
public interface OperationTechnology extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lemma.adapted.xcore.technology.TechnologyPackage#getOperationTechnology_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.technology.OperationTechnology#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Environments</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.technology.OperationEnvironment}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.technology.OperationEnvironment#getOperationTechnology <em>Operation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Environments</em>' containment reference list.
	 * @see lemma.adapted.xcore.technology.TechnologyPackage#getOperationTechnology_OperationEnvironments()
	 * @see lemma.adapted.xcore.technology.OperationEnvironment#getOperationTechnology
	 * @model opposite="operationTechnology" containment="true" required="true"
	 * @generated
	 */
	EList<OperationEnvironment> getOperationEnvironments();

	/**
	 * Returns the value of the '<em><b>Service Properties</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.technology.TechnologySpecificProperty}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty#getOperationTechnology <em>Operation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Properties</em>' containment reference list.
	 * @see lemma.adapted.xcore.technology.TechnologyPackage#getOperationTechnology_ServiceProperties()
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty#getOperationTechnology
	 * @model opposite="operationTechnology" containment="true"
	 * @generated
	 */
	EList<TechnologySpecificProperty> getServiceProperties();

} // OperationTechnology
