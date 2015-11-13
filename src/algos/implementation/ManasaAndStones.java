package algos.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManasaAndStones {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t > 0) {
      List<Long> result = new ArrayList<Long>();
      long n = in.nextLong();
      long a = in.nextLong();
      long b = in.nextLong();

      long gaps = n - 1;
      for (int i = 0; i < gaps; i++) {
        long ans1 = (a * i) + (b * (gaps - i));
        long ans2 = (b * i) + (a * (gaps - i));
        if (!result.contains(ans1)) {
          result.add(ans1);
        }
        if (!result.contains(ans2)) {
          result.add(ans2);
        }
      }
      Collections.sort(result);
      
      String res = result.toString();
      res = res.replace("[", "").replace("]", "").replace(",", "");
      System.out.println(res);
      t--;
    }

  }

}
