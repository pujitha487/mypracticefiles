package com.sample.programs;

import java.util.Scanner;

public class CalTotalAndAvgMarks {
	public static void main(String[] args) {
		int sub1,sub2,sub3,sub4,sub5,total;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of 5 subjects: ");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		sub4=sc.nextInt();
		sub5=sc.nextInt();
		total=sub1+sub2+sub3+sub4+sub5;
		avg=total%500;
		System.out.println("Total Marks: "+total);
		System.out.println("Average Marks: "+avg);

  }
}
