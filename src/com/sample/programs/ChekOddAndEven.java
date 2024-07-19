package com.sample.programs;

import java.util.Scanner;

public class ChekOddAndEven {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n=sc.nextInt();
        if(n%2==0)
        {
        	System.out.println("Given Number is Even");
        }
        else
        {
        	System.out.println("Given Number is Odd");
        }
	}

}
