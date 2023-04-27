package com.java.Constructors;
// Default COnstructor and Parameterized constructor
public class ProjectConstructor {
	int a,b;
	
	ProjectConstructor()
	{
		System.out.println("Default Constructor");
		this.a = 10;
		this.b=11;
	}
	
	ProjectConstructor(int a,int b)
	{
//		this();
		System.out.println(a);
		System.out.println(b);
		this.a=12;
		this.b=23;
	}
	void getdata()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		ProjectConstructor p = new ProjectConstructor();
		p.getdata();
		ProjectConstructor p1 = new ProjectConstructor(15,35);
		p1.getdata();
		System.out.println(p1.a);
	}
}
