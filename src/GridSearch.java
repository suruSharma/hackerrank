import java.io.*;
import java.util.*;

public class GridSearch {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {
			int gridRow = in.nextInt();

			int gridCol = in.nextInt();

			String[] grid = new String[gridRow];

			// ArrayList<ArrayList<String>> indices = new
			// ArrayList<ArrayList<String>>();

			for (int i = 0; i < gridRow; i++) {
				grid[i] = in.next();
			}

			int patternRow = in.nextInt();

			int patternCol = in.nextInt();

			String[] pattern = new String[patternRow];

			for (int i = 0; i < patternRow; i++) {
				pattern[i] = in.next();
			}

			int startRow = -1;
			int startCol = -1;
			String p = pattern[0];

			for (int j = 0; j < gridRow; j++) {
				String g = grid[j];

				if (g.contains(p)) {
					startRow = j;
					startCol = g.indexOf(p);
					break;
				}
			}

			boolean flag = false;
			if (startRow != -1) {
				for (int i = 1; i < patternRow; i++) {
					String pt = pattern[i];

					String gr = grid[startRow + i];

					if (gr.indexOf(pt) == startCol) {
						flag = true;

					} else {
						flag = false;
						break;
					}
				}
			}
			
			if(flag)
			{
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		//	System.out.println(Arrays.deepToString(grid));
		//	System.out.println(Arrays.deepToString(pattern));
		}
	}
}