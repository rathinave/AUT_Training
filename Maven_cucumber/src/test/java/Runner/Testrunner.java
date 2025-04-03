package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features= {"src//test//resource//Features"},
                 glue= {"Stepdef"},
                 plugin= {"pretty","html:target/htmlreports/report.html"},
                 tags = "@f1"
                )

class Testrunner extends AbstractTestNGCucumberTests {

}
