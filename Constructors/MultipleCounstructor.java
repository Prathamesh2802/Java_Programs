package com.java.Constructors;

public class MultipleCounstructor {
	int a,b;
	MultipleCounstructor()
	{
		a =12;
		b=24;
	}
	void multiplication()
	{
		System.out.println(a*b);
	}
	MultipleCounstructor(int a,int b)
	{
		this.a =a;
		this.b=b;
	}
	
	public static void main(String[] args) {
		MultipleCounstructor m= new MultipleCounstructor();
		m.multiplication();
		MultipleCounstructor m1= new MultipleCounstructor(50,30);
		m1.multiplication();
		
	}
	
	
	
}
