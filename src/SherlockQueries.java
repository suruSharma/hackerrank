import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockQueries {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		int[] A = new int[n];
		int[] B = new int[m];
		int[] C = new int[m];

		for (int i = 0; i < n; i++)
			A[i] = in.nextInt();

		for (int i = 0; i < m; i++)
			B[i] = in.nextInt();

		for (int i = 0; i < m; i++)
			C[i] = in.nextInt();

		int cIndex = 0;
		/*for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if ((j + 1) % B[i] == 0)
					A[j] = A[j] * C[i];*/
		
		

		for (int i = 0; i < n; i++)
			System.out.print(A[i] + " ");
	}
}