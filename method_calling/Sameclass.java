package com.java.method_calling;
import com.java.diff_pack.*;
public class Sameclass {
	public static void main(String[] args) {
		method1();
		method2();
		Diffclass.method3();
		Diffclass.method4();
		Diffpack_Difflclass.method5();
		Diffpack_Difflclass.method6();
		
		
	}
	public static void method1()
	{
		System.out.println("I am static method1 call from the same class");
	}
	public static void method2()
	{
		System.out.println("I am static method2 call from the same class");
	}
}
