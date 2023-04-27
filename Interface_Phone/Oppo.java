package com.java.Interface_Phone;

public class Oppo implements Features {

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("Ram: 6GB");
		
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("Camera: 55MP");
		
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		System.out.println("Battery: 4500MH");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Price: 15,000");
		
	}
	
	public static void main(String[] args) {
		System.out.println("OPPO Specifications are:");
		Oppo o1 = new Oppo();
		o1.battery();
		o1.ram();
		o1.camera();
		o1.price();
	}

}
