package com.java.Exams;

import java.util.Scanner;

public class Questionseventh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password:");
		int pass =sc.nextInt();
		if(pass == 1234)
		{
			System.out.println("Enter the Value of A:");
			int a = sc.nextInt();
			System.out.println("Enter the Value of B:");
			int b = sc.nextInt();
			if(a>b)
			{
				System.out.println("A is greater than B");
			}
			else
			{
				System.out.println("B is greater than A");
			}
		}
		else
		{
			System.out.println("Invalid Passcodes");
		}
		sc.close();
	}
}
