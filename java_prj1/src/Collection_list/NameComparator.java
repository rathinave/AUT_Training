package Collection_list;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//return o1.name.compareTo(o2.name); // ascending order
		return o2.name.compareTo(o1.name);// descending order
	}

}
