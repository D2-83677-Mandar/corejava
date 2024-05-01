import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the paldrom name :");
		String str1 = sc.next();
		int n = str1.length();
		
		String str2= "";
		for(int i = n-1;i>=0;--i) {
			Character char1;
		char1 = str1.charAt(i);
		str2 =  str2 + char1;
				
		}
		if (str1.equals(str2)) {
			         System.out.println(true);
			
		}else {
			System.out.println(false);
		}
	}

}
