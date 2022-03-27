/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.iotdb.db.mpp.sql.analyze;

import org.apache.iotdb.db.metadata.path.PartialPath;
import org.apache.iotdb.db.mpp.common.schematree.PathPatternTree;
import org.apache.iotdb.db.mpp.common.schematree.SchemaTree;
import org.apache.iotdb.tsfile.write.schema.MeasurementSchema;

import java.util.List;
import java.util.Map;

public class StandaloneSchemaFetcher implements ISchemaFetcher {

  private StandaloneSchemaFetcher() {}

  public static StandaloneSchemaFetcher getInstance() {
    return new StandaloneSchemaFetcher();
  }

  @Override
  public Map<String, MeasurementSchema> fetchSchema(
      PartialPath deviceId, List<String> measurementIdList) {
    return null;
  }

  @Override
  public SchemaTree fetchSchema(PathPatternTree patternTree) {
    return null;
  }
}