package com.java.Exam2;

import java.util.Scanner;

class Question101 {
//	Encapsulation
	private int a;
	private String b;
	int saveval(int a)
	{
		return this.a = a;
	}
	
	public String savename(String b)
	{
		return this.b = b;
	}
	
	public int getval()
	{
		return a;
	}
	public String getname()
	{
		return b;
	}
	
}

class Question10 extends Question101
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		String b = sc.next();
		sc.close();
		Question10 q = new Question10();
		q.saveval(a);
		q.savename(b);
		System.out.println(q.getname());
		System.out.println(q.getval());
		
		
	}
}
