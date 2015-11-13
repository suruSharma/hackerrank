package algos.strings;

import java.util.Scanner;

public class FunnyString {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    while (t > 0) {
      String s = in.next();
      String r = (new StringBuffer(s).reverse()).toString();
      boolean flag=true;
      for (int i = 1; i < s.length(); i++) {
        if (!(Math.abs(s.charAt(i) - s.charAt(i - 1)) == Math.abs(r.charAt(i) - r.charAt(i - 1)))) {
          flag=false;
          break;
        }
      }      
      if(flag){
        System.out.println("Funny");
      }else{
        System.out.println("Not Funny");
      }
      t--;
    }
    
    
  }

}
