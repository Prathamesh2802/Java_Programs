package com.java.Exams;

public class Questionfourthchild6 extends Questionfourthparent {
	void getdata()
	{
		super.getdata();
		System.out.println("This is the method 6 from the Child Class");
	}
	public static void main(String[] args) {
		Questionfourthchild6 q6 = new Questionfourthchild6();
		q6.getdata();
	}
}
