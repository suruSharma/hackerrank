package algos.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while (n > 0) {
      String s1 = in.next();
      String s2 = in.next();

      Set<Character> alphaS1 = new HashSet<Character>();
      for(int i =0;i<s1.length();i++){
        alphaS1.add(s1.charAt(i));
      }
      
      Set<Character> alphaS2 = new HashSet<Character>();
      for(int i =0;i<s2.length();i++){
        alphaS2.add(s2.charAt(i));
      }
      
      alphaS1.retainAll(alphaS2);

      if (alphaS1.size() > 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
      n--;
    }
  }
}
