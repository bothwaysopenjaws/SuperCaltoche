/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette.ui;

import java.util.Scanner;

/**
 * Implementation of interface, for console UI.
 * @author Aurélien Le Pévédic
 * @version 1.0
 */
public final class UIConsole implements InterfaceUI {
    
    /** Console, to be instanciated if null.*/
    private static final UIConsole CONSOLE = new UIConsole();
    
    /**
     * Private constructor.
     */
    private UIConsole() {
        super();
    }
    
    /**
     * Get the singleton of the class.
     * @return UIConsole the singleton
     */
    public static UIConsole getUIConsole() {
        return CONSOLE;
    }
    /**
     * Display the text in parameter.
     * @param content text displayed to user
     */
    @Override
    public final void display(final String content) {
        System.out.println(content);
    }

    /**
     * Grab context from the console.
     * @return String the content read within the console
     */
    @Override
    public String getContent() {
        return new Scanner(System.in, "UTF-8").nextLine().toString();
    }

    /**
     * Clear the console.
     */
	@Override
	public void clear() {
		//System.out.flush();  
	}

}
