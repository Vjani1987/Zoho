package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public Properties p;
	public ConfigurationReader() throws IOException {
		
		File f= new File("C:\\Users\\WELCOME\\eclipse-workspace\\IPTZohoProject\\src\\main\\java\\com\\property\\Zoho.properties");
		
		FileInputStream fi= new FileInputStream(f);
		
		 p= new Properties();
		 
		 p.load(fi);
		 
	}
	
	public String getBrowser() {
	String browser=p.getProperty("browser");
	return browser;
	}
	
	public String getUrl() {
	String url= p.getProperty("url");
	return url;
	}
		
	public String getUserName() {
	String username=p.getProperty("username");
	return username;
	}
	
	public String getPassword() {
	String password=p.getProperty("password");
	return password;
	}
	
	public String getScreenShot() {
	String path=p.getProperty("screenshot");
	return path;
	}
}
