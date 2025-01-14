public class p7 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 7: " + solve());
  }

  private static int solve() {
    int number = 2;
    int counter = 1;

    while (counter <= 10001) {
      if (Functions.isPrime(number)) {
        counter++;
      }
      number++;
    }

    return number - 1;
  }
}
