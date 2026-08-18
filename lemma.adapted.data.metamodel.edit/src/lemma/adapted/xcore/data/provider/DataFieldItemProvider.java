/**
 */
package lemma.adapted.xcore.data.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.data.DataFactory;
import lemma.adapted.xcore.data.DataField;
import lemma.adapted.xcore.data.DataPackage;

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
 * This is the item provider adapter for a {@link lemma.adapted.xcore.data.DataField} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFieldItemProvider 
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
	public DataFieldItemProvider(AdapterFactory adapterFactory) {
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
			addHiddenPropertyDescriptor(object);
			addImmutablePropertyDescriptor(object);
			addComplexTypePropertyDescriptor(object);
			addFeaturesPropertyDescriptor(object);
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
				 getString("_UI_DataField_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataField_name_feature", "_UI_DataField_type"),
				 DataPackage.Literals.DATA_FIELD__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hidden feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHiddenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataField_hidden_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataField_hidden_feature", "_UI_DataField_type"),
				 DataPackage.Literals.DATA_FIELD__HIDDEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Immutable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImmutablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataField_immutable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataField_immutable_feature", "_UI_DataField_type"),
				 DataPackage.Literals.DATA_FIELD__IMMUTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Complex Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComplexTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataField_complexType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataField_complexType_feature", "_UI_DataField_type"),
				 DataPackage.Literals.DATA_FIELD__COMPLEX_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataField_features_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataField_features_feature", "_UI_DataField_type"),
				 DataPackage.Literals.DATA_FIELD__FEATURES,
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
			childrenFeatures.add(DataPackage.Literals.DATA_FIELD__IMPORTED_COMPLEX_TYPE);
			childrenFeatures.add(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE);
			childrenFeatures.add(DataPackage.Literals.DATA_FIELD__INITIALIZATION_VALUE);
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
	 * This returns DataField.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataField"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataField)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataField_type") :
			getString("_UI_DataField_type") + " " + label;
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

		switch (notification.getFeatureID(DataField.class)) {
			case DataPackage.DATA_FIELD__NAME:
			case DataPackage.DATA_FIELD__HIDDEN:
			case DataPackage.DATA_FIELD__IMMUTABLE:
			case DataPackage.DATA_FIELD__FEATURES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DataPackage.DATA_FIELD__IMPORTED_COMPLEX_TYPE:
			case DataPackage.DATA_FIELD__PRIMITIVE_TYPE:
			case DataPackage.DATA_FIELD__INITIALIZATION_VALUE:
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
				(DataPackage.Literals.DATA_FIELD__IMPORTED_COMPLEX_TYPE,
				 DataFactory.eINSTANCE.createImportedComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveByte()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDate()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDouble()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveFloat()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveInteger()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveLong()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveShort()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveString()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveUnspecified()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_FIELD__INITIALIZATION_VALUE,
				 DataFactory.eINSTANCE.createPrimitiveValue()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataViewpointModelEditPlugin.INSTANCE;
	}

}
