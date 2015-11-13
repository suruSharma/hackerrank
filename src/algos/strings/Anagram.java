package algos.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    while (t > 0) {
      String input = in.next();
      int len = input.length();
      if (len % 2 == 1) {
        System.out.println(-1);
        t--;
        continue;
      }
      String s1 = input.substring(0, (len / 2));
      String s2 = input.substring((len / 2), len);

      char[] s1Arr = s1.toCharArray();
      char[] s2Arr = s2.toCharArray();
      int count = 0;
      Map<Character, Integer> s1Map = new HashMap<Character, Integer>();
      Map<Character, Integer> s2Map = new HashMap<Character, Integer>();

      for (int i = 0; i < len / 2; i++) {
        if (s1Map.containsKey(s1.charAt(i))) {
          s1Map.put(s1.charAt(i), s1Map.get(s1.charAt(i)) + 1);
        } else {
          s1Map.put(s1.charAt(i), 1);
        }

        if (s2Map.containsKey(s2.charAt(i))) {
          s2Map.put(s2.charAt(i), s2Map.get(s2.charAt(i)) + 1);
        } else {
          s2Map.put(s2.charAt(i), 1);
        }
      }

      for (Character c : s2Map.keySet()) {
        int val = s2Map.get(c);

        if (!s1Map.containsKey(c)) {
          count++;
        } else {
          int s1Val = s1Map.get(c);
          if (s1Val < val) {
            count+=(val-s1Val);
          }
        }
      }
      System.out.println(count);
      t--;
    }
  }
}
