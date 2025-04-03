package junit_pkg;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
 
public class Parameterized_Avg {
	private int AI;
	private int DS;
	private int ML;
	private int expected;
	
	
	public Parameterized_Avg(int aI, int dS, int mL, int expected) {
		super();
		AI = aI;
		DS = dS;
		ML = mL;
		this.expected = expected;
	}
	

	@Parameterized.Parameters
	public static List<Object[]> data()
	{
		Object[][] b = new Object[][] {
			                            {90,95,85,90},
			                            {80,75,94,83},
			                            {66,77,89,77}
		                               };
		 List<Object[]>  c = Arrays.asList(b);
	    return c;
	}
	
	 @Test
	 public void test()
	    {
	         System.out.println("AI -> "+AI+" DS -> "+DS+" ML -> "+ML+" Expected : "+expected);  
	         int a = Average.avg(AI,DS,ML);
	         assertEquals(expected,a);
	     }

}
