package com.runner5;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.ipt.sept.IPTZohoProject.baseclass.BaseClass1;
import com.property.ConfigurationHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features="C:\\Users\\WELCOME\\eclipse-workspace\\IPTZohoProject\\src\\test\\java\\com\\feature5\\Zoho.feature", glue="com.stepdefinition5",
plugin= {"html:Report/HtmlReport1.html","json:Report/JsonReport1.json","junit:Report/xmlReport2.Xml"})

public class RunnerClass5 {
	
	public static WebDriver driver;
	@BeforeClass	
	public static void setUp() throws IOException {
	String browser=ConfigurationHelper.getInstance().getBrowser();	
	driver=BaseClass1.browserLaunch(browser);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}


}
