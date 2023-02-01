package logicalProgrames;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		// when reverse string of original string is same as of originalstring that string is known as parindrome string
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String orgStr = sc.next();
		String revStr ="";
		
		for(int i=orgStr.length()-1;i>=0;i--)
		{
			char t = orgStr.charAt(i);
			revStr=revStr+t;
		}
		System.out.println("original string is "+orgStr);
		System.out.println("reverse string is "+revStr);

		if (orgStr.equals(revStr))
		{
			System.out.println("string is parindrome");
		}
		else
		{
			System.out.println("string is not parindrome");   
		}
		
		
		
		
	}

}
