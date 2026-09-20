/**
 */
package dact;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Mapping Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dact.DactPackage#getParameterMappingType()
 * @model
 * @generated
 */
public enum ParameterMappingType implements Enumerator {
	/**
	 * The '<em><b>ACTION IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_IN_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_IN(0, "ACTION_IN", "ACTION_IN"),

	/**
	 * The '<em><b>ACTION OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_OUT(0, "ACTION_OUT", "ACTION_OUT"),

	/**
	 * The '<em><b>ACTIVITY IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVITY_IN_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVITY_IN(0, "ACTIVITY_IN", "ACTIVITY_IN"),

	/**
	 * The '<em><b>ACTIVITY OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVITY_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVITY_OUT(0, "ACTIVITY_OUT", "ACTIVITY_OUT");

	/**
	 * The '<em><b>ACTION IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_IN_VALUE = 0;

	/**
	 * The '<em><b>ACTION OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_OUT_VALUE = 0;

	/**
	 * The '<em><b>ACTIVITY IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVITY_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_IN_VALUE = 0;

	/**
	 * The '<em><b>ACTIVITY OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVITY_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_OUT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Parameter Mapping Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterMappingType[] VALUES_ARRAY =
		new ParameterMappingType[] {
			ACTION_IN,
			ACTION_OUT,
			ACTIVITY_IN,
			ACTIVITY_OUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Mapping Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParameterMappingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Mapping Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterMappingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterMappingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Mapping Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterMappingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterMappingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Mapping Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterMappingType get(int value) {
		switch (value) {
			case ACTION_IN_VALUE: return ACTION_IN;
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
	private ParameterMappingType(int value, String name, String literal) {
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
	
} //ParameterMappingType
