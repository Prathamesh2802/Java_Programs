package com.java.switches;
import java.util.Scanner;
public class Bank_transaction {
	public static void main(String args[])
	{
//		Switch choice by using int
		try(Scanner sc=new Scanner(System.in))
		{
			int amount=0,withdraw=0;
			int ch = 0;
			while(ch<=3 && ch>=0)
			{
				System.out.println("1.Deposit \n2.Withdraw \n3.Bank Balance \n4.Exit \n Enter Your Choice:");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.print("Enter the Amount to Deposit in your bank Account:");
					amount = sc.nextInt();
					System.out.println("Amount"+amount+" Rs has been successfully deposited");
					break;
					
				case 2:
					System.out.print("Enter the Amount to Withdraw from your bank Account:");
					withdraw = sc.nextInt();
					if(withdraw>amount)
					{
						System.out.println("You cannot withdraw money which is more than your bank balance");
					}
					else
					{						
						amount-=withdraw;
						System.out.println("Amount"+ withdraw+" Rs has been successfully Withdrawn");
					}
					break;
				case 3:
					System.out.println("Your Bank Balance is:"+amount);
					break;
				case 4:
					System.out.println("Successfully exited");
					break;
				default:
					System.out.println("Invalid choice");
					break;
					
				}
				
			}
			
		}
	}
}
