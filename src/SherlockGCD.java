import java.util.Arrays;
import java.util.Scanner;

public class SherlockGCD {

	public static void main(String ars[]) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		int count = 1;

		while (count <= t) {

			int n = in.nextInt();

			int[] values = new int[n];
			boolean[] status = new boolean[n];

			Arrays.fill(status, true);

			for (int i = 0; i < n; i++) {
				values[i] = in.nextInt();
			}

			boolean flag = false;

			Arrays.sort(values);
			if (values[0] == 1) {
				flag = true;
			} else {
				for (int i = 1; i < n; i++) {
					int a = values[i];
					for (int j = i + 1; j < n; j++) {
						int b = values[j];
						int result = gcd(a, b);
						if (result == 1) {
							flag = true;
							break;
						}
					}
				}
			}

			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			count++;
		}

	}

	public static int gcd(int a, int b) {
		/*
		 * int a = 88968; int b = 64893;
		 */

		while (b > 0) {
			int c = a % b;
			a = b;
			b = c;
		}

		return a;
	}
}
