import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockBeast {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		int count = 1;

		while (count <= t) {
			int n = in.nextInt();

			StringBuilder ans = new StringBuilder("");

			for (int fives = n; fives >= 0; fives--) {
				int threes = n - fives;
				if (fives % 3 == 0 && threes % 5 == 0) {
					for (int k = 0; k < fives; k++)
						ans.append("5");
					for (int k = 0; k < threes; k++)
						ans.append("3");
					break;
				}
			}

			if (ans.toString().length() == 0) {
				System.out.println("-1");
			} else {
				System.out.println(ans.toString());
			}
		}
	}
}