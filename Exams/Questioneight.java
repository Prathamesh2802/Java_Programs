package com.java.Exams;
import java.util.Scanner;

public class Questioneight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String uname = sc.next();
		System.out.println("Enter the Pass:");
		String pass=  sc.next();
		if(uname.equals("abc") && pass.equals("123") || uname.equals("pinu") && pass.equals("pinu"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Invalid Username or Password");
		}
		sc.close();
	}
}
