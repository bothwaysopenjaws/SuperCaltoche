package com.iia.calculette.operation;

/**
 * Implementation of the operation Cosinus.
 * @author jbureau
 *
 */
public class OperationCos implements Operation {

    /**
     * Left value of the operation.
     */
    private Double firstValue;

    /**
     * Constructor of the operation.
     */
    @Override
    public double operation() {
        return Math.cos(this.firstValue);
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
