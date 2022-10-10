package com.ipt.sept.IPTZohoProject.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {
	//WebDriver;
		public static WebDriver driver=null;
		public static WebDriver browserLaunch(String browser) {
			
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\eclipse-workspace\\IPTFacebookProject\\Driver\\chromedriver.exe");
				 driver= new ChromeDriver();	
			
			}else if (browser.equalsIgnoreCase("edge")) {
				 driver= new EdgeDriver();	
			
			} else if (browser.equalsIgnoreCase("gecko")) {
				driver= new FirefoxDriver();
			
			} else {
				System.out.println("Invalid browser");
			} 
			driver.manage().window().maximize();
			return driver;
			}
		//getUrl()
		public static void launchUrl(String url) {
			driver.get(url);
		}
		
		//sendKeys();
		public static void userInput(WebElement element, String value) {
		element.sendKeys(value);
			
		}
		
		//click();
		public static void clickOnElement(WebElement element) {
		element.click();
		}
		//implicitwait();
		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		
		//Threas.sleep();
		public static void sleep() throws InterruptedException {
			Thread.sleep(3000);
		}
		//TakeScreenshot();
		public static void takeScreenShot(String path) throws IOException  {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File target= new File(path);
		FileUtils.copyFile(source,target);
		}
}
