package algos.implementation;

import java.util.Scanner;

public class ModifiedKaprekar {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long p = in.nextInt();
    long q = in.nextInt();

    StringBuffer res = new StringBuffer();
    if (p == 1) {
      res.append(1).append(" ");
    }
    for (long i = p; i <= q; i++) {
      long sq = i * i;
      char[] arr = (sq + "").toCharArray();
      for (int j = 0; j < arr.length - 1; j++) {
        int left = getNumber(arr, 0, j);
        int right = getNumber(arr, j + 1, arr.length - 1);

       if (((left + "").length() + (right + "").length()) == arr.length) {
          if (left > 0 && right > 0 && left + right == i) {
            res.append(i).append(" ");
            break;
          }
        }

      }

    }

    if (res.length() == 0) {
      System.out.println("INVALID RANGE");
    } else {
      System.out.println(res.toString().trim());
    }
  }

  private static int getNumber(char[] arr, int start, int end) {
    StringBuffer num = new StringBuffer();
    for (int i = start; i <= end; i++) {
      num.append(arr[i]);
    }
    if (num.length() == 0) {
      return 0;
    }
    return Integer.parseInt(num.toString());

  }
}
