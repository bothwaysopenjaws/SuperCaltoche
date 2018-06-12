/**
 *
 */
package com.iia.calculette.operation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for operationCos
 * @author jbuerau
 *
 */
public class OperationCosTest {

    /**
     * Test the assignment of the first value.
     */
    @Test
    public void testSetFirstValue() {
        OperationCos operationCos = new OperationCos();

        operationCos.setFirstValue(10.0);

        assertEquals(operationCos.getFirstValue(), (Double)10.0);

    }


    /**
     * Test the operation Cosinus.
     */
    @Test
    public void testOperation() {
        OperationCos operationCos = new OperationCos();

        operationCos.setFirstValue(0.0);

        assertEquals((Double)operationCos.operation(), (Double)1.0);
    }
}
