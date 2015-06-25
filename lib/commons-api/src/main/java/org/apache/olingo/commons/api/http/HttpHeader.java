/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.olingo.commons.api.http;

/**
 * HTTP header constants.
 */
public interface HttpHeader {

  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.1">HTTP/1.1 documentation</a>}.
   */
  public static final String ACCEPT = "Accept";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.2">HTTP/1.1 documentation</a>}.
   */
  public static final String ACCEPT_CHARSET = "Accept-Charset";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.3">HTTP/1.1 documentation</a>}.
   */
  public static final String ACCEPT_ENCODING = "Accept-Encoding";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4">HTTP/1.1 documentation</a>}.
   */
  public static final String ACCEPT_LANGUAGE = "Accept-Language";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.7">HTTP/1.1 documentation</a>}.
   */
  public static final String ALLOW = "Allow";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.8">HTTP/1.1 documentation</a>}.
   */
  public static final String AUTHORIZATION = "Authorization";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9">HTTP/1.1 documentation</a>}.
   */
  public static final String CACHE_CONTROL = "Cache-Control";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">HTTP/1.1 documentation</a>}.
   */
  public static final String CONTENT_ENCODING = "Content-Encoding";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.12">HTTP/1.1 documentation</a>}.
   */
  public static final String CONTENT_LANGUAGE = "Content-Language";
  /** See <a href="http://www.rfc-editor.org/rfc/rfc2392.txt">RFC 2392</a>. */
  public static final String CONTENT_ID = "Content-ID";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">HTTP/1.1 documentation</a>}.
   */
  public static final String CONTENT_LENGTH = "Content-Length";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.14">HTTP/1.1 documentation</a>}.
   */
  public static final String CONTENT_LOCATION = "Content-Location";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">HTTP/1.1 documentation</a>}.
   */
  public static final String CONTENT_TYPE = "Content-Type";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.18">HTTP/1.1 documentation</a>}.
   */
  public static final String DATE = "Date";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.19">HTTP/1.1 documentation</a>}.
   */
  public static final String ETAG = "ETag";
  /** See <a href="http://www.rfc-editor.org/rfc/rfc7231.txt">RFC 7231</a>. */
  public static final String EXPECT = "Expect";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21">HTTP/1.1 documentation</a>}.
   */
  public static final String EXPIRES = "Expires";
  /** See <a href="http://www.rfc-editor.org/rfc/rfc7231.txt">RFC 7231</a>. */
  public static final String FROM = "From";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.23">HTTP/1.1 documentation</a>}.
   */
  public static final String HOST = "Host";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.24">HTTP/1.1 documentation</a>}.
   */
  public static final String IF_MATCH = "If-Match";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.25">HTTP/1.1 documentation</a>}.
   */
  public static final String IF_MODIFIED_SINCE = "If-Modified-Since";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.26">HTTP/1.1 documentation</a>}.
   */
  public static final String IF_NONE_MATCH = "If-None-Match";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.28">HTTP/1.1 documentation</a>}.
   */
  public static final String IF_UNMODIFIED_SINCE = "If-Unmodified-Since";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.29">HTTP/1.1 documentation</a>}.
   */
  public static final String LAST_MODIFIED = "Last-Modified";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.30">HTTP/1.1 documentation</a>}.
   */
  public static final String LOCATION = "Location";
  /**
   * See {@link <a href="http://tools.ietf.org/html/rfc5988#page-6">Web Linking (IETF RFC-5988) documentation</a>}.
   */
  public static final String LINK = "Link";
  /** See <a href="http://www.rfc-editor.org/rfc/rfc7231.txt">RFC 7231</a>. */
  public static final String MAX_FORWARDS = "Max-Forwards";
  /**
   * OData Prefer Header.
   * See <a href="http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc406398233">
   * OData Version 4.0 Part 1: Protocol</a> and <a href="https://www.ietf.org/rfc/rfc7240.txt">RFC 7240</a>.
   */
  public static final String PREFER = "Prefer";
  /**
   * OData Preference-Applied Header.
   * See <a href="http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc406398247">
   * OData Version 4.0 Part 1: Protocol</a> and <a href="https://www.ietf.org/rfc/rfc7240.txt">RFC 7240</a>.
   */
  public static final String PREFERENCE_APPLIED = "Preference-Applied";
  /** See <a href="http://www.rfc-editor.org/rfc/rfc7233.txt">RFC 7233</a>. */
  public static final String RANGE = "Range";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.37">HTTP/1.1 documentation</a>}.
   */
  public static final String RETRY_AFTER = "Retry-After";
  /** See <a href="http://www.rfc-editor.org/rfc/rfc7230.txt">RFC 7230</a>. */
  public static final String TE = "TE";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.43">HTTP/1.1 documentation</a>}.
   */
  public static final String USER_AGENT = "User-Agent";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.44">HTTP/1.1 documentation</a>}.
   */
  public static final String VARY = "Vary";
  /**
   * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.47">HTTP/1.1 documentation</a>}.
   */
  public static final String WWW_AUTHENTICATE = "WWW-Authenticate";

  /**
   * See {@link <a href="http://www.ietf.org/rfc/rfc2109.txt">IETF RFC 2109</a>}.
   */
  public static final String COOKIE = "Cookie";
  /**
   * See {@link <a href="http://www.ietf.org/rfc/rfc2109.txt">IETF RFC 2109</a>}.
   */
  public static final String SET_COOKIE = "Set-Cookie";

  /**
   * non standard header
   */
  public static final String X_HTTP_METHOD = "X-HTTP-Method";

  /**
   * non standard header
   */
  public static final String X_HTTP_METHOD_OVERRIDE = "X-HTTP-Method-Override";

  /**
   * OData Custom Header
   */
  public static final String ODATA_VERSION = "OData-Version";

  /**
   * OData Custom Header
   */
  public static final String ODATA_MAX_VERSION = "OData-MaxVersion";
}
