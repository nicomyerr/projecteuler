import java.util.ArrayList;
import java.util.List;

public class p3 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 3: " + solve());
  }

  private static int solve() {
    long primeNumber = 600851475143L;
    long tmpPrimeNumber = primeNumber;
    List<Integer> primeFactors = new ArrayList<>();
    int i = 2;
    while (!isProduct(primeNumber, primeFactors)) {
      if (isPrime(i) && tmpPrimeNumber % i == 0) {
        tmpPrimeNumber /= i;
        primeFactors.add(i);
      }
      i++;
    }
    return primeFactors.getLast();
  }

  private static boolean isProduct(final long product, final List<Integer> factors) {
    long factorsProduct = 1;
    for (int i = 0; i < factors.size(); i++) {
      factorsProduct *= factors.get(i);
    }
    return product == factorsProduct;
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
