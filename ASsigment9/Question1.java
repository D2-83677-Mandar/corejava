import java.util.Iterator;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str1 = sc.next();
		int n = str1.length();
		
		String str2= "";
		for(int i = n-1;i>=0;--i) {
			Character char1;
		char1 = str1.charAt(i);
		str2 =  str2 + char1;
				
			
		}
		
		System.out.println(str2);
		
}

}
