package com.java.Exams;
public class Questionfourthchild2 extends Questionfourthparent {
	void getdata()
	{
		super.getdata();
		System.out.println("This is the method 2 from the Child Class");
	}
	public static void main(String[] args) {
		Questionfourthchild2 q2 = new Questionfourthchild2();
		q2.getdata();
	}
}
