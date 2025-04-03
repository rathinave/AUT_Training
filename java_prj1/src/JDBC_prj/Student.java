package JDBC_prj;

public class Student {
	int sid ;
	String sname;
	int phy;
	int chem;
	float avg;
	
	public Student(int sid, String sname, int phy, int chem) {
		this.sid = sid;
		this.sname = sname;
		this.phy = phy;
		this.chem = chem;
	
	}
	
	public static float avg(int phy,int chem) {
		float a =  (float) ((phy+chem)/2.0);
		return a;
	}
	
}
