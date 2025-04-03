package junit_pkg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_Units {
	@BeforeClass // it will run before all the methods
	public static void beforeclass()
	{
		System.out.println("In BeforeClass");
	}
	@AfterClass // it will run end of all the methods
	public static void afterclass()
	{
		System.out.println("In AfterClass");
	}
	@Before // it will run before every test methods
	public void before()
	{
		System.out.println("In Before");
	}
	@After // it will run after every test methods
	public void after()
	{
		System.out.println("In After");
	}
	@Test
	public void test1() {
		System.out.println("In Test 1");
	}
	@Test
	public void test2() {
		System.out.println("In Test 2");
	}

}
