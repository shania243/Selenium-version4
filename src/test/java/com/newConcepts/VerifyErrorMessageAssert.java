//verify error msg using assert class

package com.newConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyErrorMessageAssert 
{
	@Test
	public void verifyerror()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		WebElement errormessage=driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]"));
		//String actualerrormessage=errormessage.getText();
		//String expectederrormessage="Username or Password is invalid. Please try again.";
		
		/*if(actualerrormessage.equalsIgnoreCase(expectederrormessage))
		{
			System.out.println("Maching");
		}
		else 
		{
			System.out.println("not maching");
		}*/
		
		/*Assert.assertEquals(actualerrormessage, expectederrormessage);
		System.out.println("************");*/
		
		String actualerrormessage=errormessage.getAttribute("innerHTML");
		String expectederrormessage="Username or Password is invalid.";
		Assert.assertTrue(actualerrormessage.contains(expectederrormessage));
		System.out.println("test is succesful");
	}
}
