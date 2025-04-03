package Runner1;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//Feature"},
			     glue= {"Stepdef1"},
			     plugin= {"pretty","html:target/htmlreports/report.html"},
			     tags = "@set1"
			)
public class RunnerTest extends AbstractTestNGCucumberTests {
	

}
