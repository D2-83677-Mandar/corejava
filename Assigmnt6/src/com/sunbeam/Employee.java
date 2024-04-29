package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
	private int empId;
     private String Name;
     private  double salary;
     
    public Employee() {
    	
    }
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		Name = name;
		this.salary = salary;
	}

	
	
	public void accept(Scanner sc) {
		System.out.println("Enter empid - ");
		empId = sc.nextInt();
		System.out.println("Enter name - ");
		Name = sc.next();
		
	}
	
	public double getsalary() {
		return salary;
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + ", salary=" + salary + "]";
	}
	
	public abstract double   payRollCalculation();
	
     

}
