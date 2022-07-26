package practiceJavaCode;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		int x = 20, y = 7, z = 21;

		int large = x > ((y > z) ? y : z) ? x : ((y > z) ? y : z);

		System.out.println(large);

		System.out.println("-------------------------------------------------------------");

		// Largest of 4 numbers

		int a = 30, b = 31, c = 32, d = 33;

		int larger = d > (a > ((b > c) ? b : c) ? a : ((b > c) ? b : c)) ? d
				: (a > ((b > c) ? b : c) ? a : ((b > c) ? b : c));

		System.out.println(larger);

		System.out.println("-----------------------------If Else--------------------------------");

//		finding largest of 4 by if else 

		int greater;

		if (a > b && a > c && a > d) {

			greater = a;
		}

		else if (b > a && b > c && b > d) {

			greater = b;
		}

		else if (c > a && c > b && c > d) {

			greater = c;
		} else {
			greater = d;
		}

		System.out.println(greater);

//		If Given arrey of Numberts whats the greater

		System.out.println("-------------------larhey in a list--------------------------------");

		int[] list = { 140, 4, 45, 63, 78, 25, 1, 1000, 64 };

		/*
		 * compare first number with remaining numbers and print if its greater compare
		 * the second with the remaining numbers and print if grater
		 */

//		better go for sort methods

		int big = 0;

		for (int i = 0; i < list.length; i++) {

			if (big < list[i]) {
				big = list[i];

			}

		}
		System.out.println(big);

	}

}
