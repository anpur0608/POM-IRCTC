package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertHomePage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC010";
		description = "To verify simple alert";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	@Test
	

	public void simpleAlert() {
		
		new AlertHomePage()
		
		.switchToFrame()
		.clickOnTryIt()
		.clickOnOk()
		.backToParentFrame()
		.clickOnHome();
		
	}
	
}
