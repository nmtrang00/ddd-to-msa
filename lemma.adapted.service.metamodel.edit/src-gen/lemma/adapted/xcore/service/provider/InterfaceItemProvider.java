/**
 */
package lemma.adapted.xcore.service.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.service.Interface;
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
 * This is the item provider adapter for a {@link lemma.adapted.xcore.service.Interface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceItemProvider 
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
	public InterfaceItemProvider(AdapterFactory adapterFactory) {
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
			addNotImplementedPropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addInterfaceTypePropertyDescriptor(object);
			addMicroservicePropertyDescriptor(object);
			addEffectiveVisibilityPropertyDescriptor(object);
			addEffectivelyImplementedPropertyDescriptor(object);
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
				 getString("_UI_Interface_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_name_feature", "_UI_Interface_type"),
				 ServicePackage.Literals.INTERFACE__NAME,
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
				 getString("_UI_Interface_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_version_feature", "_UI_Interface_type"),
				 ServicePackage.Literals.INTERFACE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Not Implemented feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotImplementedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_notImplemented_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_notImplemented_feature", "_UI_Interface_type"),
				 ServicePackage.Literals.INTERFACE__NOT_IMPLEMENTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Interface_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_visibility_feature", "_UI_Interface_type"),
				 ServicePackage.Literals.INTERFACE__VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_interfaceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_interfaceType_feature", "_UI_Interface_type"),
				 ServicePackage.Literals.INTERFACE__INTERFACE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Interface_microservice_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_microservice_feature", "_UI_Interface_type"),
				 ServicePackage.Literals.INTERFACE__MICROSERVICE,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_Interface_effectiveVisibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_effectiveVisibility_feature", "_UI_Interface_type"),
				 ServicePackage.Literals.INTERFACE__EFFECTIVE_VISIBILITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Interface_effectivelyImplemented_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_effectivelyImplemented_feature", "_UI_Interface_type"),
				 ServicePackage.Literals.INTERFACE__EFFECTIVELY_IMPLEMENTED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Interface_effectivelyInternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_effectivelyInternal_feature", "_UI_Interface_type"),
				 ServicePackage.Literals.INTERFACE__EFFECTIVELY_INTERNAL,
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
			childrenFeatures.add(ServicePackage.Literals.INTERFACE__ENDPOINTS);
			childrenFeatures.add(ServicePackage.Literals.INTERFACE__PROTOCOLS);
			childrenFeatures.add(ServicePackage.Literals.INTERFACE__OPERATIONS);
			childrenFeatures.add(ServicePackage.Literals.INTERFACE__REFERRED_OPERATIONS);
			childrenFeatures.add(ServicePackage.Literals.INTERFACE__ASPECTS);
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
	 * This returns Interface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Interface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Interface_type") :
			getString("_UI_Interface_type") + " " + label;
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

		switch (notification.getFeatureID(Interface.class)) {
			case ServicePackage.INTERFACE__NAME:
			case ServicePackage.INTERFACE__VERSION:
			case ServicePackage.INTERFACE__NOT_IMPLEMENTED:
			case ServicePackage.INTERFACE__VISIBILITY:
			case ServicePackage.INTERFACE__INTERFACE_TYPE:
			case ServicePackage.INTERFACE__EFFECTIVE_VISIBILITY:
			case ServicePackage.INTERFACE__EFFECTIVELY_IMPLEMENTED:
			case ServicePackage.INTERFACE__EFFECTIVELY_INTERNAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicePackage.INTERFACE__ENDPOINTS:
			case ServicePackage.INTERFACE__PROTOCOLS:
			case ServicePackage.INTERFACE__OPERATIONS:
			case ServicePackage.INTERFACE__REFERRED_OPERATIONS:
			case ServicePackage.INTERFACE__ASPECTS:
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
				(ServicePackage.Literals.INTERFACE__ENDPOINTS,
				 ServiceFactory.eINSTANCE.createEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.INTERFACE__PROTOCOLS,
				 ServiceFactory.eINSTANCE.createProtocolSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.INTERFACE__OPERATIONS,
				 ServiceFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.INTERFACE__REFERRED_OPERATIONS,
				 ServiceFactory.eINSTANCE.createReferredOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.INTERFACE__ASPECTS,
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
