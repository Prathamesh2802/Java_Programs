package com.java.Interface_Phone;

public class Samsung implements Features {

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("Ram: 8GB");
		
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("Camera: 50MP");
		
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		System.out.println("Battery: 5000MH");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Price: 20,000");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Samsung Specifications are:");
		Samsung s1 = new Samsung();
		s1.battery();
		s1.ram();
		s1.camera();
		s1.price();
	}

}
