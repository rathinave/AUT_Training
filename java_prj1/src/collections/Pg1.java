package collections;

import java.util.ArrayList;

public class Pg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Lemon");
		list.add("Banana");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(2,"Mango");
		System.out.println(list);

	}

}
