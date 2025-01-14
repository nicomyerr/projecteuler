public class p5 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 5: " + solve());
  }

  private static int solve() {
    // TODO: better way to determine start number?
    int number = 20;

    while (!Functions.isDivisible(number)) {
      number++;
    }

    return number;
  }
}
