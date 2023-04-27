package com.java.Methods;

public class Staticmethod1 {
	int a=12;
	static int b=23;
	static int getdata()
	{
		int c=34;
		return c;
	}
	static int greater(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[j]>arr[i])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr[0];
	}
	
	public static void main(String[] args) {
		Staticmethod1 s1= new Staticmethod1(); 
		System.out.println(s1.a);
		System.out.println(b);
		int c=getdata();
		System.out.println(c);
		int arr[] = {1,2,4,7,6,10,5};
		System.out.println("Greatest Number is:"+greater(arr));
	}
}
