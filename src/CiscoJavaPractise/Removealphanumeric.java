package CiscoJavaPractise;

public class Removealphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome234To567Java89Programming0@#!!\";";
		StringBuffer string1=new StringBuffer();
		StringBuffer string2=new StringBuffer();
		StringBuffer string3=new StringBuffer();
		char[] c=s.toCharArray();
    for(int i =0 ;i<c.length;i++)
    {
    	if(Character.isDigit(c[i]))
    	{
    		
    		string1.append(c[i]);
    	}
    	else if(Character.isAlphabetic(c[i]))
    	{
    		
    		string2.append(c[i]);
    		
    		
    	}
    	else
    	{
    		
    		string3.append(c[i]);
    		
    	}
    	
    	
    }
		System.out.println(string1);
		
		System.out.println(string2);
		
		System.out.println(string3);
	}

}
