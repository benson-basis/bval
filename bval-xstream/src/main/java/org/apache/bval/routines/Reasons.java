/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.bval.routines;

import org.apache.bval.model.Features;

/**
 * Description: StandardReasons for validation errors found in
 * {@link org.apache.bval.ValidationResults}<br/>
 * 
 * TODO RSt - could become part of optional module or remove this interface. it depends indirectly on proprietary XML support only (package org.apache.bval.xml)
 */
public interface Reasons extends Features.Property {
    // The reasons inherited from Features are VALIDATION features only.
    // INFO features are not meant to be validated.

    // Add more reasons here.
    String EMAIL_ADDRESS = "emailAddress";
}