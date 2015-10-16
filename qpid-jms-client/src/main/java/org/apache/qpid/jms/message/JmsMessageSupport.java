/**
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
package org.apache.qpid.jms.message;

/**
 * Set of common utilities and definitions useful for JMS Message handling.
 */
public class JmsMessageSupport {

    public static final String JMS_DESTINATION = "JMSDestination";
    public static final String JMS_REPLYTO = "JMSReplyTo";
    public static final String JMS_TYPE = "JMSType";
    public static final String JMS_DELIVERY_MODE = "JMSDeliveryMode";
    public static final String JMS_PRIORITY = "JMSPriority";
    public static final String JMS_MESSAGEID = "JMSMessageID";
    public static final String JMS_TIMESTAMP = "JMSTimestamp";
    public static final String JMS_CORRELATIONID = "JMSCorrelationID";
    public static final String JMS_EXPIRATION = "JMSExpiration";
    public static final String JMS_REDELIVERED = "JMSRedelivered";

    public static final String JMSX_GROUPID = "JMSXGroupID";
    public static final String JMSX_GROUPSEQ = "JMSXGroupSeq";
    public static final String JMSX_DELIVERY_COUNT = "JMSXDeliveryCount";
    public static final String JMSX_USERID = "JMSXUserID";

    // TODO: decide on real property name for AMQP JMS Mapping
    // Using a temporary qpid-specific vendor prop for now.
    public static final String JMS_QPID_AMQP_ACK = "JMS_QPID_AMQP_ACK";

    // TODO: advise not using these constants, since doing so wont be portable?
    // Make them package private so they can't be used to begin with?
    public static final int ACCEPTED = 1;
    public static final int REJECTED = 2;
    public static final int RELEASED = 3;
    public static final int MODIFIED_FAILED = 4;
    public static final int MODIFIED_FAILED_UNDELIVERABLE = 5;
}
