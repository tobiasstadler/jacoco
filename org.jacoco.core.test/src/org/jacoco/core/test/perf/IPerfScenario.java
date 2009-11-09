/*******************************************************************************
 * Copyright (c) 2009 Mountainminds GmbH & Co. KG and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *    
 * $Id: $
 *******************************************************************************/
package org.jacoco.core.test.perf;

/**
 * Interface for a performance scenario.
 * 
 * @author Marc R. Hoffmann
 * @version $Revision: $
 */
public interface IPerfScenario {

	/**
	 * Runs the performance scenario and reports the result to the given
	 * interface.
	 * 
	 * @param output
	 */
	public void run(IPerfOutput output) throws Exception;

}