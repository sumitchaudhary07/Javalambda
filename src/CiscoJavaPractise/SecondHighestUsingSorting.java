package CiscoJavaPractise;

import java.util.Arrays;

public class SecondHighestUsingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {45,32,11,65,32,90};
		Arrays.sort(a);
		int n=a.length;
		int secondlargest=-1;
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]!=a[n-1])
			{
				
				secondlargest=a[i];
				System.out.println(secondlargest);
				break;
			}
			
			
		}
		
		System.out.println(secondlargest);
	}

}
