public class p2 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 2: " + solve());
  }

  private static int solve() {
    int sum = 0;
    int value = 1;
    int nextValue = 2;
    while (value < 4000000) {
      if (value % 2 == 0) {
        sum += value;
      }
      int tmp = nextValue;
      nextValue += value;
      value = tmp;
    }
    return sum;
  }
}
