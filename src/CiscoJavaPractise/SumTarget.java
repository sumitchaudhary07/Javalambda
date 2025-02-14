package CiscoJavaPractise;

public class SumTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,8,11,6,7,18};
        int target;
        
        
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		int sum=a[i]+a[j];
        		target=25;
        		if(target==sum)
        		{
        			
        			System.out.println(a[i] +" "+a[j]);
        		}
        		
        	}
        	
        	
        }
	}

}
