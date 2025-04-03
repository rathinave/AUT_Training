package collections;

import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vec = new Vector<>();
		
		vec.add("java");
		vec.add("database");
		vec.add("get");
		
		System.out.println(vec);
		vec.remove("database");
		System.out.println(vec);

	}

}