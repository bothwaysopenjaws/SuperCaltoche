/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.iia.calculette.operation.AbstractOperation;
import com.iia.calculette.operation.OperationAdd;
import com.iia.calculette.operation.OperationCos;
import com.iia.calculette.operation.OperationDivide;
import com.iia.calculette.operation.OperationMultiply;
import com.iia.calculette.operation.OperationSin;
import com.iia.calculette.operation.OperationSub;
import com.iia.calculette.operation.OperationTan;
import com.iia.calculette.ui.*;

/**
 * Mon application.
 *
 * @author Aur�lien Le P�v�dic
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
  final static Log logger = LogFactory.getLog(Application.class);
  /**
   * Private constructor of application class.
   */

  private Application() {
  }

  /**
   * Entry-point of application.
   *
   * @param args Argument from CLI.
   */
  public static void main(final String[] args) {
    getWelcomeMessage();
    Double firstValue;
    Double secondValue;
    do {
      getMenu();
      int numberVar = -1;
      try {
        numberVar = Integer.parseInt(userInterface.getContent());
        logger.info("menu choix :" + numberVar);

      } catch (Exception e) {
        userInterface
            .display("La valeur ins�r�e ne correspond pas � un chiffre.");
        logger.error("Erreur lors du parsing de numbVar (choix du menu) " + System.lineSeparator() + e.getMessage());
        numberVar = -1;
      }

      AbstractOperation operation;
      if (numberVar >= 0 && numberVar <= 7) {
          switch (numberVar) {
            case 0:
              isRunning = false;
              break;
            case 1:
              operation = new OperationAdd();
              userInterface.clear();
              userInterface.display("Inserer la premi�re valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              userInterface.display("Inserer la seconde valeur");
              secondValue = getDoubleInput();
              operation.setSecondValue(secondValue);
              System.out.println("R�sultat : " + operation.operation());
              break;
            case 2:
              operation = new OperationSub();
              userInterface.clear();
              userInterface.display("Ins�rer la premi�re valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              userInterface.display("Ins�rer la seconde valeur");
              secondValue = getDoubleInput();
              operation.setSecondValue(secondValue);
              System.out.println("R�sultat : " + operation.operation());
              break;
            case 3:
              operation = new OperationMultiply();
              userInterface.clear();
              userInterface.display("Inserer la premi�re valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              userInterface.display("Inserer la seconde valeur");
              secondValue = getDoubleInput();
              operation.setSecondValue(secondValue);
              System.out.println("R�sultat : " + operation.operation());
              break;
            case 4:
              operation = new OperationDivide();
              userInterface.clear();
              userInterface.display("Inserer la premi�re valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              userInterface.display("Inserer la seconde valeur");
              secondValue = getDoubleInput();
              operation.setSecondValue(secondValue);
              System.out.println("R�sultat : " + operation.operation());
              break;
            case 5:
              operation = new OperationSin();
              userInterface.clear();
              userInterface.display("Ins�rer une valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              System.out.println("R�sultat : " + operation.operation());
              break;
            case 6:
              operation = new OperationCos();
              userInterface.clear();
              userInterface.display("Ins�rer une valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              System.out.println("R�sultat : " + operation.operation());
              break;
            case 7:
              operation = new OperationTan();
              userInterface.clear();
              userInterface.display("Ins�rer une valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              System.out.println("R�sultat : " + operation.operation());
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
    userInterface.display("-------------------------------------------------");
    userInterface.display("Bienvenue sur super caltoche !");
    userInterface.display("-------------------------------------------------");
    }


  /**
   * Method calling interface to get a Double value.
   *
   * @return Double value
   */
  private static Double getDoubleInput() {
    Double value = null;
    while (value == null) {
      try {
        value = Double.parseDouble(userInterface.getContent());
      } catch (Exception e) {
        userInterface.display(
            "Une erreur est survenue, la valeur ins�r�e n'est pas un double");
            logger.error("Erreur lors du parsing des doubles (choix du menu) "
            + System.lineSeparator() + e.getMessage());
      }
    }
    return value;
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
    userInterface.display("5 - Sin :");
    userInterface.display("6 - Cos :");
    userInterface.display("7 - Tan :");
    userInterface.display("0 - Quitter");
  }
}
