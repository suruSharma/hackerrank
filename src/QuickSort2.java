import java.util.*;

public class QuickSort2 {

	static void quickSort(int[] ar, int start, int end) {
		if (start >= end)
			return;

		int pivot = ar[start];

		int b = start;
		int t = end;

		while (b < t) {
			while (ar[b] < pivot) {
				b++;
			}
			while (ar[t] > pivot) {
				t--;
			}

			if (b < t)
				swap(ar, b, t);
			
			//printArray(ar);
		}

		//if (start != t)
			//swap(ar, start, t);

		quickSort(ar, start, t - 1);
		quickSort(ar, t + 1, end);

	}

	static void swap(int[] ar, int l, int u) {
		ar[l] = ar[l] + ar[u];
		ar[u] = ar[l] - ar[u];
		ar[l] = ar[l] - ar[u];
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar, 0, n - 1);

		printArray(ar);
	}
}
