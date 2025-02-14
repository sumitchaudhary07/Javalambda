package CiscoJavaPractise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="mamahdfsdhkfj";
		char[] c=s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
			
		}

	}

}
