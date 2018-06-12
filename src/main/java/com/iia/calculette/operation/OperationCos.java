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
        double returnValue = Math.cos(this.firstValue);
        return returnValue;
    }

    /**
     * Assign the first value of the operation.
     */
    @Override
    public void setFirstValue(final Double firstValue) {
        this.firstValue = firstValue;
    }

    /**
     * Get the first value of the operation.
     * @return Double FirstValue
     */
    public Double getFirstValue() {
        return firstValue;
    }

    /**
     * Class constructor.
     */
    public OperationCos() {
        super();
    }


}
