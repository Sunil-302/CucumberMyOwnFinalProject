package practiceJavaCode;

public class CheckWhetherCharacterisAlphabetorNot {

	public static void main(String[] args) {

		// METHOD _ 01

		char ch = '@';

		Object outPut = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? ch + " Is an Alphabet"
				: ch + " is Not an Alphabet";

		System.out.println(outPut);

		// METHOD _ 02 { Check Alphabet using isAlphabetic() Method }

		if (Character.isAlphabetic(ch)) {

			System.out.println(" IS an Alphabet");
		} else {
			System.out.println("Not an alphabet");
		}

	}

}
