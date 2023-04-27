package com.java.Collections;

//import java.util.Arrays;
import java.util.ArrayList;
//import java.util.Collections;

// Collection in a java is a framework thus provide complete architecture used to store and Manipulate group of Object

// By using Collection we can achieve all the operation perform in data such as sorting, Inserting, deletion and updating etc.


// List Interface
// List based on index type data structure
// Duplicates are allowed
// we can have any no of Null value
// Order of Insertion is Maintain

// Set Interface
// Set does not based in values it uses hash code
// Duplicates are not allowed
// we can only have one null value
// Order of insertion random

// by using iterator we can use to retrieve value of list, set, queue
// List iterator can be use to retrieve the value of list
// by using Enumeration, we can use to retrieve the value of vector

public class Firstprog {
 
	public static void main(String[] args) {
		
		ArrayList <Integer> a1 = new ArrayList<>();
		a1.add(12);
		a1.add(56);
		a1.add(34);
		String ab="";
		ab=String.valueOf(a1);
		System.out.println(ab.substring(1,ab.length()-1));
		System.out.println(a1.get(1));
		System.out.println(a1.isEmpty());
		System.out.println(a1.toString().substring(1,ab.length()-1));
		a1.add(3,67);
	}
}
