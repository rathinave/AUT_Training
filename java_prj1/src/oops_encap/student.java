package oops_encap;

public class student {
	String name;
	int student_id;
	int marks_cc;
	int marks_ml;
	int high_avg = 0;
	String hs="";
	public student(String a,int b,int c,int d)
	{
		name = a;
		student_id = b;
		marks_cc = c;
		marks_ml = d;
	}
	public int avg()
	{
		int a = (marks_cc + marks_ml)/2;
		return a;
	}

	public void disp()
	{
		System.out.println("The average scored by "+name+" is "+avg()+"\n");
	}
	

}
