package collections;

import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"apple");
		map.put(2,"orange");
		map.put(3,"Banana");
		System.out.println(map);
		System.out.println(map.get(2));
	}

}
