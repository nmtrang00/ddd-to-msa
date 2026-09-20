/**
 */
package lemma.adapted.xcore.service.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.data.DataFactory;
import lemma.adapted.xcore.service.Parameter;
import lemma.adapted.xcore.service.ServiceFactory;
import lemma.adapted.xcore.service.ServicePackage;

import lemma.adapted.xcore.technology.TechnologyFactory;
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
 * This is the item provider adapter for a {@link lemma.adapted.xcore.service.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider 
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
	public ParameterItemProvider(AdapterFactory adapterFactory) {
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
			addExchangePatternPropertyDescriptor(object);
			addCommunicationTypePropertyDescriptor(object);
			addCommunicatesFaultPropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
			addLowerBoundPropertyDescriptor(object);
			addUpperBoundPropertyDescriptor(object);
			addAdapterParameterTypePropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
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
				 getString("_UI_Parameter_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_name_feature", "_UI_Parameter_type"),
				 ServicePackage.Literals.PARAMETER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exchange Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExchangePatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_exchangePattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_exchangePattern_feature", "_UI_Parameter_type"),
				 ServicePackage.Literals.PARAMETER__EXCHANGE_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Communication Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_communicationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_communicationType_feature", "_UI_Parameter_type"),
				 ServicePackage.Literals.PARAMETER__COMMUNICATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Communicates Fault feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicatesFaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_communicatesFault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_communicatesFault_feature", "_UI_Parameter_type"),
				 ServicePackage.Literals.PARAMETER__COMMUNICATES_FAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_optional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_optional_feature", "_UI_Parameter_type"),
				 ServicePackage.Literals.PARAMETER__OPTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_lowerBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_lowerBound_feature", "_UI_Parameter_type"),
				 ServicePackage.Literals.PARAMETER__LOWER_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_upperBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_upperBound_feature", "_UI_Parameter_type"),
				 ServicePackage.Literals.PARAMETER__UPPER_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adapter Parameter Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdapterParameterTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_adapterParameterType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_adapterParameterType_feature", "_UI_Parameter_type"),
				 ServicePackage.Literals.PARAMETER__ADAPTER_PARAMETER_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_operation_feature", "_UI_Parameter_type"),
				 ServicePackage.Literals.PARAMETER__OPERATION,
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
			childrenFeatures.add(ServicePackage.Literals.PARAMETER__INITIALIZATION_VALUE);
			childrenFeatures.add(ServicePackage.Literals.PARAMETER__INITIALIZED_BY_OPERATION);
			childrenFeatures.add(ServicePackage.Literals.PARAMETER__IMPORTED_TYPE);
			childrenFeatures.add(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE);
			childrenFeatures.add(ServicePackage.Literals.PARAMETER__ASPECTS);
			childrenFeatures.add(ServicePackage.Literals.PARAMETER__MAPPED_FIELDS);
			childrenFeatures.add(ServicePackage.Literals.PARAMETER__ORIGINAL_IMPORTED_TYPE);
			childrenFeatures.add(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE);
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
	 * This returns Parameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Parameter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Parameter_type") :
			getString("_UI_Parameter_type") + " " + label;
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

		switch (notification.getFeatureID(Parameter.class)) {
			case ServicePackage.PARAMETER__NAME:
			case ServicePackage.PARAMETER__EXCHANGE_PATTERN:
			case ServicePackage.PARAMETER__COMMUNICATION_TYPE:
			case ServicePackage.PARAMETER__COMMUNICATES_FAULT:
			case ServicePackage.PARAMETER__OPTIONAL:
			case ServicePackage.PARAMETER__LOWER_BOUND:
			case ServicePackage.PARAMETER__UPPER_BOUND:
			case ServicePackage.PARAMETER__ADAPTER_PARAMETER_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicePackage.PARAMETER__INITIALIZATION_VALUE:
			case ServicePackage.PARAMETER__INITIALIZED_BY_OPERATION:
			case ServicePackage.PARAMETER__IMPORTED_TYPE:
			case ServicePackage.PARAMETER__PRIMITIVE_TYPE:
			case ServicePackage.PARAMETER__ASPECTS:
			case ServicePackage.PARAMETER__MAPPED_FIELDS:
			case ServicePackage.PARAMETER__ORIGINAL_IMPORTED_TYPE:
			case ServicePackage.PARAMETER__ORIGINAL_PRIMITIVE_TYPE:
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
				(ServicePackage.Literals.PARAMETER__INITIALIZATION_VALUE,
				 DataFactory.eINSTANCE.createPrimitiveValue()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__INITIALIZED_BY_OPERATION,
				 ServiceFactory.eINSTANCE.createPossiblyImportedOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__IMPORTED_TYPE,
				 ServiceFactory.eINSTANCE.createImportedType()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 TechnologyFactory.eINSTANCE.createTechnologySpecificPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveByte()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDate()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDouble()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveFloat()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveLong()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveShort()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveString()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveUnspecified()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ASPECTS,
				 ServiceFactory.eINSTANCE.createImportedServiceAspect()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__MAPPED_FIELDS,
				 ServiceFactory.eINSTANCE.createMappedField()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_IMPORTED_TYPE,
				 ServiceFactory.eINSTANCE.createImportedType()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 TechnologyFactory.eINSTANCE.createTechnologySpecificPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveByte()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDate()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDouble()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveFloat()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveLong()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveShort()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveString()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveUnspecified()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ServicePackage.Literals.PARAMETER__IMPORTED_TYPE ||
			childFeature == ServicePackage.Literals.PARAMETER__ORIGINAL_IMPORTED_TYPE ||
			childFeature == ServicePackage.Literals.PARAMETER__PRIMITIVE_TYPE ||
			childFeature == ServicePackage.Literals.PARAMETER__ORIGINAL_PRIMITIVE_TYPE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
