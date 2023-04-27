package com.java.Exam2;

import java.util.Scanner;

interface Question91 {
	void getdata();
	void putdata();
}

class Question9 implements Question91
{
	int a;
	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextInt();
		sc.close();
	}
	public void putdata()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Question9 q1= new Question9();
		q1.getdata();
		q1.putdata();
	}
}
