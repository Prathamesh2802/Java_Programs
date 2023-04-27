package com.java.Operator;

public class Budget_conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int budget = 60000;
		if(budget>=60000)
		{
			System.out.println("You can buy IPhone");
		}
		else if(budget>=50000)
		{
			System.out.println("You can buy Pixel Phone");
		}
		else if(budget>=40000 )
		{
			System.out.println("You can buy OnePlus Phone");
		}
		else if(budget>=30000)
		{
			System.out.println("You can buy Samsung Phone");
		}
		else if(budget>=25000)
		{
			System.out.println("You can buy Nothing Phone");
		}
		else if(budget>=20000 )
		{
			System.out.println("You can buy Oppo or Lenovo Phone");
		}
		else if(budget>=10000)
		{
			System.out.println("You can buy Redmi Device");
		}
		else if(budget>=5000)
		{
			System.out.println("You can buy JioPhone");
		}
		else if(budget>=1000)
		{
			System.out.println("You can buy Nokia Phone");
		}
		else
		{
			System.out.println("Not Enough Money For the Phone");
		}
	}

}
