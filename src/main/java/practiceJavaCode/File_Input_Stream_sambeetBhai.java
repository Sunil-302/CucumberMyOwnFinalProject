package practiceJavaCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class File_Input_Stream_sambeetBhai {

	public static void main(String[] args) throws IOException {

		
		
		
		File file = new File(System.getProperty("user.dir") + "\\I-O_StreamRelated\\TSTOBS.W5N_2022_07_11.txt");
		
		InputStream input = new FileInputStream(file);

		String[] contents = file.list();
		
		
		for (int i = 0; i < contents.length; i++) {
			System.out.println(contents[i]);
		}
		
	

		





	}

}
