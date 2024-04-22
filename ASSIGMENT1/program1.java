package assigemnt1;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 0;
	    double num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num 1 =");
		if(sc.hasNextDouble()) {
	
	num1 =sc.nextDouble();
		}else {
            System.err.println("Error: Please enter a valid double number.");
                    return; // Terminate the program
        }
		System.out.println("Enter the num 2=");
		if(sc.hasNextDouble()) {
	
	num2=sc.nextDouble();
		}else {
            System.err.println("Error: Please enter a valid double number.");
           
            return;
        }
		
		
		double avg = (num1 + num2)/2;
	System.out.println("num1" +num1 + "num2" +num2 + "is" + avg);
		
	
	
	

	
	
		

	}

}
