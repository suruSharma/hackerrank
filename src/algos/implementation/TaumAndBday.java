package algos.implementation;

import java.util.Scanner;

public class TaumAndBday {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t > 0) {
      long black = in.nextLong();
      long white = in.nextLong();
      long blackCost = in.nextLong();
      long whiteCost = in.nextLong();
      long convert = in.nextLong();
      
      //Converting is equal to costlier
      if (convert >= blackCost && convert >= whiteCost) {
        System.out.println((black * blackCost) + (white * whiteCost));
      }
      else{
        long totalBlack = black * blackCost;
        long totalWhite = white * whiteCost;
        long blackToWhite = white * (blackCost + convert);
        long whiteToBlack = black * (whiteCost + convert);

        long blackAndWhite = totalBlack + totalWhite;
        long whiteWhiteToBlack = totalWhite + whiteToBlack;
        long blackBlackToWhite = totalBlack + blackToWhite;

        long res = blackAndWhite < whiteWhiteToBlack ? (blackAndWhite < blackBlackToWhite ? blackAndWhite
            : blackBlackToWhite)
            : whiteWhiteToBlack < blackBlackToWhite ? whiteWhiteToBlack : blackBlackToWhite;
        /*
         * if (blackAndWhite < whiteWhiteToBlack) { if (blackAndWhite <
         * blackBlackToWhite) { System.out.println(blackAndWhite); } else {
         * System.out.println(blackBlackToWhite); } } else { if (whiteWhiteToBlack
         * < blackBlackToWhite) { System.out.println(whiteWhiteToBlack); }else{
         * System.out.println(blackBlackToWhite); } }
         */
        System.out.println(res);
      }
      

      t--;
    }

  }
}
