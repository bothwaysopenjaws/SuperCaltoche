/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.tactfactory.calculette;
import com.tactfactory.ui.*;
/**
 * Mon application.
 * @version 1.0
 * @author Aurélien Le Pévédic
 *
 */
public final class Application{        

    /*
     * Instantiate userInterface singleton, to display and catch user input
     */
    private static InterfaceUI userInterface = UIConsole.getUIConsole();
    
    /*
     * Boolean set to true to begin loop in main program
     */
    private static boolean isRunning = true;
    
    /**
     * Constructor of the entry point.
     */
    public Application() {
        super();
    }
    /**
     * Entry-point of application.
     * @param args Argument from CLI.
     */
    public static void main(final String[] args) {
        new Application();
        getWelcomeMessage();
        getMenu();
        do {
            String numberVar = userInterface.getContent();
            switch (Integer.parseInt((numberVar))) {
            case 1:
                isRunning = false;
                break;
            default:
                break;
            }
        }
        while(isRunning);
    }
    
    /**
     * Display welcoming message.
     */
    private static void getWelcomeMessage() {
        userInterface.display("-------------------------------------------------");
        userInterface.display("Bienvenue sur super caltoche!");
        userInterface.display("-------------------------------------------------");
    }
    
    /**
     * Display menu message.
     */
    private static void getMenu() {
        userInterface.display("-------------------------------------------------");
        userInterface.display("Menu des choix :");
        userInterface.display("1. Quitter");
    }   
}
