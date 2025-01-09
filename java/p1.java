public class p1 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 1: " + solve());
  }

  private static int solve() {
    int sum = 0;
    for (int i = 0; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
