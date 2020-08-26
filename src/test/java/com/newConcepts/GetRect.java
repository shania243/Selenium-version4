package com.newConcepts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRect 
{
	@Test
	public void getrect()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		//selenium v3
		Point p=loginButton.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Dimension d=loginButton.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		System.out.println("****************************");
		
		//selenium v4
		Rectangle r=loginButton.getRect();
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		
		
	}
}
