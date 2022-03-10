package com.practise;

import java.util.ArrayList;
import java.util.Scanner;

public class Practise1 
{
	public static void main(String[] args) 
	{		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the percentage of 10th standard : ");
		double tenth=scan.nextDouble();
		System.out.println("Enter the percentage of 12th standard : ");
		double twelveth=scan.nextDouble();
		ArrayList<String> al=new ArrayList<>();
		if(((tenth+twelveth)/2)>=80)
		{
			System.out.println("You are eligible for University Enrollment system");
			System.out.println("Enter your choice: ");
			System.out.println("Press 1 for Medical course:"); 
			System.out.println("Press 2 for Engineering course:");
			System.out.println("Press 3 for Agriculture:");
			System.out.println("Press 4 for Nursing:");
			System.out.println("Press 5 for Arts:");
			
			int option=scan.nextInt();
			
			switch(option)
			{
			case 1:
				al.add("Medical");
				{
					System.out.println("Enter the Botany and Zoology mark");
					double bot=scan.nextDouble();
					double zoo=scan.nextDouble();
					if(((bot+zoo)/2)>=90)
					{
						System.out.println("Congrats!!!.....you are eligible for enrollment system");
					}
					else
					{
						System.out.println("Sorry!!!......you are not eligible for this enrollment system");;
					}
				}
			break;
			case 2:
				al.add("Engineering");
				System.out.println("Enter the Maths,Chemistry and Physics mark");
				double mat=scan.nextDouble();
				double che=scan.nextDouble();
				double phy =scan.nextDouble();
				if(((mat+che+phy)/3)>=90)
				{
					System.out.println("Congrats!!!.....you are eligible for enrollment system");
				}
				else
				{
					System.out.println("Sorry!!!......you are not eligible for this enrollment system");;
				}
			break;
			case 3:
				al.add("Agriculture");
				System.out.println("Enter the Botony and Zoology mark: ");
				double bot=scan.nextDouble();
				double zoo=scan.nextDouble();
				if(((bot+zoo)/2)>=85)
				{
					System.out.println("Congrats!!!.....you are eligible for enrollment system");
				}		
				else
				{
					System.out.println("Sorry!!!......you are not eligible for this enrollment system");;
				}
			break;
			case 4:
				al.add("Nursing");
				System.out.println("Enter the Botany and Zoology mark");
				double bot1=scan.nextDouble();
				double zoo1=scan.nextDouble();
				if(((bot1+zoo1)/2)>=75)
				{
					System.out.println("Congrats!!!.....you are eligible for enrollment system");
				}
				else
				{
					System.out.println("Sorry!!!......you are not eligible for this enrollment system");;
				}
					
			break;
			case 5:
				al.add("Arts");
				System.out.println("Enter the Maths,Chemistry and Physics mark");
				double mat1=scan.nextDouble();
				double che1=scan.nextDouble();
				double phy1 =scan.nextDouble();
				if(((mat1+che1+phy1)/3)>=80)
				{
					System.out.println("Congrats!!!.....you are eligible for enrollment system");
				}
				else
				{
					System.out.println("Sorry!!!......you are not eligible for this enrollment system");;
				}
			break;
			default:
				System.out.println("Enter the correct choice ");
			break;
		}
		scan.close();
		}
		else
		{
			System.out.println("Sorry!!!.....you are not eligible for University Enrollment System");
		}
	}
}
