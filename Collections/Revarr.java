package com.java.Collections;

public class Revarr {
public static void main(String[] args) {
	String arr[] = {"abc","sef","fgd"};
	for(int i=arr.length-1;i>=0;i--)
	{
		for(int j=arr[i].length();j>=0;j--)
		{
			System.out.println(arr[j].charAt(i));
		}
	}
}
}
