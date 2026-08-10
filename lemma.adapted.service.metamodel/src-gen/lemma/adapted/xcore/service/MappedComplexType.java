/**
 */
package lemma.adapted.xcore.service;

import lemma.adapted.xcore.technology.Technology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Concept to express technology-specific information, which was assigned to a complex type
 * leveraging the Mapping DSL
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getT_sourceModelUri <em>Tsource Model Uri</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getT_mappingModelUri <em>Tmapping Model Uri</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getT_typeDefinitionTechnologyImport <em>Ttype Definition Technology Import</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getT_typeDefinitionTechnology <em>Ttype Definition Technology</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getTechnologyReferences <em>Technology References</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getType <em>Type</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getMappedFields <em>Mapped Fields</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getMappedOperations <em>Mapped Operations</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getAspects <em>Aspects</em>}</li>
 *   <li>{@link lemma.adapted.xcore.service.MappedComplexType#getServiceModel <em>Service Model</em>}</li>
 * </ul>
 *
 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType()
 * @model
 * @generated
 */
public interface MappedComplexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tsource Model Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tsource Model Uri</em>' attribute.
	 * @see #setT_sourceModelUri(String)
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_T_sourceModelUri()
	 * @model unique="false"
	 * @generated
	 */
	String getT_sourceModelUri();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.MappedComplexType#getT_sourceModelUri <em>Tsource Model Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tsource Model Uri</em>' attribute.
	 * @see #getT_sourceModelUri()
	 * @generated
	 */
	void setT_sourceModelUri(String value);

	/**
	 * Returns the value of the '<em><b>Tmapping Model Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmapping Model Uri</em>' attribute.
	 * @see #setT_mappingModelUri(String)
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_T_mappingModelUri()
	 * @model unique="false"
	 * @generated
	 */
	String getT_mappingModelUri();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.MappedComplexType#getT_mappingModelUri <em>Tmapping Model Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmapping Model Uri</em>' attribute.
	 * @see #getT_mappingModelUri()
	 * @generated
	 */
	void setT_mappingModelUri(String value);

	/**
	 * Returns the value of the '<em><b>Ttype Definition Technology Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttype Definition Technology Import</em>' reference.
	 * @see #setT_typeDefinitionTechnologyImport(Import)
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_T_typeDefinitionTechnologyImport()
	 * @model
	 * @generated
	 */
	Import getT_typeDefinitionTechnologyImport();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.MappedComplexType#getT_typeDefinitionTechnologyImport <em>Ttype Definition Technology Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttype Definition Technology Import</em>' reference.
	 * @see #getT_typeDefinitionTechnologyImport()
	 * @generated
	 */
	void setT_typeDefinitionTechnologyImport(Import value);

	/**
	 * Returns the value of the '<em><b>Ttype Definition Technology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttype Definition Technology</em>' reference.
	 * @see #setT_typeDefinitionTechnology(Technology)
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_T_typeDefinitionTechnology()
	 * @model
	 * @generated
	 */
	Technology getT_typeDefinitionTechnology();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.MappedComplexType#getT_typeDefinitionTechnology <em>Ttype Definition Technology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttype Definition Technology</em>' reference.
	 * @see #getT_typeDefinitionTechnology()
	 * @generated
	 */
	void setT_typeDefinitionTechnology(Technology value);

	/**
	 * Returns the value of the '<em><b>Technology References</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.service.TechnologyReference}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.TechnologyReference#getMappedComplexType <em>Mapped Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology References</em>' containment reference list.
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_TechnologyReferences()
	 * @see lemma.adapted.xcore.service.TechnologyReference#getMappedComplexType
	 * @model opposite="mappedComplexType" containment="true"
	 * @generated
	 */
	EList<TechnologyReference> getTechnologyReferences();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ImportedType)
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_Type()
	 * @model containment="true"
	 * @generated
	 */
	ImportedType getType();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.MappedComplexType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ImportedType value);

	/**
	 * Returns the value of the '<em><b>Mapped Fields</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.service.MappedField}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.MappedField#getMappedComplexType <em>Mapped Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Fields</em>' containment reference list.
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_MappedFields()
	 * @see lemma.adapted.xcore.service.MappedField#getMappedComplexType
	 * @model opposite="mappedComplexType" containment="true"
	 * @generated
	 */
	EList<MappedField> getMappedFields();

	/**
	 * Returns the value of the '<em><b>Mapped Operations</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.service.MappedDataOperation}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.MappedDataOperation#getMappedComplexType <em>Mapped Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Operations</em>' containment reference list.
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_MappedOperations()
	 * @see lemma.adapted.xcore.service.MappedDataOperation#getMappedComplexType
	 * @model opposite="mappedComplexType" containment="true"
	 * @generated
	 */
	EList<MappedDataOperation> getMappedOperations();

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link lemma.adapted.xcore.service.ImportedServiceAspect}.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.ImportedServiceAspect#getMappedComplexType <em>Mapped Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_Aspects()
	 * @see lemma.adapted.xcore.service.ImportedServiceAspect#getMappedComplexType
	 * @model opposite="mappedComplexType" containment="true"
	 * @generated
	 */
	EList<ImportedServiceAspect> getAspects();

	/**
	 * Returns the value of the '<em><b>Service Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lemma.adapted.xcore.service.ServiceModel#getMappedComplexTypes <em>Mapped Complex Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Model</em>' container reference.
	 * @see #setServiceModel(ServiceModel)
	 * @see lemma.adapted.xcore.service.ServicePackage#getMappedComplexType_ServiceModel()
	 * @see lemma.adapted.xcore.service.ServiceModel#getMappedComplexTypes
	 * @model opposite="mappedComplexTypes" transient="false"
	 * @generated
	 */
	ServiceModel getServiceModel();

	/**
	 * Sets the value of the '{@link lemma.adapted.xcore.service.MappedComplexType#getServiceModel <em>Service Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Model</em>' container reference.
	 * @see #getServiceModel()
	 * @generated
	 */
	void setServiceModel(ServiceModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get parts of the mapped complex type for creating a qualified name
	 * <!-- end-model-doc -->
	 * @model unique="false" withImportNameUnique="false"
	 * @generated
	 */
	EList<String> getQualifiedNameParts(boolean withImportName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Build qualified name from qualified name parts
	 * <!-- end-model-doc -->
	 * @model unique="false" separatorUnique="false" withImportNameUnique="false"
	 * @generated
	 */
	String buildQualifiedName(String separator, boolean withImportName);

} // MappedComplexType
