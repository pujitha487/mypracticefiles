package com.sample.programs;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int no1, no2, sum;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the values of a and b:");
		no1=scn.nextInt();
		no2=scn.nextInt();
		scn.close();
		sum=no1+no2;
		System.out.println("Sum of two num: "+sum);
		
		
		

	}

}
