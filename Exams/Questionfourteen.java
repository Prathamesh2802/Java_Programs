package com.java.Exams;

public class Questionfourteen {
	int a;
	int b;
	Questionfourteen(int a,int b)
	{
			this.a =a;
			this.b = b;
	}
	
	public static void main(String[] args) {
		int a=12;
		int b=34;
		Questionfourteen q1=new Questionfourteen(a,b);
		System.out.println("A is: "+q1.a);
		System.out.println("B is: "+q1.b);
		
	}
	
}
