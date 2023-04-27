package com.java.Exams;

import java.util.Scanner;

public class Questiontenth {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n Enter your Choice:");
//		int ch = sc.nextInt();
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
		case '+':
			System.out.println("Enter the first Number:");
			int a = sc.nextInt();
			System.out.println("Enter the Second Number:");
			int b=sc.nextInt();
			System.out.println("Addition is: "+sum(a,b));
			break;
		case '-':
			System.out.println("Enter the first Number:");
			int a1 = sc.nextInt();
			System.out.println("Enter the Second Number:");
			int b1=sc.nextInt();
			System.out.println("Subtraction is: "+subtraction(a1,b1));
			break;
		case '*':
			System.out.println("Enter the first Number:");
			int a2 = sc.nextInt();
			System.out.println("Enter the Second Number:");
			int b2=sc.nextInt();
			System.out.println("Multiplication is: "+multiplication(a2,b2));
			break;
		case '/':
			System.out.println("Enter the first Number:");
			int a3 = sc.nextInt();
			System.out.println("Enter the Second Number:");
			int b3=sc.nextInt();
			System.out.println("Division is: "+division(a3,b3));
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		sc.close();
		
		
	}
	static int sum(int a,int b)
	{
		return a+b;
	}
	static int subtraction(int a,int b)
	{
		return a-b;
	}
	static int multiplication(int a,int b)
	{
		return a*b;
	}
	static int division(int a,int b)
	{
		return a/b;
	}
}
