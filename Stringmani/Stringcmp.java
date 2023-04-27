package com.java.Stringmani;

// String is a Collection of Character
// String is a class which is present in a java.lang Package
// String object can be created in a 2 ways : 1)New Keywords 2) Without using New Keywords.
// String memory with using new Keyword stores in non constant pool area
// String memory without using new Keyword stores in constant pool area



public class Stringcmp {
	public static void main(String[] args) {
		String a = "abc";
		String b="def";
		String c = " ";
		String r = "abc";
		String g="alpha Version";
		String abcd = new String("abc");
		System.out.println(abcd.replace('c', 'd'));
		System.out.println(abcd.replaceAll("abc", "abcd"));
		System.out.println(a.equals(b))	;
		a=a.toUpperCase();
		System.out.println(a);
		System.out.println(a.concat(" "+b));
		System.out.println(a.toUpperCase());
		System.out.println(a.length());
		System.out.println(b.toLowerCase());
		System.out.println(a.charAt(0));
		System.out.println(b.length());
		System.out.println(a.contains(b));
		System.out.println(a.contains("b".toUpperCase()));
		System.out.println(c.isEmpty());
		System.out.println(c.isBlank());
		System.out.println(a.toLowerCase().indexOf("b"));
		System.out.println(a.indexOf("C"));
		System.out.println(a.lastIndexOf("C"));
		System.out.println(a.startsWith("AB"));
		System.out.println(a.endsWith("C"));
		String s1="abc";
		String s2 = new String("abc");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(a.equalsIgnoreCase(r));
		System.out.println(r.substring(2));
		System.out.println(g.substring(3,8));
	}
}
