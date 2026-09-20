/**
 */
package lemma.adapted.xcore.data.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.data.CollectionType;
import lemma.adapted.xcore.data.DataFactory;
import lemma.adapted.xcore.data.DataPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lemma.adapted.xcore.data.CollectionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionTypeItemProvider extends ComplexTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE);
			childrenFeatures.add(DataPackage.Literals.COLLECTION_TYPE__DATA_FIELDS);
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
	 * This returns CollectionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CollectionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CollectionType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CollectionType_type") :
			getString("_UI_CollectionType_type") + " " + label;
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

		switch (notification.getFeatureID(CollectionType.class)) {
			case DataPackage.COLLECTION_TYPE__PRIMITIVE_TYPE:
			case DataPackage.COLLECTION_TYPE__DATA_FIELDS:
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
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveByte()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDate()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDouble()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveFloat()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveInteger()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveLong()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveShort()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveString()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveUnspecified()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COLLECTION_TYPE__DATA_FIELDS,
				 DataFactory.eINSTANCE.createDataField()));
	}

}
