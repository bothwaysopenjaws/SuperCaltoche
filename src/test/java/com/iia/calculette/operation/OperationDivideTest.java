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
	 * Test the assignment of the second value.
	 */
	@Test
	public void testOperation() {
	    OperationDivide operationDivide = new OperationDivide();
		
	    operationDivide.setFirstValue(10.0);		
	    operationDivide.setSecondValue(2.0);
		assertEquals((Double)operationDivide.operation(), (Double)5.0);
	}
}
