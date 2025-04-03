package collections;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> list = new ArrayList<student>();
		student s1 = new student("Rathinavel",101);
		student s2 = new student("vikesh",102);
		student s3 = new student("kamal",103);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		student s4 = list.get(0);
		s4.display();
		for(student s:list)
		{
			if(s.std_id == 102)
			{
				System.out.println("Student Name is : "+s.name);
			}
		}
		
	}

}
