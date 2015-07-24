/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.web.handler;

import java.util.Map;
import io.vertx.lang.rxjava.InternalHelper;
import rx.Observable;
import io.vertx.rxjava.ext.web.RoutingContext;
import io.vertx.core.Handler;

/**
 * This handler adds a CSRF token to requests which mutate state. In order change the state a (XSRF-TOKEN) cookie is set
 * with a unique token, that is expected to be sent back in a (X-XSRF-TOKEN) header.
 *
 * The behavior is to check the request body header and cookie for validity.
 *
 * This Handler requires session support, thus should be added somewhere below Session and Body handlers.
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.web.handler.CSRFHandler original} non RX-ified interface using Vert.x codegen.
 */

public class CSRFHandler implements Handler<RoutingContext> {

  final io.vertx.ext.web.handler.CSRFHandler delegate;

  public CSRFHandler(io.vertx.ext.web.handler.CSRFHandler delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public void handle(RoutingContext arg0) { 
    this.delegate.handle((io.vertx.ext.web.RoutingContext) arg0.getDelegate());
  }

  /**
   * Instantiate a new CSRFHandlerImpl with a secret
   * <p>
   * <pre>
   * CSRFHandler.create("s3cr37")
   * </pre>
   * @param secret server secret to sign the token.
   * @return 
   */
  public static CSRFHandler create(String secret) { 
    CSRFHandler ret= CSRFHandler.newInstance(io.vertx.ext.web.handler.CSRFHandler.create(secret));
    return ret;
  }

  /**
   * Set the cookie name. By default XSRF-TOKEN is used as it is the expected name by AngularJS however other frameworks
   * might use other names.
   * @param name a new name for the cookie.
   * @return fluent
   */
  public CSRFHandler setCookieName(String name) { 
    this.delegate.setCookieName(name);
    return this;
  }

  /**
   * Set the header name. By default X-XSRF-TOKEN is used as it is the expected name by AngularJS however other
   * frameworks might use other names.
   * @param name a new name for the header.
   * @return fluent
   */
  public CSRFHandler setHeaderName(String name) { 
    this.delegate.setHeaderName(name);
    return this;
  }

  /**
   * Should the handler give warning messages if this handler is used in other than https protocols?
   * @param nag true to nag
   * @return fluent
   */
  public CSRFHandler setNagHttps(boolean nag) { 
    this.delegate.setNagHttps(nag);
    return this;
  }

  /**
   * Set the timeout for tokens generated by the handler, by default it uses the default from the session handler.
   * @param timeout token timeout
   * @return fluent
   */
  public CSRFHandler setTimeout(long timeout) { 
    this.delegate.setTimeout(timeout);
    return this;
  }


  public static CSRFHandler newInstance(io.vertx.ext.web.handler.CSRFHandler arg) {
    return arg != null ? new CSRFHandler(arg) : null;
  }
}
