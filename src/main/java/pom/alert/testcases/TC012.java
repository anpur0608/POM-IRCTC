package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertHomePage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC012";
		description = "To verify prompt alert";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		
	}
	
	@Test
	
	public void promptAlert() {
		
		new AlertHomePage()
		
		.switchToFrame()
		.clickOnTryIt()
		.enterName("arshad")
		.waitTime()
		.clickOnOk()
		.verifyName("arshad")
		.backToParentFrame()
		.clickOnHome();
		
		
	}

}
