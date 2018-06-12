/*******************************************************************************
 * Copyright 2018 AURELIEN
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.iia.calculette;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Test class.
 * @author Aurélien Le Pévédic
 * @version 1.0
 */
public class ApplicationTest {

    @Test
    public void testComputeOperationAdd() {
        assertEquals(Application.computeOperation("1 + 2"), "1 + 2 = 3.0");
        assertEquals(Application.computeOperation("1.1 + 2"), "1.1 + 2 = 3.1");
    }

    @Test
    public void testComputeOperationSub() {
        assertEquals(Application.computeOperation("1 - 2"), "1 - 2 = -1.0");
    }

    @Test
    public void testComputeOperationMultiply() {
        assertEquals(Application.computeOperation("1 * 2"), "1 * 2 = 2.0");
        assertEquals(Application.computeOperation("2 * 4"), "2 * 4 = 8.0");
    }

    @Test
    public void testComputeOperationDivide() {
        assertEquals(Application.computeOperation("1 / 2"), "1 / 2 = 0.5");
    }

    @Test
    public void testComputeOperationSin() {
        assertEquals(Application.computeOperation("sin(0)"), "sin(0) = 0.0");
    }

    @Test
    public void testComputeOperationCos() {
        assertEquals(Application.computeOperation("cos(0)"), "cos(0) = 1.0");
    }

    @Test
    public void testComputeOperationTan() {
        assertEquals(Application.computeOperation("tan(0)"), "tan(0) = 0.0");
    }

    @Test
    public void testComputeOperationMod() {
        assertEquals(Application.computeOperation("mod(2 , 2)"), "mod(2 , 2) = 0.0");
    }

    @Test
    public void testConstructor() {
        Application app = new Application();
        assertNotNull(app);
    }
}
