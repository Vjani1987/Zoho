package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public WebDriver driver;
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//span[@class='unchecked']")
	private WebElement agreecheckbox;
	
	@FindBy(id="signupbtn")
	private WebElement signupbtn;
	
	public SignUpPage(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebElement getUserName() {
		return username;
	}	
	
	public WebElement getPassword() {
		return password;
		
	}
	
	public WebElement getAgreeCheckBox() {
		return agreecheckbox;
	}
	
	public WebElement getSignUpBtn() {
		return signupbtn;
	}
	}


