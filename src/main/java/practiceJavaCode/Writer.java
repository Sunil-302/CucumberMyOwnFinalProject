package practiceJavaCode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir") + "\\I-O_StreamRelated\\write.txt");
		
		 FileWriter output = new FileWriter(file,true);
		 
		 String Data = "I lover long Drives \n";
		 
		 output.write(Data);
		 
		 output.flush();
		 
		 output.close();
		 
		 System.out.println("Wrote successfully");
		 
		
	}

}
