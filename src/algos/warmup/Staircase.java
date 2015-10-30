package algos.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    for (int i = 0; i < t; i++) {

      int stars = i + 1;
      int spaces = t - stars;

      while (spaces > 0) {
        System.out.print(' ');
        spaces--;
      }

      while (stars > 0) {
        System.out.print("#");
        stars--;
      }
      
      System.out.println();
    }
  }
}