package CiscoJavaPractise;

public class Countnumberdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long number=1;
		
		int count=0;
		while(number%10!=0)
		{
			
			number=number/10;
			count++;
			
		}
    System.out.println(count);
	}

}
