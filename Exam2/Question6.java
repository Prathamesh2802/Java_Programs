package com.java.Exam2;

class Inherit1 {
	void getdata()
	{
		System.out.println("GrandFather Class");
	}
}
class Inherit2 extends Inherit1
{
	void getdata()
	{
		super.getdata();
		System.out.println("Parent Class");
	}
}
class Question6 extends Inherit2
{
	void getdata()
	{
		super.getdata();
		System.out.println("Child Class");
	}
	public static void main(String[] args) {
		Question6 i3 = new Question6();
		i3.getdata();
	}
}