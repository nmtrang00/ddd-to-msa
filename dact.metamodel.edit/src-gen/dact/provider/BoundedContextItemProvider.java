/**
 */
package dact.provider;


import dact.BoundedContext;
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
 * This is the item provider adapter for a {@link dact.BoundedContext} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundedContextItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContextItemProvider(AdapterFactory adapterFactory) {
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

			addIsExternalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is External feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BoundedContext_isExternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BoundedContext_isExternal_feature", "_UI_BoundedContext_type"),
				 DactPackage.Literals.BOUNDED_CONTEXT__IS_EXTERNAL,
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
			childrenFeatures.add(DactPackage.Literals.BOUNDED_CONTEXT__OWNED_ELEMENTS);
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
	 * This returns BoundedContext.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BoundedContext"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BoundedContext)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BoundedContext_type") :
			getString("_UI_BoundedContext_type") + " " + label;
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

		switch (notification.getFeatureID(BoundedContext.class)) {
			case DactPackage.BOUNDED_CONTEXT__IS_EXTERNAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DactPackage.BOUNDED_CONTEXT__OWNED_ELEMENTS:
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
				(DactPackage.Literals.BOUNDED_CONTEXT__OWNED_ELEMENTS,
				 DactFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.BOUNDED_CONTEXT__OWNED_ELEMENTS,
				 DactFactory.eINSTANCE.createValueObject()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.BOUNDED_CONTEXT__OWNED_ELEMENTS,
				 DactFactory.eINSTANCE.createSharedValueObject()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.BOUNDED_CONTEXT__OWNED_ELEMENTS,
				 DactFactory.eINSTANCE.createAggregateRoot()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.BOUNDED_CONTEXT__OWNED_ELEMENTS,
				 DactFactory.eINSTANCE.createRepository()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.BOUNDED_CONTEXT__OWNED_ELEMENTS,
				 DactFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.BOUNDED_CONTEXT__OWNED_ELEMENTS,
				 DactFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.Literals.BOUNDED_CONTEXT__OWNED_ELEMENTS,
				 DactFactory.eINSTANCE.createDomainEvent()));
	}

}
