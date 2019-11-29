/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.qpid.jms.provider;

/**
 * Set of Provider specific constants used when interacting with the Provider API.
 */
public final class ProviderConstants {

    private ProviderConstants() {}

    public enum ACK_TYPE {
        // Aligned with AMQP dispositions
        ACCEPTED,
        RELEASED,
        REJECTED,
        MODIFIED_FAILED,
        MODIFIED_FAILED_UNDELIVERABLE,
        // Conceptual
        DELIVERED,
        CLIENT_ACK_SESSION_SHUTDOWN
    }
}
