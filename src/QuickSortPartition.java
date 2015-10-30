import java.util.*;

public class QuickSortPartition {

	static void partition(int[] ar) {
		int p = ar[0];
        int n = ar.length;
        for(int i = 1;i<n;i++)
        {
            int lastIndex = i;
            int v = ar[i];
            while(lastIndex > 0 && v < p && ar[lastIndex-1] >= p)
            {
                ar[lastIndex] = ar[lastIndex-1];
                lastIndex = lastIndex-1;
            }
            
            ar[lastIndex] = v;
        }
        
        printArray(ar);
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
		partition(ar);
	}
}
