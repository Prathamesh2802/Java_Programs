package com.java.Exam2;

import java.util.Scanner;

public class Question5 {
	
	static int greater(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else if(b>a)
		{
			return b;
			
		}
		else
		{
			return -1;
		}
	}
	
	public static void main(String[] args) {
//		Return type Method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		sc.close();
		int greater = greater(a,b);
		if(greater ==-1)
		{
			System.out.println("Both values are equal");
		}
		else
		{
			
			System.out.println("The greatest value between 2 number is:"+greater);
		}
		
		
	}
}
