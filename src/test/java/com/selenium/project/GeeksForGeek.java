package com.selenium.project;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GeeksForGeek {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cyber-pu.github.io/ashirbad.ngo/");
		Actions actions=new Actions(driver);
		Thread.sleep(5000);
		actions.moveToElement(driver.findElement(By.xpath("//i[@class='fa-solid fa-magnifying-glass cursor-pointer src-btn mx-3 text-light']"))).build().perform();
		driver.findElement(By.xpath("//input[@class='search']")).sendKeys("Hii I am Sagar");
		actions.moveToElement(driver.findElement(By.xpath("//ul[@class='menu']/a[1]"))).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//ul[@class='menu']/a[2]"))).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//ul[@class='menu']/a[3]"))).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//ul[@class='menu']/a[4]"))).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//ul[@class='menu']/a[5]"))).build().perform();
		
		Thread.sleep(1000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//div[@class='sec'][3]/h1")));
		Thread.sleep(3000);
		driver.quit();
	}
}
