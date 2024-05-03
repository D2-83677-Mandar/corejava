package com.sunbeam;

import java.util.Scanner;

public class Student implements Comparable<Student> {
	int RollNo;
	String Name ;
	int marks;
	String course;
	
	
	
	public Student() {
		
	}



	public Student(int rollNo, String name, int marks, String course) {
		super();
		RollNo = rollNo;
		Name = name;
		this.marks = marks;
		this.course = course;
	}



	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", marks=" + marks + ", course=" + course + "]";
	}



	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.RollNo-o.RollNo;
	}
	
	public void accept() {
		
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Roll No :");
	    RollNo =  sc.nextInt();
	     System.out.println("Enter the Name :");
	     Name =sc.next();
	     System.out.println("Enter the Marks :");
	     marks=sc.nextInt();
	     System.out.println("Enter the course :");
	    course= sc.next();
	     
		
	}
	

}
