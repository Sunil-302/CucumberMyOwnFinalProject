package practiceJavaCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class File_Output_Stream {

	public static void main(String[] args) throws IOException {
		
		String data = " I l,o,v,e Dominor byke \n";
		
		File file = new File(System.getProperty("user.dir")+"\\I-O_StreamRelated\\write.csv");
		
		
		  OutputStream out = new FileOutputStream(new File("JamesBonf007.csv"),true);
		  
		  byte[] text = data.getBytes();
		  
		  System.out.println(text);
		 
		out.write(text);
		
		out.flush();
		
		out.close();
		
		System.out.println("The data has been written and closed the file");

	}

}
