package com.java.AccessModifier;

//import com.java.AccessModifier1.*;

class Defaultaccess extends Defaultaccess1 {
	void getdata()
	{
		super.getdata();
		System.out.println("This is the Default Access Method");
	}
	public static void main(String[] args) {
		Defaultaccess d1 = new Defaultaccess();
		d1.getdata();
//		Defaultaccess2 d2 = new Defaultaccess2(); //? Will show error as the default access specifier caanot access the other packages
		
	}
}
