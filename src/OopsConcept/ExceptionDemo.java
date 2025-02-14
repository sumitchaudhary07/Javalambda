package OopsConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		File f=new File("myfile.doc");
		String path="E:\\Cisco\\src\\OopsConcept\\myyyy";
		try
		{
		FileReader fr=new FileReader(path);
		System.out.println("File is present");
		fr.re
		int i=0;
		while((i=fr.read())!=-1)
		{
			
			
			System.out.print((char)i);
			fr.close();
			
		}
		
		
		}
		catch(FileNotFoundException e)
		{
			
			System.out.println("File is not present");
			
			
		}
		
		catch(IOException io)
		{
			
			System.out.println("cannot read");
		}
		finally {
			System.out.println("close the file");
		}
		System.out.println("dsmfdskf");
		FileReader fr1=new FileReader(path);

		
		BufferedReader br=new BufferedReader(fr1);
		
		String line=null;
		
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			
		}
		br.close();
		
		
		FileInputStream fis=new FileInputStream(f);
		fis.
	}

}
