/*
 * generated by Xtext 2.33.0
 */
/*
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class QueryRuntimeModule extends AbstractQueryRuntimeModule {

	/**
	 * Concept taken from org.eclipse.ocl.examples.pivot.tests.PivotTestCase.java
	 * It appears that the idea is to uniquely identify the plugin. So the question is 
	 * "Where should this identifier be?" 
	 * 
	 * It seemed to me that the RuntimeModule is a [Schelling point](https://en.wikipedia.org/wiki/Focal_point_(game_theory))
	 * 
	 * The value should be the package name. If we can dynamically determine this, so much the better.
	 */
	public static final @NonNull String PLUGIN_ID = "com.epistimis.uddl.query";

}
