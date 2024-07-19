package com.sample.programs;

import java.util.Scanner;

public class ConvertFhtToCelsius {

	public static void main(String[] args) {
		float temp;
		float temp1;
		Scanner sc=new Scanner("System.in");
		System.out.println("Enter temperature in Fahrenheit: ");
		temp=sc.nextFloat();
		temp1=((temp-32)*5)/9;
		System.out.println("Temperature in Celsius is: "+temp1);

	}

}
