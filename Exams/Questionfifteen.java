package com.java.Exams;

import java.util.Scanner;

public class Questionfifteen {
	int a;
	int b;
	Questionfifteen()
	{
		System.out.println("This is the Default constructor");
	}
	Questionfifteen(int a,int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("Value of a is: "+this.a);
		System.out.println("Value of b is: "+this.b);
		System.out.println("This is an Parametrized Constructor");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a =sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		Questionfifteen q1 = new Questionfifteen();
		Questionfifteen q2 = new Questionfifteen(a,b);
		sc.close();
		
	}
}
