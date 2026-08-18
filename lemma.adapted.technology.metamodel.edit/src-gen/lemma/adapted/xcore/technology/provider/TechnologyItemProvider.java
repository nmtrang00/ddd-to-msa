/**
 */
package lemma.adapted.xcore.technology.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.technology.Technology;
import lemma.adapted.xcore.technology.TechnologyFactory;
import lemma.adapted.xcore.technology.TechnologyPackage;

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
 * This is the item provider adapter for a {@link lemma.adapted.xcore.technology.Technology} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologyItemProvider 
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
	public TechnologyItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Technology_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Technology_name_feature", "_UI_Technology_type"),
				 TechnologyPackage.Literals.TECHNOLOGY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__IMPORTS);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__PRIMITIVE_TYPES);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__COLLECTION_TYPES);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__DATA_STRUCTURES);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__COMPATIBILITY_ENTRIES);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__PROTOCOLS);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__SERVICE_ASPECTS);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__DEPLOYMENT_TECHNOLOGIES);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__INFRASTRUCTURE_TECHNOLOGIES);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY__OPERATION_ASPECTS);
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
	 * This returns Technology.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Technology"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Technology)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Technology_type") :
			getString("_UI_Technology_type") + " " + label;
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

		switch (notification.getFeatureID(Technology.class)) {
			case TechnologyPackage.TECHNOLOGY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TechnologyPackage.TECHNOLOGY__IMPORTS:
			case TechnologyPackage.TECHNOLOGY__PRIMITIVE_TYPES:
			case TechnologyPackage.TECHNOLOGY__COLLECTION_TYPES:
			case TechnologyPackage.TECHNOLOGY__DATA_STRUCTURES:
			case TechnologyPackage.TECHNOLOGY__COMPATIBILITY_ENTRIES:
			case TechnologyPackage.TECHNOLOGY__PROTOCOLS:
			case TechnologyPackage.TECHNOLOGY__SERVICE_ASPECTS:
			case TechnologyPackage.TECHNOLOGY__DEPLOYMENT_TECHNOLOGIES:
			case TechnologyPackage.TECHNOLOGY__INFRASTRUCTURE_TECHNOLOGIES:
			case TechnologyPackage.TECHNOLOGY__OPERATION_ASPECTS:
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
				(TechnologyPackage.Literals.TECHNOLOGY__IMPORTS,
				 TechnologyFactory.eINSTANCE.createTechnologyImport()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY__PRIMITIVE_TYPES,
				 TechnologyFactory.eINSTANCE.createTechnologySpecificPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY__COLLECTION_TYPES,
				 TechnologyFactory.eINSTANCE.createTechnologySpecificCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY__DATA_STRUCTURES,
				 TechnologyFactory.eINSTANCE.createTechnologySpecificDataStructure()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY__COMPATIBILITY_ENTRIES,
				 TechnologyFactory.eINSTANCE.createCompatibilityMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY__PROTOCOLS,
				 TechnologyFactory.eINSTANCE.createProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY__SERVICE_ASPECTS,
				 TechnologyFactory.eINSTANCE.createServiceAspect()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY__DEPLOYMENT_TECHNOLOGIES,
				 TechnologyFactory.eINSTANCE.createDeploymentTechnology()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY__INFRASTRUCTURE_TECHNOLOGIES,
				 TechnologyFactory.eINSTANCE.createInfrastructureTechnology()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY__OPERATION_ASPECTS,
				 TechnologyFactory.eINSTANCE.createOperationAspect()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TechnologyEditPlugin.INSTANCE;
	}

}
