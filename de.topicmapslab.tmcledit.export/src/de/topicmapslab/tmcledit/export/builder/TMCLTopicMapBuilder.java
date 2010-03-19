/*******************************************************************************
 * Copyright (c) 2008, 2009 Topic Maps Lab and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Hannes Niederhausen - initial API and implementation
 *******************************************************************************/
package de.topicmapslab.tmcledit.export.builder;

import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.BENDPOINT;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.COMMENT;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.CONNECTOR;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.CONNECTS;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.CONTAINEE;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.CONTAINER;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.CONTAINS;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.CONTENT;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.DIAGRAM;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.EDGE;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.HEIGHT;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.ID;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.NODE;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.POSX;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.POSY;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.PREFIX;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.REFEREE;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.REFERER;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.REFERS;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.SOURCE;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.TARGET;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.TYPE;
import static de.topicmapslab.tmcledit.export.voc.IOnotoaUris.WIDTH;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.tinytim.voc.Namespace;
import org.tinytim.voc.TMCL;
import org.tinytim.voc.TMDM;
import org.tinytim.voc.XSD;
import org.tmapi.core.Association;
import org.tmapi.core.Locator;
import org.tmapi.core.Topic;
import org.tmapi.core.TopicMap;
import org.tmapi.core.TopicMapSystemFactory;

import de.topicmapslab.tmcledit.model.AbstractCardinalityContraint;
import de.topicmapslab.tmcledit.model.AbstractConstraint;
import de.topicmapslab.tmcledit.model.AbstractUniqueValueTopicType;
import de.topicmapslab.tmcledit.model.AssociationType;
import de.topicmapslab.tmcledit.model.AssociationTypeConstraint;
import de.topicmapslab.tmcledit.model.Bendpoint;
import de.topicmapslab.tmcledit.model.Comment;
import de.topicmapslab.tmcledit.model.Diagram;
import de.topicmapslab.tmcledit.model.Edge;
import de.topicmapslab.tmcledit.model.File;
import de.topicmapslab.tmcledit.model.KindOfTopicType;
import de.topicmapslab.tmcledit.model.MappingElement;
import de.topicmapslab.tmcledit.model.NameType;
import de.topicmapslab.tmcledit.model.NameTypeConstraint;
import de.topicmapslab.tmcledit.model.Node;
import de.topicmapslab.tmcledit.model.OccurrenceType;
import de.topicmapslab.tmcledit.model.OccurrenceTypeConstraint;
import de.topicmapslab.tmcledit.model.ReifiableTopicType;
import de.topicmapslab.tmcledit.model.ReifierConstraint;
import de.topicmapslab.tmcledit.model.RoleCombinationConstraint;
import de.topicmapslab.tmcledit.model.RoleConstraint;
import de.topicmapslab.tmcledit.model.RolePlayerConstraint;
import de.topicmapslab.tmcledit.model.ScopeConstraint;
import de.topicmapslab.tmcledit.model.ScopedTopicType;
import de.topicmapslab.tmcledit.model.SubjectIdentifierConstraint;
import de.topicmapslab.tmcledit.model.SubjectLocatorConstraint;
import de.topicmapslab.tmcledit.model.TMCLConstruct;
import de.topicmapslab.tmcledit.model.TopicMapSchema;
import de.topicmapslab.tmcledit.model.TopicReifiesConstraint;
import de.topicmapslab.tmcledit.model.TopicType;
import de.topicmapslab.tmcledit.model.TypeNode;

/**
 * @author Hannes Niederhausen
 * 
 */
public class TMCLTopicMapBuilder {
	private final TopicMapSchema topicMapSchema;
	
	// set to store the created roleconstraints and roleplayerconstraint
	private final Set<ConstraintWrapper> constraintSet = new HashSet<ConstraintWrapper>();

//	private final Set<OccurrenceType> occTypes = new HashSet<OccurrenceType>();
	
	private Map<TopicType, Topic> topicTypeMap;
	private Map<Node, Topic> nodeMap;
	private Map<String, String> prefixMap;

	private TopicMap topicMap;
	private Locator baseLocator;

	private boolean exportSchema = true;
	private Topic schema;

	private Map<TopicType, TopicType> overlapMap;

	private int topicCounter = 0;

	private boolean createDiagramNodes;
	
	// topics for the diagram informations
	
	// topics for the classes
	private Topic diagramTopic;
	private Topic nodeTopic;
	private Topic edgeTopic;
	private Topic bendpointTopic;

	private Topic commentTopic;

	private Topic idType;

	private Topic typeType;

	private Topic posxType;

	private Topic posyType;

	private Topic widthType;

	private Topic heightType;

	private Topic content;

	private Topic sourceTopic;

	private Topic targetTopic;

	private Topic connectorTopic;

	private Topic containerTopic;

	private Topic containeeTopic;

	private Topic refererTopic;

	private Topic refereeTopic;

	private Topic refersTopic;

	private Topic connectsTopic;

	private Topic containsTopic;

	public TMCLTopicMapBuilder(TopicMapSchema topicMapSchema, boolean exportSchema) {
		this(topicMapSchema, exportSchema, false);
	}
	
	public TMCLTopicMapBuilder(TopicMapSchema topicMapSchema, boolean exportSchema, boolean createDiagramNodes) {
		super();
		this.topicMapSchema = topicMapSchema;
		this.exportSchema = exportSchema;
		this.createDiagramNodes = createDiagramNodes;
	}

	public TopicMap createTopicMap() {
		try {
			// init prefixMap
			prefixMap = new HashMap<String, String>(topicMapSchema.getMappings().size());
			for (MappingElement me : topicMapSchema.getMappings()) {
				prefixMap.put(me.getKey(), me.getValue());
			}
			String baseLoc = topicMapSchema.getBaseLocator();
			if ((baseLoc == null) || (baseLoc.length() == 0))
				baseLoc = "http://onotoa.topicmapslab.de";

			if (baseLoc.endsWith(":")) {
				String key = baseLoc.substring(0, baseLoc.length() - 1);
				baseLoc = prefixMap.get(key);
				if (baseLoc == null)
					baseLoc = "http://onotoa.topicmapslab.de";
			}

			topicMap = TopicMapSystemFactory.newInstance().newTopicMapSystem().createTopicMap(baseLoc);
			baseLocator = topicMap.createLocator(baseLoc);

			topicTypeMap = new HashMap<TopicType, Topic>(topicMapSchema.getTopicTypes().size());

			overlapMap = new HashMap<TopicType, TopicType>(10);

			if (exportSchema) {
				schema = topicMap.createTopic();
				addDocumentationOccurrences(schema, topicMapSchema);
				schema.addType(topicMap.createTopicBySubjectIdentifier(TMCL.SCHEMA));
			}

			createTopicTypes();
			createAssociationConstraints();
			
//			for(OccurrenceType ot : occTypes) {
//				setOccurrenceDatatype(ot);
//			}

			// cleaning up the topics, removing item identifier where there not
			// needed
			for (Topic t : topicMap.getTopics()) {
				if ((t.getSubjectIdentifiers().size() > 0) || (t.getSubjectLocators().size() > 0)) {
					Set<Locator> itemIds = new HashSet<Locator>(t.getItemIdentifiers());
					for (Locator l : itemIds) {
						t.removeItemIdentifier(l);
					}
				}
			}
			
			if (createDiagramNodes) {
				nodeMap = new HashMap<Node, Topic>();
				createDiagramNodes();
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return topicMap;
	}

	private void createDiagramNodes() {
	    // init types
		diagramTopic = createTopic(DIAGRAM);
		edgeTopic = createTopic(EDGE);
		nodeTopic = createTopic(NODE);
		commentTopic = createTopic(COMMENT);
		bendpointTopic = createTopic(BENDPOINT);
		
		// occurrences
		idType = createTopic(ID);
		typeType = createTopic(TYPE);
		posxType = createTopic(POSX);
		posyType = createTopic(POSY);
		widthType = createTopic(WIDTH);
		heightType = createTopic(HEIGHT);
		content = createTopic(CONTENT);
		
		// roles
		sourceTopic = createTopic(SOURCE);
		targetTopic = createTopic(TARGET);
		connectorTopic = createTopic(CONNECTOR);
		containerTopic = createTopic(CONTAINER);
		containeeTopic = createTopic(CONTAINEE);
		refererTopic = createTopic(REFERER);
		refereeTopic = createTopic(REFEREE);
		
		// associations
		refersTopic = createTopic(REFERS);
		connectsTopic = createTopic(CONNECTS);
		containsTopic = createTopic(CONTAINS);
		
		File file = (File) topicMapSchema.eContainer();
		
		for (Diagram d : file.getDiagrams()) {
			createDiagram(d);
		}
		
    }

	private void createDiagram(Diagram d) {
		Locator id = topicMap.createLocator(PREFIX+"/diagrams/"+d.getName().toLowerCase());
		Topic diagram = createTopic(id);
		diagram.addType(diagramTopic);
		
		diagram.createName(d.getName());
		
		for (Comment c : d.getComments()) {
			createComment(diagram, c);
		}
		
		for (Node n : d.getNodes()) {
			createNode(diagram, n);
		}
		
		for (Edge e : d.getEdges()) {
			createEdge(diagram, e);
		}
		
	    
    }

	private void createEdge(Topic diagram, Edge e) {
	    Locator l = topicMap.createLocator(EDGE+"/"+e.getId());
	    Topic edge = createTopic(l);
	    edge.addType(edgeTopic);
	    
	    edge.createOccurrence(typeType, e.getType().getLiteral());
	    
	    Association assoc = topicMap.createAssociation(connectsTopic);
		assoc.createRole(connectorTopic, edge);
		assoc.createRole(sourceTopic, nodeMap.get(e.getSource()));
		assoc.createRole(targetTopic, nodeMap.get(e.getTarget()));
		
		for (Bendpoint bp : e.getBendpoints()) {
			createBendPoints(bp, edge);
		}
	    // TODO role constraint - contraint which represents this thing
    }

	private void createBendPoints(Bendpoint bp, Topic edge) {
		Locator l = topicMap.createLocator(BENDPOINT+"/"+bp.getId());
	    Topic bendpoint = createTopic(l);
	    bendpoint.addType(bendpointTopic);
	    
	    bendpoint.createOccurrence(posyType, Integer.toString(bp.getPosY()));
	    bendpoint.createOccurrence(posxType, Integer.toString(bp.getPosX()));
	    
	    Association assoc = topicMap.createAssociation(containsTopic);
		assoc.createRole(containerTopic, edge);
		assoc.createRole(containeeTopic, bendpoint);
	    
    }

	private void createNode(Topic diagram, Node n) {
	    Locator l = topicMap.createLocator(NODE+"/"+n.getId());
	    Topic node = createTopic(l);
	    node.addType(typeType);
	    
	    node.createOccurrence(posyType, Integer.toString(n.getPosY()));
		node.createOccurrence(posxType, Integer.toString(n.getPosX()));
		
		if (n instanceof TypeNode) {
			Topic t = topicTypeMap.get(((TypeNode) n).getTopicType());
			Association assoc = topicMap.createAssociation(refersTopic);
			assoc.createRole(refereeTopic, t);
			assoc.createRole(refersTopic, node);
		} else {
			// TODO assoc nodes
		}
		
		Association assoc = topicMap.createAssociation(containsTopic);
		assoc.createRole(containerTopic, diagram);
		assoc.createRole(containeeTopic, node);
	    nodeMap.put(n, node);
    }

	private void createComment(Topic diagram, Comment c) {
	    Locator l = topicMap.createLocator(COMMENT+"/"+c.getId());
		Topic comment = createTopic(l);
		comment.addType(commentTopic);
		
		comment.createOccurrence(content, c.getContent());
		comment.createOccurrence(posyType, Integer.toString(c.getPosY()));
		comment.createOccurrence(posxType, Integer.toString(c.getPosX()));
		comment.createOccurrence(widthType, Integer.toString(c.getWidth()));
		comment.createOccurrence(heightType, Integer.toString(c.getHeight()));
		
		Association assoc = topicMap.createAssociation(containsTopic);
		assoc.createRole(containerTopic, diagram);
		assoc.createRole(containeeTopic, comment);
    }

	private void createTopicTypes() {
		for (TopicType tt : topicMapSchema.getTopicTypes()) {
			createTopic(tt);
		}
	}

	private void createAssociationConstraints() {
		for (AssociationTypeConstraint atc : topicMapSchema.getAssociationTypeConstraints()) {
			if (atc.getType() == null)
				continue;
			AssociationType at = (AssociationType) atc.getType();
			for (RolePlayerConstraint rpc : atc.getPlayerConstraints()) {
				ConstraintWrapper w = new ConstraintWrapper(rpc, at);
				if (constraintSet.contains(w))
					continue;
				
				setRolePlayerConstraint(atc.getType(), rpc);
				constraintSet.add(w);
			}
			
			for (RoleConstraint rc : at.getRoles()) {
				ConstraintWrapper w = new ConstraintWrapper(rc, at);
				if (constraintSet.contains(w))
					continue;
				
				setRoleConstraint(atc, rc);
				constraintSet.add(w);
			}

			for (RoleCombinationConstraint rcc : at.getRoleCombinations()) {
				setRoleCombinationConstraint(at, rcc);
			}

			// setScopeConstraints(at);
		}
	}

	private void setRoleCombinationConstraint(AssociationType type, RoleCombinationConstraint rcc) {
		Topic constr = createConstraint(TMCL.ROLE_COMBINATION_CONSTRAINT);
		createConstrainedStatement(type, constr);
		createConstrainedRole(rcc.getRole(), constr);
		createConstrainedTopicType(createTopic(rcc.getPlayer()), constr);
		createOtherConstrainedRole(rcc.getOtherRole(), constr);
		createOtherConstrainedTopicType(createTopic(rcc.getOtherPlayer()), constr);

		setSchema(constr);
	}

	private void createOtherConstrainedTopicType(Topic t, Topic constr) {
		Association ass = topicMap.createAssociation(createTopic(TMCL.OTHER_CONSTRAINED_TOPIC_TYPE));
		ass.createRole(createTopic(TMCL.CONSTRAINS), constr);
		ass.createRole(createTopic(TMCL.CONSTRAINED), t);
	}

	private void createOtherConstrainedRole(TopicType rt, Topic constr) {
		Association ass = topicMap.createAssociation(createTopic(TMCL.OTHER_CONSTRAINED_ROLE));
		ass.createRole(createTopic(TMCL.CONSTRAINS), constr);
		ass.createRole(createTopic(TMCL.CONSTRAINED), createTopic(rt));
	}

	private void setRoleConstraint(AssociationTypeConstraint atc, RoleConstraint rc) {
		Topic constr = createConstraint(TMCL.ASSOCIATION_ROLE_CONSTRAINT);
		addCardinalityOccurrences(constr, rc.getCardMin(), rc.getCardMax());

		createConstrainedRole(rc.getType(), constr);
		createConstrainedStatement(atc.getType(), constr);

		setSchema(constr);
	}

	private void setRolePlayerConstraint(TopicType type, RolePlayerConstraint rpc) {
		if ((rpc.getPlayer() == null) || (rpc.getRole() == null))
			return;
		Topic constr = createConstraint(TMCL.TOPIC_ROLE_CONSTRAINT);
		addCardinalityOccurrences(constr, rpc.getCardMin(), rpc.getCardMax());
		addDocumentationOccurrences(constr, rpc);
		createConstrainedStatement(type, constr);
		createConstrainedTopicType(createTopic(rpc.getPlayer()), constr);
		createConstrainedRole(rpc.getRole().getType(), constr);

		setSchema(constr);
	}

	private void createConstrainedRole(TopicType rt, Topic constr) {
		Association ass = topicMap.createAssociation(createTopic(TMCL.CONSTRAINED_ROLE));
		
		Topic rtTopic = createTopic(rt);
		// check if type is a topic type, if so, add the role-type to isa list
		if (rt.getKind()==KindOfTopicType.TOPIC_TYPE) {
			rtTopic.addType(getTopicType(KindOfTopicType.ROLE_TYPE));
		}
		
		ass.createRole(createTopic(TMCL.CONSTRAINS), constr);
		ass.createRole(createTopic(TMCL.CONSTRAINED), createTopic(rt));
	}

	/**
	 * Creates a topic with the given subject identifier
	 * 
	 * @param loc
	 * @return
	 */
	private Topic createTopic(Locator loc) {
		return topicMap.createTopicBySubjectIdentifier(loc);
	}
	
	private Topic createTopic(String uri) {
		Locator loc = topicMap.createLocator(uri);
		return createTopic(loc);
	}

	private Topic createTopic(TopicType type) {
		Topic t = null;
		String url = (type.getName() + (topicCounter)).replaceAll(" ", "-");
		topicCounter++;
		try {
			url = URLEncoder.encode(url, "utf-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		Locator itemId = baseLocator.resolve("#" + url);
		t = topicTypeMap.get(type);
		if ((t != null) && (t.getParent()!=null))
			return t;

		t = topicMap.createTopicByItemIdentifier(itemId);
		topicTypeMap.put(type, t);
		t.createName(type.getName());
		setSchema(t);

		// creating doc occs
		addDocumentationOccurrences(t, type);

		// setting identifiers
		for (String id : type.getIdentifiers()) {
			if (id.indexOf(':') != -1) { // TODO make it more robust
				String iri = resolveIRI(id);
				if (iri != null) {
					Locator loc = topicMap.createLocator(iri);
					Topic exTopix = topicMap.getTopicBySubjectIdentifier(loc);
					if (exTopix!=null)
						t.mergeIn(exTopix);
					else
						t.addSubjectIdentifier(loc);
				}
			} else {
				Locator loc = topicMap.createLocator(id);
				Topic exTopix = topicMap.getTopicBySubjectIdentifier(loc);
				if (exTopix!=null)
					t.mergeIn(exTopix);
				else
					t.addSubjectIdentifier(loc);
			}
		}

		for (String id : type.getLocators()) {
			if (id.indexOf(':') != -1) {
				String iri = resolveIRI(id);
				if (iri != null)
					t.addSubjectLocator(topicMap.createLocator(iri));
			} else {
				t.addSubjectLocator(topicMap.createLocator(id));
			}
		}

		// add types
		Topic typeTopic = getTopicType(type.getKind());
		if (typeTopic!=null)
			t.addType(typeTopic);

		for (TopicType tt : type.getIsa()) {
			t.addType(createTopic(tt));
		}

		for (TopicType tt : type.getAko()) {
			setSuperType(t, createTopic(tt));
		}

		if (type.isAbstract())
			setAbstract(t);

		for (SubjectIdentifierConstraint sic : type.getSubjectIdentifierConstraints()) {
			setSubjectIdentifierConstraint(t, sic);
		}

		for (SubjectLocatorConstraint slc : type.getSubjectLocatorConstraints()) {
			setSubjectLocatorConstraint(t, slc);
		}

		for (NameTypeConstraint ntc : type.getNameContraints()) {
			setNameTypeConstraint(t, ntc);
		}

		for (OccurrenceTypeConstraint otc : type.getOccurrenceConstraints()) {
			setOccurrenceConstraint(t, otc);
		}

		for (TopicType tt : type.getOverlap()) {
			setOverlapConstraint(type, tt);
		}

		if (type instanceof ReifiableTopicType) {
			setReifierConstraint((ReifiableTopicType) type);
		}

		if (type instanceof ScopedTopicType) {
			setScopeConstraints((ScopedTopicType) type);
		}
		
		if (type instanceof AbstractUniqueValueTopicType) {
			setUnique((AbstractUniqueValueTopicType) type);
		}
		
		if (type instanceof OccurrenceType) {
			setOccurrenceDatatype((OccurrenceType) type);
		}

		setTopicReifiesConstraint(type);

		return t;
	}

	private Topic createConstraint(Locator type) {
		Topic constr = topicMap.createTopic();

		constr.addType(createTopic(type));

		return constr;
	}

	private void createConstrainedStatement(TopicType tt, Topic constr) {
		Association ass = topicMap.createAssociation(createTopic(TMCL.CONSTRAINED_STATEMENT));
		ass.createRole(createTopic(TMCL.CONSTRAINS), constr);
		ass.createRole(createTopic(TMCL.CONSTRAINED), createTopic(tt));
	}

	private void createConstrainedStatement(Topic t, Topic constr) {
		Association ass = topicMap.createAssociation(createTopic(TMCL.CONSTRAINED_STATEMENT));
		ass.createRole(createTopic(TMCL.CONSTRAINS), constr);
		ass.createRole(createTopic(TMCL.CONSTRAINED), t);
	}

	private void createConstrainedTopicType(Topic t, Topic constr) {
		Association ass = topicMap.createAssociation(createTopic(TMCL.CONSTRAINED_TOPIC_TYPE));
		ass.createRole(createTopic(TMCL.CONSTRAINS), constr);
		ass.createRole(createTopic(TMCL.CONSTRAINED), t);
	}

	private void createAllowesScope(TopicType tt, Topic constr) {
		Association ass = topicMap.createAssociation(createTopic(TMCL.ALLOWED_SCOPE));
		ass.createRole(createTopic(TMCL.ALLOWS), constr);
		Topic t = null;
		if (tt == null)
			t = createTopic(TMDM.SUBJECT);
		else
			t = createTopic(tt);
		ass.createRole(createTopic(TMCL.ALLOWED), t);
	}

	private void createOverlaps(TopicType type, Topic constraint) {
		Association ass = topicMap.createAssociation(createTopic(TMCL.OVERLAPS));
		ass.createRole(createTopic(TMCL.ALLOWS), constraint);
		ass.createRole(createTopic(TMCL.ALLOWED), createTopic(type));
	}

	private void addDocumentationOccurrences(Topic topic, TMCLConstruct construct) {
		String tmp = construct.getComment();
		if ((tmp != null) && (tmp.length() > 0))
			topic.createOccurrence(createTopic(TMCL.COMMENT), tmp);

		tmp = construct.getSee_also();
		if ((tmp != null) && (tmp.length() > 0))
			topic.createOccurrence(createTopic(TMCL.SEE_ALSO), tmp);

		tmp = construct.getDescription();
		if ((tmp != null) && (tmp.length() > 0))
			topic.createOccurrence(createTopic(TMCL.DESCRIPTION), tmp);

	}

	private void addCardinalityOccurrences(Topic constr, String cardMin, String cardMax) {
		// needed for templates
		if (!cardMax.equals("0"))
			constr.createOccurrence(createTopic(TMCL.CARD_MIN), cardMin, XSD.INTEGER);
		if (!cardMax.equals("*"))
			constr.createOccurrence(createTopic(TMCL.CARD_MAX), cardMax, XSD.INTEGER);
	}

	private void setOverlapConstraint(TopicType type, TopicType othertype) {
		if (type.equals(overlapMap.get(othertype)))
			return;

		overlapMap.put(type, othertype);

		Topic constr = createConstraint(TMCL.OVERLAP_DECLARATION);

		createOverlaps(othertype, constr);
		createOverlaps(type, constr);

		setSchema(constr);
	}

	private void setNameTypeConstraint(Topic t, NameTypeConstraint ntc) {
		NameType nt = (NameType) ntc.getType();
		Topic nameTopic = null;
		if (nt == null)
			nameTopic = createTopic(TMDM.TOPIC_NAME);
		else {
			nameTopic = createTopic(nt);

			if (!nt.getRegExp().equals(".*"))
				setRegExpConstraint(nt, nt.getRegExp());
		}

		Topic constr = createConstraint(TMCL.TOPIC_NAME_CONSTRAINT);
		addDocumentationOccurrences(constr, ntc);
		addCardinalityOccurrences(constr, ntc.getCardMin(), ntc.getCardMax());

		createConstrainedTopicType(t, constr);
		createConstrainedStatement(nameTopic, constr);

		// setScopeConstraints(nt);

		setSchema(constr);
	}

	private void setOccurrenceConstraint(Topic t, OccurrenceTypeConstraint otc) {
		OccurrenceType otype = (OccurrenceType) otc.getType();
		Topic occType = null;
		if (otype != null) {
			occType = createTopic(otype);
			if (!otype.getRegExp().equals(".*"))
				setRegExpConstraint(otype, otype.getRegExp());
		} else {
			occType = createTopic(TMDM.SUBJECT);
		}

		Topic constr = createConstraint(TMCL.TOPIC_OCCURRENCE_CONSTRAINT);
		addDocumentationOccurrences(constr, otc);
		addCardinalityOccurrences(constr, otc.getCardMin(), otc.getCardMax());
		setSchema(constr);

		createConstrainedTopicType(t, constr);
		createConstrainedStatement(occType, constr);

		// setScopeConstraints(otype);
	}

	private void setScopeConstraints(ScopedTopicType type) {
		if (type == null)
			return;
		for (ScopeConstraint sc : type.getScope()) {
			Topic constr = createConstraint(TMCL.SCOPE_CONSTRAINT);
			addCardinalityOccurrences(constr, sc.getCardMin(), sc.getCardMax());
			addDocumentationOccurrences(constr, sc);
			createConstrainedStatement(type, constr);
			createAllowesScope(sc.getType(), constr);

			setSchema(constr);
		}

	}

	private void setReifierConstraint(ReifiableTopicType rft) {
		ReifierConstraint constraint = rft.getReifierConstraint();
		if (constraint == null)
			return;
		Topic constr = createConstraint(TMCL.REIFIER_CONSTRAINT);
		addDocumentationOccurrences(constr, constraint);
		constr.createOccurrence(createTopic(TMCL.CARD_MIN), constraint.getCardMin(), XSD.INTEGER);
		constr.createOccurrence(createTopic(TMCL.CARD_MAX), constraint.getCardMax(), XSD.INTEGER);
		createConstrainedStatement(rft, constr);

		Association ass = topicMap.createAssociation(createTopic(TMCL.ALLOWED_REIFIER));
		ass.createRole(createTopic(TMCL.ALLOWS), constr);
		Topic t = null;
		if ((constraint.getCardMax().equals("0")) || (constraint.getType() == null))
			t = createTopic(TMDM.SUBJECT);
		else
			t = createTopic(constraint.getType());
		ass.createRole(createTopic(TMCL.ALLOWED), t);

		setSchema(constr);

	}

	private void setTopicReifiesConstraint(TopicType tt) {
		for (TopicReifiesConstraint trc : tt.getTopicReifiesConstraints()) {
			Topic constr = createConstraint(TMCL.TOPIC_REIFIES_CONSTRAINT);
			addDocumentationOccurrences(constr, trc);
			constr.createOccurrence(createTopic(TMCL.CARD_MIN), trc.getCardMin(), XSD.INTEGER);
			constr.createOccurrence(createTopic(TMCL.CARD_MAX), trc.getCardMax(), XSD.INTEGER);
			createConstrainedTopicType(createTopic(tt), constr);

			if (!("0".equals(trc.getCardMin()) && (trc.getCardMin().equals(trc.getCardMax())))) {
				TopicType type = trc.getType();
				if (type == null)
					createConstrainedStatement(createTopic(TMDM.SUBJECT), constr);
				else
					createConstrainedStatement(createTopic(type), constr);
			}

			setSchema(constr);
		}

	}

	private void setRegExpConstraint(TopicType type, String regexp) {
		Topic constr = createConstraint(TMCL.REGULAR_EXPRESSION_CONSTRAINT);
		constr.createOccurrence(createTopic(TMCL.REGEXP), regexp);
		createConstrainedStatement(type, constr);

		setSchema(constr);
	}

	private void setUnique(AbstractUniqueValueTopicType ut) {
		if (!ut.isUnique())
			return;
		Topic constr = createConstraint(TMCL.UNIQUE_VALUE_CONSTRAINT);
		Topic type = createTopic(ut);
		Association ass = topicMap.createAssociation(createTopic(TMCL.CONSTRAINED_STATEMENT));
		ass.createRole(createTopic(TMCL.CONSTRAINS), constr);
		ass.createRole(createTopic(TMCL.CONSTRAINED), type);

		setSchema(constr);
	}

	private void setOccurrenceDatatype(OccurrenceType ot) {
		Topic constr = createConstraint(TMCL.OCCURRENCE_DATATYPE_CONSTRAINT);
		
		String dataType = ot.getDataType();
		if (dataType.startsWith("xsd:")) {
			dataType = dataType.replace("xsd:", Namespace.XSD);
		}
		
		
		constr.createOccurrence(createTopic(TMCL.DATATYPE), dataType, XSD.ANY_URI);

		createConstrainedStatement(ot, constr);

		setSchema(constr);
	}

	private void setSchema(Topic construct) {
		if (!exportSchema)
			return;
		Association ass = topicMap.createAssociation(createTopic(TMCL.BELONGS_TO_SCHEMA));
		ass.createRole(createTopic(TMCL.CONTAINER), schema);
		ass.createRole(createTopic(TMCL.CONTAINEE), construct);
	}

	private void setAbstract(Topic t) {
		Topic abstrConst = createConstraint(TMCL.ABSTRACT_CONSTRAINT);
		Association ass = topicMap.createAssociation(topicMap
		        .createTopicBySubjectIdentifier(TMCL.CONSTRAINED_TOPIC_TYPE));
		ass.createRole(createTopic(TMCL.CONSTRAINS), abstrConst);
		ass.createRole(createTopic(TMCL.CONSTRAINED), t);

		setSchema(abstrConst);
	}

	private void setSubjectIdentifierConstraint(Topic t, SubjectIdentifierConstraint constraint) {
		Topic constr = createConstraint(TMCL.SUBJECT_IDENTIFIER_CONSTRAINT);

		addDocumentationOccurrences(constr, constraint);
		addCardinalityOccurrences(constr, constraint.getCardMin(), constraint.getCardMax());

		if ((constraint.getRegexp() != null) && (!".*".equals(constraint.getRegexp())))
			constr.createOccurrence(createTopic(TMCL.REGEXP), constraint.getRegexp());

		createConstrainedTopicType(t, constr);

		setSchema(constr);
	}

	private void setSubjectLocatorConstraint(Topic t, SubjectLocatorConstraint constraint) {
		Topic constr = createConstraint(TMCL.SUBJECT_LOCATOR_CONSTRAINT);
		addDocumentationOccurrences(constr, constraint);
		addCardinalityOccurrences(constr, constraint.getCardMin(), constraint.getCardMax());

		if ((constraint.getRegexp() != null) && (!".*".equals(constraint.getRegexp())))
			constr.createOccurrence(createTopic(TMCL.REGEXP), constraint.getRegexp());

		createConstrainedTopicType(t, constr);

		setSchema(constr);

	}

	private void setSuperType(Topic subtype, Topic supertype) {
		Association ass = topicMap.createAssociation(createTopic(TMDM.SUPERTYPE_SUBTYPE));
		ass.createRole(createTopic(TMDM.SUPERTYPE), supertype);
		ass.createRole(createTopic(TMDM.SUBTYPE), subtype);

	}

	private String resolveIRI(String id) {
		int index = id.indexOf(':');
		String prefix = id.substring(0, index);
		String value = prefixMap.get(prefix);
		if (value != null) {
			if (value.endsWith("/"))
				return value + id.substring(index + 1);
			else
				return value + "/" + id.substring(index + 1);
		}

		return id;
	}

	private Topic getTopicType(KindOfTopicType kind) {
		Locator loc = TMCL.TOPIC_TYPE;
		switch (kind) {
		case NO_TYPE:
			return null;
		case ASSOCIATION_TYPE:
			loc = TMCL.ASSOCIATION_TYPE;
			break;
		case ROLE_TYPE:
			loc = TMCL.ROLE_TYPE;
			break;
		case OCCURRENCE_TYPE:
			loc = TMCL.OCCURRENCE_TYPE;
			break;
		case NAME_TYPE:
			loc = TMCL.NAME_TYPE;
			break;
		}
		return createTopic(loc);
	}

	private class ConstraintWrapper {
		private final AbstractConstraint constraint;
		private final AssociationType at;

		public ConstraintWrapper(AbstractConstraint constraint, AssociationType at) {
			super();
			this.constraint = constraint;
			this.at = at;
		}

		@Override
        public int hashCode() {
	        final int prime = 31;
	        int result = at.hashCode();
	        
	       
	        
	        if (constraint instanceof RoleConstraint) {
				RoleConstraint rc = (RoleConstraint) constraint;
				if (rc.getType()!=null)
					result += prime * result + rc.getType().hashCode();
				
				
			} else if (constraint instanceof RolePlayerConstraint) {
				RolePlayerConstraint rpc = (RolePlayerConstraint) constraint;
				
				if (rpc.getPlayer()!=null)
					result += prime * result + rpc.getPlayer().hashCode();
				if (rpc.getRole()!=null)
					result += prime * result + rpc.getRole().hashCode();
			}
	        if (constraint instanceof AbstractCardinalityContraint) {
	        	AbstractCardinalityContraint acc = (AbstractCardinalityContraint) constraint;
	        	result += prime * result + acc.getCardMin().hashCode();
				result += prime * result + acc.getCardMax().hashCode();
	        }
	        return result;
        }

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof ConstraintWrapper))
				return false;

			AbstractConstraint otherC = ((ConstraintWrapper) obj).constraint;

			if (!(at.equals(((ConstraintWrapper) obj).at)))
				return false;
			
			if (!constraint.getClass().equals(otherC.getClass()))
				return false;

			if (constraint instanceof RoleConstraint) {
				RoleConstraint rc1 = (RoleConstraint) constraint;
				RoleConstraint rc2 = (RoleConstraint) otherC;

				if (rc1.getType()==null) {
					if (rc2.getType()!=null) {
						return false;
					}
				} else if (!rc1.getType().equals(rc2.getType()))
					return false;
				
				if ((rc1.getCardMin().equals(rc2.getCardMin())) && (rc1.getCardMax().equals(rc2.getCardMax())))
					return true;
				
			} else if (constraint instanceof RolePlayerConstraint) {
				RolePlayerConstraint rpc1 = (RolePlayerConstraint) constraint;
				RolePlayerConstraint rpc2 = (RolePlayerConstraint) otherC;
				
				if (rpc1.getPlayer()==null) {
					if (rpc2.getPlayer()!=null) {
						return false;
					}
				} else if (!rpc1.getPlayer().equals(rpc2.getPlayer()))
					return false;
				

				if (rpc1.getRole()==null) {
					if (rpc2.getRole()!=null) {
						return false;
					}
				} else if (!rpc1.getRole().equals(rpc2.getRole()))
					return false;

				if ((rpc1.getCardMin().equals(rpc2.getCardMin())) && (rpc1.getCardMax().equals(rpc2.getCardMax())))
					return true;
			}

			return super.equals(obj);
		}
	}
	
	

}
