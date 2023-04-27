package com.java.Abstract_Method;

public class Sample3 extends Sample2{
	public static void main(String[] args) {
		Sample3 s3 = new Sample3();
		s3.putdata();
		s3.getdata();
	}

	@Override
	void putdata() {
		// TODO Auto-generated method stub
		System.out.println("Sample 1");
	}

	@Override
	void getdata() {
		// TODO Auto-generated method stub
		System.out.println("Sample 2");
	}
}
