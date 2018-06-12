/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mariuszgromada.math.mxparser.*;

import com.iia.calculette.ui.*;

/**
 * Mon application.
 *
 * @author Aurélien Le Pévédic
 * @version 1.0
 */
public final class Application{

    /** Instantiate userInterface singleton, to display and catch user input.*/
    private static InterfaceUI userInterface = UIConsole.getUIConsole();

    /** Boolean set to true to begin loop in main program.*/
    private static boolean isRunning = true;

    /**
     * Log4j logger.
     */
    private static final Log LOGGER = LogFactory.getLog(Application.class);

    /**
     * Historic of the operations.
     */
    private static ArrayList<String> operations = new ArrayList<String>();

    /**
     * Private constructor of application class.
     */
    public Application() {
    }

    /**
     * Entry-point of application.
     *
     * @param args Argument from CLI.
     */
    public static void main(String[] args) throws NullPointerException, RuntimeException {
        getWelcomeMessage();
        do {
            getMenu();
            int numberVar = -1;
            try {
                numberVar = Integer.parseInt(userInterface.getContent());
                LOGGER.info("menu choix :" + numberVar);

            } catch (Exception e) {
                userInterface
                .display("La valeur insérée ne correspond pas à un chiffre.");
                LOGGER.error("Erreur lors du parsing de numbVar (choix du menu) "
                        + System.lineSeparator() + e.getMessage());
                numberVar = -1;
            }

            if (numberVar >= 0 && numberVar <= 3) {
                switch (numberVar) {
                case 0:
                    isRunning = false;
                    break;
                case 1:
                    userInterface.display("Merci de saisir votre calcul :");
                    operations.add(
                            computeOperation(userInterface.getContent())
                            );
                    break;
                case 2:
                    showHistoric();
                    break;
                case 3:
                    operations.clear();
                    break;
                default:
                    break;
                }
            }
        }while(isRunning);
    }

    /**
     * Display welcoming message.
     */
    private static void getWelcomeMessage() {
        userInterface.display("Bienvenue sur super caltoche !");
    }

    /**
     * Display menu message.
     */
    private static void getMenu() {
        userInterface.display("Menu des choix :");
        userInterface.display("1 - Calcul (avec ou sans parenthèses)");
        userInterface.display("2 - Afficher historique des calculs");
        userInterface.display("3 - Supprimer historique des calculs");
        userInterface.display("0 - Quitter");
    }

    /**
     * Display the historic of operations.
     */
    private static void showHistoric() {
        for (String operation : operations) {
            userInterface.display(operation);
            LOGGER.debug("Historique : " + operation);
        }
    }

    /**
     * To compute operations.
     * @param expressionString the string to calculate
     * @return String value
     */
    protected static String computeOperation(String expressionString) {
        String returnValue = expressionString;
        Expression calcul = new Expression(expressionString);
        userInterface.display(" = "+ calcul.calculate());
        returnValue = returnValue + " = "+ calcul.calculate();
        return returnValue;
    }
}
