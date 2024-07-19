package com.sample.programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,fact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		fact=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
        System.out.println("Factorial of "+n+" is: "+fact);
	}

}
