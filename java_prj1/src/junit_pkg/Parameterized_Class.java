package junit_pkg;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class Parameterized_Class {
	private int num1,num2,expected;

	public Parameterized_Class(int num1, int num2, int expected) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}
	
     @Parameterized.Parameters
     public static List<Object[]> data()
    {
	     System.out.println("In data method");
	     Object[][] b = new Object[][] {
	    	                             {1,2,3},
	    	                             {4,5,9},
	    	                             {5,6,11},
	    	                             {-9,-2,-11}
	                                    } ;
	     List<Object[]> c = Arrays.asList(b);
		return c;
    }
     // in J-unit it will pass the parameter automatically 
    public int add(int a, int b)
    {
    	int c = a+b;
    	System.out.println("In sum");
    	return c;
    }
    @Test
    public void test()
    {
         System.out.println("Num1 : "+num1+" Num2 : "+num2+" Expected : "+expected);  
         assertEquals(expected,add(num1,num2));
     }
}
