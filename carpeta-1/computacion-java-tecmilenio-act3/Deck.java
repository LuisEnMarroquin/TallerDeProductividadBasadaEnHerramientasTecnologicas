import java.util.ArrayList;
import java.util.Random;

public class Deck {

  private ArrayList<Card> cards; // ArrayList of cards
  Random randomGenerator = new Random(); // Random number generator

  private String[] optsPalos = { "Tréboles", "Corazones", "Picas", "Diamantes" };
  private String[] optsColores = { "Rojo", "Negro" };
  private String[] optsValores = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K" };

  public Deck() {
    cards = new ArrayList<Card>();
    for (int p = 0; p < optsPalos.length; p++) { // Iterate optsPalos
      int c = p < 2 ? 0 : 1; // Half are red and the other half are black
      for (int v = 0; v < optsValores.length; v++) { // Iterate optsValores
        cards.add(new Card(optsPalos[p], optsColores[c], optsValores[v])); // Add card to array
      }
    }
  }

  public void PrintCardInfo(Card showCard) {
    System.out.println(showCard.getPalo() + ", " + showCard.getColor() + ", " + showCard.getValor());
  }

  public void PrintDeckSize() {
    System.out.println("***** Quedan " + cards.size() + " *****");
  }

  public void Shuffle() {

    int In1, In2; // Random numbers for swapping cards
    Card Ca1, Ca2; // Where the cards are temporarily stored
    int size = cards.size() - 1; // Cards length - 1

    for (int i = 0; i < 50; i++) { // Cards are exchanged 50 times
      In1 = randomGenerator.nextInt(size); // Index 1
      In2 = randomGenerator.nextInt(size); // Index 2

      Ca1 = (Card) cards.get(In1); // Save card 1 in Ca1
      Ca2 = (Card) cards.get(In2); // Save card 2 in Ca2

      cards.set(In2, Ca1); // Replace the card in In2 with Ca1
      cards.set(In1, Ca2); // Replace the card in In1 with Ca2
    }

    System.out.println("***** Se mezcló el Deck *****");
  }

  public void Head() {
    Card ThisCard = cards.remove(0); // Remove first card
    PrintCardInfo(ThisCard);
    PrintDeckSize();
  }

  public void Pick() {
    Card ThisCard = cards.remove(randomGenerator.nextInt(cards.size() - 1)); // Remove random card
    PrintCardInfo(ThisCard);
    PrintDeckSize();
  }

  public void Hand() {
    for (int i = 0; i < 5; i++) { // Iterate to take and remove 5 random cards
      Card ThisCard = cards.remove(randomGenerator.nextInt(cards.size() - 1)); // Remove random card
      PrintCardInfo(ThisCard);
    }
    PrintDeckSize();
  }

}
