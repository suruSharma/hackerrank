import java.util.*;

public class CountLuckSelf {

	public static int dfs(int r, int c, char[][] forest, boolean[][] visited,
			int count, int n, int m) {

		visited[r][c] = true;

		int[] dirX = { 0, 0, 1, -1 };// up, down
		int[] dirY = { 1, -1, 0, 0 };// right, left

		if (forest[r][c] == '*') {
			return count;
		}
		int options = 0;
		boolean wandUsed = false;
		for (int i = 0; i < 4; i++) {
			int row = r + dirX[i];
			int col = c + dirY[i];

			if (row < n && col < m && row >= 0 && col >= 0
					&& forest[row][col] != 'X' && !visited[row][col]) {
				options++;
			}
		}

		if (options > 1) {
			wandUsed = true;
		}

		for (int i = 0; i < 4; i++) {
			int row = r + dirX[i];
			int col = c + dirY[i];

			if (row < n && col < m && row >= 0 && col >= 0
					&& forest[row][col] != 'X' && !visited[row][col]) {
				int result = dfs(row, col, forest, visited,
						wandUsed ? count + 1 : count, n, m);

				if (result != -1) {
					return result;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();

			int m = in.nextInt();

			char[][] forest = new char[n][m];
			boolean[][] visited = new boolean[n][m];

			int mRow = -1;
			int mCol = -1;
			for (int i = 0; i < n; i++) {
				String input = in.next();

				forest[i] = input.toCharArray();

				if (input.contains("M")) {
					mRow = i;
					mCol = input.indexOf("M");
				}

			}

			int k = in.nextInt();

			int result = dfs(mRow, mCol, forest, visited, 0, n, m);

			if (result == k) {
				System.out.println("Impressed");
			} else {
				System.out.println("Oops!");
			}

		}

	}
}
