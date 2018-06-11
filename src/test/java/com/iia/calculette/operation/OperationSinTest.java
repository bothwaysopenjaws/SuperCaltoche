/**
 * 
 */
package com.iia.calculette.operation;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.Math;

/**
 * Test class for operationSin
 * @author jbuerau
 *
 */
public class OperationSinTest {

	/**
	 * Test the assignment of the first value.
	 */
	@Test
	public void testSetFirstValue() {
		OperationSin operationSin = new OperationSin();
		
		operationSin.setFirstValue(10.0);
		
		assertEquals(operationSin.getFirstValue(), (Double)10.0);
		
	}
	
	/**
	 * Test the operation Sininus.
	 */
	@Test
	public void testOperation() {
		OperationSin operationSin = new OperationSin();
		
		operationSin.setFirstValue(0.0);
		
		assertEquals((Double)operationSin.operation(), (Double)0.0);
	}
}
