package pom.alert.pages;

import wrappers.GenericWrappers;

public class AlertHomePage extends GenericWrappers {
	
	public AlertHomePage switchToFrame() {
		switchToFrameByXpath("//iframe[@name='iframeResult']");
		return this;
	}
	public AlertHomePage waitTime() {
		waitProperty(5000);
		return this;
	}
	public AlertBoxPage clickOnTryIt() {
		clickByXpath("//button[text()='Try it']");
		return new AlertBoxPage();
	}
	public AlertHomePage verifyName(String name) {
		verifyTextContainsByXpath("//p[@id='demo']", name);
		return this;
	}
	public AlertHomePage backToParentFrame() {
		switchToParentFrame();
		return this;
	}
	public LoginPage clickOnHome() {
		clickByXpath("//a[@id='tryhome']");
		return new LoginPage();
	}
	
	
	
	

}
