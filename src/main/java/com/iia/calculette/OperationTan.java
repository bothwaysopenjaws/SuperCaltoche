package com.iia.calculette;

import com.iia.calculette.operation.Operation;

/**
 * 
 * @author jureau
 *
 */
public class OperationTan implements Operation{
	/**
	 * Left value of the operation.
	 */
	private Double firstValue;
	
	/**
	 * Constructor of the operation.
	 */
	@Override
	public double operation() {
		return Math.tan(this.firstValue);
	}

	/**
	 * Assign the first value of the operation.
	 */
	@Override
	public void setFirstValue(Double firstValue) {
		this.firstValue = firstValue;
	}
	
	/**
	 * Get the first value of the operation.
	 * @return Double FirstValue
	 */
	public Double getFirstValue() {
		return firstValue;
	}
}
