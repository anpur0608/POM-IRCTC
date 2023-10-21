package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
 public static ExtentReports reports;
 public static ExtentTest test;
 public String testName;
 public String description;
 public String author ,category;
 
	public void startReport() {
		 reports = new ExtentReports("./Results/Reports.html",false);
		
	}
	public void startTest(String testName, String description) {
		 test= reports.startTest(testName, description);
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	public abstract long  takeSnap();
	public void reportStep(String status, String description) {
		long SnapNumber= takeSnap();
	if(status.equalsIgnoreCase("Pass")) {
		test.log(LogStatus.PASS, description+test.addScreenCapture(".././Results/Screenshots/"+SnapNumber+".jpeg"));
	}else if(status.equalsIgnoreCase("Fail")) {
		test.log(LogStatus.FAIL, description+test.addScreenCapture(".././Results/Screenshots/"+SnapNumber+".jpeg"));
	}else if(status.equalsIgnoreCase("Info")) {
		test.log(LogStatus.INFO, description+test.addScreenCapture(".././Results/Screenshots/"+SnapNumber+".jpeg"));
	}else if(status.equalsIgnoreCase("warning")) {
		test.log(LogStatus.WARNING, description+test.addScreenCapture(".././Results/Screenshots/"+SnapNumber+".jpeg"));
	}
	}
	public void reportStep(String status, String description, boolean snap) {
		if(!snap);
	
}
	public void endTest() {
		reports.endTest(test);
	
}
	public void endReport() {
		reports.flush();
	
}

}
