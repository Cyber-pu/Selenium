package com.selenium.project;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleBot {
	public static void main(String[] args) throws InterruptedException {
		
//		System.out.println(System.getProperty("os.name"));
		System.setProperty("webdriver.chrom.driver","F:\\languages\\Eclips\\projects\\Selenium\\binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.findElement(By.name("q")).sendKeys("Instagram");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.name("field-keywords")).sendKeys("i phone");
		driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);
		List<WebElement> anchorElements = driver.findElements(By.tagName("a"));
		if (anchorElements.size() > 0) {
		    anchorElements.get(0).sendKeys(Keys.ENTER);
		}

		
		Thread.sleep(9000);
		driver.quit();
	}
}
