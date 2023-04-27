package com.java.Exams;

public class Questionfourthchild3 extends Questionfourthparent {
	void getdata()
	{
		super.getdata();
		System.out.println("This is the method 3 from the Child Class");
	}
	public static void main(String[] args) {
		Questionfourthchild3 q3 = new Questionfourthchild3();
		q3.getdata();
	}
}

