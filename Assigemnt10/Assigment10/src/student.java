import java.security.Identity;

public class student implements Comparable<student> {

	private int rollNo;
	String Name;
	int marks;

	public student() {

	}

	public student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", Name=" + Name + ", marks=" + marks + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(student o) {
		if (this.marks < o.marks) {
			return -1;
			
		}else if (this.marks > o.marks) {
			return 1;
			
		} 
		// TODO Auto-generated method stub
		return 0;
	}

}
