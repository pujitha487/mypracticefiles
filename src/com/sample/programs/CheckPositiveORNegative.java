package com.sample.programs;

import java.util.Scanner;

public class CheckPositiveORNegative {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=sc.nextInt();
		if(num<0)
		{
			System.out.println("Given Number is -ve");
		}
		else
		{
			System.out.println("Given Number is +ve");
		}

	}

}
