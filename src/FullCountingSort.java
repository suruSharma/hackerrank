/*import java.util.Scanner;

public class FullCountingSort {

	public static void main(String[] args) {
		
 * Enter your code here. Read input from STDIN. Print output to STDOUT.
 * Your class should be named Solution.
		 
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] arr = new int[100];
		String[] op = new String[20];

		for (int i = 0; i < n; i++) {

			int val = in.nextInt();
			String ip = in.next();
			if (i < n / 2) {
				if (op[val] != null)
					op[val] = op[val].concat("- ");
				else
					op[val] = "- ";
			} else {
				if (op[val] != null)
					op[val] = op[val].concat(ip + " ");
				else
					op[val] = ip + " ";
			}

		}

		for (String s : op) {
			if (s != null)
				System.out.print(s);
		}

	}

}
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author akshay
 */
public class FullCountingSort {
	public static void main(String[] args) {
		Scanner sco = new Scanner(System.in);
		int siz = sco.nextInt();
		String[] mak = new String[siz];
		int[] mak1 = new int[siz];
		int count[] = new int[100];
		String[] fin = new String[siz];
		Arrays.fill(mak, "-");
		for (int i = 0; i < siz; i++) {
			mak1[i] = sco.nextInt();
			count[mak1[i]]++;
			if (i >= siz / 2)
				mak[i] = sco.next();
			else
				sco.next();
		}
		for (int i = 1; i < 100; i++)
			count[i] += count[i - 1];
		for (int i = siz - 1; i >= 0; i--) {
			count[mak1[i]]--;
			fin[count[mak1[i]]] = mak[i];
		}
		StringBuilder sb = new StringBuilder();
		for (String i : fin)
			sb.append(i).append(" ");
		System.out.println(sb.toString());
	}
}