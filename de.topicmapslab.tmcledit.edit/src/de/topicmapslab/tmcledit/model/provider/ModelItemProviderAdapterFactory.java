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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2008 Hannes Niederhause, Topic Maps Lab";

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
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.SubjectLocatorConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectLocatorConstraintItemProvider subjectLocatorConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.SubjectLocatorConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubjectLocatorConstraintAdapter() {
		if (subjectLocatorConstraintItemProvider == null) {
			subjectLocatorConstraintItemProvider = new SubjectLocatorConstraintItemProvider(this);
		}

		return subjectLocatorConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.SubjectIdentifierConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectIdentifierConstraintItemProvider subjectIdentifierConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.SubjectIdentifierConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubjectIdentifierConstraintAdapter() {
		if (subjectIdentifierConstraintItemProvider == null) {
			subjectIdentifierConstraintItemProvider = new SubjectIdentifierConstraintItemProvider(this);
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
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.Node} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeItemProvider nodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeAdapter() {
		if (nodeItemProvider == null) {
			nodeItemProvider = new NodeItemProvider(this);
		}

		return nodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.TypeNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeNodeItemProvider typeNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.TypeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeNodeAdapter() {
		if (typeNodeItemProvider == null) {
			typeNodeItemProvider = new TypeNodeItemProvider(this);
		}

		return typeNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.Bendpoints} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BendpointsItemProvider bendpointsItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.Bendpoints}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBendpointsAdapter() {
		if (bendpointsItemProvider == null) {
			bendpointsItemProvider = new BendpointsItemProvider(this);
		}

		return bendpointsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.Edge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeItemProvider edgeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEdgeAdapter() {
		if (edgeItemProvider == null) {
			edgeItemProvider = new EdgeItemProvider(this);
		}

		return edgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.AssociationNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationNodeItemProvider associationNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.AssociationNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationNodeAdapter() {
		if (associationNodeItemProvider == null) {
			associationNodeItemProvider = new AssociationNodeItemProvider(this);
		}

		return associationNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.Diagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramItemProvider diagramItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.Diagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiagramAdapter() {
		if (diagramItemProvider == null) {
			diagramItemProvider = new DiagramItemProvider(this);
		}

		return diagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.topicmapslab.tmcledit.model.File} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileItemProvider fileItemProvider;

	/**
	 * This creates an adapter for a {@link de.topicmapslab.tmcledit.model.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileAdapter() {
		if (fileItemProvider == null) {
			fileItemProvider = new FileItemProvider(this);
		}

		return fileItemProvider;
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
		if (occurenceTypeConstraintItemProvider != null) occurenceTypeConstraintItemProvider.dispose();
		if (nameTypeConstraintItemProvider != null) nameTypeConstraintItemProvider.dispose();
		if (roleTypeConstraintsItemProvider != null) roleTypeConstraintsItemProvider.dispose();
		if (topicMapSchemaItemProvider != null) topicMapSchemaItemProvider.dispose();
		if (subjectLocatorConstraintItemProvider != null) subjectLocatorConstraintItemProvider.dispose();
		if (subjectIdentifierConstraintItemProvider != null) subjectIdentifierConstraintItemProvider.dispose();
		if (associationTypeConstraintItemProvider != null) associationTypeConstraintItemProvider.dispose();
		if (mappingElementItemProvider != null) mappingElementItemProvider.dispose();
		if (nodeItemProvider != null) nodeItemProvider.dispose();
		if (typeNodeItemProvider != null) typeNodeItemProvider.dispose();
		if (bendpointsItemProvider != null) bendpointsItemProvider.dispose();
		if (edgeItemProvider != null) edgeItemProvider.dispose();
		if (associationNodeItemProvider != null) associationNodeItemProvider.dispose();
		if (diagramItemProvider != null) diagramItemProvider.dispose();
		if (fileItemProvider != null) fileItemProvider.dispose();
	}

}
