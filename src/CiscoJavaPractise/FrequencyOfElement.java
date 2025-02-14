package CiscoJavaPractise;

import java.util.HashMap;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,2,3,4,4,4};
		
		HashMap <Integer,Integer> hm=new HashMap <Integer,Integer>();
		int count;
		for(int i=0;i<a.length;i++)
		{
			
			count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
					
				}
				
				
				
			}
			
			hm.put(a[i],count);
			
		}
		
		System.out.println(hm);

	}

}
