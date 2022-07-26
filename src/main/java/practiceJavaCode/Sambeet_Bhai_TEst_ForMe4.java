package practiceJavaCode;

import java.util.ArrayList;
import java.util.HashSet;

public class Sambeet_Bhai_TEst_ForMe4 {

	public static void main(String[] args) {

		String word = "monotonous";

		String[] wordArr = word.split("");

		HashSet<String> WordSet = new HashSet<>();

		for (int i = 0; i < wordArr.length; i++) {
			WordSet.add(wordArr[i]);

		}

		System.out.println(WordSet);

	}

}

// we could have done simply with the help of sets , it wont allow duplicate characters no!
