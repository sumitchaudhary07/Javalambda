package CiscoJavaPractise;

import java.util.HashMap;

public class DuplicateWordDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage CiscoJavaPractise;

		
		String sentence="This is a programme to find dupliacte word in a string again a programme ";
		
		String [] arraySen=sentence.split(" ");
		
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		
		for(int i=0;i<=arraySen.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=arraySen.length-1;j++)
			{
				
				if(arraySen[i].equals(arraySen[j]))
						{
					
					count++;
					
					System.out.println(arraySen[i] +" "+count);
					
					
						}
				
				
			}
hm.put(arraySen[i], count);
			
			
		}
		
		
		System.out.println(hm);

	}

}


