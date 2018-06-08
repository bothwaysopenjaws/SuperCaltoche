/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.ui;

/**
 * Interface class for UI to be implemented.
 * @author Aur�lien Le P�v�dic
 * @version 1.0
 */
public interface InterfaceUI {
    
    /**
     * Display the text in parameter.
     * @param content text displayed to user
     */
    public void display(String content);
    
    /**
     * Grab context from the console.
     * @return String the content read within the console
     */
    public String getContent();
}