package com.java.Ifelse;

import java.util.Scanner;

public class Nestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String uname = sc.next();
		if(uname.equals("abc"))
		{
			System.out.println("Enter Password:");
			String Password = sc.next();
			if(Password.equals("abc"))
			{
				System.out.println("Login Successfull");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Username");
		}
		sc.close();
	}
}
