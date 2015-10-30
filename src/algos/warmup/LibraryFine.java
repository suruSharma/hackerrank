package algos.warmup;

import java.util.Date;
import java.util.Scanner;

public class LibraryFine {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner in = new Scanner(System.in);
    int actualDate = in.nextInt();
    int actualMonth = in.nextInt();
    int actualYear = in.nextInt();

    int expiredDate = in.nextInt();
    int expiredMonth = in.nextInt();
    int expiredYear = in.nextInt();
    
    Date actual = new Date(actualYear, actualMonth, actualDate);
    Date expired = new Date(expiredYear, expiredMonth, expiredDate);

    if (actual.before(expired) || actual.compareTo(expired)==0) {
      System.out.println(0);
    } else if (actualDate != expiredDate && actualMonth == expiredMonth
        && actualYear == expiredYear) {
      System.out.println(15 * (actualDate - expiredDate));
    } else if (actualMonth != expiredMonth && actualYear == expiredYear) {
      System.out.println(500 * (actualMonth - expiredMonth));
    } else if (actualYear != expiredYear) {
      System.out.println(10000);
    }
  }
}
