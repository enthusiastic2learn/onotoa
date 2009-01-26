/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.topicmapslab.tmcledit.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.topicmapslab.tmcledit.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2008 Hannes Niederhause, Topic Maps Lab";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://topicmapslab.de/tmceledit/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tmceledit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = de.topicmapslab.tmcledit.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.TopicTypeImpl <em>Topic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.TopicTypeImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getTopicType()
	 * @generated
	 */
	int TOPIC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__IDENTIFIERS = 0;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__ID_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__IS_ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Isa</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__ISA = 3;

	/**
	 * The feature id for the '<em><b>Ako</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__AKO = 4;

	/**
	 * The feature id for the '<em><b>Occurence Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__OCCURENCE_CONSTRAINTS = 5;

	/**
	 * The feature id for the '<em><b>Name Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__NAME_CONTRAINTS = 6;

	/**
	 * The feature id for the '<em><b>Subject Identifier Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__SUBJECT_IDENTIFIER_CONSTRAINTS = 7;

	/**
	 * The feature id for the '<em><b>Subject Locator Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__SUBJECT_LOCATOR_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__KIND = 9;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__EXCLUSIVE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__NAME = 11;

	/**
	 * The feature id for the '<em><b>Locators</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE__LOCATORS = 12;

	/**
	 * The number of structural features of the '<em>Topic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.AbstractConstraintImpl <em>Abstract Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.AbstractConstraintImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getAbstractConstraint()
	 * @generated
	 */
	int ABSTRACT_CONSTRAINT = 1;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.ScopedConstraint <em>Scoped Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.ScopedConstraint
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getScopedConstraint()
	 * @generated
	 */
	int SCOPED_CONSTRAINT = 17;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.OccurenceTypeConstraintImpl <em>Occurence Type Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.OccurenceTypeConstraintImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getOccurenceTypeConstraint()
	 * @generated
	 */
	int OCCURENCE_TYPE_CONSTRAINT = 2;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.NameTypeConstraintImpl <em>Name Type Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.NameTypeConstraintImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getNameTypeConstraint()
	 * @generated
	 */
	int NAME_TYPE_CONSTRAINT = 3;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.RoleTypeConstraintsImpl <em>Role Type Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.RoleTypeConstraintsImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getRoleTypeConstraints()
	 * @generated
	 */
	int ROLE_TYPE_CONSTRAINTS = 4;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.TopicMapSchemaImpl <em>Topic Map Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.TopicMapSchemaImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getTopicMapSchema()
	 * @generated
	 */
	int TOPIC_MAP_SCHEMA = 5;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.SubjectLocatorConstraintImpl <em>Subject Locator Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.SubjectLocatorConstraintImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getSubjectLocatorConstraint()
	 * @generated
	 */
	int SUBJECT_LOCATOR_CONSTRAINT = 6;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.SubjectIdentifierConstraintImpl <em>Subject Identifier Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.SubjectIdentifierConstraintImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getSubjectIdentifierConstraint()
	 * @generated
	 */
	int SUBJECT_IDENTIFIER_CONSTRAINT = 7;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.AssociationTypeConstraintImpl <em>Association Type Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.AssociationTypeConstraintImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getAssociationTypeConstraint()
	 * @generated
	 */
	int ASSOCIATION_TYPE_CONSTRAINT = 8;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.MappingElementImpl <em>Mapping Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.MappingElementImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getMappingElement()
	 * @generated
	 */
	int MAPPING_ELEMENT = 9;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.NodeImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 10;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.TypeNodeImpl <em>Type Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.TypeNodeImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getTypeNode()
	 * @generated
	 */
	int TYPE_NODE = 11;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.BendpointsImpl <em>Bendpoints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.BendpointsImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getBendpoints()
	 * @generated
	 */
	int BENDPOINTS = 12;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.EdgeImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 13;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.AssociationNodeImpl <em>Association Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.AssociationNodeImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getAssociationNode()
	 * @generated
	 */
	int ASSOCIATION_NODE = 14;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.DiagramImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 15;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.FileImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 16;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.CardinalityContraintImpl <em>Cardinality Contraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.CardinalityContraintImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getCardinalityContraint()
	 * @generated
	 */
	int CARDINALITY_CONTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONTRAINT__CARD_MIN = 0;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONTRAINT__CARD_MAX = 1;

	/**
	 * The number of structural features of the '<em>Cardinality Contraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONTRAINT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__CARD_MIN = CARDINALITY_CONTRAINT__CARD_MIN;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__CARD_MAX = CARDINALITY_CONTRAINT__CARD_MAX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__NAME = CARDINALITY_CONTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__REGEXP = CARDINALITY_CONTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_FEATURE_COUNT = CARDINALITY_CONTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.NamedConstraint <em>Named Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.NamedConstraint
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getNamedConstraint()
	 * @generated
	 */
	int NAMED_CONSTRAINT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONSTRAINT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_CONSTRAINT__NAME = NAMED_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_CONSTRAINT__SCOPE = NAMED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scoped Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_CONSTRAINT_FEATURE_COUNT = NAMED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.AbstractTypeConstraintImpl <em>Abstract Type Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.AbstractTypeConstraintImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getAbstractTypeConstraint()
	 * @generated
	 */
	int ABSTRACT_TYPE_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_CONSTRAINT__NAME = SCOPED_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_CONSTRAINT__SCOPE = SCOPED_CONSTRAINT__SCOPE;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_CONSTRAINT__CARD_MIN = SCOPED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_CONSTRAINT__CARD_MAX = SCOPED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_CONSTRAINT__REGEXP = SCOPED_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_CONSTRAINT__TYPE = SCOPED_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Type Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_CONSTRAINT_FEATURE_COUNT = SCOPED_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_TYPE_CONSTRAINT__NAME = ABSTRACT_TYPE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_TYPE_CONSTRAINT__SCOPE = ABSTRACT_TYPE_CONSTRAINT__SCOPE;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_TYPE_CONSTRAINT__CARD_MIN = ABSTRACT_TYPE_CONSTRAINT__CARD_MIN;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_TYPE_CONSTRAINT__CARD_MAX = ABSTRACT_TYPE_CONSTRAINT__CARD_MAX;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_TYPE_CONSTRAINT__REGEXP = ABSTRACT_TYPE_CONSTRAINT__REGEXP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_TYPE_CONSTRAINT__TYPE = ABSTRACT_TYPE_CONSTRAINT__TYPE;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_TYPE_CONSTRAINT__UNIQUE = ABSTRACT_TYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_TYPE_CONSTRAINT__DATA_TYPE = ABSTRACT_TYPE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Occurence Type Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_TYPE_CONSTRAINT_FEATURE_COUNT = ABSTRACT_TYPE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_CONSTRAINT__NAME = ABSTRACT_TYPE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_CONSTRAINT__SCOPE = ABSTRACT_TYPE_CONSTRAINT__SCOPE;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_CONSTRAINT__CARD_MIN = ABSTRACT_TYPE_CONSTRAINT__CARD_MIN;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_CONSTRAINT__CARD_MAX = ABSTRACT_TYPE_CONSTRAINT__CARD_MAX;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_CONSTRAINT__REGEXP = ABSTRACT_TYPE_CONSTRAINT__REGEXP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_CONSTRAINT__TYPE = ABSTRACT_TYPE_CONSTRAINT__TYPE;

	/**
	 * The number of structural features of the '<em>Name Type Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_CONSTRAINT_FEATURE_COUNT = ABSTRACT_TYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_CONSTRAINTS__CARD_MIN = CARDINALITY_CONTRAINT__CARD_MIN;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_CONSTRAINTS__CARD_MAX = CARDINALITY_CONTRAINT__CARD_MAX;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_CONSTRAINTS__TYPE = CARDINALITY_CONTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_CONSTRAINTS__TOPIC_TYPE = CARDINALITY_CONTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Type Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_CONSTRAINTS_FEATURE_COUNT = CARDINALITY_CONTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Topic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__TOPIC_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Association Type Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__ASSOCIATION_TYPE_CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__INCLUDES = 3;

	/**
	 * The feature id for the '<em><b>Active Topic Type Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__ACTIVE_TOPIC_TYPE_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Active Scope Type Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__ACTIVE_SCOPE_TYPE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Active Role Type Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__ACTIVE_ROLE_TYPE_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Active Name Type Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__ACTIVE_NAME_TYPE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Active Association Type Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__ACTIVE_ASSOCIATION_TYPE_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Active Occurence Type Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA__ACTIVE_OCCURENCE_TYPE_CONSTRAINT = 9;

	/**
	 * The number of structural features of the '<em>Topic Map Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MAP_SCHEMA_FEATURE_COUNT = 10;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATOR_CONSTRAINT__CARD_MIN = ABSTRACT_CONSTRAINT__CARD_MIN;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATOR_CONSTRAINT__CARD_MAX = ABSTRACT_CONSTRAINT__CARD_MAX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATOR_CONSTRAINT__NAME = ABSTRACT_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATOR_CONSTRAINT__REGEXP = ABSTRACT_CONSTRAINT__REGEXP;

	/**
	 * The number of structural features of the '<em>Subject Locator Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATOR_CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_IDENTIFIER_CONSTRAINT__CARD_MIN = ABSTRACT_CONSTRAINT__CARD_MIN;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_IDENTIFIER_CONSTRAINT__CARD_MAX = ABSTRACT_CONSTRAINT__CARD_MAX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_IDENTIFIER_CONSTRAINT__NAME = ABSTRACT_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_IDENTIFIER_CONSTRAINT__REGEXP = ABSTRACT_CONSTRAINT__REGEXP;

	/**
	 * The number of structural features of the '<em>Subject Identifier Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_IDENTIFIER_CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_CONSTRAINT__NAME = SCOPED_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_CONSTRAINT__SCOPE = SCOPED_CONSTRAINT__SCOPE;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_CONSTRAINT__CARD_MIN = SCOPED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_CONSTRAINT__CARD_MAX = SCOPED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_CONSTRAINT__REGEXP = SCOPED_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_CONSTRAINT__ASSOCIATION_TYPE = SCOPED_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Type Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_CONSTRAINT__ROLE_TYPE_CONSTRAINTS = SCOPED_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Association Type Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_CONSTRAINT_FEATURE_COUNT = SCOPED_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Mapping Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__POS_X = 0;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__POS_Y = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE__POS_X = NODE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE__POS_Y = NODE__POS_Y;

	/**
	 * The feature id for the '<em><b>Topic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE__TOPIC_TYPE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENDPOINTS__POS_X = 0;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENDPOINTS__POS_Y = 1;

	/**
	 * The number of structural features of the '<em>Bendpoints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENDPOINTS_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__BENDPOINTS = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Role Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ROLE_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Label Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LABEL_POSITIONS = 5;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_NODE__POS_X = NODE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_NODE__POS_Y = NODE__POS_Y;

	/**
	 * The feature id for the '<em><b>Association Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_NODE__ASSOCIATION_CONSTRAINT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__EDGES = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NODES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DIAGRAMS = 0;

	/**
	 * The feature id for the '<em><b>Topic Map Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TOPIC_MAP_SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILENAME = 2;

	/**
	 * The feature id for the '<em><b>Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DIRTY = 3;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.ScopeConstraintImpl <em>Scope Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.ScopeConstraintImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getScopeConstraint()
	 * @generated
	 */
	int SCOPE_CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Card Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__CARD_MIN = CARDINALITY_CONTRAINT__CARD_MIN;

	/**
	 * The feature id for the '<em><b>Card Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__CARD_MAX = CARDINALITY_CONTRAINT__CARD_MAX;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__TYPE = CARDINALITY_CONTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scope Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT_FEATURE_COUNT = CARDINALITY_CONTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.impl.LabelPosImpl <em>Label Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.impl.LabelPosImpl
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getLabelPos()
	 * @generated
	 */
	int LABEL_POS = 20;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_POS__POS_X = 0;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_POS__POS_Y = 1;

	/**
	 * The number of structural features of the '<em>Label Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_POS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.TopicId <em>Topic Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.TopicId
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getTopicId()
	 * @generated
	 */
	int TOPIC_ID = 23;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.EdgeType <em>Edge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.EdgeType
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getEdgeType()
	 * @generated
	 */
	int EDGE_TYPE = 24;

	/**
	 * The meta object id for the '{@link de.topicmapslab.tmcledit.model.KindOfTopicType <em>Kind Of Topic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.topicmapslab.tmcledit.model.KindOfTopicType
	 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getKindOfTopicType()
	 * @generated
	 */
	int KIND_OF_TOPIC_TYPE = 25;


	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.TopicType <em>Topic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType
	 * @generated
	 */
	EClass getTopicType();

	/**
	 * Returns the meta object for the attribute list '{@link de.topicmapslab.tmcledit.model.TopicType#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifiers</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getIdentifiers()
	 * @see #getTopicType()
	 * @generated
	 */
	EAttribute getTopicType_Identifiers();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicType#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getIdType()
	 * @see #getTopicType()
	 * @generated
	 */
	EAttribute getTopicType_IdType();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicType#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#isIsAbstract()
	 * @see #getTopicType()
	 * @generated
	 */
	EAttribute getTopicType_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link de.topicmapslab.tmcledit.model.TopicType#getIsa <em>Isa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Isa</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getIsa()
	 * @see #getTopicType()
	 * @generated
	 */
	EReference getTopicType_Isa();

	/**
	 * Returns the meta object for the reference list '{@link de.topicmapslab.tmcledit.model.TopicType#getAko <em>Ako</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ako</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getAko()
	 * @see #getTopicType()
	 * @generated
	 */
	EReference getTopicType_Ako();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.TopicType#getOccurenceConstraints <em>Occurence Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occurence Constraints</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getOccurenceConstraints()
	 * @see #getTopicType()
	 * @generated
	 */
	EReference getTopicType_OccurenceConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.TopicType#getNameContraints <em>Name Contraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Contraints</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getNameContraints()
	 * @see #getTopicType()
	 * @generated
	 */
	EReference getTopicType_NameContraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.TopicType#getSubjectIdentifierConstraints <em>Subject Identifier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject Identifier Constraints</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getSubjectIdentifierConstraints()
	 * @see #getTopicType()
	 * @generated
	 */
	EReference getTopicType_SubjectIdentifierConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.TopicType#getSubjectLocatorConstraint <em>Subject Locator Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject Locator Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getSubjectLocatorConstraint()
	 * @see #getTopicType()
	 * @generated
	 */
	EReference getTopicType_SubjectLocatorConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getKind()
	 * @see #getTopicType()
	 * @generated
	 */
	EAttribute getTopicType_Kind();

	/**
	 * Returns the meta object for the reference list '{@link de.topicmapslab.tmcledit.model.TopicType#getExclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclusive</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getExclusive()
	 * @see #getTopicType()
	 * @generated
	 */
	EReference getTopicType_Exclusive();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getName()
	 * @see #getTopicType()
	 * @generated
	 */
	EAttribute getTopicType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link de.topicmapslab.tmcledit.model.TopicType#getLocators <em>Locators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Locators</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicType#getLocators()
	 * @see #getTopicType()
	 * @generated
	 */
	EAttribute getTopicType_Locators();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.AbstractConstraint <em>Abstract Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.AbstractConstraint
	 * @generated
	 */
	EClass getAbstractConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.AbstractConstraint#getRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexp</em>'.
	 * @see de.topicmapslab.tmcledit.model.AbstractConstraint#getRegexp()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EAttribute getAbstractConstraint_Regexp();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.OccurenceTypeConstraint <em>Occurence Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurence Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.OccurenceTypeConstraint
	 * @generated
	 */
	EClass getOccurenceTypeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.OccurenceTypeConstraint#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see de.topicmapslab.tmcledit.model.OccurenceTypeConstraint#isUnique()
	 * @see #getOccurenceTypeConstraint()
	 * @generated
	 */
	EAttribute getOccurenceTypeConstraint_Unique();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.OccurenceTypeConstraint#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.OccurenceTypeConstraint#getDataType()
	 * @see #getOccurenceTypeConstraint()
	 * @generated
	 */
	EAttribute getOccurenceTypeConstraint_DataType();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.NameTypeConstraint <em>Name Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.NameTypeConstraint
	 * @generated
	 */
	EClass getNameTypeConstraint();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.RoleTypeConstraints <em>Role Type Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type Constraints</em>'.
	 * @see de.topicmapslab.tmcledit.model.RoleTypeConstraints
	 * @generated
	 */
	EClass getRoleTypeConstraints();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.RoleTypeConstraints#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.RoleTypeConstraints#getType()
	 * @see #getRoleTypeConstraints()
	 * @generated
	 */
	EReference getRoleTypeConstraints_Type();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.RoleTypeConstraints#getTopicType <em>Topic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.RoleTypeConstraints#getTopicType()
	 * @see #getRoleTypeConstraints()
	 * @generated
	 */
	EReference getRoleTypeConstraints_TopicType();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.TopicMapSchema <em>Topic Map Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Map Schema</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema
	 * @generated
	 */
	EClass getTopicMapSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#getTopicTypes <em>Topic Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topic Types</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#getTopicTypes()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EReference getTopicMapSchema_TopicTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#getAssociationTypeConstraints <em>Association Type Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Type Constraints</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#getAssociationTypeConstraints()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EReference getTopicMapSchema_AssociationTypeConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#getMappings()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EReference getTopicMapSchema_Mappings();

	/**
	 * Returns the meta object for the attribute list '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Includes</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#getIncludes()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EAttribute getTopicMapSchema_Includes();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveTopicTypeConstraint <em>Active Topic Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Topic Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveTopicTypeConstraint()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EAttribute getTopicMapSchema_ActiveTopicTypeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveScopeTypeConstraint <em>Active Scope Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Scope Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveScopeTypeConstraint()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EAttribute getTopicMapSchema_ActiveScopeTypeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveRoleTypeConstraint <em>Active Role Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Role Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveRoleTypeConstraint()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EAttribute getTopicMapSchema_ActiveRoleTypeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveNameTypeConstraint <em>Active Name Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Name Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveNameTypeConstraint()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EAttribute getTopicMapSchema_ActiveNameTypeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveAssociationTypeConstraint <em>Active Association Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Association Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveAssociationTypeConstraint()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EAttribute getTopicMapSchema_ActiveAssociationTypeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveOccurenceTypeConstraint <em>Active Occurence Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Occurence Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicMapSchema#isActiveOccurenceTypeConstraint()
	 * @see #getTopicMapSchema()
	 * @generated
	 */
	EAttribute getTopicMapSchema_ActiveOccurenceTypeConstraint();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.SubjectLocatorConstraint <em>Subject Locator Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Locator Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.SubjectLocatorConstraint
	 * @generated
	 */
	EClass getSubjectLocatorConstraint();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.SubjectIdentifierConstraint <em>Subject Identifier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Identifier Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.SubjectIdentifierConstraint
	 * @generated
	 */
	EClass getSubjectIdentifierConstraint();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.AssociationTypeConstraint <em>Association Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.AssociationTypeConstraint
	 * @generated
	 */
	EClass getAssociationTypeConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.AssociationTypeConstraint#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.AssociationTypeConstraint#getAssociationType()
	 * @see #getAssociationTypeConstraint()
	 * @generated
	 */
	EReference getAssociationTypeConstraint_AssociationType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.AssociationTypeConstraint#getRoleTypeConstraints <em>Role Type Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Type Constraints</em>'.
	 * @see de.topicmapslab.tmcledit.model.AssociationTypeConstraint#getRoleTypeConstraints()
	 * @see #getAssociationTypeConstraint()
	 * @generated
	 */
	EReference getAssociationTypeConstraint_RoleTypeConstraints();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.MappingElement <em>Mapping Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Element</em>'.
	 * @see de.topicmapslab.tmcledit.model.MappingElement
	 * @generated
	 */
	EClass getMappingElement();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.MappingElement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.topicmapslab.tmcledit.model.MappingElement#getKey()
	 * @see #getMappingElement()
	 * @generated
	 */
	EAttribute getMappingElement_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.MappingElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.topicmapslab.tmcledit.model.MappingElement#getValue()
	 * @see #getMappingElement()
	 * @generated
	 */
	EAttribute getMappingElement_Value();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.topicmapslab.tmcledit.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.Node#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see de.topicmapslab.tmcledit.model.Node#getPosX()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_PosX();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.Node#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see de.topicmapslab.tmcledit.model.Node#getPosY()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_PosY();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.TypeNode <em>Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Node</em>'.
	 * @see de.topicmapslab.tmcledit.model.TypeNode
	 * @generated
	 */
	EClass getTypeNode();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.TypeNode#getTopicType <em>Topic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.TypeNode#getTopicType()
	 * @see #getTypeNode()
	 * @generated
	 */
	EReference getTypeNode_TopicType();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.Bendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bendpoints</em>'.
	 * @see de.topicmapslab.tmcledit.model.Bendpoints
	 * @generated
	 */
	EClass getBendpoints();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.Bendpoints#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see de.topicmapslab.tmcledit.model.Bendpoints#getPosX()
	 * @see #getBendpoints()
	 * @generated
	 */
	EAttribute getBendpoints_PosX();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.Bendpoints#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see de.topicmapslab.tmcledit.model.Bendpoints#getPosY()
	 * @see #getBendpoints()
	 * @generated
	 */
	EAttribute getBendpoints_PosY();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.topicmapslab.tmcledit.model.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.Edge#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bendpoints</em>'.
	 * @see de.topicmapslab.tmcledit.model.Edge#getBendpoints()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Bendpoints();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.topicmapslab.tmcledit.model.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.topicmapslab.tmcledit.model.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.Edge#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.Edge#getType()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Type();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.Edge#getRoleConstraint <em>Role Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.Edge#getRoleConstraint()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_RoleConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.Edge#getLabelPositions <em>Label Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Positions</em>'.
	 * @see de.topicmapslab.tmcledit.model.Edge#getLabelPositions()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_LabelPositions();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.AssociationNode <em>Association Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Node</em>'.
	 * @see de.topicmapslab.tmcledit.model.AssociationNode
	 * @generated
	 */
	EClass getAssociationNode();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.AssociationNode#getAssociationConstraint <em>Association Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.AssociationNode#getAssociationConstraint()
	 * @see #getAssociationNode()
	 * @generated
	 */
	EReference getAssociationNode_AssociationConstraint();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see de.topicmapslab.tmcledit.model.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.Diagram#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see de.topicmapslab.tmcledit.model.Diagram#getEdges()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.Diagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.topicmapslab.tmcledit.model.Diagram#getNodes()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.topicmapslab.tmcledit.model.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see de.topicmapslab.tmcledit.model.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.File#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see de.topicmapslab.tmcledit.model.File#getDiagrams()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Diagrams();

	/**
	 * Returns the meta object for the containment reference '{@link de.topicmapslab.tmcledit.model.File#getTopicMapSchema <em>Topic Map Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topic Map Schema</em>'.
	 * @see de.topicmapslab.tmcledit.model.File#getTopicMapSchema()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_TopicMapSchema();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.File#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see de.topicmapslab.tmcledit.model.File#getFilename()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filename();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.File#isDirty <em>Dirty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dirty</em>'.
	 * @see de.topicmapslab.tmcledit.model.File#isDirty()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Dirty();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.ScopedConstraint <em>Scoped Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.ScopedConstraint
	 * @generated
	 */
	EClass getScopedConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.topicmapslab.tmcledit.model.ScopedConstraint#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope</em>'.
	 * @see de.topicmapslab.tmcledit.model.ScopedConstraint#getScope()
	 * @see #getScopedConstraint()
	 * @generated
	 */
	EReference getScopedConstraint_Scope();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.ScopeConstraint <em>Scope Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.ScopeConstraint
	 * @generated
	 */
	EClass getScopeConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.ScopeConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.ScopeConstraint#getType()
	 * @see #getScopeConstraint()
	 * @generated
	 */
	EReference getScopeConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.CardinalityContraint <em>Cardinality Contraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Contraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.CardinalityContraint
	 * @generated
	 */
	EClass getCardinalityContraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.CardinalityContraint#getCardMin <em>Card Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Min</em>'.
	 * @see de.topicmapslab.tmcledit.model.CardinalityContraint#getCardMin()
	 * @see #getCardinalityContraint()
	 * @generated
	 */
	EAttribute getCardinalityContraint_CardMin();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.CardinalityContraint#getCardMax <em>Card Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Max</em>'.
	 * @see de.topicmapslab.tmcledit.model.CardinalityContraint#getCardMax()
	 * @see #getCardinalityContraint()
	 * @generated
	 */
	EAttribute getCardinalityContraint_CardMax();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.LabelPos <em>Label Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Pos</em>'.
	 * @see de.topicmapslab.tmcledit.model.LabelPos
	 * @generated
	 */
	EClass getLabelPos();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.LabelPos#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see de.topicmapslab.tmcledit.model.LabelPos#getPosX()
	 * @see #getLabelPos()
	 * @generated
	 */
	EAttribute getLabelPos_PosX();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.LabelPos#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see de.topicmapslab.tmcledit.model.LabelPos#getPosY()
	 * @see #getLabelPos()
	 * @generated
	 */
	EAttribute getLabelPos_PosY();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.AbstractTypeConstraint <em>Abstract Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.AbstractTypeConstraint
	 * @generated
	 */
	EClass getAbstractTypeConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.topicmapslab.tmcledit.model.AbstractTypeConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.AbstractTypeConstraint#getType()
	 * @see #getAbstractTypeConstraint()
	 * @generated
	 */
	EReference getAbstractTypeConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.topicmapslab.tmcledit.model.NamedConstraint <em>Named Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Constraint</em>'.
	 * @see de.topicmapslab.tmcledit.model.NamedConstraint
	 * @generated
	 */
	EClass getNamedConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.topicmapslab.tmcledit.model.NamedConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.topicmapslab.tmcledit.model.NamedConstraint#getName()
	 * @see #getNamedConstraint()
	 * @generated
	 */
	EAttribute getNamedConstraint_Name();

	/**
	 * Returns the meta object for enum '{@link de.topicmapslab.tmcledit.model.TopicId <em>Topic Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Topic Id</em>'.
	 * @see de.topicmapslab.tmcledit.model.TopicId
	 * @generated
	 */
	EEnum getTopicId();

	/**
	 * Returns the meta object for enum '{@link de.topicmapslab.tmcledit.model.EdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.EdgeType
	 * @generated
	 */
	EEnum getEdgeType();

	/**
	 * Returns the meta object for enum '{@link de.topicmapslab.tmcledit.model.KindOfTopicType <em>Kind Of Topic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Of Topic Type</em>'.
	 * @see de.topicmapslab.tmcledit.model.KindOfTopicType
	 * @generated
	 */
	EEnum getKindOfTopicType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.TopicTypeImpl <em>Topic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.TopicTypeImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getTopicType()
		 * @generated
		 */
		EClass TOPIC_TYPE = eINSTANCE.getTopicType();

		/**
		 * The meta object literal for the '<em><b>Identifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_TYPE__IDENTIFIERS = eINSTANCE.getTopicType_Identifiers();

		/**
		 * The meta object literal for the '<em><b>Id Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_TYPE__ID_TYPE = eINSTANCE.getTopicType_IdType();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_TYPE__IS_ABSTRACT = eINSTANCE.getTopicType_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Isa</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_TYPE__ISA = eINSTANCE.getTopicType_Isa();

		/**
		 * The meta object literal for the '<em><b>Ako</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_TYPE__AKO = eINSTANCE.getTopicType_Ako();

		/**
		 * The meta object literal for the '<em><b>Occurence Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_TYPE__OCCURENCE_CONSTRAINTS = eINSTANCE.getTopicType_OccurenceConstraints();

		/**
		 * The meta object literal for the '<em><b>Name Contraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_TYPE__NAME_CONTRAINTS = eINSTANCE.getTopicType_NameContraints();

		/**
		 * The meta object literal for the '<em><b>Subject Identifier Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_TYPE__SUBJECT_IDENTIFIER_CONSTRAINTS = eINSTANCE.getTopicType_SubjectIdentifierConstraints();

		/**
		 * The meta object literal for the '<em><b>Subject Locator Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_TYPE__SUBJECT_LOCATOR_CONSTRAINT = eINSTANCE.getTopicType_SubjectLocatorConstraint();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_TYPE__KIND = eINSTANCE.getTopicType_Kind();

		/**
		 * The meta object literal for the '<em><b>Exclusive</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_TYPE__EXCLUSIVE = eINSTANCE.getTopicType_Exclusive();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_TYPE__NAME = eINSTANCE.getTopicType_Name();

		/**
		 * The meta object literal for the '<em><b>Locators</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_TYPE__LOCATORS = eINSTANCE.getTopicType_Locators();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.AbstractConstraintImpl <em>Abstract Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.AbstractConstraintImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getAbstractConstraint()
		 * @generated
		 */
		EClass ABSTRACT_CONSTRAINT = eINSTANCE.getAbstractConstraint();

		/**
		 * The meta object literal for the '<em><b>Regexp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTRAINT__REGEXP = eINSTANCE.getAbstractConstraint_Regexp();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.OccurenceTypeConstraintImpl <em>Occurence Type Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.OccurenceTypeConstraintImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getOccurenceTypeConstraint()
		 * @generated
		 */
		EClass OCCURENCE_TYPE_CONSTRAINT = eINSTANCE.getOccurenceTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURENCE_TYPE_CONSTRAINT__UNIQUE = eINSTANCE.getOccurenceTypeConstraint_Unique();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURENCE_TYPE_CONSTRAINT__DATA_TYPE = eINSTANCE.getOccurenceTypeConstraint_DataType();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.NameTypeConstraintImpl <em>Name Type Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.NameTypeConstraintImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getNameTypeConstraint()
		 * @generated
		 */
		EClass NAME_TYPE_CONSTRAINT = eINSTANCE.getNameTypeConstraint();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.RoleTypeConstraintsImpl <em>Role Type Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.RoleTypeConstraintsImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getRoleTypeConstraints()
		 * @generated
		 */
		EClass ROLE_TYPE_CONSTRAINTS = eINSTANCE.getRoleTypeConstraints();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE_CONSTRAINTS__TYPE = eINSTANCE.getRoleTypeConstraints_Type();

		/**
		 * The meta object literal for the '<em><b>Topic Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE_CONSTRAINTS__TOPIC_TYPE = eINSTANCE.getRoleTypeConstraints_TopicType();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.TopicMapSchemaImpl <em>Topic Map Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.TopicMapSchemaImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getTopicMapSchema()
		 * @generated
		 */
		EClass TOPIC_MAP_SCHEMA = eINSTANCE.getTopicMapSchema();

		/**
		 * The meta object literal for the '<em><b>Topic Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_MAP_SCHEMA__TOPIC_TYPES = eINSTANCE.getTopicMapSchema_TopicTypes();

		/**
		 * The meta object literal for the '<em><b>Association Type Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_MAP_SCHEMA__ASSOCIATION_TYPE_CONSTRAINTS = eINSTANCE.getTopicMapSchema_AssociationTypeConstraints();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_MAP_SCHEMA__MAPPINGS = eINSTANCE.getTopicMapSchema_Mappings();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_MAP_SCHEMA__INCLUDES = eINSTANCE.getTopicMapSchema_Includes();

		/**
		 * The meta object literal for the '<em><b>Active Topic Type Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_MAP_SCHEMA__ACTIVE_TOPIC_TYPE_CONSTRAINT = eINSTANCE.getTopicMapSchema_ActiveTopicTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Active Scope Type Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_MAP_SCHEMA__ACTIVE_SCOPE_TYPE_CONSTRAINT = eINSTANCE.getTopicMapSchema_ActiveScopeTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Active Role Type Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_MAP_SCHEMA__ACTIVE_ROLE_TYPE_CONSTRAINT = eINSTANCE.getTopicMapSchema_ActiveRoleTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Active Name Type Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_MAP_SCHEMA__ACTIVE_NAME_TYPE_CONSTRAINT = eINSTANCE.getTopicMapSchema_ActiveNameTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Active Association Type Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_MAP_SCHEMA__ACTIVE_ASSOCIATION_TYPE_CONSTRAINT = eINSTANCE.getTopicMapSchema_ActiveAssociationTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Active Occurence Type Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_MAP_SCHEMA__ACTIVE_OCCURENCE_TYPE_CONSTRAINT = eINSTANCE.getTopicMapSchema_ActiveOccurenceTypeConstraint();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.SubjectLocatorConstraintImpl <em>Subject Locator Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.SubjectLocatorConstraintImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getSubjectLocatorConstraint()
		 * @generated
		 */
		EClass SUBJECT_LOCATOR_CONSTRAINT = eINSTANCE.getSubjectLocatorConstraint();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.SubjectIdentifierConstraintImpl <em>Subject Identifier Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.SubjectIdentifierConstraintImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getSubjectIdentifierConstraint()
		 * @generated
		 */
		EClass SUBJECT_IDENTIFIER_CONSTRAINT = eINSTANCE.getSubjectIdentifierConstraint();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.AssociationTypeConstraintImpl <em>Association Type Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.AssociationTypeConstraintImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getAssociationTypeConstraint()
		 * @generated
		 */
		EClass ASSOCIATION_TYPE_CONSTRAINT = eINSTANCE.getAssociationTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_TYPE_CONSTRAINT__ASSOCIATION_TYPE = eINSTANCE.getAssociationTypeConstraint_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Role Type Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_TYPE_CONSTRAINT__ROLE_TYPE_CONSTRAINTS = eINSTANCE.getAssociationTypeConstraint_RoleTypeConstraints();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.MappingElementImpl <em>Mapping Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.MappingElementImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getMappingElement()
		 * @generated
		 */
		EClass MAPPING_ELEMENT = eINSTANCE.getMappingElement();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ELEMENT__KEY = eINSTANCE.getMappingElement_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ELEMENT__VALUE = eINSTANCE.getMappingElement_Value();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.NodeImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__POS_X = eINSTANCE.getNode_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__POS_Y = eINSTANCE.getNode_PosY();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.TypeNodeImpl <em>Type Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.TypeNodeImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getTypeNode()
		 * @generated
		 */
		EClass TYPE_NODE = eINSTANCE.getTypeNode();

		/**
		 * The meta object literal for the '<em><b>Topic Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_NODE__TOPIC_TYPE = eINSTANCE.getTypeNode_TopicType();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.BendpointsImpl <em>Bendpoints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.BendpointsImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getBendpoints()
		 * @generated
		 */
		EClass BENDPOINTS = eINSTANCE.getBendpoints();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENDPOINTS__POS_X = eINSTANCE.getBendpoints_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENDPOINTS__POS_Y = eINSTANCE.getBendpoints_PosY();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.EdgeImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__BENDPOINTS = eINSTANCE.getEdge_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__TYPE = eINSTANCE.getEdge_Type();

		/**
		 * The meta object literal for the '<em><b>Role Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__ROLE_CONSTRAINT = eINSTANCE.getEdge_RoleConstraint();

		/**
		 * The meta object literal for the '<em><b>Label Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__LABEL_POSITIONS = eINSTANCE.getEdge_LabelPositions();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.AssociationNodeImpl <em>Association Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.AssociationNodeImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getAssociationNode()
		 * @generated
		 */
		EClass ASSOCIATION_NODE = eINSTANCE.getAssociationNode();

		/**
		 * The meta object literal for the '<em><b>Association Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_NODE__ASSOCIATION_CONSTRAINT = eINSTANCE.getAssociationNode_AssociationConstraint();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.DiagramImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__EDGES = eINSTANCE.getDiagram_Edges();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__NODES = eINSTANCE.getDiagram_Nodes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.FileImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__DIAGRAMS = eINSTANCE.getFile_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Topic Map Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__TOPIC_MAP_SCHEMA = eINSTANCE.getFile_TopicMapSchema();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILENAME = eINSTANCE.getFile_Filename();

		/**
		 * The meta object literal for the '<em><b>Dirty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__DIRTY = eINSTANCE.getFile_Dirty();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.ScopedConstraint <em>Scoped Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.ScopedConstraint
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getScopedConstraint()
		 * @generated
		 */
		EClass SCOPED_CONSTRAINT = eINSTANCE.getScopedConstraint();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_CONSTRAINT__SCOPE = eINSTANCE.getScopedConstraint_Scope();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.ScopeConstraintImpl <em>Scope Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.ScopeConstraintImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getScopeConstraint()
		 * @generated
		 */
		EClass SCOPE_CONSTRAINT = eINSTANCE.getScopeConstraint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CONSTRAINT__TYPE = eINSTANCE.getScopeConstraint_Type();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.CardinalityContraintImpl <em>Cardinality Contraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.CardinalityContraintImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getCardinalityContraint()
		 * @generated
		 */
		EClass CARDINALITY_CONTRAINT = eINSTANCE.getCardinalityContraint();

		/**
		 * The meta object literal for the '<em><b>Card Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY_CONTRAINT__CARD_MIN = eINSTANCE.getCardinalityContraint_CardMin();

		/**
		 * The meta object literal for the '<em><b>Card Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY_CONTRAINT__CARD_MAX = eINSTANCE.getCardinalityContraint_CardMax();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.LabelPosImpl <em>Label Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.LabelPosImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getLabelPos()
		 * @generated
		 */
		EClass LABEL_POS = eINSTANCE.getLabelPos();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_POS__POS_X = eINSTANCE.getLabelPos_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_POS__POS_Y = eINSTANCE.getLabelPos_PosY();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.impl.AbstractTypeConstraintImpl <em>Abstract Type Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.impl.AbstractTypeConstraintImpl
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getAbstractTypeConstraint()
		 * @generated
		 */
		EClass ABSTRACT_TYPE_CONSTRAINT = eINSTANCE.getAbstractTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_CONSTRAINT__TYPE = eINSTANCE.getAbstractTypeConstraint_Type();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.NamedConstraint <em>Named Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.NamedConstraint
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getNamedConstraint()
		 * @generated
		 */
		EClass NAMED_CONSTRAINT = eINSTANCE.getNamedConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_CONSTRAINT__NAME = eINSTANCE.getNamedConstraint_Name();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.TopicId <em>Topic Id</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.TopicId
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getTopicId()
		 * @generated
		 */
		EEnum TOPIC_ID = eINSTANCE.getTopicId();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.EdgeType <em>Edge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.EdgeType
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getEdgeType()
		 * @generated
		 */
		EEnum EDGE_TYPE = eINSTANCE.getEdgeType();

		/**
		 * The meta object literal for the '{@link de.topicmapslab.tmcledit.model.KindOfTopicType <em>Kind Of Topic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.topicmapslab.tmcledit.model.KindOfTopicType
		 * @see de.topicmapslab.tmcledit.model.impl.ModelPackageImpl#getKindOfTopicType()
		 * @generated
		 */
		EEnum KIND_OF_TOPIC_TYPE = eINSTANCE.getKindOfTopicType();

	}

} //ModelPackage
