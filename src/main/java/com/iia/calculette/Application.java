/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iia.calculette.operation.OperationAdd;
import com.iia.calculette.operation.OperationDivide;
import com.iia.calculette.operation.OperationMultiply;
import com.iia.calculette.operation.OperationSub;
import com.iia.calculette.ui.*;
/**
 * Mon application.
 * @version 1.0
 * @author Aur�lien Le P�v�dic
 *
 */
public final class Application{

    /** Instantiate userInterface singleton, to display and catch user input.*/
    private static InterfaceUI userInterface = UIConsole.getUIConsole();

    /** Boolean set to true to begin loop in main program.*/
    private static boolean isRunning = true;

    /**
     * Log4j logger.
     */
    final static Log logger = LogFactory.getLog(Application.class);

    /**
     * Private constructor of application class.
     */
    private Application() {}
    
    /**
     * Entry-point of application.
     * @param args Argument from CLI.
     */
    public static void main(final String[] args) {
        getWelcomeMessage();
        Double firstValue;
        Double secondValue;
        do {
            getMenu();
            int numberVar = -1 ;
            try {
                numberVar = Integer.parseInt(userInterface.getContent());
                logger.info("menu choix :" + numberVar);
            } catch (Exception e) {

                logger.error("Erreur lors du parsing de numbVar (choix du menu) " + System.lineSeparator() + e.getMessage());
                userInterface.display("La valeur ins�r�e ne correspond pas � un chiffre.");
                numberVar = -1;
            }

            if (numberVar >= 0 && numberVar <= 5) {
                logger.info("Choix du menu correct : "+ numberVar);

                switch (numberVar) {
                case 0:
                    isRunning = false;
                    break;
                case 1:
                	OperationAdd operationAdd = new OperationAdd();
                	userInterface.clear();
                	userInterface.display("Inserer la premi�re valeur");
                	firstValue = getDoubleInput();
                	operationAdd.setFirstValue(firstValue);
                	userInterface.display("Inserer la seconde valeur");
                	secondValue = getDoubleInput();
                	operationAdd.setSecondValue(secondValue);
                	System.out.println("R�sultat : " + operationAdd.operation());
                    break;
                case 2:
                    OperationSub operationSub = new OperationSub();
                    userInterface.clear();
                    userInterface.display("Inserer la premi�re valeur");
                    firstValue = getDoubleInput();
                    operationSub.setFirstValue(firstValue);
                    userInterface.display("Inserer la seconde valeur");
                    secondValue = getDoubleInput();
                    operationSub.setSecondValue(secondValue);
                    System.out.println("R�sultat : " + operationSub.operation());
                    break;
                case 3:
                    OperationMultiply operationMulti = new OperationMultiply();
                    userInterface.clear();
                    userInterface.display("Inserer la premi�re valeur");
                    firstValue = getDoubleInput();
                    operationMulti.setFirstValue(firstValue);
                    userInterface.display("Inserer la seconde valeur");
                    secondValue = getDoubleInput();
                    operationMulti.setSecondValue(secondValue);
                    System.out.println("R�sultat : " + operationMulti.operation());
                    break;
                case 4:
                    OperationDivide operationDivide = new OperationDivide();
                    userInterface.clear();
                    userInterface.display("Inserer la premi�re valeur");
                    firstValue = getDoubleInput();
                    operationDivide.setFirstValue(firstValue);
                    userInterface.display("Inserer la seconde valeur");
                    secondValue = getDoubleInput();
                    operationDivide.setSecondValue(secondValue);
                    System.out.println("R�sultat : " + operationDivide.operation());
                    break;
                default:
                    break;
                }
            } else
            {
                logger.info("Choix du menu incorrect : "+ numberVar);
            }

            userInterface.clear();

        }
        while(isRunning);
    }


    /**
     * Method calling interface to get a Double value.
     * @return Double value
     */
    private static Double getDoubleInput() {
        Double value = null;
        while (value == null) {
            try {
                value = Double.parseDouble(userInterface.getContent());
            } catch (Exception e) {
                logger.error("Erreur lors du parsing des doubles (choix du menu) " + System.lineSeparator() + e.getMessage());
                userInterface.display("Une erreur est survenue, la valeur ins�r�e n'est pas un double");
            }
        }
        return value;
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
        userInterface.display("1 - Addition :");
        userInterface.display("2 - Soustraction :");
        userInterface.display("3 - Multiplication :");
        userInterface.display("4 - Division :");
        userInterface.display("0 - Quitter");
    }
}
