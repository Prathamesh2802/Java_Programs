package com.java.Methods;

class Methodoverriding1 {
	void getdata()
	{
		System.out.println("Bye");
	}
}
public class Methodoverridingwithoutsuper extends Methodoverriding1
{
	void getdata()
	{
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
		Methodoverridingwithoutsuper o1 = new Methodoverridingwithoutsuper();
		o1.getdata();
		Methodoverriding1 o2 = new Methodoverriding1();
		o2.getdata();
	}
}
