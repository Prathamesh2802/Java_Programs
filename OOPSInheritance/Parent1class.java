package com.java.OOPSInheritance;

public class Parent1class extends Child1class {
	void getdata1()
	{
		System.out.println("This is the parent class");
	}
	void getdata2()
	{
		System.out.println("This is the second property of parent class");
	}
	void getdata3()
	{
		System.out.println("This is the third property of parent class");
	}
	void getdata4()
	{
		System.out.println("This is the fourth property of parent class");
	}
	void getdata5()
	{
		System.out.println("This is the fifth property of parent class");
	}
	public static void main(String[] args) {
		Parent1class p1 = new Parent1class();
		p1.getdata();
		p1.putdata();
		p1.putdata1();
		p1.putdata2();
		p1.putdata3();
		p1.getdata1();
		p1.getdata2();
		p1.getdata3();
		p1.getdata4();
		p1.getdata5();
	}
}
