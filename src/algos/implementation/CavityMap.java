package algos.implementation;

import java.util.Scanner;

public class CavityMap {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] map = new int[n][n];
    String[] stringMap = new String[n];
    for (int i = 0; i < n; i++) {
      stringMap[i] = in.next();
    }
    String[] resultMap = stringMap.clone();

    int i = 1;
    while (i < n - 1) {
      int j = 1;
      while (j < n - 1) {
        int top = Integer.parseInt("" + stringMap[i - 1].charAt(j));
        int left = Integer.parseInt("" + stringMap[i].charAt(j - 1));
        int bottom = Integer.parseInt("" + stringMap[i + 1].charAt(j));
        int right = Integer.parseInt("" + stringMap[i].charAt(j + 1));
        int val = Integer.parseInt("" + stringMap[i].charAt(j));
        if (val > top && val > left && val > bottom && val > right) {
          char[] result = resultMap[i].toCharArray();
          result[j] = 'X';
          resultMap[i] = new String(result);
        }
        j++;
      }
      i++;
    }
    for(String s:resultMap){
      System.out.println(s);
    }
  }
}
