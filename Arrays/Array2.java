package com.java.Arrays;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Array2 {
	public static void main(String args[])
	{
		int arr[] = {12,3,4,5,6};
		
		ArrayList<Integer> l1 =new ArrayList<>(); 
		l1.add(12);
		l1.add(24);
		l1.add(2);
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(l1.get(0));
		System.out.println(l1);
		Integer arr1[] = {12,3,4,5,6,7};
		Arrays.sort(arr);
		Collections.sort(Arrays.asList(arr1));
		
		System.out.println(Arrays.toString(arr));
	}
}
