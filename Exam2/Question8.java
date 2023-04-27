package com.java.Exam2;

abstract class Question81 {
	void getdata()
	{
		System.out.println("Complete Method in Abstract class");
	}
	abstract void putdata();
}
class Question8 extends Question81
{

	@Override
	void putdata() {
		// TODO Auto-generated method stub
		System.out.println("Incomplete method in Abstract class");
		
	}
	public static void main(String[] args) {
		Question8 q8 = new Question8();
		q8.getdata();
		q8.putdata();
	}
	
}
