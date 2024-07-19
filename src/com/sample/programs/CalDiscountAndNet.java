package com.sample.programs;

import java.util.Scanner;

public class CalDiscountAndNet {

	public static void main(String[] args) {
		int amt;
		double dis=0,net;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		amt=sc.nextInt();
		if(amt>1000)
		{
			dis=amt*0.1;
		}
		net=amt-dis;
		System.out.println("Discount: "+dis);
		System.out.println("Net Amount: "+net);

	}

}
