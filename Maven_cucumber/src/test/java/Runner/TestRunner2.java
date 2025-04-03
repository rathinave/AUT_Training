package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//Features2"},
				glue= {"Stepdef2"},
				plugin= {"pretty","html:target/htmlreports/report.html"}
			  //tags="@set5"
				)

public class TestRunner2 extends AbstractTestNGCucumberTests {
}


