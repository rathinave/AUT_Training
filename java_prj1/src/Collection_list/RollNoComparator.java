package Collection_list;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
//		return o1.std_id - o2.std_id; // ascending order
		return o2.std_id - o1.std_id ;// descending order
	}

}
