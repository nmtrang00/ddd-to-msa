/**
 */
package dact;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dact.DomainNode#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link dact.DomainNode#getResult <em>Result</em>}</li>
 *   <li>{@link dact.DomainNode#getEntity <em>Entity</em>}</li>
 *   <li>{@link dact.DomainNode#getMainExpr <em>Main Expr</em>}</li>
 *   <li>{@link dact.DomainNode#getPropertyChain <em>Property Chain</em>}</li>
 * </ul>
 *
 * @see dact.DactPackage#getDomainNode()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SelfAnchoredBinaryExpression RequiresMainExpression'"
 * @generated
 */
public interface DomainNode extends ExecutableNode, DiagnosticSupported {
	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' reference.
	 * @see #setAggregate(AggregateRoot)
	 * @see dact.DactPackage#getDomainNode_Aggregate()
	 * @model
	 * @generated
	 */
	AggregateRoot getAggregate();

	/**
	 * Sets the value of the '{@link dact.DomainNode#getAggregate <em>Aggregate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(AggregateRoot value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Identifier)
	 * @see dact.DactPackage#getDomainNode_Result()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getResult();

	/**
	 * Sets the value of the '{@link dact.DomainNode#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Identifier value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see dact.DactPackage#getDomainNode_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link dact.DomainNode#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Main Expr</b></em>' containment reference list.
	 * The list contents are of type {@link dact.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Expr</em>' containment reference list.
	 * @see dact.DactPackage#getDomainNode_MainExpr()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getMainExpr();

	/**
	 * Returns the value of the '<em><b>Property Chain</b></em>' reference list.
	 * The list contents are of type {@link dact.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Chain</em>' reference list.
	 * @see dact.DactPackage#getDomainNode_PropertyChain()
	 * @model
	 * @generated
	 */
	EList<Property> getPropertyChain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean RequiresMainExpression(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean SelfAnchoredBinaryExpression(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DomainNode
