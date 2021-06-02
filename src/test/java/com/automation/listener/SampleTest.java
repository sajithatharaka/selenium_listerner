package com.automation.listener;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{
	
	@Test
    public static void pageTitleValidation(){ 
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.id("submit")).click();
		
	
		driver.findElement(By.id("fname")).sendKeys("Jack");
		driver.findElement(By.id("lname")).sendKeys("Brown");
		driver.findElement(By.id("country")).sendKeys("United Kingdon");
		driver.findElement(By.id("subject")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		driver.switchTo().alert().accept();
		
    }  
	
}
