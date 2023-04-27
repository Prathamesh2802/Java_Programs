package com.java.Interface_Phone;

public class OnePlus implements Features  {

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("Ram: 8GB");
		
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("Camera: 60MP");
		
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		System.out.println("Battery: 6000MH");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Price: 30,000");
		
	}
	
	public static void main(String[] args) {
		System.out.println("OnePlus Specifications are:");
		OnePlus o1 = new OnePlus();
		o1.battery();
		o1.ram();
		o1.camera();
		o1.price();
	}

}
