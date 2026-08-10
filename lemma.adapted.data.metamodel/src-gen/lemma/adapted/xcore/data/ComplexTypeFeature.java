/**
 */
package lemma.adapted.xcore.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Complex Type Feature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * Possible features for a complex type. Remember to adapt ComplexType.getAllDomainFeatures() if a
 * new domain-driven-design-related feature is added.
 * <!-- end-model-doc -->
 * @see lemma.adapted.xcore.data.DataPackage#getComplexTypeFeature()
 * @model
 * @generated
 */
public enum ComplexTypeFeature implements Enumerator {
	/**
	 * The '<em><b>REQUEST PAYLOAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_PAYLOAD_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_PAYLOAD(0, "REQUEST_PAYLOAD", "REQUEST_PAYLOAD"),

	/**
	 * The '<em><b>RESPONSE PAYLOAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_PAYLOAD_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE_PAYLOAD(0, "RESPONSE_PAYLOAD", "RESPONSE_PAYLOAD"),

	/**
	 * The '<em><b>NOTFOUND EXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTFOUND_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	NOTFOUND_EXCEPTION(0, "NOTFOUND_EXCEPTION", "NOTFOUND_EXCEPTION"),

	/**
	 * The '<em><b>RUNTIME EXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNTIME_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	RUNTIME_EXCEPTION(0, "RUNTIME_EXCEPTION", "RUNTIME_EXCEPTION"),

	/**
	 * The '<em><b>AGGREGATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATE_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATE(0, "AGGREGATE", "AGGREGATE"),

	/**
	 * The '<em><b>DOMAIN EVENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_EVENT(0, "DOMAIN_EVENT", "DOMAIN_EVENT"),

	/**
	 * The '<em><b>ENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY(0, "ENTITY", "ENTITY"),

	/**
	 * The '<em><b>VALUE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_OBJECT(0, "VALUE_OBJECT", "VALUE_OBJECT"),

	/**
	 * The '<em><b>SHARED VALUE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_VALUE_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	SHARED_VALUE_OBJECT(0, "SHARED_VALUE_OBJECT", "SHARED_VALUE_OBJECT"),

	/**
	 * The '<em><b>EXTERNAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL(0, "EXTERNAL", "EXTERNAL");

	/**
	 * The '<em><b>REQUEST PAYLOAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_PAYLOAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_PAYLOAD_VALUE = 0;

	/**
	 * The '<em><b>RESPONSE PAYLOAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_PAYLOAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_PAYLOAD_VALUE = 0;

	/**
	 * The '<em><b>NOTFOUND EXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTFOUND_EXCEPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTFOUND_EXCEPTION_VALUE = 0;

	/**
	 * The '<em><b>RUNTIME EXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNTIME_EXCEPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUNTIME_EXCEPTION_VALUE = 0;

	/**
	 * The '<em><b>AGGREGATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATE_VALUE = 0;

	/**
	 * The '<em><b>DOMAIN EVENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_EVENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_EVENT_VALUE = 0;

	/**
	 * The '<em><b>ENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_VALUE = 0;

	/**
	 * The '<em><b>VALUE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_OBJECT_VALUE = 0;

	/**
	 * The '<em><b>SHARED VALUE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_VALUE_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHARED_VALUE_OBJECT_VALUE = 0;

	/**
	 * The '<em><b>EXTERNAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Complex Type Feature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComplexTypeFeature[] VALUES_ARRAY =
		new ComplexTypeFeature[] {
			REQUEST_PAYLOAD,
			RESPONSE_PAYLOAD,
			NOTFOUND_EXCEPTION,
			RUNTIME_EXCEPTION,
			AGGREGATE,
			DOMAIN_EVENT,
			ENTITY,
			VALUE_OBJECT,
			SHARED_VALUE_OBJECT,
			EXTERNAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Complex Type Feature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComplexTypeFeature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Complex Type Feature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComplexTypeFeature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComplexTypeFeature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Complex Type Feature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComplexTypeFeature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComplexTypeFeature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Complex Type Feature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComplexTypeFeature get(int value) {
		switch (value) {
			case REQUEST_PAYLOAD_VALUE: return REQUEST_PAYLOAD;
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
	private ComplexTypeFeature(int value, String name, String literal) {
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
	
} //ComplexTypeFeature
