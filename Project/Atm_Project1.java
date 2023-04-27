package com.java.Project;

import java.util.Scanner;

public class Atm_Project1{
	public static void main(String args[])
	{
//		Switch choice by using int
		try(Scanner sc=new Scanner(System.in))
		{
			int amount=0,withdraw=0,depam=0;
			int ch=0,ch1=0;
			System.out.print("Enter the Pin of the bank Account 🔑 :");
		    int pass = sc.nextInt();
		    if(pass == 123456)
		    {
		    	
		    	while(ch1<=3 && ch1>=0)
		    	{
		    		System.out.println("1.Deposit \n2.Withdraw \n3.Bank Balance \n4.Exit \n Enter Your Choice:");
		    		ch=sc.nextInt();
		    		switch(ch)
		    		{
		    		case 1:
		    			System.out.print("Enter the Amount to Deposit in your bank Account:");
		    			depam = sc.nextInt();
		    			amount +=depam;
		    			System.out.println("Amount 💵 "+amount+" Rs has been successfully deposited");
		    			ch1=1;
		    			break;
		    			
		    		case 2:
		    			System.out.print("Enter the Amount to Withdraw from your bank Account:");
		    			withdraw = sc.nextInt();
		    			if(withdraw>amount)
		    			{
		    				System.out.println("❌ You cannot withdraw money which is more than your bank balance");
		    			}
		    			else if(withdraw<=0)
		    			{
		    				System.out.println("❌ You cannot withdraw the amount which is less than or equal to 0");
		    			}
		    			else
		    			{						
		    				amount-=withdraw;
		    				System.out.println("Amount 💵 "+ withdraw+" Rs has been successfully Withdrawn ");
		    			}
		    			ch1=2;
		    			break;
		    		case 3:
		    			System.out.println("Your Bank Balance is 💵:"+amount);
		    			ch1=3;
		    			break;
		    		case 4:
		    			System.out.println("Successfully exited 👍");
		    			ch1=4;
		    			break;
		    		default:
		    			System.out.println("Invalid choice 😞");
		    			ch1=5;
		    			break;
		    			
		    		}
		    		
		    	}
		    }
		    else
		    {
		    	System.out.println("Invalid Pin");
		    }
			
		}
	}
}
