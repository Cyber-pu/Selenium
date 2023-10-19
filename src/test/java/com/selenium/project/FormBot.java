package com.selenium.project;

import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormBot {
	public static void main(String[] args) throws InterruptedException {
		String gender[]= {"//input[@value='female']","//input[@value='male']"};
		String language[]= {"//input[@value='Java']","//input[@value='Python']","//input[@value='JavaScript']"};
		String country[]= {"Canada","India","UK","Australia","USA"};
		Random rnd=new Random();
		System.setProperty("webdriver.chrome.driver","./binary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		for(int i=0;i<10;i++) {

			driver.findElement(By.name("firstname")).sendKeys(UUID.randomUUID().toString().substring(0,9));
			driver.findElement(By.name("lastname")).sendKeys(UUID.randomUUID().toString().substring(0,9));
			driver.findElement(By.name("email")).sendKeys(UUID.randomUUID().toString().substring(0,9)+"@gmail.com");
			driver.findElement(By.xpath(gender[(int) rnd.nextInt(2)])).click();
			driver.findElement(By.name("phone")).sendKeys(UUID.randomUUID().toString().substring(0,9));
			Select s=new Select(driver.findElement(By.name("country")));
			s.selectByVisibleText(country[rnd.nextInt(5)]);
			driver.findElement(By.xpath(language[ rnd.nextInt(3)])).click();
			driver.findElement(By.tagName("button")).click();
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
