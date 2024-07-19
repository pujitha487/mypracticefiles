package com.sample.programs;

import java.util.Scanner;

public class ReverseaString {

	public static void main(String[] args) {
		String str,revstr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.nextLine();
		revstr=" ";
		for(int i=str.length()-1;i>0;i--)
		{
			revstr+=str.charAt(i);  // revstr=revsre+str.charAt(i);s
		}
				System.out.println("Reverse String is: "+revstr);

	}

}
