package com.iia.calculette.operation;

/**
 * Implementation of the operation. Allow to add a value to an other one.
 * @author estephant
 *
 */
public class OperationSub extends AbstractOperation {

	/**
	 * Execute substraction.
	 * @return result of substraction
	 */
	protected double operationExecute() {
		return this.firstValue - this.secondValue;
	}
}
