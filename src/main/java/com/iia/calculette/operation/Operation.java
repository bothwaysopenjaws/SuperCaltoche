/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette.operation;

/**
 * Interface class for every operations (+,*,-,/...etc) to be implemented.
 * @author Aurélien Le Pévédic
 * @version 1.0
 */
public interface Operation{
    /**
     * Interface operations.
     * @return double result
     */
    public double operation();
    
    /**
     * First value of the calculation.
     * @param firstValue
     */
    public void setFirstValue(Double firstValue);
    
    /**
     * Second value of the calculation.
     * @param secondValue
     */
    public void setSecondValue(Double secondValue);
    
}
