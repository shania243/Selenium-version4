package com.newConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabWindow 
{
	@Test
	public void newtabwindow() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		//driver.switchTo().newWindow(WindowType.TAB);                     //blank tab
		driver.switchTo().newWindow(WindowType.WINDOW);                    //new blank window

 }
}
