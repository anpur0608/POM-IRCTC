package wrappers;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
    public static Properties prop;
	public static RemoteWebDriver driver ;
	
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("weddriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/iedriverserver.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+browser+" is launched with given url "+url+" successfully");
			reportStep("PASS", "The browser "+browser+" is launched with given url "+url+" successfully");
		}
		catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
		      //System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("FAIL", "The browser "+browser+" is not launched due to session not created error");
		}
		catch (InvalidArgumentException e) {
			// TODO: handle exception
			 // System.err.println("The browser "+browser+" is not launched as the url does not contains http/https");
			  reportStep("FAIL", "The browser "+browser+" is not launched as the url does not contains http/https");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			  //System.err.println("The browser "+browser+" is not lanuched due to unknown error");
			reportStep("FAIL", "The browser "+browser+" is not lanuched due to unknown error");
		}
		
	}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered the data "+data+" successfully");
			reportStep("PASS", "The element with id "+idValue+" is entered the data "+data+" successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the dom");
			reportStep("FAIL", "The element with id "+idValue+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("FAIL", "The element with id "+idValue+" is not visible in the application");	
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("FAIL", "The element with id "+idValue+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("FAIL", "The element with id "+idValue+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to the unknown error");
			reportStep("FAIL", "The element with id "+idValue+" is not entered with data "+data+" due to the unknown error");
		}
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data+" successfully");
			reportStep("PASS", "The element with name "+nameValue+" is entered with data "+data+" successfully");
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in the dom");
			reportStep("FAIL", "The element with name "+nameValue+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("FAIL", "The element with name "+nameValue+" is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("FAIL", "The element with name "+nameValue+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("FAIL", "The element with name "+nameValue+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("FAIL", "The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
		}
		
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with data "+data+" successfully");
			reportStep("PASS", "The element with xpath "+xpathValue+" is entered with data "+data+" successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not found in the dom");
			reportStep("FAIL", "The element with xpath "+xpathValue+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("FAIL", "The element with xpath "+xpathValue+" is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("FAIL", "The element with xpath "+xpathValue+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("FAIL", "The element with xpath "+xpathValue+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
			reportStep("FAIL", "The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
		}
		
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
	try {
		String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is matched with the expected title "+title);
				reportStep("PASS", "The title of the page "+actualTitle+" is matched with the expected title "+title);
			}
			else {
				//System.err.println("The title of the page "+actualTitle+" is not mahcted with the expected title "+title);
				reportStep("FAIL", "The title of the page "+actualTitle+" is not mahcted with the expected title "+title);
			}
	}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+title+" is not matched due to unknown error");
			reportStep("FAIL", "The title of the page "+title+" is not matched due to unknown error");
		}
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		 try {
			String actualText = driver.findElementById(id).getText();
			 if(actualText.equals(text)) {
				// System.out.println("The text with id "+id+" is holding the text "+actualText+" is matched with the expected text "+text);
				 reportStep("PASS", "The text with id "+id+" is holding the text "+actualText+" is matched with the expected text "+text);
			 }
			 else {
				 //System.err.println("The text with id "+id+" is holding the text "+actualText+" is not matched with the expected text "+text);
				 reportStep("FAIL", "The text with id "+id+" is holding the text "+actualText+" is not matched with the expected text "+text);
			 }
		} 
		 catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text with id "+id+" is  holding the text "+text+" is not found in the dom");
			reportStep("FAIL", "The text with id "+id+" is  holding the text "+text+" is not found in the dom");
		}
		 catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The text with id "+id+" is  holding the text "+text+" is not visible in the application");
			reportStep("FAIL", "The text with id "+id+" is  holding the text "+text+" is not visible in the application");
		}
		 catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The text with id "+id+" is  holding the text "+text+" is not interactable in the application");
			reportStep("FAIL", "The text with id "+id+" is  holding the text "+text+" is not interactable in the application");
		}
		 catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The text with id"+id+"is  holding the text "+text+" is not stable in the application");
			reportStep("FAIL", "The text with id"+id+"is  holding the text "+text+" is not stable in the application");
		}
		 catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text with id "+id+" is  holding the text "+text+" is not verified due to unknown error");
			reportStep("FAIL", "The text with id "+id+" is  holding the text "+text+" is not verified due to unknown error");
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				//System.out.println("The text with xpath "+xpath+" is  holding the text "+actualText+" is matched with exxpected text "+text);
				reportStep("PASS", "The text with xpath "+xpath+" is  holding the text "+actualText+" is matched with exxpected text "+text);
			}
			else {
				//System.err.println("The text with xpath "+xpath+" is  holding the text "+actualText+" is not matched with exxpected text "+text);
				reportStep("FAIL", "The text with xpath "+xpath+" is  holding the text "+actualText+" is not matched with exxpected text "+text);
			}
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text with xpath "+xpath+" is holding the text "+text+" is not found in the dom");
			reportStep("FAIL", "The text with xpath "+xpath+" is holding the text "+text+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The text with xpath "+xpath+" is holding the text "+text+" is not visible in the application");
			reportStep("FAIL", "The text with xpath "+xpath+" is holding the text "+text+" is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The text with xpath "+xpath+" is holding the text "+text+" is not interactable in the application");
			reportStep("FAIL", "The text with xpath "+xpath+" is holding the text "+text+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The text with xpath "+xpath+" is holding the text "+text+" is not stable in the application");
			reportStep("FAIL", "The text with xpath "+xpath+" is holding the text "+text+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text with xpath "+xpath+" is holding the text "+text+" is not verified due to unknown error");
			reportStep("FAIL", "The text with xpath "+xpath+" is holding the text "+text+" is not verified due to unknown error");
		}
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
	try {
		String actualText =	driver.findElementByXPath(xpath).getText();
		if (actualText.contains(text)) {
			//System.out.println("The text with xpath "+xpath+" is holding the text "+actualText+" is containing the expected text "+text);
			reportStep("PASS", "The text with xpath "+xpath+" is holding the text "+actualText+" is containing the expected text "+text);
		}
		else {
			//System.err.println("The text with xpath "+xpath+" is holding the text "+actualText+" is not containing the expected text "+text);
			reportStep("FAIL", "The text with xpath "+xpath+" is holding the text "+actualText+" is not containing the expected text "+text);
		}
	} 
	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The text with xpath "+xpath+" is containing the text "+text+" is not found in the dom");
		reportStep("FAIL", "The text with xpath "+xpath+" is containing the text "+text+" is not found in the dom");
	}
	catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The text with xpath "+xpath+" is containing the text "+text+" is not visible in the application");
		reportStep("FAIL", "The text with xpath "+xpath+" is containing the text "+text+" is not visible in the application");
	}
	catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The text with xpath "+xpath+" is containing the text "+text+" is not interactable in the application");
		reportStep("FAIL", "The text with xpath "+xpath+" is containing the text "+text+" is not interactable in the application");
	}
	catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The text with xpath "+xpath+" is containing the text "+text+" is not stable in the application");
		reportStep("FAIL", "The text with xpath "+xpath+" is containing the text "+text+" is not stable in the application");
	}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The text with xpath "+xpath+" is containing the text "+text+" is not verified due to unknown error");
		reportStep("FAIL", "The text with xpath "+xpath+" is containing the text "+text+" is not verified due to unknown error");
	}
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The click with id "+id+" is executing click action successfully");
			reportStep("PASS", "The click with id "+id+" is executing click action successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The click with id "+id+" is not found in the dom");
			reportStep("FAIL", "The click with id "+id+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The click with id "+id+" is not visible in the application");
			reportStep("FAIL", "The click with id "+id+" is not visible in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The click with id "+id+" is unable to execute  in the application");
			reportStep("FAIL", "The click with id "+id+" is unable to execute  in the application");
		} 
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The click with id "+id+" is not interactable in the application");
			reportStep("FAIL", "The click with id "+id+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The click with id "+id+" is not stable in the application");
			reportStep("FAIL", "The click with id "+id+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The click with id "+id+" is not executing the click action due to unknown error");
			reportStep("FAIL", "The click with id "+id+" is not executing the click action due to unknown error");
		}
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The click with className "+classVal+" is executing click action successfully");
			reportStep("PASS", "The click with className "+classVal+" is executing click action successfully");
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The click with className "+classVal+" is not found in the dom");
			reportStep("FAIL", "The click with className "+classVal+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The click with className "+classVal+" is not visible in the application");
			reportStep("FAIL", "The click with className "+classVal+" is not visible in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The click with className "+classVal+" is unable to execute  in the application");
			reportStep("FAIL", "The click with className "+classVal+" is unable to execute  in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The click with className "+classVal+" is not interactable in the application");
			reportStep("FAIL", "The click with className "+classVal+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The click with className "+classVal+" is not stable in the application");
			reportStep("FAIL", "The click with className "+classVal+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The click with className "+classVal+" is not executing the click action due to unknown error");
			reportStep("FAIL", "The click with className "+classVal+" is not executing the click action due to unknown error");
		}
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The click with name "+name+" is executing click action successfully");
			reportStep("PASS", "The click with name "+name+" is executing click action successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The click with name "+name+" is not found in the dom");
			reportStep("FAIL", "The click with name "+name+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The click with name "+name+" is not visible in the application");
			reportStep("FAIL", "The click with name "+name+" is not visible in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The click with name "+name+" is unable to execute in the application");
			reportStep("FAIL", "The click with name "+name+" is unable to execute in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The click with name "+name+" is not interactable in the application");
			reportStep("FAIL", "The click with name "+name+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The click with name "+name+" is not stable in the application");
			reportStep("FAIL", "The click with name "+name+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The click with name "+name+" is not executing the click action due to unknown error");
			reportStep("FAIL", "The click with name "+name+" is not executing the click action due to unknown error");
		}
	}

	@Override
	public void clickByLink(String link) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(link).click();
			//System.out.println("The click with linkText "+link+" is executing click action successfully");
			reportStep("PASS", "The click with linkText "+link+" is executing click action successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The click with linkText "+link+" is not found in the dom");
			reportStep("FAIL", "The click with linkText "+link+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+link+" is not visible in the application");
			reportStep("FAIL", "The click with linkText "+link+" is not visible in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+link+" is unable to execute in the application");
			reportStep("FAIL", "The click with linkText "+link+" is unable to execute in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+link+" is not interactable in the application");
			reportStep("FAIL", "The click with linkText "+link+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+link+" is not stable in the application");
			reportStep("FAIL", "The click with linkText "+link+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+link+" is not executing the click action due to unknown error");
			reportStep("FAIL", "The click with linkText "+link+" is not executing the click action due to unknown error");
		}
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The click with linkText "+name+" is executing click action successfully");
			reportStep("PASS", "The click with linkText "+name+" is executing click action successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The click with linkText "+name+" is not found in the dom");
			reportStep("FAIL", "The click with linkText "+name+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+name+" is not visible in the application");
			reportStep("FAIL", "The click with linkText "+name+" is not visible in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+name+" is unable to execute in the application");
			reportStep("FAIL", "The click with linkText "+name+" is unable to execute in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+name+" is not interactable in the application");
			reportStep("FAIL", "The click with linkText "+name+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+name+" is not stable in the application");
			reportStep("FAIL", "The click with linkText "+name+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The click with linkText "+name+" is not executing the click action due to unknown error");
			reportStep("FAIL", "The click with linkText "+name+" is not executing the click action due to unknown error");
		}
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The click with xpath "+xpathVal+" is executing click action successfully");
			reportStep("PASS", "The click with xpath "+xpathVal+" is executing click action successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The click with xpath "+xpathVal+" is not found in the dom");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is not visible in the application");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is not visible in the application");
		} 
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is unable to execute in the application");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is unable to execute in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is not interactable in the application");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is not stable in the application");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is not executing the click action due to unknown error");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is not executing the click action due to unknown error");
		}
	}
 
	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The click with xpath "+xpathVal+" is preformed click action successfully");
			reportStep("PASS", "The click with xpath "+xpathVal+" is preformed click action successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The click with xpath "+xpathVal+" is not found in the dom");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is not visible in the application");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is not visible in the application");
		} 
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is unable to execute in the application");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is unable to execute in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is not interactable in the application");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is not stable in the application");
			reportStep("FAIL", "The click with xpath "+xpathVal+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal +" is not executing the click action due to unknown error");
			reportStep("FAIL", "The click with xpath "+xpathVal +" is not executing the click action due to unknown error");
		}
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text1 = null;
		try {
		 text1 = driver.findElementById(idVal).getText();
		//System.out.println("The text with id "+idVal+" is printed in the consol successfully "+text1);
		reportStep("PASS", "The text with id "+idVal+" is printed in the consol successfully "+text1);
	} 
		catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The text with id "+idVal+" is not found in the dom");
		reportStep("FAIL", "The text with id "+idVal+" is not found in the dom");
	}
		catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The text with id "+idVal+" is not visible in the application");
		reportStep("FAIL", "The text with id "+idVal+" is not visible in the application");
	}
		catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The text with id "+idVal+" is not interactable in the application");
		reportStep("FAIL", "The text with id "+idVal+" is not interactable in the application");
	}
		catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The text with id "+idVal+" is not stable in the application");
		reportStep("FAIL", "The text with id "+idVal+" is not stable in the application");
	}
		catch (WebDriverException  e) {
		// TODO: handle exception
		//System.err.println("The text with id "+idVal+" is unable to print the text in the consol "+text1+" due to unknown error");
		reportStep("FAIL", "The text with id "+idVal+" is unable to print the text in the consol "+text1+" due to unknown error");
	}
		return text1;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		String text2 = null;
		
		try {
			text2 = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The text with xpath "+xpathVal+" is printed in the consol successfully "+text2);
			reportStep("PASS", "The text with xpath "+xpathVal+" is printed in the consol successfully "+text2);
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The text with xpath "+xpathVal+" is not found in the dom");
			reportStep("FAIL", "The text with xpath "+xpathVal+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The text with xpath "+xpathVal+" is not visible in the application");
			reportStep("FAIL", "The text with xpath "+xpathVal+" is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The text with xpath "+xpathVal+" is not interactable in the application");
			reportStep("FAIL", "The text with xpath "+xpathVal+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("FAIL", "The text with xpath "+xpathVal+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("FAIL", "The text with xpath "+xpathVal+" is unable to print the text in the consol "+text2+" due to unknown error");
		}
		return text2;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
	try {
		WebElement wrappers =driver.findElementById(id);
				Select sel = new Select(wrappers);
				sel.selectByVisibleText(value);
				//System.out.println("The element with  id "+id+" is selected with visibile text successfully "+value);
				reportStep("PASS", "The element with  id "+id+" is selected with visibile text successfully "+value);
	} 
	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The select with visibile text by id "+id+" is not found in the dom");
		reportStep("FAIL", "The select with visibile text by id "+id+" is not found in the dom");
	}
	catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The select with visibile text by id "+id+" is not visible in the application");
		reportStep("FAIL", "The select with visibile text by id "+id+" is not visible in the application");
	}
	catch (ElementNotSelectableException e) {
		// TODO: handle exception
		//System.err.println("The select with visibile text by id "+id+" is not selected in the application");
		reportStep("FAIL", "The select with visibile text by id "+id+" is not selected in the application");
	}
	catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The select with visible text by id "+id+" is not stable in the application");
		reportStep("FAIL", "The select with visible text by id "+id+" is not stable in the application");
	}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The select with visibile text by id "+id+" is not selected due to unknown error");
		reportStep("FAIL", "The select with visibile text by id "+id+" is not selected due to unknown error");
	}
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement wrappers =driver.findElementById(id);
					Select sel = new Select(wrappers);
					sel.selectByIndex(value);
					//System.out.println("The element with  id "+id+" is selected by index is successfully "+value);
					reportStep("PASS", "The element with  id "+id+" is selected by index is successfully "+value);
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The select with index by id "+id+" is not found in the dom");
			reportStep("FAIL", "The select with index by id "+id+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The select with index by id "+id+" is not visible in the application");
			reportStep("FAIL", "The select with index by id "+id+" is not visible in the application");
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The select with index  by id "+id+" is not selected in the application");
			reportStep("FAIL", "The select with index  by id "+id+" is not selected in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The select with index by id "+id+" is not stable in the application");
			reportStep("FAIL", "The select with index by id "+id+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The select with index by id "+id+" is not selected due to unknown error");
			reportStep("FAIL", "The select with index by id "+id+" is not selected due to unknown error");
		}
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
	try {
		Set<String> allWinIdsAfterClick =driver.getWindowHandles();
		for(String eachId:allWinIdsAfterClick ) {
			driver.switchTo().window(eachId);
			break;
		}
		//System.out.println("Switching  to parent window is done successfully");
		reportStep("PASS", "Switching  to last window is done successfully");
	} 
	catch (NoSuchWindowException e) {
		// TODO Auto-generated catch block
		//System.err.println("The driver is unable to switch to parent window becuase no window is found in the dom");
		reportStep("FAIL", "The driver is unable to switch to parent window becuase no window is found in the dom");
	}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The driver is unable to switch to parent window due to unknown error");
		reportStep("FAIL", "The driver is unable to switch to parent window due to unknown error");
	}
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinIdsAfterClick =driver.getWindowHandles();
			for(String eachId:allWinIdsAfterClick ) {
				driver.switchTo().window(eachId);
			}
			//System.out.println("Switching  to last window is done successfully");
			reportStep("PASS", "Switching  to last window is done successfully");
		} 
		catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The driver is unable to switch to last window becuase no window is found in the dom");
			reportStep("FAIL", "The driver is unable to switch to last window becuase no window is found in the dom");
			
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The driver is unable to switch to last window due to unknown error");
			reportStep("FAIL", "The driver is unable to switch to last window due to unknown error");
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is executed successfully");
			reportStep("PASS", "The alert is executed successfully",false);
		} 
		catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not found in the application");
			reportStep("FAIL", "The alert is not found in the application",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not executed due to unknown error");
			reportStep("FAIL", "The alert is not executed due to unknown error",false);
		}
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is executed successfully");
			reportStep("PASS", "The alert is executed successfully",false);
		} 
		catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not found in the application");
			reportStep("FAIL", "The alert is not found in the application",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not executed due to unknown error");
			reportStep("FAIL", "The alert is not executed due to unknown error",false);
		}
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText=null;
		try {
		 alertText =	driver.switchTo().alert().getText();
		//System.out.println("The text from alert is printed in the console successfully "+alertText);
		reportStep("PASS", "The text from alert is printed in the console successfully "+alertText);
	} 
		catch (NoAlertPresentException e) {
		// TODO Auto-generated catch block
		//System.err.println("The alert is not present in the application");
		reportStep("FAIL", "The alert is not present in the application");
	}
		catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The text from alert is not printed in the consol due to unknown error");
		reportStep("FAIL", "The text from alert is not printed in the consol due to unknown error");
	}
	return alertText;
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		long number=0;
	try {
		File snap = driver.getScreenshotAs(OutputType.FILE);
		number=(long) (Math.floor(Math.random()*100000000)+100000);
		File dets = new File("./Results/screenshots/"+number+".png");
		
		FileUtils.copyFile(snap, dets);
		
		//System.out.println("The screenshot is taken successfully");
	
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		//System.err.println("The screenshots is not taken");
		reportStep("FAIL", "The screenshots is not taken", false);
	}
	catch (WebDriverException e) {
		// TODO Auto-generated catch block
		//System.err.println("The screenshot is unable take due to unknown error ");
		reportStep("FAIL", "The screenshot is unable take due to unknown error",false);
	}
	return number;
  }

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println(" Browser got closed successfully");
			reportStep("PASS", "Browser got closed successfully",false);
		} 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println(" Browser was not closed due to unknown error");
			reportStep("FAIL", "Browser was not closed due to unknown error",false);
		}
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println(" All browser got closed successfully");
			reportStep("PASS", "All browser got closed successfully", false);
		} 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("All browers was not closed due to unknown error");
			reportStep("FAIL", "All browers was not closed due to unknown error", false);
		}
	}

	@Override
	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("The sleep time is executed successfully ");
			reportStep("PASS", "The sleep time is executed successfully");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The sleep time is unable execute due to interrupted in the application");
			reportStep("FAIL", "The sleep time is unable execute due to interrupted in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The sleep time is unable to execute due to unknown error");
			reportStep("FAIL", "The sleep time is unable to execute due to unknown error");
		}
	}

	@Override
	public void selectVisibleTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		
	try {
		WebElement text = driver.findElementByXPath(xpath);
			Select sel = new Select(text);
			sel.selectByVisibleText(value);
			//System.out.println("The element with xpath "+xpath+" is selected with visibile text successfully "+value);
			reportStep("PASS", "The element with xpath "+xpath+" is selected with visibile text successfully \"+value");
	} 
	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The select with visibile text by xpath "+xpath+" is not found in the dom");
		reportStep("FAIL", "The select with visibile text by xpath "+xpath+" is not found in the dom");
	}
	catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The select with visibile text by xpath "+xpath+" is not visible in the application");
		reportStep("FAIL", "The select with visibile text by xpath "+xpath+" is not visible in the application");
	}
	catch (ElementNotSelectableException e) {
		// TODO: handle exception
		//System.err.println("The select with visibile text by xpath "+xpath+" is not selected in the application");
		reportStep("FAIL", "The select with visibile text by xpath "+xpath+" is not selected in the application");
	}
	catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The select with visible text by xpath "+xpath+" is not stable in the application");
		reportStep("FAIL", "The select with visible text by xpath "+xpath+" is not stable in the application");
	}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The select with visibile text by xpath "+xpath+" is not selected due to unknown error");
		reportStep("FAIL", "The select with visibile text by xpath "+xpath+" is not selected due to unknown error");
	}
	}

	@Override
	public void pressTabKeyById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).sendKeys(Keys.TAB);
			//System.out.println("The tab function is excuted successfully");
			reportStep("PASS", "The tab function is excuted successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The tab function is not found in the dom");
			reportStep("FAIL", "The tab function is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The tab function is not visible in the application");
			reportStep("FAIL", "The tab function is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The tab function is not interactable in the application");
			reportStep("FAIL", "The tab function is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The tab function is not stable in the application");
			reportStep("FAIL", "The tab function is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The tab function is not excuted due to unknown error");
			reportStep("FAIL", "The tab function is not excuted due to unknown error");
		}
	}

	@Override
	public void selectVisibleTextByName(String name, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement text = driver.findElementByName(name);
			
			Select sel = new Select(text);
			sel.selectByVisibleText(value);
			//System.out.println("The element with  name "+name+" is selected with visibile text successfully "+value);
			reportStep("PASS", "The element with  name "+name+" is selected with visibile text successfully "+value);
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The select with visibile text by name "+name+" is not found in the dom");
			reportStep("FAIL", "The select with visibile text by name "+name+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The select with visibile text by name "+name+" is not visible in the application");
			reportStep("FAIL", "The select with visibile text by name "+name+" is not visible in the application");
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The select with visibile text by name "+name+" is not selected in the application");
			reportStep("FAIL", "The select with visibile text by name "+name+" is not selected in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The select with visible text by name "+name+" is not stable in the application");
			reportStep("FAIL", "The select with visible text by name "+name+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The select with visibile text by name "+name+" is not selected due to unknown error");
			reportStep("FAIL", "The select with visibile text by name "+name+" is not selected due to unknown error");
		}
	}

	@Override
	public void switchToFrameById(String id) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().frame(id);
			//System.out.println("Switching into frame is done successfully ");
			reportStep("PASS", "Switching into frame is done successfully ");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame with id "+id+" is not found in the dom");
			reportStep("FAIL", "The frame with id "+id+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The frame with id "+id+" is not visible in the application");
			reportStep("FAIL", "The frame with id "+id+" is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The frame with id "+id+" is not interactable in the application");
			reportStep("FAIL", "The frame with id "+id+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The frame with id "+id+" is not stable in the application");
			reportStep("FAIL", "The frame with id "+id+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The frame with id "+id+" is unable to excute due to unknwon error");
			reportStep("FAIL", "The frame with id "+id+" is unable to excute due to unknwon error");
		}
	}

	@Override
	public void enterInAlert(String text) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().sendKeys(text);
			//System.out.println("The text is entered in the alert successfully ");
			reportStep("PASS", "The text is entered in the alert successfully ",false);
		} 
		catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text is unable to enter in the alert due to no alert present in the application");
			reportStep("FAIL", "The text is unable to enter in the alert due to no alert present in the application", false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("the text is unable to enter in the alert due to unknown erroe");
			reportStep("FAIL", "The text is unable to enter in the alert due to unknown error", false);
		}
		
	}

	@Override
	public void switchToParentFrame() {
		// TODO Auto-generated method stub, 
		
		try {
			driver.switchTo().defaultContent();
			//System.out.println("Switching to parent frame is done successfully");
			reportStep("PASS", "Switching to parent frame is done successfully");
		} 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame is unable to switch due to unknown error");
			reportStep("FAIL", "The frame is unable to switch due to unknown error");
		}
	}

	@Override
	public void refreshThePage() {
		// TODO Auto-generated method stub
		
		try {
			driver.navigate().refresh();
			//System.out.println("Refresh of the page is done successfully");
			reportStep("PASS", "Refresh of the page is done successfully");
		} 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Refresh of the page is unable excute due to unknown error");
			reportStep("FAIL", "Refresh of the page is unable excute due to unknown error");
		}
	}

	@Override
	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText =	driver.findElementById(id).getText();
			if (actualText.contains(text)) {
				//System.out.println("The text with id "+id+" is holding the text "+actualText+" is containing the expected text "+text);
				reportStep("PASS", "The text with id "+id+" is holding the text "+actualText+" is containing the expected text "+text);
			}
			else {
				//System.err.println("The text with id "+id+" is holding the text "+actualText+" is not containing the expected text "+text);
				reportStep("FAIL", "The text with id "+id+" is holding the text "+actualText+" is not containing the expected text "+text);
			}
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text with id "+id+" is containing the text "+text+" is not found in the dom");
			reportStep("FAIL", "The text with id "+id+" is containing the text "+text+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The text with id "+id+" is containing the text "+text+" is not visible in the application");
			reportStep("FAIL", "The text with id "+id+" is containing the text "+text+" is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The text with id "+id+" is containing the text "+text+" is not interactable in the application");
			reportStep("FAIL", "The text with id "+id+" is containing the text "+text+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The text with id "+id+" is containing the text "+text+" is not stable in the application");
			reportStep("FAIL", "The text with id "+id+" is containing the text "+text+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text with id "+id+" is containing the text "+text+" is not verified due to unknown error");
			reportStep("FAIL", "The text with id "+id+" is containing the text "+text+" is not verified due to unknown error");
			
		}

	}

	@Override
	public void pageDown() {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("The pageDown is excuted successfully");
			reportStep("PASS", "The pageDown is excuted successfully");
		} 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The pageDown is unable excuted due to unknown error");
			reportStep("FAIL", "The pageDown is unable excuted due to unknown error");
		}
		
	}

	@Override
	public void mouseHoverByXpath(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			Actions biulder = new Actions(driver);
			
			 WebElement mouse= driver.findElementByXPath(xpath);
			 
			 biulder.moveToElement(mouse).perform();
			// System.out.println("The mousehover action with xpath "+xpath+"  is excuted successfully");
			 reportStep("PASS", "The mousehover action with xpath "+xpath+"  is excuted successfully");
		} 
		catch (NoSuchElementException  e) {
			// TODO Auto-generated catch block
			//System.err.println("The mousehover action with xpath "+xpath+" is not found in the dom");
			reportStep("FAIL", "The mousehover action with xpath "+xpath+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The mousehover action with xpath "+xpath+" is not visible in the application");
			reportStep("FAIL", "The mousehover action with xpath "+xpath+" is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The mousehover action with xpath "+xpath+" is not interactable in the application");
			reportStep("FAIL", "The mousehover action with xpath "+xpath+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The mousehover action with xpath "+xpath+" is not stable in the application");
			reportStep("FAIL", "The mousehover action with xpath "+xpath+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The mousehover action with xpath "+xpath+" is unable excute due to unknown error"); 
			reportStep("FAIL", "The mousehover action with xpath "+xpath+" is unable excute due to unknown erro");
		}
	}

	@Override
	public void switchToFrameByXpath(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			WebElement myFrame =driver.findElementByXPath(xpath);
			driver.switchTo().frame(myFrame);
			//System.out.println("Switching into frame is done successfully ");
			reportStep("PASS", "Switching into frame is done successfully ");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame with xpath "+xpath+" is not found in the dom");
			reportStep("FAIL", "The frame with xpath "+xpath+" is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The frame with xpath "+xpath+" is not visible in the application");
			reportStep("FAIL", "The frame with xpath "+xpath+" is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The frame with xpath "+xpath+" is not interactable in the application");
			reportStep("FAIL", "The frame with xpath "+xpath+" is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The frame with xpath "+xpath+" is not stable in the application");
			reportStep("FAIL", "he frame with xpath "+xpath+" is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The frame with id "+xpath+" is unable to excute due to unknwon error");
			reportStep("FAIL", "The frame with xpath "+xpath+" is unable to excute due to unknwon error");
		}
	 }

	@Override
	public void pressTabKeyByXpath(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpath).sendKeys(Keys.TAB);
			//System.out.println("The tab function is excuted successfully");
			reportStep("PASS", "The tab function is excuted successfully");
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The tab function is not found in the dom");
			reportStep("FAIL", "The tab function is not found in the dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The tab function is not visible in the application");
			reportStep("FAIL", "The tab function is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The tab function is not interactable in the application");
			reportStep("FAIL", "The tab function is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The tab function is not stable in the application");
			reportStep("FAIL", "The tab function is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The tab function is not excuted due to unknown error");
			reportStep("FAIL", "The tab function is not excuted due to unknown error");
		}
		
	}
	public void loadObjects() {
		
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	public void unloadObjects() {
		prop=null;
	}

	
  } 	
		


