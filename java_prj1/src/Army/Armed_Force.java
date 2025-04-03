package Army;

import java.util.ArrayList;

public class Armed_Force {
	
	public static  String  test(String name, int age, String location, ArrayList<String> l)
	{
		String s ="";
		if(age >=17 && age <=37) 
		{
			
			
			if(!l.contains(location))
			{
				System.out.println(name+" is eligible");
				s += name+" is eligible";
			}
			else
			{
				System.out.println(name+" is not eligible");
				s += name+" is not eligible";
			}
		}
		else
		{
			System.out.println(name+" is not eligible");
			s += name+" is not eligible";
		}
		return s;
	}

}
