package algos.implementation;

import java.util.Scanner;

public class TimeInWords {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int h = in.nextInt();
    int m = in.nextInt();

    String[] hour = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve" };
    String[] minutes = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
        "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
        "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine" };
    StringBuffer res = new StringBuffer();
    //5:00
    if (m == 0) {
      res.append(hour[h - 1]).append(" o' clock");
    } else if(m == 15){
      res.append("quarter past ").append(hour[h-1]);
    }else if (m == 30) {
      res.append("half past ").append(hour[h - 1]);
    } else if (m == 45) {
      res.append("quarter to ").append(hour[h]);
    } else {
      if (m == 1) {
        res.append(minutes[0]).append(" minute past ").append(hour[h - 1]);
      } else {
        int diff = 60 - m;
        if (diff > 30) {
          res.append(minutes[m - 1]).append(" minutes past ").append(hour[h - 1]);
        } else {
          res.append(minutes[diff - 1]).append(" minutes to ").append(hour[h]);
        }
      }
    }
    System.out.println(res.toString());

    //5:30

  }
}
