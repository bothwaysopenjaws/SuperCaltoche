/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.iia.calculette.operation.AbstractOperation;
import com.iia.calculette.operation.OperationCos;
import com.iia.calculette.operation.OperationSin;
import com.iia.calculette.operation.OperationTan;
import com.iia.calculette.ui.*;
import org.mariuszgromada.math.mxparser.*;

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
    Expression calcul;
    do {
      getMenu();
      int numberVar = -1;
      try {
        numberVar = Integer.parseInt(userInterface.getContent());
        logger.info("menu choix :" + numberVar);

      } catch (Exception e) {
        userInterface
            .display("La valeur insérée ne correspond pas à un chiffre.");
        logger.error("Erreur lors du parsing de numbVar (choix du menu) " + System.lineSeparator() + e.getMessage());
        numberVar = -1;
      }

      AbstractOperation operation;
      if (numberVar >= 0 && numberVar <= 4) {
          switch (numberVar) {
            case 0:
              isRunning = false;
              break;
            case 1:
              userInterface.display("Merci de saisir votre calcul :");
              calcul = new Expression(userInterface.getContent());
              System.out.println("Résultat : "+calcul.calculate());
              final String methodName = "Calcul simple";
              logger.debug(methodName + ": "+calcul.getExpressionString() );
              logger.debug(methodName + "- Resultat obtenu : "+calcul.calculate());
              break;
            case 2:
              operation = new OperationSin();
              userInterface.clear();
              userInterface.display("Insérer une valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              System.out.println("Résultat : " + operation.operation());
              break;
            case 3:
              operation = new OperationCos();
              userInterface.clear();
              userInterface.display("Insérer une valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              System.out.println("Résultat : " + operation.operation());
              break;
            case 4:
              operation = new OperationTan();
              userInterface.clear();
              userInterface.display("Insérer une valeur");
              firstValue = getDoubleInput();
              operation.setFirstValue(firstValue);
              System.out.println("Résultat : " + operation.operation());
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
            "Une erreur est survenue, la valeur insérée n'est pas un double");
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
    userInterface.display("1 - Calcul simple (avec ou sans parenthèses)");
    userInterface.display("2 - Sin");
    userInterface.display("3 - Cos");
    userInterface.display("4 - Tan");
    userInterface.display("0 - Quitter");
  }
}
