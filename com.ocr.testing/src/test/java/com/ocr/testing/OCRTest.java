package com.ocr.testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OCRTest {
	
	WebDriver driver;
	   
	 @BeforeTest  
	  public void setUpDriver() {  
		 System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	  } 

	@Test
	public void test1 ()
	{
		
		 driver.get("http://google.com");  
		 driver.findElement(By.name("q")).sendKeys("selenium");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 driver.quit();
		
		
	}
	
	@Test
	public void test2 ()
	{
		
		 System.out.println("pass");
		
		
	}
}
