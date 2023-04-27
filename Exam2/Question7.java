package com.java.Exam2;

public class Question7 {
	
	Question7()
	{
		System.out.println("Default Constructor");
	}
	Question7(int a,int b)
	{
		System.out.println("Parametrized Constructor having 2 values:"+a+", "+b);
	}
	Question7(String a)
	{
		System.out.println("Parametrized Constructor having String value: "+a);
	}
	
	public static void main(String[] args) {
		Question7 q1 = new Question7();
		Question7 q2 = new Question7(56,52);
		Question7 q3 = new Question7("Pinu");
		
	}
}
