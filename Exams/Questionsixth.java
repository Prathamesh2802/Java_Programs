package com.java.Exams;

public class Questionsixth {
	public static void main(String[] args) {
		
		for(int rows=1;rows<=5;rows++)
		{
			for(int cols=1;cols<=5;cols++)
			{
				if(rows==3 || cols ==3 || rows==2 && cols==2 || rows==2 && cols==4 || rows==4 && cols==4 ||  rows==4 && cols==2 || rows==5 && cols==3 || rows==2 & cols==3 || rows==4 & cols==3)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
