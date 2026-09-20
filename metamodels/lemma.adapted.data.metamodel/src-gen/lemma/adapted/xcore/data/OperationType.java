/**
 */
package lemma.adapted.xcore.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lemma.adapted.xcore.data.DataPackage#getOperationType()
 * @model
 * @generated
 */
public enum OperationType implements Enumerator {
	/**
	 * The '<em><b>D0 CONSTRUCTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D0_CONSTRUCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	D0_CONSTRUCTOR(0, "D0_CONSTRUCTOR", "D0_CONSTRUCTOR"),

	/**
	 * The '<em><b>D2 COMPOUND MUTATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D2_COMPOUND_MUTATOR_VALUE
	 * @generated
	 * @ordered
	 */
	D2_COMPOUND_MUTATOR(0, "D2_COMPOUND_MUTATOR", "D2_COMPOUND_MUTATOR"),

	/**
	 * The '<em><b>D4 COMPOUND ACCESSOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D4_COMPOUND_ACCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	D4_COMPOUND_ACCESSOR(0, "D4_COMPOUND_ACCESSOR", "D4_COMPOUND_ACCESSOR"),

	/**
	 * The '<em><b>D5 SPECIFICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D5_SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	D5_SPECIFICATION(0, "D5_SPECIFICATION", "D5_SPECIFICATION");

	/**
	 * The '<em><b>D0 CONSTRUCTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D0_CONSTRUCTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D0_CONSTRUCTOR_VALUE = 0;

	/**
	 * The '<em><b>D2 COMPOUND MUTATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D2_COMPOUND_MUTATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D2_COMPOUND_MUTATOR_VALUE = 0;

	/**
	 * The '<em><b>D4 COMPOUND ACCESSOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D4_COMPOUND_ACCESSOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D4_COMPOUND_ACCESSOR_VALUE = 0;

	/**
	 * The '<em><b>D5 SPECIFICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D5_SPECIFICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D5_SPECIFICATION_VALUE = 0;

	/**
	 * An array of all the '<em><b>Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperationType[] VALUES_ARRAY =
		new OperationType[] {
			D0_CONSTRUCTOR,
			D2_COMPOUND_MUTATOR,
			D4_COMPOUND_ACCESSOR,
			D5_SPECIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationType get(int value) {
		switch (value) {
			case D0_CONSTRUCTOR_VALUE: return D0_CONSTRUCTOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OperationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OperationType
