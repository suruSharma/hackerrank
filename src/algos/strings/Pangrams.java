package algos.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] alpha = new String[26];
    String s = in.nextLine();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isUpperCase(c)) {
        int intVal = (int) c;
        alpha[intVal - 65] = "true";
      } else if (Character.isLowerCase(c)) {
        int intVal = (int) c;
        alpha[intVal - 97] = "true";
      }
    }

    if(Arrays.asList(alpha).contains(null)){
      System.out.println("not panagram");
    }else{
      System.out.println("panagram");
    }
  }

}
