package com.java.Exam2;

public class Question13 {
//	Binary Search
	public static void main(String[] args) {
		int arr[] = {90,82,76,56,32,11};
		int target = 56;
		int val = Location(arr,target);
		System.out.println(val);
		
	}
	static int Location(int arr[], int target)
	{
		int start = 0, end = arr.length-1;
		boolean isasc = arr[start]<arr[end];
		
		while(start<=end)
		{
			int mid = end+(start-end)/2;
			if(target == arr[mid])
			{
				return mid;
			}
			if(isasc)
			{
				if(target<arr[mid])
				{
					end = mid-1;
				}
				else
				{
					start = mid+1;
				}

			}
			else
			{
				if(target>arr[mid])
				{
					end = mid-1;
				}
				else
				{
					start = mid+1;
				}
			}
		}
		return -1;
	}
}
