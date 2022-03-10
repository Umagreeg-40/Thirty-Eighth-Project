package com.practise;

import java.util.Scanner;

public class Practise3 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input");
		String input=scan.next();
		
		int uppercase=0,lowercase=0,digits=0,special=0;
		
		for(int i=0;i<input.length();i++)
		{

			if(Character.isUpperCase(input.charAt(i)))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(input.charAt(i)))
			{
				lowercase++;
			}
			else if(Character.isDigit(input.charAt(i)))
			{
				digits++;
			}
			else
			{
				special++;
			}
		}
			System.out.println("The number of Uppercase: "+uppercase);
			System.out.println("The number of Lowercase: "+lowercase);
			System.out.println("The number of digits: "+digits);
			System.out.println("The number of Special Characters: "+special);
	}
}
