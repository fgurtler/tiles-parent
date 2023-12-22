/*
 * $Id: CompleteAutoloadTilesInitializer.java 892369 2009-12-18 20:21:36Z apetrelli $
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

package org.apache.tiles.extras.complete;

import javax.servlet.ServletContext;

import org.apache.tiles.factory.AbstractTilesContainerFactory;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.wildcard.WildcardServletApplicationContext;
import org.apache.tiles.startup.AbstractTilesInitializer;

/**
 * This initializer uses {@link WildcardServletApplicationContext} to
 * retrieve resources using Ant-style patterns and creates a
 * {@link CompleteAutoloadTilesContainerFactory} to load all new features of
 * Tiles at once.
 *
 * @version $Rev: 892369 $ $Date: 2009-12-18 21:21:36 +0100 (vie, 18 dic 2009) $
 * @since 2.2.0
 */
public class CompleteAutoloadTilesInitializer extends AbstractTilesInitializer {

    /** {@inheritDoc} */
    @Override
    protected ApplicationContext createTilesApplicationContext(
            ApplicationContext preliminaryContext) {
        return new WildcardServletApplicationContext(
                (ServletContext) preliminaryContext.getContext());
    }

    /** {@inheritDoc} */
    @Override
    protected AbstractTilesContainerFactory createContainerFactory(
            ApplicationContext context) {
        return new CompleteAutoloadTilesContainerFactory();
    }
}
