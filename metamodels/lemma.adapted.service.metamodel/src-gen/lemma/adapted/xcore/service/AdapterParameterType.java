/**
 */
package lemma.adapted.xcore.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Adapter Parameter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lemma.adapted.xcore.service.ServicePackage#getAdapterParameterType()
 * @model
 * @generated
 */
public enum AdapterParameterType implements Enumerator {
	/**
	 * The '<em><b>PATH PARAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_PARAM_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_PARAM(0, "PATH_PARAM", "PATH_PARAM"),

	/**
	 * The '<em><b>QUERY PARAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_PARAM_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_PARAM(0, "QUERY_PARAM", "QUERY_PARAM"),

	/**
	 * The '<em><b>REQUEST BODY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_BODY_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_BODY(0, "REQUEST_BODY", "REQUEST_BODY"),

	/**
	 * The '<em><b>RESPONSE BODY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_BODY_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE_BODY(0, "RESPONSE_BODY", "RESPONSE_BODY");

	/**
	 * The '<em><b>PATH PARAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_PARAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATH_PARAM_VALUE = 0;

	/**
	 * The '<em><b>QUERY PARAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_PARAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_PARAM_VALUE = 0;

	/**
	 * The '<em><b>REQUEST BODY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_BODY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_BODY_VALUE = 0;

	/**
	 * The '<em><b>RESPONSE BODY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_BODY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_BODY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Adapter Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdapterParameterType[] VALUES_ARRAY =
		new AdapterParameterType[] {
			PATH_PARAM,
			QUERY_PARAM,
			REQUEST_BODY,
			RESPONSE_BODY,
		};

	/**
	 * A public read-only list of all the '<em><b>Adapter Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdapterParameterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Adapter Parameter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdapterParameterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdapterParameterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adapter Parameter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdapterParameterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdapterParameterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adapter Parameter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdapterParameterType get(int value) {
		switch (value) {
			case PATH_PARAM_VALUE: return PATH_PARAM;
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
	private AdapterParameterType(int value, String name, String literal) {
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
	
} //AdapterParameterType
