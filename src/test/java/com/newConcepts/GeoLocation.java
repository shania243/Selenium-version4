package com.newConcepts;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.emulation.Emulation;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoLocation 
{
	@Test
	public void loc()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		HashMap<String,Object> coordinateMap=new HashMap<String,Object>();
		coordinateMap.put("latitude", 41.878113);
		coordinateMap.put("longitude", -87.629799);
		coordinateMap.put("accuracy",100 );            //should be greater than 0
		
		((ChromeDriver)driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinateMap);
		
		driver.get("https://oldnavy.gap.com/stores");
    }
}