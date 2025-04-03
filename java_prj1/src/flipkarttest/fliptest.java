package flipkarttest;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;



public class fliptest {
	HashMap<Integer,Product> am =new HashMap<>();

	
	Product p[] = new Product[1];{
    p[0] = new Product(1,"Poco x3 pro",40000,"Redmi",2);

     }
	// test input
	HashMap<Integer, Product> inp = new HashMap<>();
	Product p1[] = new Product[1];{
	    p1[0] = new Product(1,"Poco x3 pro",20000,"Redmi",15);
	    inp.put(1, p1[0]);

	     }


	@Test
	public void test() {
		am = Function_Map.Buy_Product(inp);
		int ti =0;
		for(Map.Entry<Integer, Product> e : am.entrySet())
		{
			Product ee = e.getValue();
			ti = ee.Product_ID;
		}
		assertTrue(ti == p[0].Product_ID);
	}

}
