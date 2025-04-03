package junit_pkg;

import org.junit.Test;

public class timeout_test {
	
	@Test(timeout = 15000) // Testing timeout : Test will fail if it take longer than 1000ms.
	public void testTimeout() throws InterruptedException{
		
		Thread.sleep(2000);
	}

}
