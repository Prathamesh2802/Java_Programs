package com.java.Stringmani;

public class Stringassignment {
	public static void main(String[] args) {
		String s2= "APP123LE";
		System.out.println(s2.substring(0,3)+s2.substring(6,8)+s2.substring(3,6));
		String s3= "Apple Mango";
		String s4[] = s3.split(" ");
		for(String s5:s4)
		{
			System.out.print(s5+" ");
			
		}
		System.out.println();
		for(int i=s4.length-1;i>=0;i--)
		{
			System.out.print(s4[i]+" ");
		}
		
	}
}
