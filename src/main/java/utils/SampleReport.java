package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	@Test
	public void reportGeneration() {
		//start report
		ExtentReports reports = new ExtentReports("./Results/reports.html", false);
		//Start Test
		ExtentTest test = reports.startTest("TC005", "To verify IRCTC Registration for the new user sign up");
		test.assignAuthor("Arshad");
		test.assignCategory("Fumtional");
		
		//log test steps
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		test.log(LogStatus.PASS, "the application got launched with the url successfuly");
		
		//end test
		reports.endTest(test);
		
		//End report
		reports.flush();
		
		
	}

}
