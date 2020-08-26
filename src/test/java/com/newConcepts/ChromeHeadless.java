package com.newConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless 
{
	@Test
	public void chromeheadless() throws InterruptedException          //without opening the browser
	{
		WebDriverManager.chromedriver().setup();                      //without setting key n value of chrome browser
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver =new ChromeDriver(options);
		driver.navigate().to("https://demo.actitime.com/");
		
		System.out.println("The Title of this page is : "+ driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");;
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");;
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		
		Thread.sleep(5000);
		System.out.println("The Title of this page after entering credentials is : "+ driver.getTitle());
		
	}
}
