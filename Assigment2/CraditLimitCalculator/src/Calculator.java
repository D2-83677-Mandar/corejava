import java.util.Scanner;

public class Calculator {
	int AccountNumber;
	int AllowedCradit;
	int totalItemCharged;
	int pendiingBalance;
	int totalCraditApplied;
	int newbal;
	
	

	
		
		
		public void accept() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Account Number");
		 AccountNumber = sc.nextInt();

		System.out.println("Enter  Allowed Cradit");
	 AllowedCradit = sc.nextInt();

		System.out.println("Enter total Item Charged");
		 totalItemCharged = sc.nextInt();

		System.out.println("Enter pending balance");
		pendiingBalance = sc.nextInt();

		System.out.println("Enter Total cradit applied");
		 totalCraditApplied = sc.nextInt();
		}
		
		public void calculate() {

			int newbal = pendiingBalance + totalItemCharged - AllowedCradit;

			System.out.println("Equivanalant balance is " + newbal);

			if (newbal > totalCraditApplied) {
				System.out.println("Credit Limit Exceeded");
			}
			System.out.println("HAPPY SHOPPING !!!!!!");
		}
		
		public void display() {
			System.out.println(" Account Number"+ AccountNumber);
			System.out.println(" Account Number"+ AllowedCradit);
			System.out.println(" Account Number"+ totalItemCharged);
			System.out.println(" Account Number"+ pendiingBalance);
			System.out.println(" Account Number"+ totalCraditApplied);
			
			
		}
		
}			
		


	


