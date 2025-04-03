package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testsum {

	@Test
	public void test1() {
		add_num obj = new add_num();
		int i,j;
		i = j = 11;
		System.out.println("in Testnum test1");
		assertEquals(i+i, obj.add(i, j));
	}
	@Test
	public void test2()
	{
		add_num obj = new add_num();
		int i,j;
		i = j = 20;
		System.out.println("in Testnum test2");
		assertEquals(i+i, obj.add(i, j));
	}

}
