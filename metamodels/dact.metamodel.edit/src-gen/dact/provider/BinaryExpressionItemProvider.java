/**
 */
package dact.provider;


import dact.BinaryExpression;
import dact.DactFactory;
import dact.DactPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dact.BinaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DactPackage.eINSTANCE.getBinaryExpression_Operator());
			childrenFeatures.add(DactPackage.eINSTANCE.getBinaryExpression_LeftExpr());
			childrenFeatures.add(DactPackage.eINSTANCE.getBinaryExpression_RightExpr());
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
	 * This returns BinaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BinaryExpression)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BinaryExpression_type") :
			getString("_UI_BinaryExpression_type") + " " + label;
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

		switch (notification.getFeatureID(BinaryExpression.class)) {
			case DactPackage.BINARY_EXPRESSION__OPERATOR:
			case DactPackage.BINARY_EXPRESSION__LEFT_EXPR:
			case DactPackage.BINARY_EXPRESSION__RIGHT_EXPR:
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
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createDivide()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createTimes()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createGt()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createLt()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createGe()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createLe()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createEq()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createNe()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_Operator(),
				 DactFactory.eINSTANCE.createIn()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_LeftExpr(),
				 DactFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_LeftExpr(),
				 DactFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_LeftExpr(),
				 DactFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_LeftExpr(),
				 DactFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_RightExpr(),
				 DactFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_RightExpr(),
				 DactFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_RightExpr(),
				 DactFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DactPackage.eINSTANCE.getBinaryExpression_RightExpr(),
				 DactFactory.eINSTANCE.createNotExpression()));
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
			childFeature == DactPackage.eINSTANCE.getBinaryExpression_LeftExpr() ||
			childFeature == DactPackage.eINSTANCE.getBinaryExpression_RightExpr();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
