package com.iia.calculette.operation;

/**
 * Implementation of the operation. Allow to add a value to an other one.
 * @author estephant
 *
 */
public class OperationAdd extends AbstractOperation {

	/**
	 * Execute addition.
   * @return result of addition
	 */
	protected double operationExecute() {
		return this.firstValue + this.secondValue;
	}
}
