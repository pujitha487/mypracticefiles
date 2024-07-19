package com.sample.programs;

import java.util.Scanner;

public class FibonanciSeries {

	public static void main(String[] args) {
		int num1,num2,num3,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers 0f num1 and num2: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println(num1+" "+num2);
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			num3=num1+num2;
		    System.out.println(" "+num3);
		    num1=num2;
		    num2=num3;
		}
		

		
	}

}
