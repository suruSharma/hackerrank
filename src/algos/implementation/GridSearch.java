package algos.implementation;

import java.util.Scanner;

public class GridSearch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t > 0) {
      int gridRow = in.nextInt();
      int gridCol = in.nextInt();
      String[] grid = new String[gridRow];
      for (int i = 0; i < gridRow; i++) {
        grid[i] = in.next();
      }

      int r = in.nextInt();
      int c = in.nextInt();
      String[] pattern = new String[r];
      for (int i = 0; i < r; i++) {
        pattern[i] = in.next();
      }

      int index = -1;
      int row = -1;
      boolean found = false;
      for (int i = 0; i < gridRow; i++) {
        index = grid[i].indexOf(pattern[0]);
        if (index > -1) {
          row = i;
          break;
        }
      }

      for (int i = 1; i < r; i++) {//pattern
        String p = pattern[i];
        String g = grid[i + row];
        if (g.indexOf(p) == index) {
          found = true;
        } else {
          found = false;
          break;
        }
      }
      if (found) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

      t--;
    }
  }
}
