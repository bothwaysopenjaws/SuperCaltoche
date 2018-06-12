/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette.operation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Interface class for every operations (+,*,-,/...etc) to be implemented.
 * @author Aurélien Le Pévédic
 * @version 1.0
 */
public abstract class AbstractOperation {
    final Log logger = LogFactory.getLog(this.getClass());

    /**
     * Left value of the operation.
     */
    protected Double firstValue;

    /**
     * Right value of the operation.
     */
    protected Double secondValue;

    /**
     * Interface operations.
     * @return double result
     */
    public double operation() {
        final String methodName = "operation";
        logger.debug(methodName + ": firstValue=" + firstValue);
        logger.debug(methodName + ": secondValue=" + secondValue);

        final double result = this.operationExecute();

        logger.debug(methodName + ": result=" + result);

        return result;
    }

    /**
     *
     * @return
     */
    protected abstract double operationExecute();

    /**
     * Assign the first value of the operation.
     */
    public void setFirstValue(Double firstValue) {
        final String methodName = "setFirstValue";
        logger.debug(methodName + ": " + firstValue);
        this.firstValue = firstValue;
    }

    /**
     * Assign the second value of the operation.
     */
    public void setSecondValue(Double secondValue) {
        final String methodName = "setSecondValue";
        logger.debug(methodName + ": " + firstValue);
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
