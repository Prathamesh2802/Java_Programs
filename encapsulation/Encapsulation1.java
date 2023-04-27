package com.java.encapsulation;

class Encapsulation2 {
	private String name;
	private int age;
	
	void setname(String name,int age)
	{	
		this.name = name;
		this.age = age;
	}
	
	String getname()
	{
		return name;
	}
	int getid()
	{
		return age;
	}
}

//class Encapsulation1 extends Encapsulation2 both Inherited and Non Inherited methods can be initialised
class Encapsulation1
{
	public static void main(String[] args) {
		Encapsulation2 e2 = new Encapsulation2();
		e2.setname("Pinu",22);
		System.out.println(e2.getname());
		System.out.println(e2.getid());
	}
}