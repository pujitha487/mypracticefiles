package com.sample.programs;

import java.util.Scanner;

public class CalProfitORLoss {

	public static void main(String[] args) {
		int sellingamt, purchaseamt, Profit, Loss;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the SellingAmount and PurchaseAmmount: ");
		sellingamt=sc.nextInt();
		purchaseamt=sc.nextInt();
		Profit=sellingamt-purchaseamt;
		Loss=purchaseamt-sellingamt;
		if(sellingamt>purchaseamt)
		{
			System.out.println("Customer gain profit: "+Profit);
		}
		else
		{
			System.out.println("Customer gain loss: "+Loss);
		}

	}

}
