package com.maven_22_nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello_selenium99 {

	static WebDriver driver; 
	//public static void main(String[] args) throws Exception {

@Test

public void google_search() throws Exception{
		
		System.out.println("hello selenium how r u ? ");
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.name("q")).sendKeys("selenium");
		 Thread.sleep(2000);
		 driver.findElement(By.name("btnK")).click();
		 
		 
		 
		}

}
