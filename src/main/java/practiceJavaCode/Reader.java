package practiceJavaCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) throws IOException {

		File file = new File(System.getProperty("user.dir") + "\\I-O_StreamRelated\\read.csv");

		FileReader input = new FileReader(file);

		char[] array = new char[(int) file.length()];

		input.read(array);

		System.out.println(array);
		
		System.out.println(array.length);

//		int i = input.read();
//
//		while (i != -1) {
////			System.out.println("Second Method " + (char) i);
//			System.out.print((char) i);
//			i = input.read();
//		}

		input.close();

	}

}
