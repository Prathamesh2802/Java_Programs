package com.java.Operator;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in))
		{
			
			System.out.print("Enter the Username:");
			String uname = sc.next();
			if(uname.equals("Prat@2001"))
			{
				System.out.println("Your username is Correct");
				System.out.print("Enter the Pass:");
				String Pass = sc.next();
				if(Pass.equals("abcd"))
				{
					System.out.println("Login Successful");
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
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

}
