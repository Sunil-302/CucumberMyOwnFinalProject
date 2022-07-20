package practiceJavaCode;

public class Sambeet_Bhai_TEst_ForMe {

	public static void main(String[] args) {

		String name = "My NAme IS sunil";

//		System.out.println(name);

		char ch = 's';

		System.out.println(name.length());

		System.out.println("========================================================");

		for (int i = name.length() - 1; i >= 0; i--) {

			System.out.print(name.charAt(i));

		}

		System.out.println("");

		System.out.println("=======================Method01=================================");

//		@mETHOD_01
//		HERE I AM REMOVINF THE CAPITAL LETTERs AND SPACES FROM MY NAME 

		for (int i = 0; i < name.length(); i = i + 2) {

//			System.out.println(i);

			if (!(name.charAt(i) >= 65 && name.charAt(i) <= 90) && !(name.charAt(i) == ' '))

				System.out.print(name.charAt(i));

		}

		System.out.println("");

		System.out.println("===========================Method02=============================");

//		@mETHOD_02
//		HERE I AM REMOVINF THE CAPITAL LETTERs AND SPACES FROM MY NAME 

		for (int i = 0; i < name.length(); i = i + 2) {

			if (!Character.isUpperCase((name.charAt(i))) && !Character.isSpace(name.charAt(i))) {

				System.out.print(name.charAt(i));
			}

		}
	}
}
