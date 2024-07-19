package com.sample.programs;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
	int rad;
	double area;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value: ");
	rad=sc.nextInt();
	area=3.142*rad*rad;
	System.out.println("Area of circle: "+area);

	}

}
