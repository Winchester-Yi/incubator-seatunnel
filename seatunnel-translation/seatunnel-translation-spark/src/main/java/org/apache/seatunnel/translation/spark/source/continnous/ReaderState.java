/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.translation.spark.source.continnous;

import org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset;

import java.util.List;

public class ReaderState implements PartitionOffset {
    private final List<byte[]> bytes;
    private final Integer subtaskId;
    private final Integer checkpointId;

    public ReaderState(List<byte[]> bytes, Integer subtaskId, Integer checkpointId) {
        this.bytes = bytes;
        this.subtaskId = subtaskId;
        this.checkpointId = checkpointId;
    }

    public List<byte[]> getBytes() {
        return bytes;
    }

    public Integer getSubtaskId() {
        return subtaskId;
    }

    public Integer getCheckpointId() {
        return checkpointId;
    }
}