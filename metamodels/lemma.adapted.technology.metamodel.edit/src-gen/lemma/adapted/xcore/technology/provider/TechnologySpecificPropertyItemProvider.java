/**
 */
package lemma.adapted.xcore.technology.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.data.DataFactory;
import lemma.adapted.xcore.technology.TechnologyFactory;
import lemma.adapted.xcore.technology.TechnologyPackage;
import lemma.adapted.xcore.technology.TechnologySpecificProperty;

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
 * This is the item provider adapter for a {@link lemma.adapted.xcore.technology.TechnologySpecificProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologySpecificPropertyItemProvider 
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
	public TechnologySpecificPropertyItemProvider(AdapterFactory adapterFactory) {
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
			addFeaturesPropertyDescriptor(object);
			addOperationTechnologyPropertyDescriptor(object);
			addTechnologyAspectPropertyDescriptor(object);
			addIsMandatoryPropertyDescriptor(object);
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
				 getString("_UI_TechnologySpecificProperty_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySpecificProperty_name_feature", "_UI_TechnologySpecificProperty_type"),
				 TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_TechnologySpecificProperty_features_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySpecificProperty_features_feature", "_UI_TechnologySpecificProperty_type"),
				 TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__FEATURES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySpecificProperty_operationTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySpecificProperty_operationTechnology_feature", "_UI_TechnologySpecificProperty_type"),
				 TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__OPERATION_TECHNOLOGY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Technology Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechnologyAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySpecificProperty_technologyAspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySpecificProperty_technologyAspect_feature", "_UI_TechnologySpecificProperty_type"),
				 TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TECHNOLOGY_ASPECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Mandatory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMandatoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySpecificProperty_isMandatory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySpecificProperty_isMandatory_feature", "_UI_TechnologySpecificProperty_type"),
				 TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__IS_MANDATORY,
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
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE);
			childrenFeatures.add(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__DEFAULT_VALUE);
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
	 * This returns TechnologySpecificProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TechnologySpecificProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TechnologySpecificProperty)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TechnologySpecificProperty_type") :
			getString("_UI_TechnologySpecificProperty_type") + " " + label;
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

		switch (notification.getFeatureID(TechnologySpecificProperty.class)) {
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PROPERTY__NAME:
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PROPERTY__FEATURES:
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PROPERTY__IS_MANDATORY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE:
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PROPERTY__DEFAULT_VALUE:
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
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 TechnologyFactory.eINSTANCE.createTechnologySpecificPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveByte()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDate()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveFloat()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveInteger()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveLong()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveShort()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveString()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__TYPE,
				 DataFactory.eINSTANCE.createPrimitiveUnspecified()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY__DEFAULT_VALUE,
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
		return TechnologyEditPlugin.INSTANCE;
	}

}
