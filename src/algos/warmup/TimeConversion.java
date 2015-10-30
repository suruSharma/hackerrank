package algos.warmup;

import java.util.Scanner;

public class TimeConversion {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String input = in.next();
    String pm = "PM";
    boolean evening = pm.equals(input.subSequence(input.length() - 2, input.length()));
    String hour = input.substring(0, 2);
    //System.out.println(hour);
    String result = "";
    if (evening) {
      if (hour.equals("12")) {
        System.out.println(input.substring(0, input.length() - 2));
      } else {
        int hh = Integer.parseInt(hour) + 12;
        result = hh > 23 ? "00" : hh + "";
        System.out.println(result + input.substring(2, input.length() - 2));
      }

    } else {
      if (hour.equals("12")) {
        result = "00";
        System.out.println(result + input.substring(2, input.length() - 2));
      } else {
        System.out.println(input.substring(0, input.length() - 2));
      }
    }

  }
}
