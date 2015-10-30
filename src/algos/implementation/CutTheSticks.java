package algos.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    Arrays.sort(a);

    int startIndex = 0;
    int smallest = a[startIndex];
    while (true) {
      int result = 0;
      int revisedStart = -1;
      for (int i = startIndex; i < n; i++) {
        a[i] = a[i] - smallest;
        // if(a[i] > 0){
        result++;
        if (a[i] > 0 && revisedStart == -1) {
          revisedStart = i;
        }
        //}
      }

      System.out.println(result);
      if (revisedStart > -1) {
        startIndex = revisedStart;
        smallest = a[startIndex];
      } else {
        break;
      }
    }
  }
}
