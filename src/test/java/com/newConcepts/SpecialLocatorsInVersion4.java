package com.newConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecialLocatorsInVersion4 
{

	@Test
	public void spcl_locatrs() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebElement emailAddress=driver.findElement(new ByAll(By.id("emaail"),By.name("emmail"),By.xpath("//input[@data-testid='royal_email']")));
		emailAddress.sendKeys("Shania");                     //
		Thread.sleep(2000);
		emailAddress.clear();
		
		WebElement emailAddress1=driver.findElement(new ByIdOrName("email"));        //enter any value from Id or Name
		StringBuilder sb=new StringBuilder()
				.append('m')
				.append('r')
				.append('i')
				.append('n')
				.append('a')
				.append('l');                              
		emailAddress1.sendKeys(sb);  
	
	}
}
