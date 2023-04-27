package com.java.Exam2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
//		Finding the largest Number 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.print("Enter the second Number:");
		int b = sc.nextInt();
		sc.close();
		if(a>b)
		{
			System.out.println(a+" is bigger than "+ b);
		}
		else if(a<b)
		{
			System.out.println(b+" is greater than "+a);
		}
		else
		{
			System.out.println(a+" is equal to "+b);
		}
	}
}
