package CiscoJavaPractise;

public class ReverseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Both String builder and String buffer reverse the string Word by Word liker 
		//Output=aidni my si siht
		
		String s="this is my india";
		
		StringBuffer sb=new StringBuffer(s);
		
		  
		
		String s1=sb.reverse().toString();
		System.out.println(s1);
				 sb.append(" and i love india");
				 System.out.println(sb.toString());
				 sb.append(1);
				 System.out.println(sb.toString());
				 
				 
				 
				 
		StringBuilder sb1=new StringBuilder(s);
		
		  
		
		String s2=sb1.reverse().toString();
		System.out.println(s2);
	}

}
