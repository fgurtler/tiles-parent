/*
 * $Id: ExceptionTool.java 752303 2009-03-10 23:24:21Z apetrelli $
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
package org.apache.tiles.test.velocity;

/**
 * Tool to generate exceptions.
 *
 * @version $Rev: 752303 $ $Date: 2009-03-11 00:24:21 +0100 (mié, 11 mar 2009) $
 */
public class ExceptionTool {

    /**
     * Throws an exception.
     *
     * @return Nothing.
     */
    public String throwRuntimeException() {
        throw new RuntimeException("It is an exception!");
    }
}
