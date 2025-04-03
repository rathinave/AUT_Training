package oops_encap;

public class Student_ArrayOfObject {
	String name;
	int student_id;
	int marks_cc;
	int marks_ml;
	int a=0;
	String fname = "";
	Student_ArrayOfObject(String name, int student_id, int marks_cc, int marks_ml){
		this.name = name;
		this.student_id = student_id;
		this.marks_cc = marks_cc;
		this.marks_ml = marks_ml;
	}
	public Student_ArrayOfObject() {
		// TODO Auto-generated constructor stub
	}
	public int avg()
	{
		a = (marks_cc + marks_ml)/2;
		return a;
	}
	public static Student_ArrayOfObject findmax(Student_ArrayOfObject[] b)
	{
		Student_ArrayOfObject fmax = new Student_ArrayOfObject();
		fmax.a = 0;
		for(Student_ArrayOfObject s: b)
		{
			if(fmax.a < s.a)
			{
				fmax.a = s.a;
				fmax.fname = s.name;
			}
			
		}
		return fmax;
		
	}
	public void disp()
	{
		System.out.println("The average scored by "+name+" is "+avg()+"\n");
	}
	
	

}
