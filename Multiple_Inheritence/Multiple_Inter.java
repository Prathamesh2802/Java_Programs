package com.java.Multiple_Inheritence;

public class Multiple_Inter implements Interface1, Interface2 {
	public static void main(String[] args) {
		Multiple_Inter m1= new Multiple_Inter();
		m1.getdata();
		m1.putdata();
		m1.getdata1();
		m1.putdata1();
	}

	@Override
	public void getdata1() {
		// TODO Auto-generated method stub
		System.out.println("Getdata1");
	}

	@Override
	public void putdata1() {
		// TODO Auto-generated method stub
		System.out.println("Putdata1");
	}

	@Override
	public void getdata() {
		// TODO Auto-generated method stub
		System.out.println("Getdata");
		
	}

	@Override
	public void putdata() {
		// TODO Auto-generated method stub
		System.out.println("Putdata");
	}
}
