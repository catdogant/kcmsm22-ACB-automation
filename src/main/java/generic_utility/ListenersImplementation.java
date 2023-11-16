package generic_utility;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener{
   ExtentReports reports;
   ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.INFO, methodname+"execution starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.PASS, methodname+"test case pass");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriverUtility WUTIL  = new WebDriverUtility();
		JavaUtility JUTIL = new JavaUtility();
		String methodname = result.getMethod().getMethodName()+JUTIL.getDateUsingCalender();
		test.log(Status.FAIL, methodname+"is failed");
		test.log(Status.FAIL,result.getThrowable());
		
		try {
			String path = WUTIL.screenShotCaptureMetod(BaseClass.driver, methodname);
			test.addScreenCaptureFromPath(path);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+"is skipped");
		test.log(Status.SKIP, result.getThrowable());
		
	}

	

	@Override
	public void onStart(ITestContext context) {
		//basic configuration
		ExtentSparkReporter htmlReport = new ExtentSparkReporter(". \\Extentreport"+ new JavaUtility().getDateUsingCalender()+".html");
		htmlReport.config().setDocumentTitle(" V tiger report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("extent report");
		//generate the report 
		reports = new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("browser","Chrome");
		reports.setSystemInfo("author name","pavani");
		reports.setSystemInfo("platform","window");
		reports.setSystemInfo("url","http://localhost:8888/");
		reports.setSystemInfo("enviorment name","Testing");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}
	

}
