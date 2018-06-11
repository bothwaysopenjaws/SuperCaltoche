package com.iia.calculette.operation;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Test class for operationAdd
 * @author estephant
 *
 */
public class OperationAddTest {
	
	/**
	 * Test the assignment of the first value.
	 */
	@Test
	public void testSetFirstValue() {
		OperationAdd operationAdd = new OperationAdd();
		
		operationAdd.setFirstValue(10.5);
		
		assertEquals(operationAdd.getFirstValue(), (Double)10.5);
	}
	
	/**
	 * Test the assignment of the second value.
	 */
	@Test
	public void testSetSecondValue() {
		OperationAdd operationAdd = new OperationAdd();
		
		operationAdd.setSecondValue(10.5);
		
		assertEquals(operationAdd.getSecondValue(), (Double)10.5);
	}
	
	
	/**
	 * Test the assignment of the second value.
	 */
	@Test
	public void testOperation() {
		OperationAdd operationAdd = new OperationAdd();
		
		operationAdd.setFirstValue(9.5);		
		operationAdd.setSecondValue(10.5);
		assertEquals((Double)operationAdd.operation(), (Double)20.0);
	}
}
