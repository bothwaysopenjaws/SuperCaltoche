package com.iia.calculette.operation;

/**
 * Implementation of the operation Tangante.
 * @author jbureau
 *
 */
public class OperationTan extends AbstractOperation {

    /**
     * Execute tan.
     * @return result of tan
     */
    protected double operationExecute() {
        return Math.tan(this.firstValue);
    }
}
