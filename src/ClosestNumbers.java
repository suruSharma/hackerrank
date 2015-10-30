import java.io.*;
import java.util.*;

public class ClosestNumbers {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);

		int min = Integer.MAX_VALUE;
		LinkedList<Integer> res = new LinkedList<Integer>();
		int count = -1;
		for (int i = 0; i < n - 1; i++) {
			int diff = Math.abs(arr[i] - arr[i + 1]);
			if (diff < min) {
				count = -1;
				min = diff;
				res.clear();
				res.add(arr[i]);
				res.add(arr[i+1]);
				//res[++count] = arr[i];
				//res[++count] = arr[i + 1];
			} else if (diff == min) {
				res.add(arr[i]);
				res.add(arr[i+1]);
			}
		}

		Iterator it = res.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}
}