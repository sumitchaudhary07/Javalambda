package CiscoJavaPractise;

public class SecondHighestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {45,32,11,65,32,90};
		int max=a[0];
		int secondlargest=-1;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];
				
			}
			
		}
		for(int j=0;j<a.length;j++)
		{
			
			if(a[j]>secondlargest&& a[j]!=max)
			{
				secondlargest=a[j];
				
			}
			
		}
System.out.println(secondlargest);

	}

}
