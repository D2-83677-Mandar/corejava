package com.sunbeam;

import java.util.Comparator;

public class StudentNameCamparator  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.Name.compareTo(o2.Name);
	}

}
