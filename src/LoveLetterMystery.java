import java.util.Scanner;

public class LoveLetterMystery {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);

		int testCases = in.nextInt();
		int n = 0;
		while (n < testCases) {
			String test = in.next();
			int len = test.length();

			if (isPalindrome(test)) {
				System.out.println(0);
			} else {
				int count = 0;
				for (int i = 0; i < len/2; i++) // abcd
				{
					char front = test.charAt(i);
					char back = test.charAt(len - i - 1);
					// if(front < back)
					// {
					count = count + Math.abs((back - front));
					// }
					// else
				}
				System.out.println(count);
			}

			n++;
		}

		in.close();
	}

	public static boolean isPalindrome(String s) {
		int n = s.length();

		int front = 0;
		int back = n - 1;
		while (front <= back) {
			if (s.charAt(front) == s.charAt(back)) {
				front++;
				back--;
			} else
				return false;
		}

		return true;
	}
}
