package com.sunbeam;

import java.util.Scanner;

public class salariedEmployee extends Employee {
	
	
	private double WeeklySalary;

	@Override
	public String toString() {
		return "salariedEmployee [WeeklySalary=" + WeeklySalary + ", toString()=" + super.toString() + "]";
	}

	public salariedEmployee(double weeklySalary) {
		super();
		WeeklySalary = weeklySalary;
	}
	
	public salariedEmployee() {
		
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter the weeliy salary :");
		WeeklySalary = sc.nextDouble();
		
	}

	public double getWeeklySalary() {
		return WeeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		WeeklySalary = weeklySalary;
	}

	@Override
	public double payRollCalculation() {
		// TODO Auto-generated method stub
		return WeeklySalary;
		
	}

}
