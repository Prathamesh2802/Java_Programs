package com.java.Exams;

public class Questionfourthchild5 extends Questionfourthparent {
	void getdata()
	{
		super.getdata();
		System.out.println("This is the method 5 from the Child Class");
	}
	public static void main(String[] args) {
		Questionfourthchild5 q5 = new Questionfourthchild5();
		q5.getdata();
	}
}
