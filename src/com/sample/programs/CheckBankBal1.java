package com.sample.programs;

import java.util.Scanner;

public class CheckBankBal1 {

	public static void main(String[] args) {
		int bal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bal: ");
		bal=sc.nextInt();
		if(bal<2000)
		{
			System.out.println("Low Balance");
		}
		else
		{
			System.out.println("Balance is Ok");
		}

	}

}
