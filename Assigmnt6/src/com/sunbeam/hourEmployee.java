package com.sunbeam;

import java.util.Scanner;

public class hourEmployee  extends Employee{
	
	private double wages;
	private int hrs;
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	@Override
	public String toString() {
		return "hourEmployee [wages=" + wages + ", hrs=" + hrs + ", toString()=" + super.toString() + "]";
	}
	public hourEmployee() {
		super();
		this.wages = wages;
		this.hrs = hrs;
	}
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		
		super.accept(sc);

		System.out.println("Enter the wages :");
		wages = sc.nextDouble();
		System.out.println("enter thr hrs :");
		hrs = sc.nextInt();
		
	}
	@Override
	public double payRollCalculation() {
	       double total;
	       total= wages *  hrs;
	       if (hrs>40) {
	    	   total += (hrs-40)*(wages*0.5);
	    	   
	    	   
	    	   
			
		}
		return total;
	      	       
		
	}
	
	
	

}
