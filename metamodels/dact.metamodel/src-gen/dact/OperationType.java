/**
 */
package dact;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dact.DactPackage#getOperationType()
 * @model
 * @generated
 */
public enum OperationType implements Enumerator {
	/**
	 * The '<em><b>S0 DOMAIN SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S0_DOMAIN_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	S0_DOMAIN_SERVICE(0, "S0_DOMAIN_SERVICE", "S0_DOMAIN_SERVICE"),

	/**
	 * The '<em><b>R0 REPOSITORY CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R0_REPOSITORY_CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	R0_REPOSITORY_CREATE(0, "R0_REPOSITORY_CREATE", "R0_REPOSITORY_CREATE"),

	/**
	 * The '<em><b>R1 REPOSITORY READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R1_REPOSITORY_READ_VALUE
	 * @generated
	 * @ordered
	 */
	R1_REPOSITORY_READ(0, "R1_REPOSITORY_READ", "R1_REPOSITORY_READ"),

	/**
	 * The '<em><b>R2 REPOSITORY UPDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R2_REPOSITORY_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	R2_REPOSITORY_UPDATE(0, "R2_REPOSITORY_UPDATE", "R2_REPOSITORY_UPDATE"),

	/**
	 * The '<em><b>R3 REPOSITORY DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R3_REPOSITORY_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	R3_REPOSITORY_DELETE(0, "R3_REPOSITORY_DELETE", "R3_REPOSITORY_DELETE"),

	/**
	 * The '<em><b>R4 REPOSITORY EXIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R4_REPOSITORY_EXIST_VALUE
	 * @generated
	 * @ordered
	 */
	R4_REPOSITORY_EXIST(0, "R4_REPOSITORY_EXIST", "R4_REPOSITORY_EXIST"),

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
	 * The '<em><b>S0 DOMAIN SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S0_DOMAIN_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S0_DOMAIN_SERVICE_VALUE = 0;

	/**
	 * The '<em><b>R0 REPOSITORY CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R0_REPOSITORY_CREATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R0_REPOSITORY_CREATE_VALUE = 0;

	/**
	 * The '<em><b>R1 REPOSITORY READ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R1_REPOSITORY_READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R1_REPOSITORY_READ_VALUE = 0;

	/**
	 * The '<em><b>R2 REPOSITORY UPDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R2_REPOSITORY_UPDATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R2_REPOSITORY_UPDATE_VALUE = 0;

	/**
	 * The '<em><b>R3 REPOSITORY DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R3_REPOSITORY_DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R3_REPOSITORY_DELETE_VALUE = 0;

	/**
	 * The '<em><b>R4 REPOSITORY EXIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R4_REPOSITORY_EXIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R4_REPOSITORY_EXIST_VALUE = 0;

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
			S0_DOMAIN_SERVICE,
			R0_REPOSITORY_CREATE,
			R1_REPOSITORY_READ,
			R2_REPOSITORY_UPDATE,
			R3_REPOSITORY_DELETE,
			R4_REPOSITORY_EXIST,
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
			case S0_DOMAIN_SERVICE_VALUE: return S0_DOMAIN_SERVICE;
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
