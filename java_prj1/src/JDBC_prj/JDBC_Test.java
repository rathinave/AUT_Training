package JDBC_prj;

import java.sql.SQLException;
import java.util.HashMap;

public class JDBC_Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> map = new HashMap<>();
		
		map.put(1, new Student(1,"Rathinavel",95,90));
		map.put(2, new Student(2,"Sathis",85,90));
		map.put(3, new Student(3,"Sanju",90,85));
		map.put(4, new Student(4,"Vikesh",85,80));
		map.put(5, new Student(5,"Kamal",95,85));
		
//		JDBC_Methods.insert(map);
		
//		JDBC_Methods.add_Avg(map);
		
//		JDBC_Methods.Display();

	}

}
