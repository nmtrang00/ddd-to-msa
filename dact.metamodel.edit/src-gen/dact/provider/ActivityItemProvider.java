/**
 */
package dact.provider;


import dact.Activity;
import dact.DactFactory;
import dact.DactPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dact.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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

			addSpecificationPropertyDescriptor(object);
			addToTransformPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Behavior_specification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Behavior_specification_feature", "_UI_Behavior_type"),
				 DactPackage.Literals.BEHAVIOR__SPECIFICATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Transform feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToTransformPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_toTransform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_toTransform_feature", "_UI_Activity_type"),
				 DactPackage.Literals.ACTIVITY__TO_TRANSFORM,
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
			childrenFeatures.add(DactPackage.Literals.ACTIVITY__OWNED_PARAMETERS);
			childrenFeatures.add(DactPackage.Literals.ACTIVITY__PARAMETER_MAPPINGS);
			childrenFeatures.add(DactPackage.Literals.ACTIVITY__ROOT);
			childrenFeatures.add(DactPackage.Literals.ACTIVITY__OWNED_DOMAIN_NODES);
			childrenFeatures.add(DactPackage.Literals.ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS);
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
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Activity_type") :
			getString("_UI_Activity_type") + " " + label;
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

		switch (notification.getFeatureID(Activity.class)) {
			case DactPackage.ACTIVITY__TO_TRANSFORM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DactPackage.ACTIVITY__OWNED_PARAMETERS:
			case DactPackage.ACTIVITY__PARAMETER_MAPPINGS:
			case DactPackage.ACTIVITY__ROOT:
			case DactPackage.ACTIVITY__OWNED_DOMAIN_NODES:
			case DactPackage.ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS:
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
				(DactPackage.Literals.ACTIVITY__OWNED_PARAMETERS,
				 DactFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.ACTIVITY__PARAMETER_MAPPINGS,
				 DactFactory.eINSTANCE.createParameterMapping()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.ACTIVITY__ROOT,
				 DactFactory.eINSTANCE.createActivityGroup()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.ACTIVITY__OWNED_DOMAIN_NODES,
				 DactFactory.eINSTANCE.createDomainFindAction()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.ACTIVITY__OWNED_DOMAIN_NODES,
				 DactFactory.eINSTANCE.createDomainExistAction()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.ACTIVITY__OWNED_DOMAIN_NODES,
				 DactFactory.eINSTANCE.createDomainCreateAction()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.ACTIVITY__OWNED_DOMAIN_NODES,
				 DactFactory.eINSTANCE.createDomainUpdateAction()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.ACTIVITY__OWNED_DOMAIN_NODES,
				 DactFactory.eINSTANCE.createDomainDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.ACTIVITY__PROCESSED_DOMAIN_NODE_MAPPINGS,
				 DactFactory.eINSTANCE.createDomainNodeOperationMapping()));
	}

}
