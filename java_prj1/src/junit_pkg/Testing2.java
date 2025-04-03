package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing2 {
	SumOfEvenDigit sd = new SumOfEvenDigit();

	@Test
	public void test1() {
		
		int a = sd.sumofDigits(12496);
		System.out.println("The Expected Value is : 12");
		assertEquals(a, 12);
		System.out.println();
	}
	@Test
	public void test2() {
		
		int a = sd.sumofDigits(27583456);
		System.out.println("The Expected Value is : 22");
		assertEquals(a, 22);
//		assertNotEquals(a, 22);
		System.out.println();
	}

}
