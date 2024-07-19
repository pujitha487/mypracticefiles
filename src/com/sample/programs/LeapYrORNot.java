package com.sample.programs;

import java.util.Scanner;

public class LeapYrORNot {

	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Given year is leap year");
		}
		else
		{
			System.out.println("Given year is not leap year");
		}

	}

}
