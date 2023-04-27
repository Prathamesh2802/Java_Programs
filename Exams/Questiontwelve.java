package com.java.Exams;

public class Questiontwelve {
	public static void main(String[] args) {
		System.out.println();
		for(int rows=1;rows<=5;rows++)
		{
			for(int cols=1;cols<=5;cols++)
			{
				if(rows==1 || rows==3 || rows==5 || rows==2 & cols==1 || rows==4 & cols==1)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
				
		}
	}
}
