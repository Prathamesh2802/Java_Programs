package com.java.Exams;

import java.util.Scanner;

public class Questionninth {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Pin:");
			int pin = sc.nextInt();
			int amount=0,withdraw=0,depam=0;
			String ch="";
			boolean choice = true;
			if(pin ==1234)
			{
				
				while(choice)
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
							System.out.println(" You cannot withdraw money which is more than your bank balance");
						}
						else
						{						
							amount-=withdraw;
							System.out.println("Amount "+ withdraw+" Rs has been successfully Withdrawn");
						}
						break;
					case "balance":
						System.out.println("Your Bank Balance is:"+amount);
						break;
					case "exit":
						System.out.println("Successfully exited");
						choice = false;
						break;
					default:
						System.out.println("Invalid choice");
						choice=false;
						break;
						
						
					}
					
					
				}
			}
			else
			{
				System.out.println("Invalid Pin");
			}
			sc.close();
			
		}
	
}
