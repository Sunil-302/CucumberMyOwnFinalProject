package practiceJavaCode;

public class Sambeet_Bhai_TEst_ForMe2 {

	public static void main(String[] args) {

		/*
		 * Step_1) splitting the sentances at spaces and saving in an array step_2) now
		 * we have to pick each word and reverse it
		 */

		String word = "I love Driving Cars";

		String[] wordSplit = word.split(" ");

		System.out.println(wordSplit.length);

		for (int i = 0; i < wordSplit.length; i++) {

//			System.out.println(wordSplit[i]);

			for (int j = (wordSplit[i].length())-1; j >=0; j--) {

				System.out.print(wordSplit[i].charAt(j));

			}

			System.out.print("\t");

		}

	}
}
