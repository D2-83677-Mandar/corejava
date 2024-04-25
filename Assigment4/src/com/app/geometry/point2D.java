package com.app.geometry;

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
	
	
	public String getDetails() {
	
		return ("("+x+","+y+")");
		
	}
    
     
	
	public boolean isEqual(point2D p2) {
		if(this.x==p2.x && this.y==p2.y) {
		return true;
		}
		else {
		return false;
		}
		}
	
	public double calculatedistance(point2D p) {
		double distance= Math.pow(p.x-this.x,2)+Math.pow(p.y-this.x,2);
		double result=Math.sqrt(distance);
		return result;
		}

	}

