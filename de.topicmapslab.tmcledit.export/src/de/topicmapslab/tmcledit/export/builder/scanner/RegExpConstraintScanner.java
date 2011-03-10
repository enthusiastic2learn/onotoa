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
package de.topicmapslab.tmcledit.export.builder.scanner;

import java.util.Collection;

import org.tmapi.core.Construct;
import org.tmapi.core.Topic;

import de.topicmapslab.ctm.writer.templates.TemplateMatching;
import de.topicmapslab.tmql4j.components.processor.results.model.IResult;
import de.topicmapslab.tmql4j.query.IQuery;

/**
 * @author Hannes Niederhausen
 *
 */
public class RegExpConstraintScanner extends AbstractConstraintScanner {

	@Override
    protected void parseResults(IQuery q) {
		for (IResult result : q.getResults()) {
			TemplateMatching matching = new TemplateMatching();
			matching.setContext((Topic) result.getResults().get(0));
			matching.addArgument(result.getResults().get(1));
			matching.addAffectedConstruct((Construct) result.getResults().get(2));
			addAffectedConstructs((Collection<?>) result.getResults().get(3), matching);
			addMatching(matching);
		}
    }

	@Override
    protected String getQuery() {
	    return "FOR $c IN //tmcl:regular-expression-constraint "
		 	 + "RETURN ($c >> traverse tmcl:constrained-statement, " 
			 + "$c / tmcl:regexp || \".*\", $c, $c << players)";
    }

}
