package com.handles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {
	public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/FileDownload.html");
	driver.findElement(By.id("textbox")).sendKeys("testing files");
	driver.findElement(By.id("createTxt")).click();
	driver.findElement(By.id("link-to-download")).click();
	

	}
}
