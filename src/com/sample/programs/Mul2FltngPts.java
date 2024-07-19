package com.sample.programs;

import java.util.Scanner;

public class Mul2FltngPts {

	public static void main(String[] args) {
		float no1,no2,mul;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of no1 and no2:");
		no1=sc.nextFloat();
		no2=sc.nextFloat();
		mul=no1*no2;
		System.out.println("Mul of Floating two num's: "+mul);
		

	}

}
