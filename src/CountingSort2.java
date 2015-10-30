import java.io.*;
import java.util.*;

public class CountingSort2 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] arr = new int[100];

		for (int i = 0; i < n; i++) {
			int val = in.nextInt();

			arr[val]++;
		}

		for (int i = 0; i < 100; i++) {
			int val = arr[i];
			if (val > 0) {
				while (val-- > 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}