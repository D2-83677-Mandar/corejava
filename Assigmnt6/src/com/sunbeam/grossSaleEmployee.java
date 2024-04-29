package com.sunbeam;

import java.util.Scanner;

public class grossSaleEmployee extends commEmployee {

	
	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public grossSaleEmployee(int grossSale, double commRate, double baseSalary) {
		super(grossSale, commRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public int getGrossSale() {
		// TODO Auto-generated method stub
		return super.getGrossSale();
	}

	@Override
	public double getCommRate() {
		// TODO Auto-generated method stub
		return super.getCommRate();
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		
		System.out.println("enetr the badse Salary");
		baseSalary= sc.nextDouble();
	}

	@Override
	public double payRollCalculation() {
		// TODO Auto-generated method stub
		return super.payRollCalculation() + baseSalary + (baseSalary*0.10);
	}

	public grossSaleEmployee()
	{
		
	}

	@Override
	public String toString() {
		return "grossSaleEmployee [baseSalary=" + baseSalary + ", toString()=" + super.toString() + ", getGrossSale()="
				+ getGrossSale() + ", getCommRate()=" + getCommRate() + "]";
	}
}
