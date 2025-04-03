package str;

import java.util.ArrayList;

public class pg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello all Welcome");
		String s = "";
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<sb.length(); i++)
		{
			if((sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') || (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'))
			{
				s += sb.charAt(i);
			}
			else
			{
				list.add(s);
				s="";
			}
		}
		list.add(s);
		System.out.println(list);

	}

}
