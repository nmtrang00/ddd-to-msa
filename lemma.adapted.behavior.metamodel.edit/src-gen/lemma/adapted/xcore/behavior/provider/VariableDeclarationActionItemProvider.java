/**
 */
package lemma.adapted.xcore.behavior.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.behavior.BehaviorFactory;
import lemma.adapted.xcore.behavior.BehaviorPackage;
import lemma.adapted.xcore.behavior.VariableDeclarationAction;
import lemma.adapted.xcore.data.DataFactory;
import lemma.adapted.xcore.service.ServiceFactory;
import lemma.adapted.xcore.technology.TechnologyFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lemma.adapted.xcore.behavior.VariableDeclarationAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableDeclarationActionItemProvider extends ExecutableNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationActionItemProvider(AdapterFactory adapterFactory) {
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

			addLowerBoundPropertyDescriptor(object);
			addUpperBoundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_VariableDeclarationAction_lowerBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclarationAction_lowerBound_feature", "_UI_VariableDeclarationAction_type"),
				 BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__LOWER_BOUND,
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
				 getString("_UI_VariableDeclarationAction_upperBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclarationAction_upperBound_feature", "_UI_VariableDeclarationAction_type"),
				 BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__UPPER_BOUND,
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
			childrenFeatures.add(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE);
			childrenFeatures.add(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE);
			childrenFeatures.add(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__DECLARATION);
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
	 * This returns VariableDeclarationAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableDeclarationAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VariableDeclarationAction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VariableDeclarationAction_type") :
			getString("_UI_VariableDeclarationAction_type") + " " + label;
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

		switch (notification.getFeatureID(VariableDeclarationAction.class)) {
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__LOWER_BOUND:
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__UPPER_BOUND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE:
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE:
			case BehaviorPackage.VARIABLE_DECLARATION_ACTION__DECLARATION:
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
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__IMPORTED_TYPE,
				 ServiceFactory.eINSTANCE.createImportedType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveByte()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDate()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveDouble()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveFloat()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveInteger()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveLong()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveShort()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveString()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 DataFactory.eINSTANCE.createPrimitiveUnspecified()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__PRIMITIVE_TYPE,
				 TechnologyFactory.eINSTANCE.createTechnologySpecificPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.VARIABLE_DECLARATION_ACTION__DECLARATION,
				 BehaviorFactory.eINSTANCE.createVariableAssignment()));
	}

}
