package algos.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

      List<Character> s1List = new ArrayList<Character>();
      List<Character> s2List = new ArrayList<Character>();

      for (int i = 0; i < len / 2; i++) {
        s1List.add(s1.charAt(i));
        s2List.add(s2.charAt(i));
      }

      for (int i = 0; i < s1List.size(); i++) {
        Character ch = s1List.get(i);
        if (s2List.contains(ch)) {
          s2List.remove(ch);
        }
      }
      System.out.println(s2List.size());

      t--;
    }
  }
}
