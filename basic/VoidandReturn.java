package com.java.basic;
import java.util.Scanner;
public class VoidandReturn {
	static void getdata(int a)
	{
		a=a+10;
		System.out.println(a);
	}
	 int putdata(int a)
	{
		a=a+10;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =21;
		getdata(a);
		VoidandReturn ab = new VoidandReturn();
		System.out.println(a);
		System.out.println(ab.putdata(a));
		
		try(Scanner sc  = new Scanner(System.in))
		{
			int b,c;
			System.out.println("Enter the first Number:");
			b=sc.nextInt();
			System.out.println("Enter the Second Number:");
			c=sc.nextInt();
			System.out.println(b+c);
		}
	}

}
