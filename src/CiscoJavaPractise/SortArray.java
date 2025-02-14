package CiscoJavaPractise;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {65,73,89,0,64,0,78,0,11};
		
		int temp=0;
		
		for(int i=0;i<=a.length-1;i++)
			
		{
			for(int j=i+1;j<=a.length-1;j++)
				
			{
				
				if(a[i]<a[j])
				{
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		System.out.println(a[8]);
		
		
	}

}
