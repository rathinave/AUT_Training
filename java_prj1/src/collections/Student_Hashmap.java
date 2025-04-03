package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Student_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Student_map> map = new HashMap<Integer,Student_map>();
		Student_map sm1 = new Student_map("Rathinavel",7,21);
		Student_map sm2 = new Student_map("Vikesh",5,20);
		Student_map sm3 = new Student_map("Kamal",10,20);
		
		map.put(sm1.std_id, sm1);
		map.put(sm2.std_id, sm2);
		map.put(sm3.std_id, sm3);
		
		for(Entry<Integer, Student_map> e: map.entrySet())
		{
			Student_map sm4 = e.getValue();
			System.out.println("Student_ID : "+e.getKey()+" || Name : "+sm4.name+" || Age : "+sm4.age);
			System.out.println();
		}
		

	}

}
