package com.iia.calculette.operation;

/**
 * Implementation of the operation. Allow to add a value to an other one.
 * @author estephant
 *
 */
public class OperationMultiply extends AbstractOperation {

	/**
	 * Constructor of the operation.
	 */
	protected double operationExecute() {
		return this.firstValue * this.secondValue;
	}
}
