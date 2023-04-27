package com.java.switches;

public class BasicLoop {
	public static void main(String args[])
	{
		String name = "Pinu";
//		for(initialization;condition;increment/decrement)
		for(int i=1;i<=100;i++)
		{
			System.out.print(name+" ");
			if(i%20==0)
			{
				System.out.println("");
			}
		}
	}
}
