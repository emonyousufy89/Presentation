package Reporterutils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class TestListenerImpl  extends ExtentReportListner implements ITestListener {
	
public static ExtentReports extent;
	
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("PASS");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("FAIL");
	}
	public void onTestSkipped(ITestResult result) {

		System.out.println("SKIP");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	public void onStart(ITestContext context) {
		System.out.println("On start...");
		extent = setup();
	}
	public void onFinish(ITestContext context) {
		System.out.println("Execution completed on SYS env...");
		extent.flush();
	}


}
