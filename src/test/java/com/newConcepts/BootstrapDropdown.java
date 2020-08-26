package com.newConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown 
{

	@Test
	public void bootstrapdrop()
	{
		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("");
        driver.findElement(By.xpath(""));
        

	}

	
	
}
