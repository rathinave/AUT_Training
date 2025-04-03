package Collection_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {5,7,2,3,10};
		List<Integer> list = Arrays.asList(5,7,2,3,10);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
