package algos.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gemstones {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int backup=n;
    int[] letters = new int[26];

    while (n > 0) {
      String s = in.next();
      List<Character> alphabets = new ArrayList<Character>();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if(!alphabets.contains(c)){
          letters[c-97]++;
          alphabets.add(c);
        }
      }
      n--;
    }
    
    int count=0;
    for(int i = 0;i<letters.length;i++){
      if(letters[i] >= backup){
        count++;
      }
    }

    System.out.println(count);
  }
}
