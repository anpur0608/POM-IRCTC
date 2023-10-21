package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OtpPage extends GenericWrappers{
	
	public OtpPage waitTime() {
		waitProperty(7000);
		return this;
	}
	public OtpPage clickOnVerify() {
		clickByXpath("//button[text()='Verify']");
		return this;
	}
	public OtpPage verifytext(String text) {
		verifyTextByXpath("//span[text()='otp is required.']", text);
		return this;
	}

}
