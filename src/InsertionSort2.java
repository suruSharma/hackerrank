import java.io.*;
import java.util.*;

public class InsertionSort2 {

	public static void insertionSortPart2(int[] ar) {
		// Fill up the code for the required logic here
		// Manipulate the array as required
		// The code for Input/Output is already provided

		int n = ar.length;

		for (int i = 1; i < n; i++) {
			int localIndex = i;
			int v = ar[i];

			while (localIndex > 0 && ar[localIndex - 1] > v) {
				ar[localIndex] = ar[localIndex - 1];
				localIndex = localIndex - 1;
			}

			ar[localIndex] = v;

			//System.out.println("When v = " + v);
		//	printArray(ar);
		}

		printArray(ar);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
