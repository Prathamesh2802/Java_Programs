package com.java.TypeCasting;

public class Typecast1 {
	public static void main(String[] args) {
		int a = 12;
		float b = (float)a;
		System.out.println(b);
		String c = String.valueOf(a);
		System.out.println(c);
		String d = c+c;
		System.out.println( );
		int e = Integer.parseInt(d);
		e+=e;
		System.out.println(e);
		
	}
}
