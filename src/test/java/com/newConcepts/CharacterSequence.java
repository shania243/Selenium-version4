//Different ways of entering character sequence

package com.newConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CharacterSequence 
{
	@Test
	public void charseq() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");                     //by using String class
		Thread.sleep(2000);
		username.clear();
		
		StringBuilder sb=new StringBuilder()
				.append('h')
				.append('e')
				.append('l')
				.append('l')
				.append('o');                              
		username.sendKeys(sb);                          //by using StringBuilder class
		Thread.sleep(2000);
		
		StringBuffer sb2=new StringBuffer()             //by using StringBuffer class
				.append(' ')
				.append('m')
				.append('e')
				.append("gh")
				.append('a'); 
		username.sendKeys(sb2); 
    }
}