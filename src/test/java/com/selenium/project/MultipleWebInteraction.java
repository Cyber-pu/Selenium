package com.selenium.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebInteraction {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./binary/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		List<WebElement> elements=driver.findElements(By.xpath("//select[@name='country']/option"));
		
		for(WebElement el1:elements) {
			System.out.println(el1.getText());
		}
		driver.quit();
	}
}
