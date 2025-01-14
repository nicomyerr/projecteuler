public class p6 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 6: " + solve());
  }

  private static int solve() {
    return Functions.squareOfSum() - Functions.sumOfSquares();
  }
}
