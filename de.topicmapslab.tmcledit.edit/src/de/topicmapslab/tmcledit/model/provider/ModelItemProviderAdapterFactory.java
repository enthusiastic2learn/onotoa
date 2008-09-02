/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.topicmapslab.tmcledit.model.provider;

import de.topicmapslab.tmcledit.model.util.ModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.TopicType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicTypeItemProvider topicTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.TopicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopicTypeAdapter() {
		if (topicTypeItemProvider == null) {
			topicTypeItemProvider = new TopicTypeItemProvider(this);
		}

		return topicTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.OccurenceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurenceTypeItemProvider occurenceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.OccurenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOccurenceTypeAdapter() {
		if (occurenceTypeItemProvider == null) {
			occurenceTypeItemProvider = new OccurenceTypeItemProvider(this);
		}

		return occurenceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.NameType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameTypeItemProvider nameTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.NameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNameTypeAdapter() {
		if (nameTypeItemProvider == null) {
			nameTypeItemProvider = new NameTypeItemProvider(this);
		}

		return nameTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.ScopeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeTypeItemProvider scopeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.ScopeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScopeTypeAdapter() {
		if (scopeTypeItemProvider == null) {
			scopeTypeItemProvider = new ScopeTypeItemProvider(this);
		}

		return scopeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.OccurenceTypeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurenceTypeConstraintItemProvider occurenceTypeConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.OccurenceTypeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOccurenceTypeConstraintAdapter() {
		if (occurenceTypeConstraintItemProvider == null) {
			occurenceTypeConstraintItemProvider = new OccurenceTypeConstraintItemProvider(this);
		}

		return occurenceTypeConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.NameTypeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameTypeConstraintItemProvider nameTypeConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.NameTypeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNameTypeConstraintAdapter() {
		if (nameTypeConstraintItemProvider == null) {
			nameTypeConstraintItemProvider = new NameTypeConstraintItemProvider(this);
		}

		return nameTypeConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.AssociationsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationsTypeItemProvider associationsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.AssociationsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationsTypeAdapter() {
		if (associationsTypeItemProvider == null) {
			associationsTypeItemProvider = new AssociationsTypeItemProvider(this);
		}

		return associationsTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.RoleType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeItemProvider roleTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.RoleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleTypeAdapter() {
		if (roleTypeItemProvider == null) {
			roleTypeItemProvider = new RoleTypeItemProvider(this);
		}

		return roleTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.RoleTypeConstraints} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeConstraintsItemProvider roleTypeConstraintsItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.RoleTypeConstraints}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleTypeConstraintsAdapter() {
		if (roleTypeConstraintsItemProvider == null) {
			roleTypeConstraintsItemProvider = new RoleTypeConstraintsItemProvider(this);
		}

		return roleTypeConstraintsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.TopicMapSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicMapSchemaItemProvider topicMapSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.TopicMapSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopicMapSchemaAdapter() {
		if (topicMapSchemaItemProvider == null) {
			topicMapSchemaItemProvider = new TopicMapSchemaItemProvider(this);
		}

		return topicMapSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.subjectLocatorConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected subjectLocatorConstraintItemProvider subjectLocatorConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.subjectLocatorConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createsubjectLocatorConstraintAdapter() {
		if (subjectLocatorConstraintItemProvider == null) {
			subjectLocatorConstraintItemProvider = new subjectLocatorConstraintItemProvider(this);
		}

		return subjectLocatorConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.subjectIdentifierConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected subjectIdentifierConstraintItemProvider subjectIdentifierConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.subjectIdentifierConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createsubjectIdentifierConstraintAdapter() {
		if (subjectIdentifierConstraintItemProvider == null) {
			subjectIdentifierConstraintItemProvider = new subjectIdentifierConstraintItemProvider(this);
		}

		return subjectIdentifierConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.AssociationTypeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationTypeConstraintItemProvider associationTypeConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.AssociationTypeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationTypeConstraintAdapter() {
		if (associationTypeConstraintItemProvider == null) {
			associationTypeConstraintItemProvider = new AssociationTypeConstraintItemProvider(this);
		}

		return associationTypeConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.MappingElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingElementItemProvider mappingElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.MappingElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMappingElementAdapter() {
		if (mappingElementItemProvider == null) {
			mappingElementItemProvider = new MappingElementItemProvider(this);
		}

		return mappingElementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (topicTypeItemProvider != null) topicTypeItemProvider.dispose();
		if (occurenceTypeItemProvider != null) occurenceTypeItemProvider.dispose();
		if (nameTypeItemProvider != null) nameTypeItemProvider.dispose();
		if (scopeTypeItemProvider != null) scopeTypeItemProvider.dispose();
		if (occurenceTypeConstraintItemProvider != null) occurenceTypeConstraintItemProvider.dispose();
		if (nameTypeConstraintItemProvider != null) nameTypeConstraintItemProvider.dispose();
		if (associationsTypeItemProvider != null) associationsTypeItemProvider.dispose();
		if (roleTypeItemProvider != null) roleTypeItemProvider.dispose();
		if (roleTypeConstraintsItemProvider != null) roleTypeConstraintsItemProvider.dispose();
		if (topicMapSchemaItemProvider != null) topicMapSchemaItemProvider.dispose();
		if (subjectLocatorConstraintItemProvider != null) subjectLocatorConstraintItemProvider.dispose();
		if (subjectIdentifierConstraintItemProvider != null) subjectIdentifierConstraintItemProvider.dispose();
		if (associationTypeConstraintItemProvider != null) associationTypeConstraintItemProvider.dispose();
		if (mappingElementItemProvider != null) mappingElementItemProvider.dispose();
	}

}
