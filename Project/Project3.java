package com.java.Project;

import java.util.Scanner;

public class Project3 {
	public static void main(String args[])
	{
	 int amount=0;
	 boolean isloop = true;
	 String location = "";
	 try(Scanner sc=new Scanner(System.in))
	 {
		 while(isloop)
		 {
			 System.out.println("Pune \nMumbai \n Enter your Choice:");
			 location = sc.next().toLowerCase();
			 switch(location)
			 {
			 case "pune":
				 System.out.println("Enter the amount:");
				 amount  = sc.nextInt();
				 if(amount>=400)
				 {
					 System.out.println("You can go to Pune with this amount using shivneri bus \n");
				 }
				 if(amount>=500)
				 {
					 System.out.println("You can go to Pune with this amount by using shivsahi bus \n");
				 }
				 else
				 {
					System.out.println("Not enough money"); 
				 }
				 break;
			 case "mumbai":
				 System.out.println("Enter the amount:");
				 amount  = sc.nextInt();
				 if(amount>=700)
				 {
					 System.out.println("You can go to Mumbai with this amount by using shivneri bus \n");
				 }
				 if(amount>=800)
				 {
					 System.out.println("You can go to Mumbai with this amount by using shivsahi bus \n");
				 }
				 else
				 {
						System.out.println("Not enough money"); 
				 }
				 break;
			 case "exit":
				 System.out.println("Exited suceesfully");
				 isloop = false;
				 break;
			 
			 default:
				 System.out.println("Invalid Choice");
				 isloop = false;
				 break;
				 
			 }
			
		 }
		  
	 }
	}
}
