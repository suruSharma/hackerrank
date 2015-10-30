package algos.implementation;

import java.util.Scanner;

public class ChocolateFest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t > 0) {
      int n = in.nextInt();
      int c = in.nextInt();
      int m = in.nextInt();//2
      int chocolates = n/c;//3
      int wrapper = chocolates;//3
      while(wrapper >= m){
        wrapper = wrapper - m;//3-2 = 1
        chocolates++;//4
        wrapper = wrapper+1;//2
      }
      System.out.println(chocolates);
      t--;
    }
  }
}
