package Collection_list;

public class Student implements Comparable <Student> {
	int std_id;
	String name;
	int age;
	public Student(int std_id, String name, int age) {
		super();
		this.std_id = std_id;
		this.name = name;
		this.age = age;
	}
	public void dis()
	{
		System.out.println(name+" "+std_id+" "+age);
	}
//
//	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		
		return s.age - this.age; // descending order
		//return this.age - s.age; // ascending order
	}
	
	

}
