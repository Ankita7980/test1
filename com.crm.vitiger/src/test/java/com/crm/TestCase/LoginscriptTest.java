package com.crm.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginscriptTest {

	
	public WebDriver driver =null;
	
	@Test 
	
	
	public void login()
	
	{
		String browser = System.getProperty("browser");
		System.out.println(browser);
		String url =  System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		if(browser.equalsIgnoreCase("chrome")) {
			  WebDriverManager.chromedriver().setup();
			  driver =new ChromeDriver();
			 }
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(username);	
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		
	}
	
	
	
}
