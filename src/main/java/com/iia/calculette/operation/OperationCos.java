package com.iia.calculette.operation;

/**
 * Implementation of the operation Cosinus.
 * @author jbureau
 *
 */
public class OperationCos extends AbstractOperation {

    /**
     * Execute cos.
     * @return double of firstValue
     */
    protected double operationExecute() {
        return Math.cos(this.firstValue);
    }
}
