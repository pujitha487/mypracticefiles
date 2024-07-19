package com.sample.programs;

import java.util.Scanner;

public class Add2BryStrings {

	public static void main(String[] args) {
		int x,y,add;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vales of x and y: ");
		x=sc.nextInt();
		y=sc.nextInt();
		add=x+y;
		System.out.println("Sum of two Binary Strings are: "+add);

	}

}
