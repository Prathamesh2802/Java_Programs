package com.java.Multipleinterfaces;

public class Mainclass implements Interface3 {
	public static void main(String[] args) {
		Mainclass m1 = new Mainclass();
		m1.getdata();
		m1.pudata();
		m1.getdata1();
		m1.putdata1();
		m1.getdata2();
		m1.putdata2();
	}
	@Override
	public void getdata() {
		// TODO Auto-generated method stub
		System.out.println("Getdata");
	}

	@Override
	public void pudata() {
		// TODO Auto-generated method stub
		System.out.println("Putdata");
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
	public void getdata2() {
		// TODO Auto-generated method stub
		System.out.println("Getdata2");
	}

	@Override
	public void putdata2() {
		// TODO Auto-generated method stub
		System.out.println("Putdata2");
	}

}
