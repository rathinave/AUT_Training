package Collection_list;

import java.util.ArrayList;
import java.util.Collections;

public class comparator_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(101,"Rathinavel",21));
		list.add(new Student(102,"Vikesh",19));
		list.add(new Student(103,"Kamal",20));
		
		for(Student s:list)
		{
			System.out.println(s.name+" "+s.std_id+" "+s.age);
		}
		System.out.println();
		
		Collections.sort(list,new RollNoComparator());
		for(Student s:list)
		{
			System.out.println(s.name+" "+s.std_id+" "+s.age);
		}
		System.out.println();
		
		Collections.sort(list,new NameComparator());
		for(Student s:list)
		{
			System.out.println(s.name+" "+s.std_id+" "+s.age);
		}
		
		

	}

}
