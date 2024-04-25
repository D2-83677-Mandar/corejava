package tester;

import java.util.Iterator;
import java.util.Scanner;

import com.app.geometry.point2D;

public class TestPointArray1 {

	public static void main(String[] args) {

		int pointcount = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no points you want to plot");
		pointcount = sc.nextInt();
		point2D point2d[] = new point2D[pointcount];

		for (int i = 0; i < pointcount; i++) {
			int x, y;
			System.out.println("Enter the x codeinate");
			x = sc.nextInt();
			System.out.println("Enter the Ycodeinate");
			y = sc.nextInt();
			point2d[i] = new point2D(x, y);

		}

		int choice;

		do {

			System.out.println("1. Display details of a specific point");
			System.out.println("2) Display x, y ordinates of all points");
			System.out.println("3) User i/p : 2 indices for the points ,validate the indices");
			System.out.println("4) Exit ");

			System.out.println("Enter your choice ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				int index ;
				System.out.println("enter point indxe do you want ");
				index = sc.nextInt();
				System.out.println(point2d[index].getDetails());
				break;

			case 2:
                   for(int i = 0;i<point2d.length;i++)
                   {
                	   System.out.println(point2d[i].getDetails());
                   }
				break;

			case 3:
				
				int pt1,pt2;
				System.out.println("enter the point 1");
				pt1=sc.nextInt();
				System.out.println("enter the point 2");
				pt2=sc.nextInt();
				if (point2d[pt1].isEqual(point2d[pt2])) {
					System.out.println("x is equal to y");
					}
					else {
						double res;
						
				res= point2d[pt1].calculatedistance(point2d[pt2]);
					System.out.println(res);
					}

				
				break;
			case 4:
				System.out.println("thank you!!!!!!!!!!!!!");

				break;

			default:
				break;
			}

		} while (choice != 4);

	}

}
