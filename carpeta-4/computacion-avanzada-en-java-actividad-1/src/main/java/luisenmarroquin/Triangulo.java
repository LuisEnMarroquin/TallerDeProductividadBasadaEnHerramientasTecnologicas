package luisenmarroquin;

public class Triangulo {
  private static int resultado;

  public static int metodoArea(int base, int altura) {
    resultado = (base * altura) / 2;
    return resultado;
  }

  public static int metodoPerimetro(int lado1, int lado2, int lado3) {
    resultado = lado1 + lado2 + lado3;
    return resultado;
  }
}
