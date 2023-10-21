package pom.facebook.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookHomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC007";
		description = "To verify the facebook new user for the signup ";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.facebook.com";
		sheetName="TC007";
		
		
	}
	
	@Test(dataProvider="fetchData")
	
	public void facebook(String firstName, String lastName, String email, String confirmEmail,
			String password, String day, String month, String year,String gender) {
		
		new FacebookHomePage()
		
		.clickOnCreataAccount()
		.enterFristName(firstName)
		.enterSurName(lastName)
		.enterEmail(email)
		.enterConfrimEmail(confirmEmail)
		.enterPassword(password)
		.selectDay(day)
		.waitTime()
		.selectMonth(month)
		.selectYear(year)
		.clickOnGender(gender);
	}

}
