import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    student [] arr = {
    		new  student(4,"Mandar",45),
    		new  student(5,"Akash",86),
    		new  student(3,"sanket",35),
    		new  student(1,"hsrhsl",95),
    		new  student(2,"rohsn",12)
    		
    };
    System.out.println("Before sorting ");
    for (student student : arr) {
		System.out.println(student);
	}
    
    Arrays.sort(arr);
    System.out.println("After sorting");
    for (student student : arr) {
		System.out.println(student);
	}
	} 

}
