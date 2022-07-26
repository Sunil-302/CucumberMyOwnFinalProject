package practiceJavaCode;

import java.util.ArrayList;

public class Sambeet_Bhai_TEst_ForMe3 {

	public static void main(String[] args) {

		/*
		 * Step_1) compare eatch letter with the remaining and if its duplicate remove
		 * print th efinal word
		 *
		 */

		String word = "monotonous";

		String[] wordArr = word.split("");

		ArrayList<String> wordList = new ArrayList<>();

		for (int i = 0; i < wordArr.length; i++) {
			wordList.add(wordArr[i]);

		}
		
		System.out.println(wordList);

		for (int i = 0; i < wordArr.length; i++) {

			for (int j = i + 1; j < (wordArr.length) - 1; j++) {

				if (wordArr[i].equalsIgnoreCase(wordArr[j])) {

//					System.out.println(wordArr[i]);
					
					wordList.remove(wordArr[i]);
					

					break;

				}
			}

		}
		
		System.out.println(">>>"+wordList+"<<<");

	}
	
	
}

// we could have done simply with the help of sets , it wont allow duplicate characters no!



