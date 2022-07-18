package practiceJavaCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class File_Input_Stream {

	public static void main(String[] args) throws IOException {

//		File file = new File(System.getProperty("user.dir") + "\\I-O_StreamRelated\\TSTOBS.W5N_2022_07_11.txt");
////		System.out.println(System.getProperty("user.dir"));
//
//		InputStream input = new FileInputStream(file);
		
//		System.out.println(input.available());
//
//		byte[] data = new byte[input.available()];
//
//		input.read(data);
//		
//		String text = new String(data);
		
	

		

//		System.out.println("$$" + text.length());
				
//		System.out.println(text);
//
//		input.close();

		/*
		 * ======================== ALSO WE CAN USE THE FOLLOWING PROCESS TOO
		 * ==============================
		 */

		File file = new File(System.getProperty("user.dir") + "\\I-O_StreamRelated\\TSTOBS.W5N_2022_07_11.txt");

		InputStream input = new FileInputStream(file);
			
		int i = input.read();

		while (i != -1) {
//			System.out.println("Second Method "+(char)i);
			System.out.print((char) i);
			i = input.read();
		}

		input.close();	

	}

}
