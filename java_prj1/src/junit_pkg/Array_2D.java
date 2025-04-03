package junit_pkg;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Array_2D {
	
	Object[][] data =new Object[][] {
			       {90,95,85,90},
                   {80,75,94,83},
                   {66,77,89,77}
	};
	static int pos = 0;
	static int m1,m2,m3,a;
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("Test Started -->>");
		System.out.println();
	}
	
	@Before
	public void beforetest()
	{
		Object[] c = data[pos++];
		m1 = (int)c[0];
		m2 = (int)c[1];
		m3 = (int)c[2];
		a = (int)c[3];
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1 Completed...!");
		System.out.println();
		assertEquals(a,Average.avg(m1, m2, m3));
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 Completed...!");
		System.out.println();
		assertEquals(a,Average.avg(m1, m2, m3));
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3 Completed...!");
		System.out.println();
		assertEquals(a,Average.avg(m1, m2, m3));
		
	}
	
	@AfterClass
	public static void aftertest()
	{
		System.out.println("<<-- All Test Completed");
		System.out.println();
	}
	

}
