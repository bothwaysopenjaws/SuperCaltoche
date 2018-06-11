package com.iia.calculette.operation;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.iia.calculette.ui.UIConsole;

/**
 * Test class for operationAdd
 * @author estephant
 *
 */
public class OperationMultiplyTest {
	
	/**
	 * Test the assignment of the first value.
	 */
	@Test
	public void testSetFirstValue() {
		OperationMultiply operationMulti = new OperationMultiply();
		
		operationMulti.setFirstValue(10.5);
		
		assertEquals(operationMulti.getFirstValue(), (Double)10.5);
	}
	
	/**
	 * Test the assignment of the second value.
	 */
	@Test
	public void testSetSecondValue() {
	    OperationMultiply operationMulti = new OperationMultiply();
		
	    operationMulti.setSecondValue(10.5);
		
		assertEquals(operationMulti.getSecondValue(), (Double)10.5);
	}
	
	
	/**
	 * Test the assignment of the second value.
	 */
	@Test
	public void testOperation() {
	    OperationMultiply operationMulti = new OperationMultiply();
		
	    operationMulti.setFirstValue(1.0);		
	    operationMulti.setSecondValue(6.0);
		assertEquals((Double)operationMulti.operation(), (Double)6.0);
	}
}
