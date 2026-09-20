/**
 */
package lemma.adapted.xcore.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interface Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lemma.adapted.xcore.service.ServicePackage#getInterfaceType()
 * @model
 * @generated
 */
public enum InterfaceType implements Enumerator {
	/**
	 * The '<em><b>CONTROLLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLER(0, "CONTROLLER", "CONTROLLER"),

	/**
	 * The '<em><b>MESSAGE HANDLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_HANDLER(0, "MESSAGE_HANDLER", "MESSAGE_HANDLER"),

	/**
	 * The '<em><b>APPLICATION SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_SERVICE(0, "APPLICATION_SERVICE", "APPLICATION_SERVICE"),

	/**
	 * The '<em><b>DOMAIN SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_SERVICE(0, "DOMAIN_SERVICE", "DOMAIN_SERVICE"),

	/**
	 * The '<em><b>REPOSITORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY(0, "REPOSITORY", "REPOSITORY"),

	/**
	 * The '<em><b>OUTBOUND ADAPTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTBOUND_ADAPTER_VALUE
	 * @generated
	 * @ordered
	 */
	OUTBOUND_ADAPTER(0, "OUTBOUND_ADAPTER", "OUTBOUND_ADAPTER"),

	/**
	 * The '<em><b>MESSAGE WORKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_WORKER_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_WORKER(0, "MESSAGE_WORKER", "MESSAGE_WORKER");

	/**
	 * The '<em><b>CONTROLLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLER_VALUE = 0;

	/**
	 * The '<em><b>MESSAGE HANDLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_HANDLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_HANDLER_VALUE = 0;

	/**
	 * The '<em><b>APPLICATION SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SERVICE_VALUE = 0;

	/**
	 * The '<em><b>DOMAIN SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_SERVICE_VALUE = 0;

	/**
	 * The '<em><b>REPOSITORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_VALUE = 0;

	/**
	 * The '<em><b>OUTBOUND ADAPTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTBOUND_ADAPTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OUTBOUND_ADAPTER_VALUE = 0;

	/**
	 * The '<em><b>MESSAGE WORKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_WORKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_WORKER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterfaceType[] VALUES_ARRAY =
		new InterfaceType[] {
			CONTROLLER,
			MESSAGE_HANDLER,
			APPLICATION_SERVICE,
			DOMAIN_SERVICE,
			REPOSITORY,
			OUTBOUND_ADAPTER,
			MESSAGE_WORKER,
		};

	/**
	 * A public read-only list of all the '<em><b>Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterfaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceType get(int value) {
		switch (value) {
			case CONTROLLER_VALUE: return CONTROLLER;
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
	private InterfaceType(int value, String name, String literal) {
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
	
} //InterfaceType
