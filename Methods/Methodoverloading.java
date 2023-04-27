package com.java.Methods;

public class Methodoverloading {
	void getdata()
	{
		System.out.println("HEllO");
	}
	void getdata(int a,int b)
	{
		System.out.println("Addition is:"+(a+b));
	}
	void getdata(String a,String b)
	{
		System.out.println("First Name is: "+a+". Last Name is: "+b);
	}
	public static void main(String[] args) {
		Methodoverloading o1 = new Methodoverloading();
		o1.getdata();
		o1.getdata(12,34);
		o1.getdata("Prathamesh","Patil");

	}
}
