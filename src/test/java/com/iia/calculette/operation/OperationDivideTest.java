package com.iia.calculette.operation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for operationAdd
 * @author alepevedic
 *
 */
public class OperationDivideTest {
	
	/**
	 * Test the assignment of the first value.
	 */
	@Test
	public void testSetFirstValue() {
		OperationDivide operationDivide = new OperationDivide();
		
		operationDivide.setFirstValue(10.5);
		
		assertEquals(operationDivide.getFirstValue(), (Double)10.5);
	}
	
	/**
	 * Test the assignment of the second value.
	 */
	@Test
	public void testSetSecondValue() {
	    OperationDivide operationDivide = new OperationDivide();
		
		operationDivide.setSecondValue(10.5);
		
		assertEquals(operationDivide.getSecondValue(), (Double)10.5);
	}
	
	
	/**
	 * Test the operation Divide.
	 */
	@Test
	public void testOperation() {
	    OperationDivide operationDivide = new OperationDivide();
		
	    operationDivide.setFirstValue(10.0);		
	    operationDivide.setSecondValue(2.0);
		assertEquals((Double)operationDivide.operation(), (Double)5.0);
	}
}
