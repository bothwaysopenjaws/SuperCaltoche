package com.iia.calculette.operation;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

/**
 * Implementation of the operation. Allow to add a value to an other one.
 * @author estephant
 *
 */
public class OperationAdd implements Operation {
	//final static Log logger = LogFactory.getLog(Sample.class);

	/**
	 * Left value of the operation.
	 */
	private Double firstValue;

	/**
	 * Right value of the operation.
	 */
	private Double secondValue;

	/**
	 * Constructor of the operation.
	 */
	@Override
	public double operation() {
		//logger.debug("operation Add return : " + this.firstValue + this.secondValue);
		return this.firstValue + this.secondValue;
	}

	/**
	 * Assign the first value of the operation.
	 */
	@Override
	public void setFirstValue(Double firstValue) {
		this.firstValue = firstValue;
	}

	/**
	 * Assign the second value of the operation.
	 */
	@Override
	public void setSecondValue(Double secondValue) {
		this.secondValue = secondValue;
	}

	/**
	 * Get the first value of the operation.
	 * @return Double FirstValue
	 */
	public Double getFirstValue() {
		return firstValue;
	}

	/**
	 * Get the second value of the operation.
	 * @return Double secondValue
	 */
	public Double getSecondValue() {
		return secondValue;
	}
}
