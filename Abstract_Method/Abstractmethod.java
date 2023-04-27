package com.java.Abstract_Method;

//? both incomplete and completer methods can be achieved by using abstarct class

abstract class abc
{
	abstract void getdata();
	void putdata()
	{
		System.out.println("Hello");
	}
}


public class Abstractmethod extends abc {
//	public void getdata()
//	{
//		System.out.println("abc");
//	}
	public static void main(String[] args) {
		Abstractmethod m1 = new Abstractmethod();
		m1.getdata();
	}

@Override
void getdata() {
	// TODO Auto-generated method stub
	System.out.println("abc");

}
}
