package com.ipt.sept.IPTZohoProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ipt.sept.IPTZohoProject.baseclass.BaseClass1;
import com.pom1.SignUpNowPage;
import com.pom1.SignUpPage;
import com.pom1.SingleTonDesignPattern;
import com.property.ConfigurationHelper;

public class ZohoProject3 extends BaseClass1{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String browser=ConfigurationHelper.getInstance().getBrowser();
		browserLaunch(browser);
		
		
		SingleTonDesignPattern sdp= new SingleTonDesignPattern(driver);

		String url=ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);

		implicitWait();
	
		clickOnElement(sdp.getSignUpNowPage().getSignUpNow());

		String username=ConfigurationHelper.getInstance().getUserName();	
		userInput(sdp.getSignUpPage().getUserName(),username);

		String password=ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getSignUpPage().getPassword(),password);
		
		sleep();
		
		clickOnElement(sdp.getSignUpPage().getAgreeCheckBox());

		sleep();
		
		clickOnElement(sdp.getSignUpPage().getSignUpBtn());

		sleep();
		String path=ConfigurationHelper.getInstance().getScreenShot();
		takeScreenShot(path);
		
	
}

}


