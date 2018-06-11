/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette;
import com.iia.calculette.operation.OperationAdd;
import com.iia.calculette.ui.*;
/**
 * Mon application.
 * @version 1.0
 * @author Aurélien Le Pévédic
 *
 */
public final class Application{        

    /** Instantiate userInterface singleton, to display and catch user input.*/
    private static InterfaceUI userInterface = UIConsole.getUIConsole();
    
    /** Boolean set to true to begin loop in main program.*/
    private static boolean isRunning = true;
    
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
        getMenu();
        int numberVar = -1 ;
        do {
        	try {
        		numberVar = Integer.parseInt(userInterface.getContent());
        		} catch (Exception e) {
        			userInterface.display("La valeur insérée ne correspond pas à un chiffre.");
        			userInterface.display("Veuillez réessayer.");
        			numberVar = -1;
			}
        	
            if (numberVar >= 0 && numberVar <= 1) {
                switch (numberVar) {
                case 0:
                    isRunning = false;
                    break;
                case 1:
                	OperationAdd operationAdd = new OperationAdd();
                	userInterface.clear();
                	userInterface.display("Inserer la première valeur");
                	Double firstValue = getDoubleInput();
                	operationAdd.setFirstValue(firstValue);

                	userInterface.display("Inserer la seconde valeur");
                	Double secondValue = getDoubleInput();
                	operationAdd.setSecondValue(secondValue);
                	
                	System.out.println("Résultat : " + operationAdd.operation());
                	
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
                }			
			}

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
            	userInterface.display("Une erreur est survenue, la valeur insérée n'est pas un double");
            }
            userInterface.display("Veuillez rééssayer");
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
        //userInterface.display("2 - Soustraction :");
        userInterface.display("0 - Quitter");
    }
}
