
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

    while (!Functions.isProduct(primeNumber, primeFactors)) {
      if (Functions.isPrime(i) && tmpPrimeNumber % i == 0) {
        tmpPrimeNumber /= i;
        primeFactors.add(i);
      }
      i++;
    }

    return primeFactors.getLast();
  }
}
