package com.sample.programs;

import java.util.Scanner;

public class PrintStarOnConsole {
	public static void main(String[] args) {
		int n; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		   System.out.println(" * ");	
		}
		System.out.println();
	}

}
