/**
 */
package lemma.adapted.xcore.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lemma.adapted.xcore.service.ServicePackage#getOperationType()
 * @model
 * @generated
 */
public enum OperationType implements Enumerator {
	/**
	 * The '<em><b>I0 INBOUND GET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I0_INBOUND_GET_VALUE
	 * @generated
	 * @ordered
	 */
	I0_INBOUND_GET(0, "I0_INBOUND_GET", "I0_INBOUND_GET"),

	/**
	 * The '<em><b>I1 INBOUND PUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I1_INBOUND_PUT_VALUE
	 * @generated
	 * @ordered
	 */
	I1_INBOUND_PUT(0, "I1_INBOUND_PUT", "I1_INBOUND_PUT"),

	/**
	 * The '<em><b>I2 INBOUND POST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I2_INBOUND_POST_VALUE
	 * @generated
	 * @ordered
	 */
	I2_INBOUND_POST(0, "I2_INBOUND_POST", "I2_INBOUND_POST"),

	/**
	 * The '<em><b>I3 INBOUND DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I3_INBOUND_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	I3_INBOUND_DELETE(0, "I3_INBOUND_DELETE", "I3_INBOUND_DELETE"),

	/**
	 * The '<em><b>I4 MESSAGE HANDLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I4_MESSAGE_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	I4_MESSAGE_HANDLER(0, "I4_MESSAGE_HANDLER", "I4_MESSAGE_HANDLER"),

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
	 * The '<em><b>S1 APPLICATION SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S1_APPLICATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	S1_APPLICATION_SERVICE(0, "S1_APPLICATION_SERVICE", "S1_APPLICATION_SERVICE"),

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
	 * The '<em><b>O0 OUTBOUND GET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O0_OUTBOUND_GET_VALUE
	 * @generated
	 * @ordered
	 */
	O0_OUTBOUND_GET(0, "O0_OUTBOUND_GET", "O0_OUTBOUND_GET"),

	/**
	 * The '<em><b>O1 OUTBOUND PUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O1_OUTBOUND_PUT_VALUE
	 * @generated
	 * @ordered
	 */
	O1_OUTBOUND_PUT(0, "O1_OUTBOUND_PUT", "O1_OUTBOUND_PUT"),

	/**
	 * The '<em><b>O2 OUTBOUND POST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O2_OUTBOUND_POST_VALUE
	 * @generated
	 * @ordered
	 */
	O2_OUTBOUND_POST(0, "O2_OUTBOUND_POST", "O2_OUTBOUND_POST"),

	/**
	 * The '<em><b>O3 OUTBOUND DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O3_OUTBOUND_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	O3_OUTBOUND_DELETE(0, "O3_OUTBOUND_DELETE", "O3_OUTBOUND_DELETE"),

	/**
	 * The '<em><b>O4 MESSAGE DISPATCHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O4_MESSAGE_DISPATCHER_VALUE
	 * @generated
	 * @ordered
	 */
	O4_MESSAGE_DISPATCHER(0, "O4_MESSAGE_DISPATCHER", "O4_MESSAGE_DISPATCHER"),

	/**
	 * The '<em><b>O5 OUTBOX POLLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O5_OUTBOX_POLLER_VALUE
	 * @generated
	 * @ordered
	 */
	O5_OUTBOX_POLLER(0, "O5_OUTBOX_POLLER", "O5_OUTBOX_POLLER"),

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
	 * The '<em><b>D1 SIMPLE MUTATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D1_SIMPLE_MUTATOR_VALUE
	 * @generated
	 * @ordered
	 */
	D1_SIMPLE_MUTATOR(0, "D1_SIMPLE_MUTATOR", "D1_SIMPLE_MUTATOR"),

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
	 * The '<em><b>D3 SIMPLE ACCESSOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D3_SIMPLE_ACCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	D3_SIMPLE_ACCESSOR(0, "D3_SIMPLE_ACCESSOR", "D3_SIMPLE_ACCESSOR"),

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
	 * The '<em><b>I0 INBOUND GET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I0_INBOUND_GET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I0_INBOUND_GET_VALUE = 0;

	/**
	 * The '<em><b>I1 INBOUND PUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I1_INBOUND_PUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I1_INBOUND_PUT_VALUE = 0;

	/**
	 * The '<em><b>I2 INBOUND POST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I2_INBOUND_POST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I2_INBOUND_POST_VALUE = 0;

	/**
	 * The '<em><b>I3 INBOUND DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I3_INBOUND_DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I3_INBOUND_DELETE_VALUE = 0;

	/**
	 * The '<em><b>I4 MESSAGE HANDLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I4_MESSAGE_HANDLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I4_MESSAGE_HANDLER_VALUE = 0;

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
	 * The '<em><b>S1 APPLICATION SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S1_APPLICATION_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S1_APPLICATION_SERVICE_VALUE = 0;

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
	 * The '<em><b>O0 OUTBOUND GET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O0_OUTBOUND_GET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int O0_OUTBOUND_GET_VALUE = 0;

	/**
	 * The '<em><b>O1 OUTBOUND PUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O1_OUTBOUND_PUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int O1_OUTBOUND_PUT_VALUE = 0;

	/**
	 * The '<em><b>O2 OUTBOUND POST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O2_OUTBOUND_POST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int O2_OUTBOUND_POST_VALUE = 0;

	/**
	 * The '<em><b>O3 OUTBOUND DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O3_OUTBOUND_DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int O3_OUTBOUND_DELETE_VALUE = 0;

	/**
	 * The '<em><b>O4 MESSAGE DISPATCHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O4_MESSAGE_DISPATCHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int O4_MESSAGE_DISPATCHER_VALUE = 0;

	/**
	 * The '<em><b>O5 OUTBOX POLLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #O5_OUTBOX_POLLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int O5_OUTBOX_POLLER_VALUE = 0;

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
	 * The '<em><b>D1 SIMPLE MUTATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D1_SIMPLE_MUTATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D1_SIMPLE_MUTATOR_VALUE = 0;

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
	 * The '<em><b>D3 SIMPLE ACCESSOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D3_SIMPLE_ACCESSOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D3_SIMPLE_ACCESSOR_VALUE = 0;

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
			I0_INBOUND_GET,
			I1_INBOUND_PUT,
			I2_INBOUND_POST,
			I3_INBOUND_DELETE,
			I4_MESSAGE_HANDLER,
			S0_DOMAIN_SERVICE,
			S1_APPLICATION_SERVICE,
			R0_REPOSITORY_CREATE,
			R1_REPOSITORY_READ,
			R2_REPOSITORY_UPDATE,
			R3_REPOSITORY_DELETE,
			R4_REPOSITORY_EXIST,
			O0_OUTBOUND_GET,
			O1_OUTBOUND_PUT,
			O2_OUTBOUND_POST,
			O3_OUTBOUND_DELETE,
			O4_MESSAGE_DISPATCHER,
			O5_OUTBOX_POLLER,
			D0_CONSTRUCTOR,
			D1_SIMPLE_MUTATOR,
			D2_COMPOUND_MUTATOR,
			D3_SIMPLE_ACCESSOR,
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
			case I0_INBOUND_GET_VALUE: return I0_INBOUND_GET;
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
