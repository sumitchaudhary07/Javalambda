package CiscoJavaPractise;

public class TwicePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello";
		
		char[]c1=s.toCharArray();
		char[]c2=new char[c1.length*2];
		
		for(int i=0;i<c1.length;i++)
		{
			c2[2*i]=c1[i];
			c2[(2*i)+1]=c1[i];
			
		}
		
		String s1=new String(c2);
		System.out.println(s1); 
		
		

	}

}
