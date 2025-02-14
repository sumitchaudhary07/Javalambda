package CiscoJavaPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="E:\\Cisco\\src\\OopsConcept\\myyyy";
		String oppath="E:\\Cisco\\src\\OopsConcept\\myyyyop";
		File file=new File(path);
		File opfile=new File(oppath);
		
		
		try {
			FileInputStream fis=new FileInputStream(file);
		
			FileOutputStream fos=new FileOutputStream(opfile);
			
			fos.write(fis.readAllBytes());
			
			fis.read()
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	

	}

}
