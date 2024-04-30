package com.sunbeam;

import java.lang.Math;

import java.util.Scanner;

public class point2D {
	
	Scanner sc = new Scanner(System.in);

	int x;
	int y;

	public point2D(int x, int y) {
	
		this.x = x;
		this.y = y;
	}

	public point2D() {

	}

	public point2D(double x2, double y2) {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public void accept() {
		
		System.out.println("Enter the X :" );
		setX(sc.nextInt());
		System.out.println("Enter the Y :" );
		setY(sc.nextInt());
		
	}
	
	
	public String toString() {
	
		return ("("+x+","+y+")");
		
	}
    
     
	
	public boolean isEqual(int x2,int y2) {
		if(x==x2 && y==y2) {
		return true;
		}
		else {
		return false;
		}
		}
	
	public double calculateDistance(int x2,int y2) {
		double res=Math.sqrt(((getX()-x2)*(getX()-x2))+((getY()-y2)*(getY()-y2)));
		        return res;
		}
}
