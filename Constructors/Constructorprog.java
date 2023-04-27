package com.java.Constructors;

public class Constructorprog {
	int v;
	int d;
	float f;
	String s;
	Constructorprog()
	{
		 this.v = 12;
		  this.d= 23;
		  this.f = 2.4f;
		  this.s = "Hello World";
	}
	Constructorprog(int a,int b, String c)
	{
		this.v = a;
		this.d = b;
		this.s = c;
	}
	static void putdata(int c,int d, String e)
	{
		System.out.println(c+"\n"+d+"\n"+e);
	}
	public static void main(String[] args) {
		Constructorprog c = new Constructorprog();
		System.out.println(c.v);
		int a=22;
		int b=34;
		String c2="Bye Bye";
		Constructorprog c1 = new Constructorprog(a,b,c2);
		putdata(c1.v,c1.d,c1.s);
	}
}
