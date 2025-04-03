 package junit_pkg;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	junit_pkg.Testsum.class,
	junit_pkg.TestSub.class
})
public class Test_suite {
	
}

