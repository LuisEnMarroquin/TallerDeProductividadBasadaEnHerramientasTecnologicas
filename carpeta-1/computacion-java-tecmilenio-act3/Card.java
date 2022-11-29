public class Card {
  private String palo, color, valor; // Private variables

  public Card(String palo, String color, String valor) { // Constructor
    this.palo = palo;
    this.color = color;
    this.valor = valor;
  }

  public String getPalo() { // Getter
    return palo;
  }

  public String getColor() { // Getter
    return color;
  }

  public String getValor() { // Getter
    return valor;
  }
}
