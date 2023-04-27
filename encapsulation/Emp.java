package com.java.encapsulation;

class Emp1 {
	private String empname;
	private int empid;
	
	void setter(String empname,int empid)
	{
		this.empid = empid;
		this.empname = empname;
	}
	int getterempid()
	{
		return empid;
	}
	String getterempname()
	{
		return empname;
	}
}

class Emp
{
	public static void main(String[] args) {
		Emp1 e1 =new Emp1() ;
		e1.setter("Pinu", 1);
		System.out.println(e1.getterempid());
		System.out.println(e1.getterempname());
		
	}
}