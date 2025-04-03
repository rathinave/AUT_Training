package flipcart;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Scanner;

public class Function_Map {
	
	static Scanner sc = new Scanner(System.in);
	static HashMap<Integer, Product> hm = new HashMap<>();
	static double total = 0;
	static int t_count=0;
	
	
	// buy product function
	public static  HashMap<Integer, Product>  Buy_Product(HashMap<Integer,Product> m)
	{
		
		while(true) {
			
			System.out.println("Enter the Product ID : ");
			int id = sc.nextInt();
			Product want = m.get(id);
			System.out.println();
			System.out.println("Enter the Number Of Units you Want : ");
			int q = sc.nextInt();
			
			if(q <= want.Quantity) // First check the quantity for your product 
			{
				int sub = want.Quantity;
				want.Quantity = sub - q;
				m.put(id, want);
				
				if(hm.containsKey(id)) // This If will execute, when you enter same product_id in the purchasing list.
				{
					Product bi = new Product();
					bi.Product_Name = want.Product_Name;
					Product u = hm.get(id);
					bi.Quantity = u.Quantity+q;
					bi.Brand = want.Brand;
					bi.Price = want.Price;
					bi.Product_ID = id;
					hm.put(id,bi);
					
				}
				else // This else will execute, when you enter a new product_id in the purchasing list.
				{
				    Product bill = new Product();
				    bill.Product_Name = want.Product_Name;
				    bill.Product_ID = id;
				    bill.Quantity = q;
				    bill.Brand = want.Brand;
				    bill.Price = want.Price;
				    hm.put(id, bill);
				}
			}
			else// This else will execute if product is out of stock 
			{
				System.out.println("Out Of Stock....!");
			}
			
			System.out.println();
			System.out.println("Are You want to Continue This : Yes/NO");
			System.out.println();
			String s = sc.next();
			
			if(!s.equals("yes")) // if you don't want continue shopping then it will execute 
			{
				System.out.println();
				Display_All.Display(m);
				System.out.println("-----------------------------------------------------------------------------------------------------");
			    break;
			}
		}
		System.out.println();
		System.out.printf("%-10s%-20s%-10s%-10s%-20s\n", "Product_ID", "Product_Name", "Quantity", "Price", "Brand");
		System.out.println();
		for(Map.Entry<Integer, Product> e: hm.entrySet()) // it will show what are the product you bought
		{
			Product pp = e.getValue();
			total += (pp.Price*pp.Quantity);
			
			if(pp.Product_Name == "T-Shirts") // find t-shirt count
				t_count = pp.Quantity;
			
			System.out.printf("% -10d%-20s%-10d%-10d%-20s\n",pp.Product_ID, pp.Product_Name, pp.Quantity, pp.Price*pp.Quantity, pp.Brand);
	     }	
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Total Bill Amount : "+total);
		System.out.println();
		Discount(total,t_count); // this function call is for calculate the discount amount and show.
		return hm;
	}
	
	// discount function
	public static void Discount(double t,int c)
	{
		double temp1 = 0;
		double temp2 = 0;
		System.out.println("************************************************************************************************\n");
		System.out.println("If The bill is more than Rs. 25000/-, 20% discount on total bill.");
		System.out.println("If The bill is between 15000/- and 25000/-, 10% discount on total bill.");
		System.out.println("If 3 t-shirts are purchased, 10% discount on total bill.");
		System.out.println("\n**********************************************************************************************");
		
		if(t > 25000)
		{
			temp1 = t * 0.2;
		}
		else if(t >= 15000 && t <= 25000)
		{
			temp1 = t * 0.1;
		}
		if(c >= 3)
		{
			temp2 = t*0.1;
		}
		
		System.out.println("After The dicount Total Bill is : "+(t-(temp1+temp2)));	// final amount after the discount.
	}
		
}

