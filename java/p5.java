public class p5 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 5: " + solve());
  }

  private static int solve() {
    // TODO: better way to determine start number?
    int number = 20;

    while (!isDivisible(number)) {
      number++;
    }

    return number;
  }

  private static boolean isDivisible(final int number) {
    for (int i = 1; i <= 20; i++) {
      if (number % i != 0) {
        return false;
      }
    }
    return true;
  }
}
