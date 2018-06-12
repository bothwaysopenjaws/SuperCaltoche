/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette.ui;

import java.util.Scanner;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * Implementation of interface, for console UI.
 * @author Aurélien Le Pévédic
 * @version 1.0
 */
public final class UIConsole implements InterfaceUI {

    /** Console, to be instanciated if null.*/
    private static final UIConsole CONSOLE = new UIConsole();

    /**
     * Log4j logger.
     */
    private static final Log LOGGER = LogFactory.getLog(UIConsole.class);

    /**
     * Private constructor.
     */
    public UIConsole() {
        super();
    }

    /**
     * Get the singleton of the class.
     * @return UIConsole the singleton
     */
    public static UIConsole getUIConsole() {
        LOGGER.info("UI console OK.");
        return CONSOLE;
    }
    /**
     * Display the text in parameter.
     * @param content text displayed to user
     */
    @Override
    public void display(final String content) {
        System.out.println(content);
    }

    /**
     * Grab context from the console.
     * @return String the content read within the console
     */
    @SuppressWarnings("resource")
    @Override
    public String getContent() {
        return new Scanner(System.in, "UTF-8").nextLine().toString();
    }
}
