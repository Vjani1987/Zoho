package com.stepdefinition5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.ipt.sept.IPTZohoProject.baseclass.BaseClass1;
import com.pom1.SingleTonDesignPattern;
import com.property.ConfigurationHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition5 extends BaseClass1{
	
	public WebDriver driver= BaseClass1.browserLaunch("chrome");
	
	SingleTonDesignPattern sdp= new SingleTonDesignPattern(driver);
	@Given("user Launch The Application Url")
	public void user_Launch_The_Application_Url() throws IOException {
		String url=ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);
		implicitWait();
	}

	@When("user Click On SignUpNow")
	public void user_Click_On_SignUpNow() {
		clickOnElement(sdp.getSignUpNowPage().getSignUpNow());
	}

	@When("user Enter the Username In The Username Field")
	public void user_Enter_the_Username_In_The_Username_Field() throws IOException {
		String username=ConfigurationHelper.getInstance().getUserName();	
		userInput(sdp.getSignUpPage().getUserName(),username);
	}

	@When("user Enter The Password In The Passwod Field")
	public void user_Enter_The_Password_In_The_Passwod_Field() throws IOException {
		String password=ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getSignUpPage().getPassword(),password);   
	}

	@When("user Click On Agree Check Box")
	public void user_Click_On_Agree_Check_Box() throws InterruptedException {
		sleep();		
		clickOnElement(sdp.getSignUpPage().getAgreeCheckBox()); 
	}

	@When("user Click The SignUp Button")
	public void user_Click_The_SignUp_Button() throws InterruptedException {
		sleep();		
		clickOnElement(sdp.getSignUpPage().getSignUpBtn());   
	}

	@Then("user Takes Screenshot Of The Current Webpage")
	public void user_Takes_Screenshot_Of_The_Current_Webpage() throws InterruptedException, IOException {
		sleep();
		String path=ConfigurationHelper.getInstance().getScreenShot();
		takeScreenShot(path); 
	}

}
