// Data type is used to represent some type of information which we want to use in our java program 
// 2 types of data type - 1)Primitive 2)Non Primitive
// Primitive data type - 1)Memory size is fixed 2) Int ,float,char,double,short,long, boolean and byte 3) all primitive data types are keywords

package com.java.basic;


public class Datatype_basic {
	public static void main(String args[]) {
		int a=10,b=20;
		System.out.println(+(a+b));
		int c = Integer.MAX_VALUE;
		float d = Float.MAX_VALUE;
		byte e = Byte.MAX_VALUE;
		short f = Short.MAX_VALUE;
		char g =  'A';
		long h = Long.MAX_VALUE;
		double i = Double.MAX_VALUE;
		boolean j =true;
		if(j)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		System.out.println("Integer Max Value is:"+c);
		System.out.println("Float Max Value is:"+d);
		System.out.println("Byte Max Value is:"+e);
		System.out.println("Short Max Value is:"+f);
		System.out.println("Character is:"+g);
		System.out.println("Long Max Value is:"+h);
		System.out.println("Double Max Value is:"+i);
		System.out.println("Boolean value is:"+j);
		String k = "Hello World";
		System.out.println(k);
	}
}
