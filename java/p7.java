public class p7 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 7: " + solve());
  }

  private static int solve() {
    int number = 2;
    int counter = 1;

    while (counter <= 10001) {
      if (isPrime(number)) {
        counter++;
      }
      number++;
    }

    return number - 1;
  }

  private static boolean isPrime(final int number) {
    for (int i = 1; i <= number; i++) {
      if (number % i == 0 && i != 1 && i != number) {
        return false;
      }
    }
    return true;
  }
}
