package Testng_reports;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener1.class)
public class Listerner_report {
	
	
	@Test
	public void test1()
	{
		System.out.println("Test 1");
		assertTrue(true);
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2");
		assertTrue(false);
	}

}
