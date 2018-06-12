package com.iia.calculette.operation;

/**
 * Implementation of the operation Sinus.
 * @author jbureau
 *
 */
public class OperationSin extends AbstractOperation {

    /**
     * Execute sin.
     * @return result of sin
     */
    protected double operationExecute() {
        return Math.sin(this.firstValue);
    }
}
