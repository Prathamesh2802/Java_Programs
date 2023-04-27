package com.java.Generalization;

public class Lenovo implements Laptop{

	@Override
	public void ram() {
		System.out.println("Ram: 8GB");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storage() {
		System.out.println("HDD:1TB and SSD:500GB");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devicetype() {
		// TODO Auto-generated method stub
		System.out.println("Portable Computer");
		
	}

	@Override
	public void laptopname() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo");
		
	}

	@Override
	public void laptopsize() {
		// TODO Auto-generated method stub
		System.out.println("15.6 Inches");
		
	}
	
	public static void main(String[] args) {
		Lenovo l1 = new Lenovo();
		l1.laptopname();
		l1.laptopsize();
		l1.storage();
		l1.ram();
	}

}
