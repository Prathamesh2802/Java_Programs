package com.java.Stringmani;

import java.util.Arrays;

public class Stringreplace {
	public static void main(String[] args) {
		String abc = "12,3,4,5,6,7,";
		String a[]=abc.split(",");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		String ab = Arrays.toString(a);
		System.out.println(ab);
	}
}
