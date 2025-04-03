package collections;

public class student {
	String name;
	int std_id;
	student(String name,int std_id)
	{
		this.name = name;
		this.std_id = std_id;
	}
	public void display()
	{
		System.out.println("Student Id : "+this.std_id+"\nStudent Name : "+this.name);
	}

}
