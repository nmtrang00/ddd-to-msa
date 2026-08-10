/**
 */
package lemma.adapted.xcore.behavior;

import lemma.adapted.xcore.data.DataOperation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.behavior.InvariantDataOperation#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getInvariantDataOperation()
 * @model
 * @generated
 */
public interface InvariantDataOperation extends DataOperation {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference list.
	 * @see lemma.adapted.xcore.behavior.BehaviorPackage#getInvariantDataOperation_Expr()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpr();

} // InvariantDataOperation
