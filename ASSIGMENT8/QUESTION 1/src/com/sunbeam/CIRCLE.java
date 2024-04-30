package com.sunbeam;
import com.sunbeam.Invalidexecption;

public class CIRCLE {
	
	
	private point2D centerPoint =  null; 
	private double myDiameter = 0;
	
	
	public CIRCLE() {
		this.centerPoint = new point2D(0, 0);
		this.myDiameter = myDiameter;
		
	}
	public CIRCLE(double x, double y ,double myDiameter) {
		 this.centerPoint =new point2D(x,y);
		
	}
	
	public void setMyDiameter(double myDiameter) throws Exception{
		
		if(myDiameter < 0) {
			throw new Exception(new Invalidexecption("diameter is Negative"));
		}
		this.myDiameter = myDiameter;
		}
	@Override
	public String toString() {
		return "CIRCLE [centerPoint=" + centerPoint.toString() + ", myDiameter=" + myDiameter + "]";
	}
	}
		



	
