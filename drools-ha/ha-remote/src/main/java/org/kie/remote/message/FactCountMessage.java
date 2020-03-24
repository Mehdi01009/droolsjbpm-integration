/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.remote.message;

import java.io.Serializable;

public class FactCountMessage extends AbstractMessage implements Serializable, ResultMessage<Long> {

    private long factCount;

    /* Empty constructor for serialization */
    public FactCountMessage(){}

    public FactCountMessage(String id, long factCount) {
        super(id);
        this.factCount = factCount;
    }

    @Override
    public Long getResult() {
        return getFactCount();
    }

    public long getFactCount() {
        return factCount;
    }

    @Override
    public String toString() {
        return "FactCountMessage{" +
                "factCount=" + factCount +
                ", id='" + id + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}