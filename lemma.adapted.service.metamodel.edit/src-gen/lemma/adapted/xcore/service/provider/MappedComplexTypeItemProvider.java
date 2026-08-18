/**
 */
package lemma.adapted.xcore.service.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.service.MappedComplexType;
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
 * This is the item provider adapter for a {@link lemma.adapted.xcore.service.MappedComplexType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappedComplexTypeItemProvider 
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
	public MappedComplexTypeItemProvider(AdapterFactory adapterFactory) {
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

			addT_sourceModelUriPropertyDescriptor(object);
			addT_mappingModelUriPropertyDescriptor(object);
			addT_typeDefinitionTechnologyImportPropertyDescriptor(object);
			addT_typeDefinitionTechnologyPropertyDescriptor(object);
			addServiceModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_MappedComplexType_t_sourceModelUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedComplexType_t_sourceModelUri_feature", "_UI_MappedComplexType_type"),
				 ServicePackage.Literals.MAPPED_COMPLEX_TYPE__TSOURCE_MODEL_URI,
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
				 getString("_UI_MappedComplexType_t_mappingModelUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedComplexType_t_mappingModelUri_feature", "_UI_MappedComplexType_type"),
				 ServicePackage.Literals.MAPPED_COMPLEX_TYPE__TMAPPING_MODEL_URI,
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
				 getString("_UI_MappedComplexType_t_typeDefinitionTechnologyImport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedComplexType_t_typeDefinitionTechnologyImport_feature", "_UI_MappedComplexType_type"),
				 ServicePackage.Literals.MAPPED_COMPLEX_TYPE__TTYPE_DEFINITION_TECHNOLOGY_IMPORT,
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
				 getString("_UI_MappedComplexType_t_typeDefinitionTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedComplexType_t_typeDefinitionTechnology_feature", "_UI_MappedComplexType_type"),
				 ServicePackage.Literals.MAPPED_COMPLEX_TYPE__TTYPE_DEFINITION_TECHNOLOGY,
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
				 getString("_UI_MappedComplexType_serviceModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedComplexType_serviceModel_feature", "_UI_MappedComplexType_type"),
				 ServicePackage.Literals.MAPPED_COMPLEX_TYPE__SERVICE_MODEL,
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
			childrenFeatures.add(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__TECHNOLOGY_REFERENCES);
			childrenFeatures.add(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__TYPE);
			childrenFeatures.add(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__MAPPED_FIELDS);
			childrenFeatures.add(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__MAPPED_OPERATIONS);
			childrenFeatures.add(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__ASPECTS);
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
	 * This returns MappedComplexType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappedComplexType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MappedComplexType)object).getT_sourceModelUri();
		return label == null || label.length() == 0 ?
			getString("_UI_MappedComplexType_type") :
			getString("_UI_MappedComplexType_type") + " " + label;
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

		switch (notification.getFeatureID(MappedComplexType.class)) {
			case ServicePackage.MAPPED_COMPLEX_TYPE__TSOURCE_MODEL_URI:
			case ServicePackage.MAPPED_COMPLEX_TYPE__TMAPPING_MODEL_URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicePackage.MAPPED_COMPLEX_TYPE__TECHNOLOGY_REFERENCES:
			case ServicePackage.MAPPED_COMPLEX_TYPE__TYPE:
			case ServicePackage.MAPPED_COMPLEX_TYPE__MAPPED_FIELDS:
			case ServicePackage.MAPPED_COMPLEX_TYPE__MAPPED_OPERATIONS:
			case ServicePackage.MAPPED_COMPLEX_TYPE__ASPECTS:
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
				(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__TECHNOLOGY_REFERENCES,
				 ServiceFactory.eINSTANCE.createTechnologyReference()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__TYPE,
				 ServiceFactory.eINSTANCE.createImportedType()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__MAPPED_FIELDS,
				 ServiceFactory.eINSTANCE.createMappedField()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__MAPPED_OPERATIONS,
				 ServiceFactory.eINSTANCE.createMappedDataOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.MAPPED_COMPLEX_TYPE__ASPECTS,
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
