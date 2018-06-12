package com.iia.calculette.operation;

/**
 * Implementation of the operation. Allow to add a value to an other one.
 * @author estephant
 *
 */
public class OperationDivide extends AbstractOperation {

  /**
   * Execute division.
   * @return result of division
   */
	protected double operationExecute() {
		return this.firstValue / this.secondValue;
	}
}
