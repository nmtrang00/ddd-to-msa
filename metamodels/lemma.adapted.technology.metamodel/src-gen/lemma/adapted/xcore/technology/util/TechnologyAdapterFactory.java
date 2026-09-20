/**
 */
package lemma.adapted.xcore.technology.util;

import lemma.adapted.xcore.data.ComplexType;
import lemma.adapted.xcore.data.PrimitiveType;
import lemma.adapted.xcore.data.Type;

import lemma.adapted.xcore.technology.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lemma.adapted.xcore.technology.TechnologyPackage
 * @generated
 */
public class TechnologyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TechnologyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TechnologyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologySwitch<Adapter> modelSwitch =
		new TechnologySwitch<Adapter>() {
			@Override
			public Adapter caseTechnology(Technology object) {
				return createTechnologyAdapter();
			}
			@Override
			public Adapter caseTechnologyImport(TechnologyImport object) {
				return createTechnologyImportAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseDataFormat(DataFormat object) {
				return createDataFormatAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificPrimitiveType(TechnologySpecificPrimitiveType object) {
				return createTechnologySpecificPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificCollectionType(TechnologySpecificCollectionType object) {
				return createTechnologySpecificCollectionTypeAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificDataStructure(TechnologySpecificDataStructure object) {
				return createTechnologySpecificDataStructureAdapter();
			}
			@Override
			public Adapter caseCompatibilityMatrixEntry(CompatibilityMatrixEntry object) {
				return createCompatibilityMatrixEntryAdapter();
			}
			@Override
			public Adapter casePossiblyImportedTechnologySpecificType(PossiblyImportedTechnologySpecificType object) {
				return createPossiblyImportedTechnologySpecificTypeAdapter();
			}
			@Override
			public Adapter caseOperationTechnology(OperationTechnology object) {
				return createOperationTechnologyAdapter();
			}
			@Override
			public Adapter caseOperationEnvironment(OperationEnvironment object) {
				return createOperationEnvironmentAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificProperty(TechnologySpecificProperty object) {
				return createTechnologySpecificPropertyAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificPropertyValueAssignment(TechnologySpecificPropertyValueAssignment object) {
				return createTechnologySpecificPropertyValueAssignmentAdapter();
			}
			@Override
			public Adapter caseDeploymentTechnology(DeploymentTechnology object) {
				return createDeploymentTechnologyAdapter();
			}
			@Override
			public Adapter caseInfrastructureTechnology(InfrastructureTechnology object) {
				return createInfrastructureTechnologyAdapter();
			}
			@Override
			public Adapter caseTechnologyAspect(TechnologyAspect object) {
				return createTechnologyAspectAdapter();
			}
			@Override
			public Adapter caseServiceAspect(ServiceAspect object) {
				return createServiceAspectAdapter();
			}
			@Override
			public Adapter caseServiceAspectPointcut(ServiceAspectPointcut object) {
				return createServiceAspectPointcutAdapter();
			}
			@Override
			public Adapter caseServiceAspectPointcutSelector(ServiceAspectPointcutSelector object) {
				return createServiceAspectPointcutSelectorAdapter();
			}
			@Override
			public Adapter caseOperationAspect(OperationAspect object) {
				return createOperationAspectAdapter();
			}
			@Override
			public Adapter caseOperationAspectPointcut(OperationAspectPointcut object) {
				return createOperationAspectPointcutAdapter();
			}
			@Override
			public Adapter caseOperationAspectPointcutSelector(OperationAspectPointcutSelector object) {
				return createOperationAspectPointcutSelectorAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseComplexType(ComplexType object) {
				return createComplexTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.Technology
	 * @generated
	 */
	public Adapter createTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.TechnologyImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.TechnologyImport
	 * @generated
	 */
	public Adapter createTechnologyImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.DataFormat
	 * @generated
	 */
	public Adapter createDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType <em>Specific Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType
	 * @generated
	 */
	public Adapter createTechnologySpecificPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.TechnologySpecificCollectionType <em>Specific Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificCollectionType
	 * @generated
	 */
	public Adapter createTechnologySpecificCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.TechnologySpecificDataStructure <em>Specific Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificDataStructure
	 * @generated
	 */
	public Adapter createTechnologySpecificDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.CompatibilityMatrixEntry <em>Compatibility Matrix Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.CompatibilityMatrixEntry
	 * @generated
	 */
	public Adapter createCompatibilityMatrixEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType <em>Possibly Imported Technology Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.PossiblyImportedTechnologySpecificType
	 * @generated
	 */
	public Adapter createPossiblyImportedTechnologySpecificTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.OperationTechnology <em>Operation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.OperationTechnology
	 * @generated
	 */
	public Adapter createOperationTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.OperationEnvironment <em>Operation Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.OperationEnvironment
	 * @generated
	 */
	public Adapter createOperationEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.TechnologySpecificProperty <em>Specific Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificProperty
	 * @generated
	 */
	public Adapter createTechnologySpecificPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.TechnologySpecificPropertyValueAssignment <em>Specific Property Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.TechnologySpecificPropertyValueAssignment
	 * @generated
	 */
	public Adapter createTechnologySpecificPropertyValueAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.DeploymentTechnology <em>Deployment Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.DeploymentTechnology
	 * @generated
	 */
	public Adapter createDeploymentTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.InfrastructureTechnology <em>Infrastructure Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.InfrastructureTechnology
	 * @generated
	 */
	public Adapter createInfrastructureTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.TechnologyAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.TechnologyAspect
	 * @generated
	 */
	public Adapter createTechnologyAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.ServiceAspect <em>Service Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.ServiceAspect
	 * @generated
	 */
	public Adapter createServiceAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.ServiceAspectPointcut <em>Service Aspect Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcut
	 * @generated
	 */
	public Adapter createServiceAspectPointcutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.ServiceAspectPointcutSelector <em>Service Aspect Pointcut Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.ServiceAspectPointcutSelector
	 * @generated
	 */
	public Adapter createServiceAspectPointcutSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.OperationAspect <em>Operation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.OperationAspect
	 * @generated
	 */
	public Adapter createOperationAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.OperationAspectPointcut <em>Operation Aspect Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcut
	 * @generated
	 */
	public Adapter createOperationAspectPointcutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.technology.OperationAspectPointcutSelector <em>Operation Aspect Pointcut Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.technology.OperationAspectPointcutSelector
	 * @generated
	 */
	public Adapter createOperationAspectPointcutSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.data.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.data.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.data.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.data.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lemma.adapted.xcore.data.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lemma.adapted.xcore.data.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TechnologyAdapterFactory
