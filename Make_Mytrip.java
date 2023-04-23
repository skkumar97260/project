package com.selenium_miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_Mytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse Workspace\\Selenium_Trainings\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/?gclid=CjwKCAjw_MqgBhAGEiwAnYOAesDnvEYWe10TycSz2EWIxyNNsXw4xdmZy_q6Oqjq7PwTLARDnJHH0xoCeFMQAvD_BwE&cmp=SEM|D|DF|G|Brand|Brand-BrandVariants_DT|B_M_Makemytrip_Variants|Brand-Variants-Exact|RSA|Regular|V2|274470846615&s_kwcid=AL!1631!3!274470846615!e!!g!!makemytrip%20login&ef_id=CjwKCAjw_MqgBhAGEiwAnYOAesDnvEYWe10TycSz2EWIxyNNsXw4xdmZy_q6Oqjq7PwTLARDnJHH0xoCeFMQAvD_BwE:G:s");
				driver.manage().window().maximize();
				
				Thread.sleep(1000);
				WebElement findElement = driver.findElement(By.id("fromCity"));
				findElement.sendKeys("coimbatore");
				Thread.sleep(1000);
				WebElement findElement2 = driver.findElement(By.id("toCity"));
				findElement2.sendKeys("chennai");
				Thread.sleep(1000);
				//return
				WebElement dep = driver.findElement(By.xpath("//label[@for='departure']"));
				dep.click();
				//div[text()='April 2023']
				Thread.sleep(1000);
				WebElement next = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
				next.click();
				Thread.sleep(1000);
				WebElement day = driver.findElement(By.xpath("//p[text()='10']"));
				day.click();
				Thread.sleep(1000);
				//return
				WebElement return1 = driver.findElement(By.xpath("//div[@data-cy='returnArea']"));
				return1.click();
				Thread.sleep(1000);
				WebElement next1 = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
				next1.click();
				Thread.sleep(1000);
				WebElement day1 = driver.findElement(By.xpath("//p[text()='21']"));
				day1.click();
				Thread.sleep(1000);
				//Traveller
				WebElement traveller= driver.findElement(By.xpath("//label[@for='travellers']"));
				traveller.click();
				Thread.sleep(1000);
				
				WebElement adult= driver.findElement(By.xpath("//li[@data-cy='adults-2']"));
				adult.click();
				Thread.sleep(1000);
				
				WebElement child= driver.findElement(By.xpath("//li[@data-cy='children-2']"));
				child.click();
				Thread.sleep(1000);
				
				WebElement infant= driver.findElement(By.xpath("//li[@data-cy='infants-2']"));
				infant.click();
				Thread.sleep(1000);
				
				WebElement choseclass= driver.findElement(By.xpath("//li[text()='Business']"));
				choseclass.click();
				Thread.sleep(1000);
				
				WebElement apply= driver.findElement(By.xpath("//button[text()='APPLY']"));
				apply.click();
				Thread.sleep(1000);
				//select fare type
//				WebElement select= driver.findElement(By.xpath("//p[text()='Student ']"));
//				select.click();
//				Thread.sleep(1000);
				//search
				
				WebElement  search= driver.findElement(By.xpath("//a[text()='Search']"));
				search.click();
				
				

	}

}
