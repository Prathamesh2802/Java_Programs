package com.java.OOPSInheritance;

public class Childclass1 extends Parentclass1 {
	void getdata1()
	{
		
		System.out.println("This is the child class");
	}
	public static void main(String[] args) {
		Childclass1 c1 = new Childclass1();
		c1.getdata1();
		c1.getdata();
		c1.getval();
		
	}
}
