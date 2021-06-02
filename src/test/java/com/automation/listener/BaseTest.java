package com.automation.listener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends MyListerner{
	public static String BASE_URL="https://sajithatharaka.github.io/testers_helpers";
	public static EventFiringWebDriver driver;
	static{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	}
	@BeforeSuite
	 public static void precondition(){
	    driver = new EventFiringWebDriver(new ChromeDriver()); 
		MyListerner listerner = new MyListerner();
		driver.register(listerner);
			     
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.get(BASE_URL);
	}
	
	@AfterSuite
	 public static void postcondition(){
		driver.quit();		
	}
}
