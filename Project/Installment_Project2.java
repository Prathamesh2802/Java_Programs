package com.java.Project;

import java.util.Scanner;

public class Installment_Project2 {
	public static void main(String args[])
	{
		try(Scanner sc=new Scanner(System.in))
		{			
			int totalamount = 100000,totaldays=30,dayrem=0, birthdays=0,savingam=0;
			int perdayam=0, extraamount=0, days=0,dayam=0;
			boolean monthlyamount = true;
			while(monthlyamount)
			{
				System.out.println("1.perdayam \n2.calculate for 30 days amount \n3.Birthday amount \n4.Saving Amount \n5.Exit \nEnter Your Choice:");
				int ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter the days: ");
					days = sc.nextInt();
					int i=0;
					if(days>30)
					{
						System.out.println("You can only calculate the installment upto 30 days");
						days=0;
					}
					else
					{
						for(i=1;i<=days;i++)
						{
							System.out.println("Enter the amount spent for the day"+i);
							dayam = sc.nextInt();
							perdayam+=dayam;
						}
						System.out.println("Amount spent in "+days+"is :"+perdayam);
					}
					break;
				case 2:
					if(totaldays == days)
					{
						System.out.println("Amount spent in a month is:"+(perdayam+extraamount));
					}
					else
					{
						dayrem = totaldays-days;
						perdayam*=dayrem;
						System.out.println("Amount spent in month is"+(perdayam+extraamount));
					}
					break;
				
				case 3:
					System.out.println("Enter the number of birthdays in a month:");
					birthdays = sc.nextInt();
					if(birthdays>30)
					{
						System.out.println("There cannot be more than 30 birthdays in a month");
					}
					else if(birthdays<0)
					{
						System.out.println("There cannot be negative birthdays");
					}
					else
					{
						System.out.println("Enter birthday amount:");
						extraamount = sc.nextInt();
						extraamount*=birthdays;
						System.out.println("Extra_amount used for birthday in this month:"+extraamount);
					}
					break;
				
				case 4:
					savingam = totalamount-(perdayam+extraamount);
					System.out.println("Your savings amount in this month is:"+savingam);
					break;
					
				case 5:
					System.out.println("Exited Successfully");
					monthlyamount=false;
					break;
				
				default:
					System.out.println("Invalid Choice");
					monthlyamount=false;
					break;
				}
			}
		}
	}
	
}
