import java.io.*;
import java.util.*;

public class Encryption {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);

		String input = in.next();

		int l = input.length();

		double sqrtL = Math.sqrt(l);

		int rows = (int) Math.floor(sqrtL);

		int cols = (int) Math.ceil(sqrtL);

		while (rows <= cols) {
			if (rows * cols >= l) {
				break;
			} else {
				rows++;
			}
		}

		char[][] result = new char[rows][cols];

		int index = 0;
		for (int i = 0; i < rows && index < l; i++) {
			for (int j = 0; j < cols && index < l; j++) {
				result[i][j] = input.charAt(index);
				index++;
			}
		}

		/*
		 * for (int i = 0; i < rows; i++) { for (int j = 0; j < cols; j++) {
		 * System.out.print(result[i][j]+" "); } System.out.println(); }
		 */

		// System.out.println(Arrays.deepToString(result));
		for (int j = 0; j < cols; j++) {
			String output = "";
			for (int i = 0; i < rows; i++) {
				//System.out.println(result[i][j]);
				if (result[i][j] > 65)
					output = output + result[i][j];
			}

			System.out.print(output + " ");
		}
	}
}