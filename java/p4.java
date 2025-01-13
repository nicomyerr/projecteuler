public class p4 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 4: " + solve());
  }

  private static int solve() {
    int largestPalindrome = 1;

    for (int factor1 = 1; factor1 < 1000; factor1++) {
      for (int factor2 = 1; factor2 < 1000; factor2++) {
        int product = factor1 * factor2;
        if (isPalindrome(product)) {
          if (largestPalindrome < product) {
            largestPalindrome = product;
          }
        }
      }
    }

    return largestPalindrome;
  }

  private static boolean isPalindrome(final int number) {
    String numberString = String.valueOf(number);
    for (int i = 0; i < numberString.length() / 2; i++) {
      if (numberString.charAt(i) != numberString.charAt((numberString.length() - 1) - i)) {
        return false;
      }
    }
    return true;
  }
}
