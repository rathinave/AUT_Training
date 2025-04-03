package flipcart;

import java.util.HashMap;
import java.util.Map.Entry;

public class Display_All {
	
	public static void Display(HashMap<Integer,Product> m)
	{
		 System.out.printf("%-10s%-20s%-10s%-10s%-20s\n", "Product_ID", "Product_Name", "Quantity", "Price", "Brand");
		 System.out.println();
		for(Entry<Integer,Product> e: m.entrySet())
		{
			Product p = e.getValue();
			System.out.printf("% -10d%-20s%-10d%-10d%-20s\n",p.Product_ID,p.Product_Name,p.Quantity,p.Price,p.Brand);
		}
	}

}
