/*******************************************************************************
 * Copyright 2018.
 ******************************************************************************/
package com.iia.calculette;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
   * Historic of the operations
   */
  private static ArrayList<String> operations = new ArrayList<String>();

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
    Expression calcul = null;
    do {
      getMenu();
      calcul = null;
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

      if (numberVar >= 0 && numberVar <= 6) {
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
                showHistoric();
                break;
            case 3:
                operations.clear();
                break;
            default:
              break;
          }
        }
      if (calcul != null && numberVar != 3) {
          operations.add(calcul.getExpressionString()+" = "+calcul.calculate());
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
    userInterface.display("1 - Calcul (avec ou sans parenthèses)");
    userInterface.display("2 - Afficher historique des calculs");
    userInterface.display("3 - Supprimer historique des calculs");
    userInterface.display("0 - Quitter");
  }

  /**
   * Display the historic of operations.
   */
  private static void showHistoric() {
      userInterface.display("-----------------HISTORIQUE----------------------");
      for (String operation : operations) {
          userInterface.display(operation);
    }
      userInterface.display("-------------------------------------------------");
  }
}
