package com.java.Exams;

public class Questionfourthchild4 extends Questionfourthparent {
	void getdata()
	{
		super.getdata();
		System.out.println("This is the method 4 from the Child Class");
	}
	public static void main(String[] args) {
		Questionfourthchild4 q4 = new Questionfourthchild4();
		q4.getdata();
	}
}
