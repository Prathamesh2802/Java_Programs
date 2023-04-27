package com.java.Operator;

public class Vote {
	public static void main(String args[])
	{
		int m=22,f=18;
		if(m>18 && m<24)
		{
			System.out.println("The male Person is eligible to Vote but is not Eligible for the Marriage");
		}
		else if(m>=24)
		{
			System.out.println("The male Person is eligible to Vote but is not Eligible for the Marriage");
		}
		else
		{
			System.out.println("The male person is not eligible for both Voting and Marriage");
		}
		
		if(f>18 && f<21)
		{
			System.out.println("The Female Person is only eligible for Voting");
		}
		
		else if(f>=21)
		{
			System.out.println("The Female Person is eligible for Voting and Marriage");

		}
		else
		{
			System.out.println("The Female person is not eligible for both Voting and Marriage");
		}
	}
}
