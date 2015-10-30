import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Manasa {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		int count = 0;

		while (count < T) {
			long n = in.nextLong();
			long a = in.nextLong();
			long b = in.nextLong();

			long gaps = n - 1;

			ArrayList<Long> resultList = new ArrayList<Long>();

			for (int i = 1; i <= gaps; i++) {
				long result = (a * i) + (b * (gaps - i));
				if (!resultList.contains(result)) {
					resultList.add(result);
				}

				long result2 = (b * i) + (a * (gaps - i));
				if (!resultList.contains(result2)) {
					resultList.add(result2);
				}
			}

			Collections.sort(resultList);

			//Arrays.sort(returnValue);
			System.out.println(resultList);

			count++;
		}

		in.close();
	}
}