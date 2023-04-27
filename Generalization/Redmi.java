package com.java.Generalization;

public class Redmi implements Mobile {

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("Ram:8GB");
	}

	@Override
	public void storage() {
		// TODO Auto-generated method stub
		System.out.println("Storage:1TB");
	}

	@Override
	public void devicetype() {
		// TODO Auto-generated method stub
		System.out.println("Mobile");
		
	}

	@Override
	public void devicename() {
		// TODO Auto-generated method stub
		System.out.println("Redmi Note 10 Pro");
	}

	@Override
	public void devicesize() {
		// TODO Auto-generated method stub
		System.out.println("4.5 Inches");
	}
	
	public static void main(String[] args) {
		Redmi r1 = new Redmi();
		r1.devicename();
		r1.devicesize();
		r1.storage();
		r1.devicetype();
		r1.ram();
	}

}
