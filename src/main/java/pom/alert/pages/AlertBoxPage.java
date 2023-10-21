package pom.alert.pages;

import wrappers.GenericWrappers;

public class AlertBoxPage extends GenericWrappers{
	
	public AlertBoxPage enterName(String name) {
		enterInAlert(name);
		return  this;
	}
	public AlertBoxPage waitTime() {
		waitProperty(5000);
		return this;
	}
	public AlertHomePage clickOnOk() {
		acceptAlert();
		return  new AlertHomePage() ;
	}
	public AlertHomePage clickOnCanecl() {
		dismissAlert();
		return  new AlertHomePage() ;
	}
	

}
