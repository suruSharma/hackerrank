import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

public class ZeroOne {

	public static void main(String[] args) {

		//int n = 9999;
		
		System.out.println(new Date().toString());
		
		BigInteger n = new BigInteger("99");
		ArrayList<String> useful = new ArrayList<String>();

		ArrayList<String> backup = null;

		boolean flag = true;
		BigInteger answer = new BigInteger("-1");

		BigInteger bigZero = new BigInteger("0");
		BigInteger bigOne = new BigInteger("1");
		int position = 1;
		while (flag) {
			if (useful.size() > 0) {

				backup = (ArrayList<String>) useful.clone();
				useful.clear();

				for (int j = 0; j < backup.size() && flag; j++) {
					String num = backup.get(j);
					for (int i = 0; i < 10; i++) {
						String newNumber = i + "" + num;

						//System.out.println(newNumber);
						//long intNumber = Long.parseLong(newNumber);
						
						BigInteger intNumber = new BigInteger(newNumber);

						BigInteger product = intNumber.multiply(n);

						if (checkValid(product)) {
							flag = false;
							answer = product;
							break;
						} else {
							BigInteger digit = extractDigit(product, position);
							if (digit.equals(bigZero) || digit.equals(bigOne)) {
								useful.add(newNumber);
							}
						}

					}
				}

				position++;
			} else {
				for (int i = 0; i < 10; i++) {
					BigInteger product = n.multiply(new BigInteger(i+""));

					if (checkValid(product)) {
						flag = false;
						answer = product;
						break;
					} else {
						BigInteger digit = extractDigit(product, position);
						if (digit.equals(bigZero) || digit.equals(bigOne)) {
							useful.add(i + "");
						}
					}
				}

				position++;
			}
		}

		System.out.println(answer);
		System.out.println(new Date().toString());
	}

	static boolean checkValid(BigInteger n) {
		String num = n + "";

		if ((num.contains("2") || num.contains("3") || num.contains("4")
				|| num.contains("5") || num.contains("6") || num.contains("7")
				|| num.contains("8") || num.contains("9"))
				|| (!(num.contains("0") && num.contains("1")))) {
			return false;
		}
		return true;
	}

	static BigInteger extractDigit(BigInteger number, int position) {
		BigInteger returnValue = new BigInteger("-1");

		String num = number + "";
		BigInteger backup = number;

		int zeroes = num.length();

		if (position == 1) {
			return number.mod(new BigInteger(10+""));
		} else {
			int i = 1;

			// int answer = -1;
			while (i != position) {
				backup = backup.divide(new BigInteger(10+""));
				returnValue = backup.mod(new BigInteger(10+""));
				i++;
			}
		}
		return returnValue;
	}
}
