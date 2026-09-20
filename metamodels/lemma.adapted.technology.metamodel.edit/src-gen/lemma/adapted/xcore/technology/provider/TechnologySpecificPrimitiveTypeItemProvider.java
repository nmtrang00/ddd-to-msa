/**
 */
package lemma.adapted.xcore.technology.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.data.DataFactory;
import lemma.adapted.xcore.data.provider.PrimitiveTypeItemProvider;
import lemma.adapted.xcore.technology.TechnologyFactory;
import lemma.adapted.xcore.technology.TechnologyPackage;
import lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lemma.adapted.xcore.technology.TechnologySpecificPrimitiveType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologySpecificPrimitiveTypeItemProvider extends PrimitiveTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySpecificPrimitiveTypeItemProvider(AdapterFactory adapterFactory) {
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
			addDefaultPropertyDescriptor(object);
			addTechnologyPropertyDescriptor(object);
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
				 getString("_UI_TechnologySpecificPrimitiveType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySpecificPrimitiveType_name_feature", "_UI_TechnologySpecificPrimitiveType_type"),
				 TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySpecificPrimitiveType_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySpecificPrimitiveType_default_feature", "_UI_TechnologySpecificPrimitiveType_type"),
				 TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySpecificPrimitiveType_technology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySpecificPrimitiveType_technology_feature", "_UI_TechnologySpecificPrimitiveType_type"),
				 TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__TECHNOLOGY,
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
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES);
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
	 * This returns TechnologySpecificPrimitiveType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TechnologySpecificPrimitiveType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TechnologySpecificPrimitiveType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TechnologySpecificPrimitiveType_type") :
			getString("_UI_TechnologySpecificPrimitiveType_type") + " " + label;
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

		switch (notification.getFeatureID(TechnologySpecificPrimitiveType.class)) {
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__NAME:
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__DEFAULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES:
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
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 TechnologyFactory.eINSTANCE.createTechnologySpecificPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveByte()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveDate()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveFloat()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveInteger()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveLong()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveShort()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveString()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE__BASIC_BUILTIN_PRIMITIVE_TYPES,
				 DataFactory.eINSTANCE.createPrimitiveUnspecified()));
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
