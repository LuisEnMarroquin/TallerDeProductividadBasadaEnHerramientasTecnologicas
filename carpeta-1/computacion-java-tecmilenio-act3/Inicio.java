import java.util.Scanner;

public class Inicio {
  public static void main(String[] args) {

    Scanner scannerObject = new Scanner(System.in); // Text input

    Deck deck = new Deck(); // Initialize card deck

    while (true) { // Infinite loop

      String userInput; // User input variable

      System.out.println("\nMenú principal (elija una opción)");
      System.out.println("- 0. Salir de la aplicación");
      System.out.println("- 1. Shuffle (mezclar cartas)");
      System.out.println("- 2. Head (quitar primer carta)");
      System.out.println("- 3. Pick (elegir carta al azar)");
      System.out.println("- 4. Hand (tomar cinco cartas)");

      System.out.print("\nIngrese el número de opción: ");
      userInput = scannerObject.nextLine(); // Get user input
      System.out.println("");

      if (userInput.equals("0")) { // Stop infinite loop
        break;
      }

      switch (userInput) { // Determine which option was chosen
        case "1":
          deck.Shuffle();
          break;
        case "2":
          deck.Head();
          break;
        case "3":
          deck.Pick();
          break;
        case "4":
          deck.Hand();
          break;
        default:
          System.out.println("***** Opción inválida *****");
          break;
      }

    }

    scannerObject.close(); // Close scanner object properly
  }
}
