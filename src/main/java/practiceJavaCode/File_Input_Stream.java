package practiceJavaCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class File_Input_Stream {

	public static void main(String[] args) throws IOException {

		int requiredColumnNo = 0;
		int finalValue = 0;

		String headerText = "Examiner_ID";

		File file = new File(System.getProperty("user.dir") + "\\I-O_StreamRelated\\OVANT.W5N_2022_07_18.txt");
////		System.out.println(System.getProperty("user.dir"));

		InputStream input = new FileInputStream(file);
		System.out.println(input.available());
		byte[] data = new byte[input.available()];
		input.read(data);

		String text = new String(data);

		System.out.println("$$" + text.length());

		System.out.println(text); // prints all the stuff from the file

		List<String> notes = Arrays.asList(text.split("\n")); // WE ARE CONVERTING THE arrays as kist and splitting at
																// every new line

		String headerString[] = notes.get(0).split("\t"); // we will get the all hedings firest line that why index 0 ,
															// Nowe are splitting at the Tab space

		for (int i = 0; i < headerString.length; i++) { // we are cooking in which column index does that required
														// column exists

			if (headerString[i].equalsIgnoreCase(headerText)) {

				requiredColumnNo = i; // we figured out the column and assigning the same int to one variable
				break; // since there is a parent for loop for if , so we want to terminate once done

			}

		}

		for (int i = 0; i < notes.size(); i++) {

			String[] dataString = notes.get(i).split("\t"); // here the values of the dataString wil be like [64644464,examinee,all the stuff from the line in splits]

			System.out.println(dataString[requiredColumnNo]); // and we are fetching the one which is matching with the index of the HEaader Index

		}

		input.close();

		/*
		 * ======================== ALSO WE CAN USE THE FOLLOWING PROCESS TOO
		 * ==============================
		 */

		/*
		 * File file = new File(System.getProperty("user.dir") +
		 * "\\I-O_StreamRelated\\TSTOBS.W5N_2022_07_11.txt");
		 * 
		 * InputStream input = new FileInputStream(file);
		 * 
		 * int i = input.read();
		 * 
		 * while (i != -1) { // System.out.println("Second Method "+(char)i);
		 * System.out.print((char) i); i = input.read(); }
		 * 
		 * input.close();
		 * 
		 * }
		 */

	}
}
