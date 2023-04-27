package com.java.Exam2;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
//		Switch cases
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.print("Enter your choice:");
		int ch=sc.nextInt();
		System.out.print("Enter a:");
		int a = sc.nextInt();
		System.out.print("Enter b:");
		int b=sc.nextInt();
		sc.close();
		switch(ch)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
	}
}
