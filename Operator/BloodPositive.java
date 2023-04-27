package com.java.Operator;

import java.util.Scanner;

public class BloodPositive {
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in))
		{
			String blood_group = sc.next().toUpperCase()+"+";		
			if(blood_group.equals("A+"))
			{
				System.out.println("You can Donate blood to only A+ blood Group Members only");
			}
			else if(blood_group.equals("A-"))
			{
				System.out.println("You can Donate blood to only A- blood Group Members only");
			}
			else if(blood_group.equals("B+"))
			{
				System.out.println("You can Donate blood to only B+ blood Group Members only");
			}
			else if(blood_group.replace("+","").equals("AB"))
			{
				System.out.println("You can get blood from any A+,B+ and O+ blood Group Members");
			}
			else if(blood_group.equals("B-"))
			{
				System.out.println("You can Donate blood to only B- blood Members ");
			}
			else if(blood_group.equals("O+"))
			{
				System.out.println("You can Donate blood All of the other blood group Members");
			}
			else if(blood_group.equals("O-"))
			{
				System.out.println("You can Donate blood to only o- blood group Members only");
			}
			else
			{
				System.out.println("Invalid Blood Group");
			}
		}
	}
}
