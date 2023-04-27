package com.java.Exam2;

public class Question12 {
 public static void main(String[] args) {
	String a = "Hello World";
	String b = "      abc";
	System.out.println(a.length());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.replace("Hello","Bye"));
	System.out.println(a.indexOf("H"));
	System.out.println(a.lastIndexOf("d"));
	System.out.println(a.charAt(2));
	System.out.println(a.equals("Hello World"));
	System.out.println(a.equalsIgnoreCase("Hello World"));
	System.out.println(a.substring(0,6));
	System.out.println(b.trim());
	System.out.println(a.equals(b));
}
}
