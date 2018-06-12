package com.iia.calculette.operation;

/**
 * Implementation of the operation. Allow to add a value to an other one.
 * @author estephant
 *
 */
public class OperationMultiply extends AbstractOperation {

  /**
   * Execute multiplication.
   * @return result of multiplication
   */
	protected double operationExecute() {
		return this.firstValue * this.secondValue;
	}
}
