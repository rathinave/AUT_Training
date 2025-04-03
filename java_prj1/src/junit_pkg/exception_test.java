package junit_pkg;

import org.junit.Test;

public class exception_test {

	@Test(expected = ArithmeticException.class)
	public void test1() {
		int a = 1 / 0;
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2() {
		int[] a = new int[5];
		a[7] = 7;
	}

}
