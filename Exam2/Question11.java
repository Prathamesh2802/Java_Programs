package com.java.Exam2;

public class Question11 {
	public static void main(String[] args) {
//		Finding biggest val in an Array
		int arr[] = {123,445,6,34,324,21,434,234};
		int max = Maxarr(arr);
		System.out.println("The highest Number is an Array is: "+max);
	}
	static int Maxarr(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
		}
		return max;
	}
}
