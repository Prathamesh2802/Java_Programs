package com.java.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Array1 {
	
	public static void main(String[] args) {
		String a="";
		int no=0;
		Integer arr[] = {10,90,40,50,60};
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		for (int i=0;i<arr.length;i++)
		{
			a+=arr[i]+",";
		}
		while(no<arr.length)
		{
			System.out.println(arr[no]);
			no++;
		}
		System.out.println("Array is:"+a.substring(0,a.length()-1));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
				
		}
		System.out.println(Arrays.toString(arr));
		Collections.sort(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
		Collections.reverse(Arrays.asList(arr));
		System.out.print(Arrays.toString(arr));
	}
}
