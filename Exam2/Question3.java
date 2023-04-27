package com.java.Exam2;

public class Question3 {
 public static void main(String[] args) {
//	Hollow Pattern
	 for(int rows=1;rows<=4;rows++)
	 {
		 for(int cols=1;cols<=3;cols++)
		 {
			 if( rows==1 && cols>=1 || rows==4 && cols>=1 || rows>=1 && cols==1 || rows>=1 && cols==3)
			 {
				 System.out.print("*");
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
