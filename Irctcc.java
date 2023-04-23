package com.selenium_miniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctcc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse Workspace\\Selenium_Trainings\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		//from
		WebElement from= driver.findElement(By.xpath("//input[@role='searchbox']"));
		from.sendKeys("Erode");
		Thread.sleep(1000);
		//to
		WebElement to= driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
		to.sendKeys("Chennai");
		Thread.sleep(1000);
		
		//date
		WebElement cal= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		cal.click();
		Thread.sleep(1000);
	
		WebElement next = driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']"));
		next.click();
        Thread.sleep(1000);
        
		WebElement day = driver.findElement(By.xpath("//a[text()='21']"));
		day.click();
		Thread.sleep(1000);
		
		// classselect
		WebElement classes = driver.findElement(By.id("journeyClass"));
		classes.click();
		Thread.sleep(1000);
		
		WebElement class1 = driver.findElement(By.xpath("//span[text()='Sleeper (SL)']"));
		class1.click();
		Thread.sleep(1000);
		
		//general
		WebElement general = driver.findElement(By.id("journeyQuota"));
		general.click();
		Thread.sleep(1000);
		WebElement general1= driver.findElement(By.xpath("//span[text()='LADIES']"));
		general1.click();
		Thread.sleep(1000);
		
		//check box
		 WebElement check = driver.findElement(By.xpath("//label[contains(text(),'Train with Available Berth ')]"));
		check.click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		 WebElement findElement = driver.findElement(By.xpath("//span[text()='OK']"));
//		 findElement.click();
		// Thread.sleep(1000);
		 
		 //search
		 WebElement search= driver.findElement(By.xpath("//button[@label='Find Trains']"));
     	// search.click();
		 Actions a= new Actions(driver);
		 a.click(search).build().perform();
//		 JavascriptExecutor js=(JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].click();",search);
		
     	
		

		

	}

}

