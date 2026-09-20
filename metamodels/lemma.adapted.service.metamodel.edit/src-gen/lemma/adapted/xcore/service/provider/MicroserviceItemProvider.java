/**
 */
package lemma.adapted.xcore.service.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.service.Microservice;
import lemma.adapted.xcore.service.ServiceFactory;
import lemma.adapted.xcore.service.ServicePackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lemma.adapted.xcore.service.Microservice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroserviceItemProvider 
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
	public MicroserviceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addT_defaultProtocolsPropertyDescriptor(object);
			addT_sourceModelUriPropertyDescriptor(object);
			addT_mappingModelUriPropertyDescriptor(object);
			addT_typeDefinitionTechnologyImportPropertyDescriptor(object);
			addT_typeDefinitionTechnologyPropertyDescriptor(object);
			addServiceModelPropertyDescriptor(object);
			addEffectivelyImplementedPropertyDescriptor(object);
			addEffectiveVisibilityPropertyDescriptor(object);
			addEffectivelyInternalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_name_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_version_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_type_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_visibility_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tdefault Protocols feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addT_defaultProtocolsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_t_defaultProtocols_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_t_defaultProtocols_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__TDEFAULT_PROTOCOLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tsource Model Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addT_sourceModelUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_t_sourceModelUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_t_sourceModelUri_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__TSOURCE_MODEL_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tmapping Model Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addT_mappingModelUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_t_mappingModelUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_t_mappingModelUri_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__TMAPPING_MODEL_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ttype Definition Technology Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addT_typeDefinitionTechnologyImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_t_typeDefinitionTechnologyImport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_t_typeDefinitionTechnologyImport_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__TTYPE_DEFINITION_TECHNOLOGY_IMPORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ttype Definition Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addT_typeDefinitionTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_t_typeDefinitionTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_t_typeDefinitionTechnology_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__TTYPE_DEFINITION_TECHNOLOGY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_serviceModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_serviceModel_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__SERVICE_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effectively Implemented feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectivelyImplementedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_effectivelyImplemented_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_effectivelyImplemented_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__EFFECTIVELY_IMPLEMENTED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effective Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectiveVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_effectiveVisibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_effectiveVisibility_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__EFFECTIVE_VISIBILITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effectively Internal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectivelyInternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_effectivelyInternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_effectivelyInternal_feature", "_UI_Microservice_type"),
				 ServicePackage.Literals.MICROSERVICE__EFFECTIVELY_INTERNAL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(ServicePackage.Literals.MICROSERVICE__TECHNOLOGY_REFERENCES);
			childrenFeatures.add(ServicePackage.Literals.MICROSERVICE__ENDPOINTS);
			childrenFeatures.add(ServicePackage.Literals.MICROSERVICE__REQUIRED_MICROSERVICES);
			childrenFeatures.add(ServicePackage.Literals.MICROSERVICE__REQUIRED_INTERFACES);
			childrenFeatures.add(ServicePackage.Literals.MICROSERVICE__REQUIRED_OPERATIONS);
			childrenFeatures.add(ServicePackage.Literals.MICROSERVICE__PROTOCOLS);
			childrenFeatures.add(ServicePackage.Literals.MICROSERVICE__INTERFACES);
			childrenFeatures.add(ServicePackage.Literals.MICROSERVICE__ASPECTS);
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
	 * This returns Microservice.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Microservice"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Microservice)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Microservice_type") :
			getString("_UI_Microservice_type") + " " + label;
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

		switch (notification.getFeatureID(Microservice.class)) {
			case ServicePackage.MICROSERVICE__NAME:
			case ServicePackage.MICROSERVICE__VERSION:
			case ServicePackage.MICROSERVICE__TYPE:
			case ServicePackage.MICROSERVICE__VISIBILITY:
			case ServicePackage.MICROSERVICE__TDEFAULT_PROTOCOLS:
			case ServicePackage.MICROSERVICE__TSOURCE_MODEL_URI:
			case ServicePackage.MICROSERVICE__TMAPPING_MODEL_URI:
			case ServicePackage.MICROSERVICE__EFFECTIVELY_IMPLEMENTED:
			case ServicePackage.MICROSERVICE__EFFECTIVE_VISIBILITY:
			case ServicePackage.MICROSERVICE__EFFECTIVELY_INTERNAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicePackage.MICROSERVICE__TECHNOLOGY_REFERENCES:
			case ServicePackage.MICROSERVICE__ENDPOINTS:
			case ServicePackage.MICROSERVICE__REQUIRED_MICROSERVICES:
			case ServicePackage.MICROSERVICE__REQUIRED_INTERFACES:
			case ServicePackage.MICROSERVICE__REQUIRED_OPERATIONS:
			case ServicePackage.MICROSERVICE__PROTOCOLS:
			case ServicePackage.MICROSERVICE__INTERFACES:
			case ServicePackage.MICROSERVICE__ASPECTS:
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
				(ServicePackage.Literals.MICROSERVICE__TECHNOLOGY_REFERENCES,
				 ServiceFactory.eINSTANCE.createTechnologyReference()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MICROSERVICE__ENDPOINTS,
				 ServiceFactory.eINSTANCE.createEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MICROSERVICE__REQUIRED_MICROSERVICES,
				 ServiceFactory.eINSTANCE.createPossiblyImportedMicroservice()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MICROSERVICE__REQUIRED_INTERFACES,
				 ServiceFactory.eINSTANCE.createPossiblyImportedInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MICROSERVICE__REQUIRED_OPERATIONS,
				 ServiceFactory.eINSTANCE.createPossiblyImportedOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MICROSERVICE__PROTOCOLS,
				 ServiceFactory.eINSTANCE.createProtocolSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MICROSERVICE__INTERFACES,
				 ServiceFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MICROSERVICE__ASPECTS,
				 ServiceFactory.eINSTANCE.createImportedServiceAspect()));
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
