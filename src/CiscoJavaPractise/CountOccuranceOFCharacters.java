package CiscoJavaPractise;

import java.util.HashMap;

public class CountOccuranceOFCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="jsgdjshkdasldjaskdhkashd";
		
		char[] c=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=0;j<c.length;j++)
			{
				
				if(c[i]==c[j])
				{
					count++;
					
				}
			}
			hm.put(c[i], count);
			
		}
		
		System.out.println(hm);
		
		int county=hm.get('s');
		System.out.println(county);
		

	}

}
