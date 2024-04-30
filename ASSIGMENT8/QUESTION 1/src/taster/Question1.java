package taster;

import java.util.Scanner;

import com.sunbeam.Invalidexecption;
import com.sunbeam.readstring;

public class Question1 {

	public static void main(String[] args) {
		
	
		
		readstring r= new readstring();
		try {
			r.accept();
			r.cheak();
		
		}catch (Invalidexecption e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
