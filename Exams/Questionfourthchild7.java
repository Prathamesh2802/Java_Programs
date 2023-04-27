package com.java.Exams;

public class Questionfourthchild7 extends Questionfourthparent {
	void getdata()
	{
		super.getdata();
		System.out.println("This is the method 7 from the Child Class");
	}
	public static void main(String[] args) {
		Questionfourthchild7 q7 = new Questionfourthchild7();
		q7.getdata();
	}
}

