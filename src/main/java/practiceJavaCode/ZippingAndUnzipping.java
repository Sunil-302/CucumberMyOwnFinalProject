package practiceJavaCode;

import java.io.File;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class ZippingAndUnzipping {

	public static void main(String[] args) {
		
//		File file = new File (System.getProperty("user.dir")+"\\\\I-O_StreamRelated\\\\ZipFile");
		
		
		
		String source = "D:\\Software Engineer\\Selenium java\\CucumberMyOwnFinalProject\\I-O_StreamRelated\\ZipFile\\Notes_DataExport_FilterTemplate.zip";
		
		String destination = "D:\\Software Engineer\\Selenium java\\CucumberMyOwnFinalProject\\I-O_StreamRelated\\UnZipFile";
		
		char password = ' ';
		
		ZipFile zipfile = new ZipFile(source);
		
		 try {
			zipfile.extractAll(destination);
		} catch (ZipException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Probably Unzipped");
		
		
		

	}

}
