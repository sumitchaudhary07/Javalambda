package CiscoJavaPractise;

import java.util.HashSet;

public class RemovingDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};
		
		
		HashSet<String> hs=new HashSet<String>();
		
		for(int i=0;i<strArray.length;i++)
		{
			hs.add(strArray[i]);
			
		}
		
		System.out.println(hs);
	}

}
