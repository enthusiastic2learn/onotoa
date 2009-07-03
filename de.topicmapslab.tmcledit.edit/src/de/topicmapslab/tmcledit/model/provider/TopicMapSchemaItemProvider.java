/**
 * (C) 2008 Hannes Niederhausen, Topic Maps Lab
 *
 * $Id$
 */
package de.topicmapslab.tmcledit.model.provider;


import de.topicmapslab.tmcledit.model.ModelFactory;
import de.topicmapslab.tmcledit.model.ModelPackage;
import de.topicmapslab.tmcledit.model.TopicMapSchema;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.topicmapslab.tmcledit.model.TopicMapSchema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TopicMapSchemaItemProvider
	extends TMCLConstructItemProvider
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
	public TopicMapSchemaItemProvider(AdapterFactory adapterFactory) {
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

			addMappingsPropertyDescriptor(object);
			addIncludesPropertyDescriptor(object);
			addBaseLocatorPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mappings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TopicMapSchema_mappings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TopicMapSchema_mappings_feature", "_UI_TopicMapSchema_type"),
				 ModelPackage.Literals.TOPIC_MAP_SCHEMA__MAPPINGS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Includes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TopicMapSchema_includes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TopicMapSchema_includes_feature", "_UI_TopicMapSchema_type"),
				 ModelPackage.Literals.TOPIC_MAP_SCHEMA__INCLUDES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Locator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseLocatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TopicMapSchema_baseLocator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TopicMapSchema_baseLocator_feature", "_UI_TopicMapSchema_type"),
				 ModelPackage.Literals.TOPIC_MAP_SCHEMA__BASE_LOCATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_TopicMapSchema_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TopicMapSchema_name_feature", "_UI_TopicMapSchema_type"),
				 ModelPackage.Literals.TOPIC_MAP_SCHEMA__NAME,
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
			childrenFeatures.add(ModelPackage.Literals.TOPIC_MAP_SCHEMA__TOPIC_TYPES);
			childrenFeatures.add(ModelPackage.Literals.TOPIC_MAP_SCHEMA__ASSOCIATION_TYPE_CONSTRAINTS);
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
	 * This returns TopicMapSchema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TopicMapSchema"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TopicMapSchema)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TopicMapSchema_type") :
			getString("_UI_TopicMapSchema_type") + " " + label;
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

		switch (notification.getFeatureID(TopicMapSchema.class)) {
			case ModelPackage.TOPIC_MAP_SCHEMA__INCLUDES:
			case ModelPackage.TOPIC_MAP_SCHEMA__BASE_LOCATOR:
			case ModelPackage.TOPIC_MAP_SCHEMA__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.TOPIC_MAP_SCHEMA__TOPIC_TYPES:
			case ModelPackage.TOPIC_MAP_SCHEMA__ASSOCIATION_TYPE_CONSTRAINTS:
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
				(ModelPackage.Literals.TOPIC_MAP_SCHEMA__TOPIC_TYPES,
				 ModelFactory.eINSTANCE.createTopicType()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.TOPIC_MAP_SCHEMA__TOPIC_TYPES,
				 ModelFactory.eINSTANCE.createAssociationType()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.TOPIC_MAP_SCHEMA__TOPIC_TYPES,
				 ModelFactory.eINSTANCE.createOccurrenceType()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.TOPIC_MAP_SCHEMA__TOPIC_TYPES,
				 ModelFactory.eINSTANCE.createRoleType()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.TOPIC_MAP_SCHEMA__TOPIC_TYPES,
				 ModelFactory.eINSTANCE.createNameType()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.TOPIC_MAP_SCHEMA__TOPIC_TYPES,
				 ModelFactory.eINSTANCE.createReifiableTpoicType()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.TOPIC_MAP_SCHEMA__TOPIC_TYPES,
				 ModelFactory.eINSTANCE.createScopedReifiableTopicType()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.TOPIC_MAP_SCHEMA__ASSOCIATION_TYPE_CONSTRAINTS,
				 ModelFactory.eINSTANCE.createAssociationTypeConstraint()));
	}

}