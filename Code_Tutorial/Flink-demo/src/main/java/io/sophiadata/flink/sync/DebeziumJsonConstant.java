/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.sophiadata.flink.sync;

import io.debezium.data.Envelope;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/** (@SophiaData) (@date 2023/3/7 20:27). */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DebeziumJsonConstant {

    public static final String SOURCE = Envelope.FieldName.SOURCE;
    public static final String TABLE = "table";
    public static final String DB = "db";

    public static final String AFTER = Envelope.FieldName.AFTER;
    public static final String BEFORE = Envelope.FieldName.BEFORE;
}
