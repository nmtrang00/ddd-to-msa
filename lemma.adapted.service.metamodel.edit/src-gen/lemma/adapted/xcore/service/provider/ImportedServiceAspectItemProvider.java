/**
 */
package lemma.adapted.xcore.service.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.data.DataFactory;
import lemma.adapted.xcore.service.ImportedServiceAspect;
import lemma.adapted.xcore.service.ServicePackage;

import lemma.adapted.xcore.technology.TechnologyFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lemma.adapted.xcore.service.ImportedServiceAspect} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImportedServiceAspectItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedServiceAspectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addImportPropertyDescriptor(object);
			addImportedAspectPropertyDescriptor(object);
			addMicroservicePropertyDescriptor(object);
			addInterfacePropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
			addReferredOperationPropertyDescriptor(object);
			addParameterPropertyDescriptor(object);
			addMappedComplexTypePropertyDescriptor(object);
			addMappedFieldPropertyDescriptor(object);
			addMappedDataOperationPropertyDescriptor(object);
			addMappedDataOperationReturnTypePropertyDescriptor(object);
			addMappedDataOperationParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_import_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_import_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__IMPORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imported Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_importedAspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_importedAspect_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__IMPORTED_ASPECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Microservice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMicroservicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_microservice_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_microservice_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__MICROSERVICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_interface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_interface_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_operation_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__OPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referred Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferredOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_referredOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_referredOperation_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__REFERRED_OPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_parameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_parameter_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapped Complex Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappedComplexTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_mappedComplexType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_mappedComplexType_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__MAPPED_COMPLEX_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapped Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappedFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_mappedField_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_mappedField_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__MAPPED_FIELD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapped Data Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappedDataOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_mappedDataOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_mappedDataOperation_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__MAPPED_DATA_OPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapped Data Operation Return Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappedDataOperationReturnTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_mappedDataOperationReturnType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_mappedDataOperationReturnType_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__MAPPED_DATA_OPERATION_RETURN_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapped Data Operation Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappedDataOperationParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImportedServiceAspect_mappedDataOperationParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImportedServiceAspect_mappedDataOperationParameter_feature", "_UI_ImportedServiceAspect_type"),
				 ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__MAPPED_DATA_OPERATION_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__SINGLE_PROPERTY_VALUE);
			childrenFeatures.add(ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__VALUES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ImportedServiceAspect.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImportedServiceAspect"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ImportedServiceAspect_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ImportedServiceAspect.class)) {
			case ServicePackage.IMPORTED_SERVICE_ASPECT__SINGLE_PROPERTY_VALUE:
			case ServicePackage.IMPORTED_SERVICE_ASPECT__VALUES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__SINGLE_PROPERTY_VALUE,
				 DataFactory.eINSTANCE.createPrimitiveValue()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.IMPORTED_SERVICE_ASPECT__VALUES,
				 TechnologyFactory.eINSTANCE.createTechnologySpecificPropertyValueAssignment()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ServiceEditPlugin.INSTANCE;
	}

}
