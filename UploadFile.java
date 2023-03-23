package com.handles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		driver.findElement(By.className("heroSection-buttonContainer_secondaryBtn secondaryBtn"));
		//using sendkeys()
		driver.findElement(By.id("file-upload")).sendKeys("D:\\screenshot");
		
	}

}
