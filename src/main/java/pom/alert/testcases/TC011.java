package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertHomePage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC011";
		description = "To verify confrim alert";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}
	@Test
	
	
	public void confrimAlert() {
		
		new AlertHomePage()
		
		.switchToFrame()
		.clickOnTryIt()
		.clickOnOk()
		.backToParentFrame()
		.clickOnHome();
		
	}

}
