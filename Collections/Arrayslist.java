package com.java.Collections;

import java.util.ArrayList;
import java.util.Collections;

// List based on index type data structure
// Duplicates are allowed
// we can have any no of Null value
// Order of Insertion is Maintain


// Set does not based in values it uses hash code
// Duplicates are not allowed
// we can only have one null value
// Order of insertion maintained


public class Arrayslist {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add("Hello");
		a1.add(null);
		a1.add('a');
		System.out.println(a1.size());
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		a1.add(4,67);
		a1.set(2, "World");
		System.out.println(a1);
		for(int i=0;i<a1.size();i++)
		{
			System.out.print(a1.get(i)+" ");
		}
		for(Object temp:a1)
		{
			System.out.print(temp+" ");
		}
		
	}
}
