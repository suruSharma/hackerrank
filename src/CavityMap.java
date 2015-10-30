import java.util.Arrays;
import java.util.Scanner;

public class CavityMap {
	public static void constructArray(int[][] map, String input, int i) {
		int n = input.length();

		char[] charInput = input.toCharArray();
		for (int j = 0; j < n; j++) {
			map[i][j] = Integer.parseInt(charInput[j] + "");
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[][] map = new int[n][n];

		String[][] result = new String[n][n];

		for (int i = 0; i < n; i++) {
			String input = in.next();

			constructArray(map, input, i);
		}

		//System.out.println(Arrays.toString(map));
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				int cell = map[i][j];

				int up = map[i - 1][j];
				int down = map[i + 1][j];

				int left = map[i][j - 1];
				int right = map[i][j + 1];

				if (up < cell && down < cell && left < cell && right < cell) {
					result[i][j] = "X";
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (result[i][j] == null) {
					System.out.print(map[i][j]);
				} else
					System.out.print("X");
			}
			System.out.println();
		}
	}
}