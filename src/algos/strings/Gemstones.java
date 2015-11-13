package algos.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int backup = n;
    Set<Character> gemstones = new HashSet<Character>();
    while (n > 0) {
      String s = in.next();
      Set<Character> currentStones = new HashSet<Character>();
      for (int i = 0; i < s.length(); i++) {
        if (n == backup) {
          gemstones.add(s.charAt(i));
        } else {
          currentStones.add(s.charAt(i));
        }
      }
      if (n != backup)
        gemstones.retainAll(currentStones);
      n--;
    }

    System.out.println(gemstones.size());
  }
}
