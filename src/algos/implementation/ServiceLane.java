package algos.implementation;

import java.util.Scanner;

public class ServiceLane {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int t = in.nextInt();
    int[] width = new int[n];
    for (int i = 0; i < n; i++) {
      width[i] = in.nextInt();
    }

    while (t > 0) {
      int i = in.nextInt();
      int j = in.nextInt();
      int smallest = 3;
      while (i <= j) {
        if(width[i] < smallest){
          smallest = width[i];
        }
        i++;
      }
      System.out.println(smallest);
      t--;
    }

  }
}
