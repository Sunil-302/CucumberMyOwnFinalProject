package practiceJavaCode;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Give me sa alphabet = ");

		char alphabet = reader.next().charAt(0);

		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {

			System.out.println("Ovel");
		} else {
			System.out.println("consonent");

		}

	}

}
