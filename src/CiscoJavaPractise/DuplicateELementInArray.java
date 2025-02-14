package CiscoJavaPractise;

import java.util.HashSet;

public class DuplicateELementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {23,54,32,67,89,90,23,54};
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		//hs.add(a[i]);
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
			
			
		}
		
		System.out.println(hs);
		
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					
					System.out.println(a[i]);
					
				}
				
			}
			
			
		}

	}

}
