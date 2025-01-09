public class p6 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 6: " + solve());
  }

  private static int solve() {
    return squareOfSum() - sumOfSquares();
  }

  private static int sumOfSquares() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i * i;
    }
    return sum;
  }

  private static int squareOfSum() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    return sum * sum;
  }
}
