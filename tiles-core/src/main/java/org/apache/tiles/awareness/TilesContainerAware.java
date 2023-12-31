/*
 * $Id: TilesContainerAware.java 630422 2008-02-23 11:20:20Z apetrelli $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tiles.awareness;

import org.apache.tiles.TilesContainer;

/**
 * It represents an object that can have a reference to the
 * {@link TilesContainer}.
 *
 * @version $Rev: 630422 $ $Date: 2008-02-23 12:20:20 +0100 (sáb, 23 feb 2008) $
 * @since 2.1.0
 */
public interface TilesContainerAware {

    /**
     * Sets the Tiles container.
     *
     * @param container The Tiles container.
     * @since 2.1.0
     */
    void setContainer(TilesContainer container);
}
