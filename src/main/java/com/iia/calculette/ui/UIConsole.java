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
    
    /** Scanner class, to grad text in console.*/
    private static final Scanner SCANNER = new Scanner(System.in);
    
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
        return SCANNER.nextLine().toString();
    }

}
