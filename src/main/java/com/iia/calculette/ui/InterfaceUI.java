/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette.ui;

/**
 * Interface class for UI to be implemented.
 * @author Aurélien Le Pévédic
 * @version 1.0
 */
public interface InterfaceUI {

    /**
     * Display the text in parameter.
     * @param content text displayed to user
     */
    void display(String content);

    /**
     * Grab context from the console.
     * @return String the content read within the console
     */
    String getContent();

    /**
     * To clear the console.
     */
    void clear();
}
