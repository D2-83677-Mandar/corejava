package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	Scanner sc= new Scanner(System.in);
	
	
	private String color;
	private double weight;
	private String Name;
	private boolean isfresh;
	
	
  public  Fruit() {
	  
	
}
	
	public Fruit(String color, double weight, String name, boolean isfresh) {
		super();
		this.color = color;
		this.weight = weight;
		Name = name;
		this.isfresh = isfresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public boolean isIsfresh() {
		return isfresh;
	}

	public void setIsfresh(boolean isfresh) {
		this.isfresh = isfresh;
	}
	
	
	public String toString() {
		return "Fruit{" +
                "name='" + Name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
		
		
	}
	
	public String test() {
		return "no spesciif test";
		
	}
	public void accept() {
		
		System.out.println("Enter the name :");
		Name = sc.next();
		System.out.println("Enter the color :");
		color = sc.next();
		System.out.println("Enter the wight :");
		weight = sc.nextDouble();
		System.out.println("Enter the  it is fersh :");
		isfresh = sc.nextBoolean();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
