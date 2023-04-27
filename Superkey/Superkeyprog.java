package com.java.Superkey;

class superkeypro
{
	int a = 12;
	int b=23;
}
public class Superkeyprog extends superkeypro {
	
	void putdata()
	{
		System.out.println(super.a);
		System.out.println(super.b);
	}
 public static void main(String[] args) {
	int a=24;
	int b=25;
	Superkeyprog s1 = new Superkeyprog();
	s1.putdata();
	System.out.println(a);
	System.out.println(b);
}
}
