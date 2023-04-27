package com.java.Exams;

public class Questionfourthchild1 extends Questionfourthparent {
	void getdata()
	{
		super.getdata();
		System.out.println("This is the method 1 from the Child Class");
	}
	public static void main(String[] args) {
		Questionfourthchild1 q1 = new Questionfourthchild1();
		q1.getdata();
	}
}
