package com.java.Methods;

	class Methodoverriding11 {
		void getdata()
		{
			System.out.println("Bye");
		}
	}
	
	public class Methodoverridingusingsuper extends Methodoverriding11
	{
		void getdata()
		{
			System.out.println("Hello");
			super.getdata();
			
		}
		public static void main(String[] args) {
			Methodoverridingusingsuper o1 = new Methodoverridingusingsuper();
			o1.getdata();
		}
	}

