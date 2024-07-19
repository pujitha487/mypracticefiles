package com.sample.programs;

import java.util.Scanner;

public class CheckBankBal {
	public static void main(String[] args) {
		int bal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the balance: ");
		bal=sc.nextInt();
		if(bal<2000)
			System.out.println("Insufficient Balance or Low Balance");
		
	}

}
