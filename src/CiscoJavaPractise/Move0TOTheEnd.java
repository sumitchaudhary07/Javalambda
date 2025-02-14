package CiscoJavaPractise;

public class Move0TOTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {65,73,89,0,64,0,78,0,11};
int temp=0;
for(int i=0;i<=a.length-1;i++)
{
	
	
	if(a[i]!=0)
	{
		
		a[temp]=a[i];
		temp++;
		
	}
	

}

for(int i=temp;i<=a.length-1;i++)
{
	a[i]=0;


}

for(int i=0;i<=a.length-1;i++)
{
	System.out.println(a[i]);


}



	}

}
