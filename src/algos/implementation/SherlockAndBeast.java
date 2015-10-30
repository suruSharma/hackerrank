package algos.implementation;

import java.util.Scanner;

public class SherlockAndBeast {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t > 0) {
      int n = in.nextInt();
      if (n < 3) {
        System.out.println("-1");
      } else if ((n < 8) && (n % 5 != 0 && n % 3 != 0)) {
        System.out.println("-1");
      } else {
        if (n == 3) {
          System.out.println("555");
        } else if (n == 5) {
          System.out.println("33333");
        } else {
          StringBuffer result = new StringBuffer();
          int fives = (n / 3) * 3;
          int threes = n - fives;
          if (fives % 3 == 0 && threes % 5 == 0) {
            while (fives > 0) {
              result.append("5");
              fives--;
            }
            while (threes > 0) {
              result.append("3");
              threes--;
            }

            System.out.println(result.toString());
          } else {
            while (!(fives % 3 == 0 && threes % 5 == 0) && (fives + threes == n)) {
              fives--;
              threes++;
            }
            while (fives > 0) {
              result.append("5");
              fives--;
            }
            while (threes > 0) {
              result.append("3");
              threes--;
            }
            System.out.println(result.toString());
          }
        }
      }
      t--;
    }
  }
}
