package com.handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WindowsHandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("https://www.hyrtutorials.com/");
	Thread.sleep(4000);
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		driver.findElement(By.xpath("//*[@id='newWindowBtn']")).click();
		
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		
		for(String allWindows : allWindowsId) {
			if(!allWindows.equals(parentWindowId)) {
				driver.switchTo().window(allWindows);
		
				driver.findElement(By.id("firstName")).sendKeys("Hello Java");
				Thread.sleep(4000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("BYEBYE");
				
			}
		
		

}
