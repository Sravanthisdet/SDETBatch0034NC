package testNGScript;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListeningClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Started @Test Method Name is : "+result.getName());
		Reporter.log("Started @Test Method Name is : "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success @Test Method Name is : "+result.getName());
		Reporter.log("Success @Test Method Name is : "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed @Test Method Name is : "+result.getName());
		Reporter.log("Failed @Test Method Name is : "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped @Test Method Name is : "+result.getName());
		Reporter.log("Skipped @Test Method Name is : "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {

		System.out.println("Started test Name is : "+context.getName());

		Reporter.log("Started test Name is : "+context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("Finished test Name is : "+context.getName());
		Reporter.log("Finished test Name is : "+context.getName());

	}

}
