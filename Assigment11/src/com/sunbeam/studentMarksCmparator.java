package com.sunbeam;

import java.util.Comparator;

public class studentMarksCmparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.marks, o2.marks);
	}

}
