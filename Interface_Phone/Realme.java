package com.java.Interface_Phone;

public class Realme implements Features{

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("Ram: 7GB");
		
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("Camera: 40MP");
		
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		System.out.println("Battery: 6000MH");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Price: 18,000");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Realme Specifications are:");
		Realme r1 = new Realme();
		r1.battery();
		r1.ram();
		r1.camera();
		r1.price();
	}

	
}
