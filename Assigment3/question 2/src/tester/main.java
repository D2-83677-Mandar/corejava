package tester;

import com.app.geometry.point2D;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		point2D p1 = new point2D();
		point2D p2 = new point2D();
		p1.accept();
		p2.accept();
		String result = p1.getDetails();
		System.out.println(result);
		String r2 = p2.getDetails();
		System.out.println(r2);
		
		
		if (p1.isEqual(p2.getX(),p2.getY())) {
			System.out.println("x is equal to y");
			}
			else {
			System.out.println(p1.calculateDistance(p2.getX(), p2.getY()));
			
			}

		
		
		
	}

}
