/*
 * Copyright 2004,2005 The Apache Software Foundation.
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

package org.wso2.carbon.event.output.adaptor.websocket.local;

import javax.websocket.RemoteEndpoint;
import javax.websocket.Session;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * This interface is exposed as an OSGI service, which will be invoked by the local websocket endpoint to inform new subscriptions; and do un-subscriptions..
 */
public interface WebsocketLocalOutputCallbackRegisterService {

    public void subscribe(int tenantId, String adaptorName, String topic, Session session);

    public void unsubscribe(int tenantId, String adaptorName, String topic, Session session);
}
