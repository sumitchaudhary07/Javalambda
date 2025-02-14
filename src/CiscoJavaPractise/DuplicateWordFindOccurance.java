package CiscoJavaPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordFindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence="This is a programme to find dupliacte word in a string again a programme ";
		
		String [] arraySen=sentence.split(" ");
		
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		
		for(int i=0;i<=arraySen.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=arraySen.length-1;j++)
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

		
		Set<Entry<String,Integer>> set=hm.entrySet();
		
		Iterator itr=set.iterator();
		
		
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			
			int value=(int) me.getValue();
			
			if (value>1)
			{
				System.out.println(me.getKey());
				
			}
			
		}

	}

}
