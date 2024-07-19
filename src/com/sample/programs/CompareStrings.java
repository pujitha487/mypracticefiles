package com.sample.programs;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two strings: ");
		str1=sc.nextLine();
		str2=sc.nextLine();
		if(str1.compareTo(str2)>0)
		{
			System.out.println("str1 is greater than str2");
		}
		else
		{
			if(str1.compareTo(str2)<0)
			{
				System.out.println("str1 is less than str2");
			}
			else
			{
				System.out.println("str1 and str2 both are same");
			}
		}

	}

}
