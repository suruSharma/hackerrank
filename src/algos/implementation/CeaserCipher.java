package algos.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CeaserCipher {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String s = in.next();
    int k = in.nextInt();
    char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    char[] input = s.toCharArray();
    char[] output = new char[input.length];
    if (k > 26) {
      k = k - ((k / 26) * 26);
    }
    for (int i = 0; i < input.length; i++) {
      if (Character.isLetter(input[i])) {
        if (Character.isUpperCase(input[i])) {
          int index = input[i] - 'A';
          int replacementIndex = (index % 26) + k;
          if (replacementIndex >= 26) {
            replacementIndex = replacementIndex - 26;
          }
          output[i] = upper[replacementIndex];
        } else {
          int index = input[i] - 'a';
          int replacementIndex = (index % 26) + k;
          if (replacementIndex >= 26) {
            replacementIndex = replacementIndex - 26;
          }
          output[i] = lower[replacementIndex];
        }
      } else {
        output[i] = input[i];
      }
    }
    String result = new String(output);
    System.out.println(result);
  }
}
