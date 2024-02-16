import polynomial.Polynomial;

/**
 * Main class to test the Polynomial class.
 */
public class Main {
  /**
   * Main method to test the Polynomial class.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // Creates a new Polynomial object and tests the evaluate method
    Polynomial p1 = new PolynomialImpl("4x^2 +2x^1 -1");
    System.out.println("Evaluating " + p1 + " at x = 2:");
    System.out.println(p1.evaluate(2));

    // Tests the add and multiply methods
    Polynomial p2 = new PolynomialImpl("-2x^1 -1");
    Polynomial p3 = p1.add(p2);
    System.out.println("\nAdding " + p1 + " and " + p2 + ":");
    System.out.println(p3.toString());

    Polynomial p4 = p2.multiply(p2);
    System.out.println("\nMultiplying " + p2 + " and " + p2 + ":");
    System.out.println(p4.toString());
  }
}
