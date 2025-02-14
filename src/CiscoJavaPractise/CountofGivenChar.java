package CiscoJavaPractise;

import java.util.HashMap;

public class CountofGivenChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="jsgdjshkdasldjaskdhkashd";
		
		char[] c=s.toCharArray();
		//HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
		
				
				if(c[i]=='z')
				{
					count++;
					
				}
			}
			System.out.println(count);
			
		
		
	
		

	}
}
