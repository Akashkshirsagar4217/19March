package logicalProgram;

import java.util.Scanner;

public class PalindroneString {

	public static void main(String[] args) 
	
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter string");
		
		String originalstr = sc.next();
		String rev ="";
		
		for(int i=originalstr.length()-1;i>=0;i--)
		{
			rev=rev+originalstr.charAt(i);
		}
		
		System.out.println("original string is "+originalstr);
		System.out.println("reverse string is "+rev);
		
		if(originalstr.equals(rev))
		{
			System.out.println("Gievn string is Palindrone");
		}

		else
		{
			System.out.println("Given Strind is not Palindrone");
		}
	}

}
