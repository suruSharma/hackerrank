package algos.implementation;

import java.util.Scanner;

public class SherlockAndSquares {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int testCases = in.nextInt();

    int i = 0;

    while (i < testCases) {
      int count = 0;
      long a = in.nextLong();
      long b = in.nextLong();

      long result = (long) Math.sqrt(a);
      for (long j = result; j * j <= b; j++) {
        long square = j * j;
        if (square >= a && square <= b) {
          count++;
        }
      }

      System.out.println(count);
      i++;
    }
  }
}
