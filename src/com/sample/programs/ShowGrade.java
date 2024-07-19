package com.sample.programs;

import java.util.Scanner;

public class ShowGrade {

	public static void main(String[] args) {
		int sub1,sub2,sub3,sub4,sub5,total,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of 5 subjects: ");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		sub4=sc.nextInt();
		sub5=sc.nextInt();
		total=sub1+sub2+sub3+sub4+sub5;
		avg=(total)%5;
		System.out.println("Total Marks: "+total);
		System.out.println("Average marks: "+avg);
		if(avg>=85)
		{
			System.out.println("Distinct");
		}
		else
		{
			if(avg<85 && avg>=75)
			{
				System.out.println("Grade A");
			}
			else
			{
				if(avg<75 && avg>=60)
				{
					System.out.println("Grade B");
				}
				else
					if(avg<60 && avg>=50)
					{
						System.out.println("Grade C");
					}
					else
						if(avg<50 && avg>=35)
						{
							System.out.println("Grade D");
						}
						else
							if(avg<35)
								System.out.println("Fail");
                
}
}
	}
}
