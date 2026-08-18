/**
 */
package lemma.adapted.xcore.technology.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.technology.ServiceAspectPointcut;
import lemma.adapted.xcore.technology.TechnologyPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link lemma.adapted.xcore.technology.ServiceAspectPointcut} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceAspectPointcutItemProvider 
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
	public ServiceAspectPointcutItemProvider(AdapterFactory adapterFactory) {
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

			addForExchangePatternPropertyDescriptor(object);
			addForCommunicationTypePropertyDescriptor(object);
			addForProtocolPropertyDescriptor(object);
			addForDataFormatPropertyDescriptor(object);
			addExchangePatternPropertyDescriptor(object);
			addCommunicationTypePropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addDataFormatPropertyDescriptor(object);
			addSelectorPropertyDescriptor(object);
			addEffectiveTypePropertyDescriptor(object);
			addEffectiveSelectorNamePropertyDescriptor(object);
			addEffectiveValuePropertyDescriptor(object);
			addPrintableEffectiveValuePropertyDescriptor(object);
			addOrderedPointcutTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the For Exchange Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForExchangePatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_forExchangePattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_forExchangePattern_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__FOR_EXCHANGE_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the For Communication Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForCommunicationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_forCommunicationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_forCommunicationType_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__FOR_COMMUNICATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the For Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_forProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_forProtocol_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__FOR_PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the For Data Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForDataFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_forDataFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_forDataFormat_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__FOR_DATA_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_ServiceAspectPointcut_exchangePattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_exchangePattern_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__EXCHANGE_PATTERN,
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
				 getString("_UI_ServiceAspectPointcut_communicationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_communicationType_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__COMMUNICATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_protocol_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__PROTOCOL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_dataFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_dataFormat_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__DATA_FORMAT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_selector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_selector_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__SELECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effective Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectiveTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_effectiveType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_effectiveType_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__EFFECTIVE_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effective Selector Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectiveSelectorNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_effectiveSelectorName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_effectiveSelectorName_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__EFFECTIVE_SELECTOR_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effective Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectiveValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_effectiveValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_effectiveValue_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__EFFECTIVE_VALUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Printable Effective Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrintableEffectiveValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_printableEffectiveValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_printableEffectiveValue_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__PRINTABLE_EFFECTIVE_VALUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ordered Pointcut Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderedPointcutTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAspectPointcut_orderedPointcutTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAspectPointcut_orderedPointcutTypes_feature", "_UI_ServiceAspectPointcut_type"),
				 TechnologyPackage.Literals.SERVICE_ASPECT_POINTCUT__ORDERED_POINTCUT_TYPES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ServiceAspectPointcut.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceAspectPointcut"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceAspectPointcut)object).getEffectiveSelectorName();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceAspectPointcut_type") :
			getString("_UI_ServiceAspectPointcut_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceAspectPointcut.class)) {
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__FOR_EXCHANGE_PATTERN:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__FOR_COMMUNICATION_TYPE:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__FOR_PROTOCOL:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__FOR_DATA_FORMAT:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__EXCHANGE_PATTERN:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__COMMUNICATION_TYPE:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__EFFECTIVE_TYPE:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__EFFECTIVE_SELECTOR_NAME:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__EFFECTIVE_VALUE:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__PRINTABLE_EFFECTIVE_VALUE:
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT__ORDERED_POINTCUT_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
