package taster;

import java.util.Scanner;
import com.sunbeam.Invalidexecption;

import com.sunbeam.CIRCLE;

public class test {
	public static void main(String[] args) {
		
		
		Scanner sc =  new Scanner(System.in);
		CIRCLE c1 = new CIRCLE();
		
		
		
		try {
			System.out.println("Enyter the diameter :");
			c1.setMyDiameter(sc.nextDouble());
			System.out.println(c1.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		System.out.println("program terminated successfullay");
	}

}
