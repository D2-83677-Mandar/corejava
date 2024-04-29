package com.sunbeam;

import java.util.Scanner;

public class commEmployee extends Employee {
	
	private  int grossSale;
	private double commRate;
	@Override
	public String toString() {
		return "commEmployee [grossSale=" + grossSale + ", commRate=" + commRate + ", toString()=" + super.toString()
				+ "]";
	}
	public commEmployee(int grossSale, double commRate) {
		super();
		this.grossSale = grossSale;
		this.commRate = commRate;
	}
	public commEmployee() {
		
	}
	public int getGrossSale() {
		return grossSale;
	}
	public void setGrossSale(int grossSale) {
		this.grossSale = grossSale;
	}
	public double getCommRate() {
		return commRate;
	}
	public void setCommRate(double commRate) {
		this.commRate = commRate;
	}
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		
		System.out.println("Enter the gross sale :");
		grossSale=sc.nextInt();
		System.out.println("enter the comm rate :");
		commRate = sc.nextDouble();
		
	}
	
	@Override
	public double payRollCalculation() {
		// TODO Auto-generated method stub
		return grossSale*commRate ;
	}
	
	
	

}
