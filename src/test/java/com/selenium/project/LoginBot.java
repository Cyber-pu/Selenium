package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v2/");
		driver.findElement(By.name("uid")).sendKeys("mngr533454");
		driver.findElement(By.name("password")).sendKeys("anYbAnA");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
