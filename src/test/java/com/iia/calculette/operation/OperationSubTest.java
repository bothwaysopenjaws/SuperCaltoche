package com.iia.calculette.operation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for operationAdd
 * @author estephant
 *
 */
public class OperationSubTest {
	
	/**
	 * Test the assignment of the first value.
	 */
	@Test
	public void testSetFirstValue() {
		OperationSub operationSub = new OperationSub();
		
		operationSub.setFirstValue(10.5);
		
		assertEquals(operationSub.getFirstValue(), (Double)10.5);
	}
	
	/**
	 * Test the assignment of the second value.
	 */
	@Test
	public void testSetSecondValue() {
	    OperationSub operationSub = new OperationSub();
		
	    operationSub.setSecondValue(10.5);
		
		assertEquals(operationSub.getSecondValue(), (Double)10.5);
	}
	
	
	/**
	 * Test the assignment of the second value.
	 */
	@Test
	public void testOperation() {
	    OperationSub operationSub = new OperationSub();
		
	    operationSub.setFirstValue(10.0);		
	    operationSub.setSecondValue(2.5);
		assertEquals((Double)operationSub.operation(), (Double)7.5);
	}
}
