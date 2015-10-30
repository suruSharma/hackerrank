import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class LonelyInteger {
	static int lonelyinteger(int[] a) {
		Hashtable<Integer, Integer> values = new Hashtable<Integer, Integer>();
		if (a.length == 1)
			return a[0];
		else {

			for (int i = 0; i < a.length; i++) {
				int val = a[i];

				if (values.containsKey(val)) {
					int count = values.get(val);
					values.replace(val, count + 1);
				} else {
					values.put(val, 1);
				}
			}

		}

		Enumeration<Integer> keys = values.keys();

		while (keys.hasMoreElements()) {
			int key = keys.nextElement();

			int count = values.get(key);

			if (count == 1) {
				return key;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _a_size = Integer.parseInt(in.nextLine());
		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = lonelyinteger(_a);
		System.out.println(res);

	}
}
