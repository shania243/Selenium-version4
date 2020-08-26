package com.newConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class PhantomJSHeadless 
{
	@Test
	public void phontomjsheadless() throws InterruptedException 
	{
		//WebDriverManager.phantomjs().setup();
		
		System.setProperty("phantomjs.binary.path","./drivers/phantomjs.exe");
		WebDriver driver=new PhantomJSDriver();                                     //error
		
        driver.navigate().to("https://demo.actitime.com/");
		
		System.out.println("Title of this page is : "+ driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");;
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");;
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		
		Thread.sleep(5000);
		System.out.println("Title of this page after entering credentials is : "+ driver.getTitle());
	}
	
}
