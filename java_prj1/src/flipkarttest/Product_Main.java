package flipkarttest;

import java.util.HashMap;

public class Product_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Product> map = new HashMap<>();
	    Product[] p = new Product[10];
	    p[0] = new Product(1,"Poco x3 pro",20000,"Redmi",15);
	    p[1] = new Product(2,"Laptop",80000,"HP",50);
	    p[2] = new Product(3,"S23 Ultra",120000,"SamSung",15);
	    p[3] = new Product(4,"HeadSet",1200,"SamSung",50);
	    p[4] = new Product(5,"iPhone 16pro",100000,"Apple",15);
	    p[5] = new Product(6,"T-Shirts",250,"Zudio",450);
	    p[6] = new Product(7,"Pants",499,"Polo",250);
	    p[7] = new Product(8,"Casual Shoes",399,"Zudio",100);
	    p[8] = new Product(9,"Belt",150,"WoodLand",150);
	    p[9] = new Product(10,"Shirts",799,"OTTO",250);
	    
        map.put(p[0].Product_ID, p[0]);
        map.put(p[1].Product_ID, p[1]);
        map.put(p[2].Product_ID, p[2]);
        map.put(p[3].Product_ID, p[3]);
        map.put(p[4].Product_ID, p[4]);
        map.put(p[5].Product_ID, p[5]);
        map.put(p[6].Product_ID, p[6]);
        map.put(p[7].Product_ID, p[7]);
        map.put(p[8].Product_ID, p[8]);
        map.put(p[9].Product_ID, p[9]);
        
      
        Display_All.Display(map);
        
        System.out.println();
        
        Function_Map.Buy_Product(map);
        
        

	    
	}
	    
}
