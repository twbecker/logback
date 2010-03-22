/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2009, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.classic;

public class ClassicConstants {
  static public final String USER_MDC_KEY = "user";

  public static final String LOGBACK_CONTEXT_SELECTOR = "logback.ContextSelector";
  public static final String JNDI_CONFIGURATION_RESOURCE = "java:comp/env/logback/configuration-resource";
  public static final String JNDI_CONTEXT_NAME = "java:comp/env/logback/context-name";

  /**
   * The maximum number of package separators (dots) that abbreviation
   * algorithms can handle. Class or logger names with more separators will have
   * their first MAX_DOTS parts shortened.
   * 
   */
  public static final int MAX_DOTS = 16;

  /**
   * The default stack data depth computed during caller data extraction.
   */
  public static final int DEFAULT_MAX_CALLEDER_DATA_DEPTH = 8;
  
  public final static String REQUEST_REMOTE_HOST_MDC_KEY = "req.remoteHost";
  public final static String REQUEST_USER_AGENT_MDC_KEY = "req.userAgent";
  public final static String REQUEST_REQUEST_URI = "req.requestURI";
  public final static String REQUEST_QUERY_STRING = "req.queryString";
  public final static String REQUEST_REQUEST_URL = "req.requestURL";
  public final static String REQUEST_X_FORWARDED_FOR = "req.xForwardedFor";
  
}
