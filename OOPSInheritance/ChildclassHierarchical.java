package com.java.OOPSInheritance;

public class ChildclassHierarchical extends Hierarchicalinherit {
	void getdata()
	{
		super.getdata();
		System.out.println("This is one of the child class of the Heirarchical Inheritance class");
	}
	public static void main(String ar[])
	{
		ChildclassHierarchical c1 = new ChildclassHierarchical();
		c1.getdata();
	}

}
