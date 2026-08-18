/**
 */
package lemma.adapted.xcore.behavior.provider;


import java.util.Collection;
import java.util.List;

import lemma.adapted.xcore.behavior.ActivityGroup;
import lemma.adapted.xcore.behavior.BehaviorFactory;
import lemma.adapted.xcore.behavior.BehaviorPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lemma.adapted.xcore.behavior.ActivityGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityGroupItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroupItemProvider(AdapterFactory adapterFactory) {
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

			addParentPropertyDescriptor(object);
			addChildrenPropertyDescriptor(object);
			addInheritedVariablesPropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addActivityPropertyDescriptor(object);
			addStructuredActivityNodePropertyDescriptor(object);
			addConditionalNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scope_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scope_parent_feature", "_UI_Scope_type"),
				 BehaviorPackage.Literals.SCOPE__PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Children feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildrenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scope_children_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scope_children_feature", "_UI_Scope_type"),
				 BehaviorPackage.Literals.SCOPE__CHILDREN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scope_inheritedVariables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scope_inheritedVariables_feature", "_UI_Scope_type"),
				 BehaviorPackage.Literals.SCOPE__INHERITED_VARIABLES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scope_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scope_group_feature", "_UI_Scope_type"),
				 BehaviorPackage.Literals.SCOPE__GROUP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_activity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_activity_feature", "_UI_ActivityGroup_type"),
				 BehaviorPackage.Literals.ACTIVITY_GROUP__ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Structured Activity Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructuredActivityNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_structuredActivityNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_structuredActivityNode_feature", "_UI_ActivityGroup_type"),
				 BehaviorPackage.Literals.ACTIVITY_GROUP__STRUCTURED_ACTIVITY_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conditional Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionalNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_conditionalNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_conditionalNode_feature", "_UI_ActivityGroup_type"),
				 BehaviorPackage.Literals.ACTIVITY_GROUP__CONDITIONAL_NODE,
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
			childrenFeatures.add(BehaviorPackage.Literals.SCOPE__OWNED_VARIABLES);
			childrenFeatures.add(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES);
			childrenFeatures.add(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_EDGES);
			childrenFeatures.add(BehaviorPackage.Literals.ACTIVITY_GROUP__SCOPE);
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
	 * This returns ActivityGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActivityGroup)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ActivityGroup_type") :
			getString("_UI_ActivityGroup_type") + " " + label;
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

		switch (notification.getFeatureID(ActivityGroup.class)) {
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_VARIABLES:
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_NODES:
			case BehaviorPackage.ACTIVITY_GROUP__OWNED_EDGES:
			case BehaviorPackage.ACTIVITY_GROUP__SCOPE:
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
				(BehaviorPackage.Literals.SCOPE__OWNED_VARIABLES,
				 BehaviorFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createVariableDeclarationAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createVariableAssignmentAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createRaiseEntityNotFoundExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createReceiveSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
				 BehaviorFactory.eINSTANCE.createParallelNode()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__OWNED_EDGES,
				 BehaviorFactory.eINSTANCE.createActivityEdge()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__SCOPE,
				 BehaviorFactory.eINSTANCE.createScope()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.ACTIVITY_GROUP__SCOPE,
				 BehaviorFactory.eINSTANCE.createActivityGroup()));
	}

}
