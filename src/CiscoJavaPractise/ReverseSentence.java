package CiscoJavaPractise;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="I am a good boy and you are also good";
		String[] c=s.split(" ");
		
		
		for(int i=c.length-1;i>=0;i--)
		{
			
			char []rev=c[i].toCharArray();
			for(int j=rev.length-1;j>=0;j--)
			{
			System.out.print(rev[j]);
			
		}
		System.out.print(" ");
	}
	}
}
