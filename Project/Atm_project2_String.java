package com.java.Project;

import java.util.Scanner;

public class Atm_project2_String {
	public static void main(String args[])
	{
//		Switch choice by using String
		try(Scanner sc=new Scanner(System.in))
		{
			int amount=0,withdraw=0,depam=0;
			String ch="";
			while(ch.equals("Deposit".toLowerCase()) || ch.equals("Withdraw".toLowerCase()) || ch.equals("Balance".toLowerCase()) || ch.equals(""))
			{
				System.out.println("Deposit \nWithdraw \nBalance \nExit \n Enter Your Choice:");
				ch=sc.next().toLowerCase();
				switch(ch.toLowerCase())
				{
				case "deposit":
					System.out.print("Enter the Amount to Deposit in your bank Account:");
					depam= sc.nextInt();
					amount+=depam;
					System.out.println("Amount "+amount+" Rs has been successfully deposited");
					break;
					
				case "withdraw":
					System.out.print("Enter the Amount to Withdraw from your bank Account:");
					withdraw = sc.nextInt();
					if(withdraw>amount)
					{
						System.out.println("❌ You cannot withdraw money which is more than your bank balance");
					}
					else
					{						
						amount-=withdraw;
						System.out.println("Amount 💵"+ withdraw+" Rs has been successfully Withdrawn");
					}
					break;
				case "balance":
					System.out.println("Your Bank Balance is 💵:"+amount);
					break;
				case "exit":
					System.out.println("Successfully exited 👍");
					break;
				default:
					System.out.println("Invalid choice 😞");
					break;
					
				}
				
			}
			
		}
	}
}

