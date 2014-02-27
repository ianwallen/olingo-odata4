/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.odata4.client.core.op.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.olingo.odata4.client.core.edm.xml.AbstractEntitySet;
import org.apache.olingo.odata4.client.core.edm.xml.v4.AnnotationImpl;
import org.apache.olingo.odata4.client.core.edm.xml.v4.NavigationPropertyBindingImpl;
import org.apache.olingo.odata4.commons.api.edm.constants.ODataServiceVersion;

public class EntitySetDeserializer extends AbstractEdmDeserializer<AbstractEntitySet> {

  @Override
  protected AbstractEntitySet doDeserialize(final JsonParser jp, final DeserializationContext ctxt)
          throws IOException, JsonProcessingException {

    final AbstractEntitySet entitySet = ODataServiceVersion.V30 == client.getServiceVersion()
            ? new org.apache.olingo.odata4.client.core.edm.xml.v3.EntitySetImpl()
            : new org.apache.olingo.odata4.client.core.edm.xml.v4.EntitySetImpl();

    for (; jp.getCurrentToken() != JsonToken.END_OBJECT; jp.nextToken()) {
      final JsonToken token = jp.getCurrentToken();
      if (token == JsonToken.FIELD_NAME) {
        if ("Name".equals(jp.getCurrentName())) {
          entitySet.setName(jp.nextTextValue());
        } else if ("EntityType".equals(jp.getCurrentName())) {
          entitySet.setEntityType(jp.nextTextValue());
        } else if ("IncludeInServiceDocument".equals(jp.getCurrentName())) {
          ((org.apache.olingo.odata4.client.core.edm.xml.v4.EntitySetImpl) entitySet).
                  setIncludeInServiceDocument(BooleanUtils.toBoolean(jp.nextTextValue()));
        } else if ("NavigationPropertyBinding".equals(jp.getCurrentName())) {
          jp.nextToken();
          ((org.apache.olingo.odata4.client.core.edm.xml.v4.EntitySetImpl) entitySet).
                  getNavigationPropertyBindings().add(
                          jp.readValueAs(NavigationPropertyBindingImpl.class));
        } else if ("Annotation".equals(jp.getCurrentName())) {
          jp.nextToken();
          ((org.apache.olingo.odata4.client.core.edm.xml.v4.EntitySetImpl) entitySet).
                  setAnnotation(jp.readValueAs(AnnotationImpl.class));
        }
      }
    }

    return entitySet;
  }

}
