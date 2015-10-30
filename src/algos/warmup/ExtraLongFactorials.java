package algos.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    BigInteger result = fact(n);
    System.out.println(result);
  }

  static BigInteger fact(int n) {
    if (n == 0 || n == 1) {
      return new BigInteger("1");
    } else {
      return new BigInteger(n + "").multiply(fact((n - 1)));
    }
  }
}
