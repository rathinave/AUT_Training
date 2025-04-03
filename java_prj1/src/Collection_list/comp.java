package Collection_list;

import java.util.ArrayList;
import java.util.Collections;


public class comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(101,"Rathinavel",21));
		list.add(new Student(102,"Vikesh",19));
		list.add(new Student(103,"Kamal",20));
		for(Student s:list)
		{
			System.out.println("Name : "+s.name+" Std_Id "+s.std_id+" Age : "+s.age);
		}
		Collections.sort(list);
		System.out.println("After the Sorting : ");
		for(Student s:list)
		{
			System.out.println("Name : "+s.name+" Std_Id "+s.std_id+" Age : "+s.age);
		}

	}

}
