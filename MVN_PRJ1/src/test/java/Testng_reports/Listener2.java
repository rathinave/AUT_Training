package Testng_reports;
import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilites.common_methods;

public class Listener2 extends common_methods implements ITestListener  {
	
	@Override
	public void onTestStart(ITestResult result)
	{
		Reporter.log("Test Started : "+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Test Success : "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		try {
			screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test Failed : "+result.getName());
	}
 
}
