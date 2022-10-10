package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPattern {
	
	public static WebDriver driver;
	
	public SingleTonDesignPattern(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}

	public SignUpNowPage getSignUpNowPage() {		
	
		SignUpNowPage snp= new SignUpNowPage(driver);
		return snp;
	}
	
	public SignUpPage getSignUpPage() {
		SignUpPage sp= new SignUpPage(driver);
		return sp;
	}
}
