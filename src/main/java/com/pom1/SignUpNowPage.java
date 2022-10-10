package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpNowPage {
	
	public WebDriver driver;
	@FindBy (xpath="//a[text()='Sign Up Now']")
	private WebElement signupnow;
	
	public SignUpNowPage(WebDriver driver1) {
		this.driver= driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getSignUpNow() {
		return signupnow;
	}

}
