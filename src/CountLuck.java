import java.io.*;
import java.util.*;

public class CountLuck {

	private static int dfs(char[][] forrest, int r, int c, int n, int m,
			boolean[][] visited, int count) {
		visited[r][c] = true;
		// System.out.println("At " + r + " " + c);
		if (forrest[r][c] == '*') {
			return count;
		}
		int[] dirX = { 0, 0, 1, -1 };
		int[] dirY = { 1, -1, 0, 0 };
		int dirs = 0;
		for (int i = 0; i < 4; i++) {
			int row = r + dirX[i];
			int col = c + dirY[i];
			if (row < n && col < m && row >= 0 && col >= 0
					&& !visited[row][col] && forrest[row][col] != 'X') {
				dirs++;
			}

		}
		// System.out.println("dirs = " + dirs);
		boolean wand = false;
		if (dirs > 1) {
			wand = true;
		}
		for (int i = 0; i < 4; i++) {

			int row = r + dirX[i];
			int col = c + dirY[i];
			int result = -1;
			if (row < n && col < m && row >= 0 && col >= 0
					&& !visited[row][col] && forrest[row][col] != 'X') {
				// System.out.println("visit " + row + " " + col);
				result = dfs(forrest, row, col, n, m, visited, wand ? count + 1
						: count);
				// System.out.println("Got result from visit " + row + " " + col
				// + " = " + result);
				if (result != -1) {
					return result;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();
			char[][] forrest = new char[n][m];
			boolean[][] visited = new boolean[n][m];
			int startRow = 0, startCol = 0;
			for (int i = 0; i < n; i++) {
				String line = sc.nextLine();
				for (int j = 0; j < m; j++) {
					forrest[i][j] = line.charAt(j);
					if (line.charAt(j) == 'M') {
						startRow = i;
						startCol = j;
					}
					visited[i][j] = false;
				}
			}
			int k = sc.nextInt();
			int result = dfs(forrest, startRow, startCol, n, m, visited, 0);
			if (result == k) {
				System.out.println("Impressed");
			} else {
				System.out.println("Oops!");
			}
		}
	}
}