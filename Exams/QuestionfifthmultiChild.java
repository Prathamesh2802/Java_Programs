package com.java.Exams;

public class QuestionfifthmultiChild extends QuestionfifthMultiparent {
	void getdata()
	{
		super.getdata();
		System.out.println("This is the method from the child class");
	}
	public static void main(String[] args) {
		QuestionfifthmultiChild q1 = new QuestionfifthmultiChild();
		q1.getdata();
	}
}
