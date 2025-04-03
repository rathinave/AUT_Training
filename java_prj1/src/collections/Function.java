package collections;

import java.util.ArrayList;

public class Function {
	
	public static  void find_mobile_by_brand(String s, ArrayList<Mobile> l)
	{
		for(Mobile m: l)
		{
			if(m.Brand.equals(s))
			{
				System.out.println("Brand : "+m.Brand+" || Model : "+m.Model+" || Price : "+m.Price+" || Ram : "+m.Ram);
			}
		}
	}
	
	public static void display_mobile_details(int price_ll, int price_ul, ArrayList<Mobile> l)
	{
		for(Mobile m: l)
		{
			if(m.Price >= price_ll && m.Price <= price_ul)
			{
				System.out.println("Brand : "+m.Brand+" || Model : "+m.Model+" || Price : "+m.Price+" || Ram : "+m.Ram);
			}
		}
	}
	public static void display_mobile(int ram, int price, ArrayList<Mobile> l)
	{
		for(Mobile m: l)
		{
			if(m.Ram >= ram && m.Price < price)
			{
				System.out.println("Brand : "+m.Brand+" || Model : "+m.Model+" || Price : "+m.Price+" || Ram : "+m.Ram);
			}
		}
	}

}
