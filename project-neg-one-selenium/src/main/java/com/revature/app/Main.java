package com.revature.app;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/webdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080");
		
		// Addition
		WebElement addInput1 = driver.findElement(By.id("addNum1"));
		WebElement addInput2 = driver.findElement(By.id("addNum2"));
		WebElement addButton = driver.findElement(By.id("addBtn"));
		
		// addition values
		String addNumber1 = "9.11";
		String addNumber2 = "11.11";
		
		addInput1.sendKeys(addNumber1);
		addInput2.sendKeys(addNumber2);
		addButton.click();
	
		driver.switchTo().frame("addResult");
		
		// getting result in the iframe element by tagName "pre"
		WebElement addOutputElement = driver.findElement(By.tagName("pre"));
		System.out.println("Addition Result: " + addNumber1 + " + " + addNumber2 + " = " + addOutputElement.getText());
		
		driver.switchTo().defaultContent();
		
		// Subtraction
		WebElement subInput1 = driver.findElement(By.id("subNum1"));
		WebElement subInput2 = driver.findElement(By.id("subNum2"));
		WebElement subButton = driver.findElement(By.id("subBtn"));
		
		// subtraction values
		String subNumber1 = "10.27";
		String subNumber2 = "10.11";
				
		subInput1.sendKeys(subNumber1);
		subInput2.sendKeys(subNumber2);
		subButton.click();
	
		driver.switchTo().frame("subResult");
		
		WebElement subOutputElement = driver.findElement(By.tagName("pre"));
		System.out.println("Subtraction Result: " + subNumber1 + " + " + subNumber2 + " = " + subOutputElement.getText());
		
		driver.switchTo().defaultContent();
		
		// Multiplication
		WebElement mulInput1 = driver.findElement(By.id("mulNum1"));
		WebElement mulInput2 = driver.findElement(By.id("mulNum2"));
		WebElement mulButton = driver.findElement(By.id("mulBtn"));
		
		// multiplication values
		String mulNumber1 = "12.22";
		String mulNumber2 = "5.0";
		
		mulInput1.sendKeys(mulNumber1);
		mulInput2.sendKeys(mulNumber2);
		mulButton.click();
	
		driver.switchTo().frame("mulResult");
		
	
		WebElement mulOutputElement = driver.findElement(By.tagName("pre"));
		System.out.println("Multiplication Result: " + mulNumber1 + " + " + mulNumber2 + " = " + mulOutputElement.getText());
	
		driver.switchTo().defaultContent();
		
		// Division
		WebElement divInput1 = driver.findElement(By.id("divNum1"));
		WebElement divInput2 = driver.findElement(By.id("divNum2"));
		WebElement divButton = driver.findElement(By.id("divBtn"));
		
		// division values
		String divNumber1 = "143";
		String divNumber2 = "2.0";
		
		divInput1.sendKeys(divNumber1);
		divInput2.sendKeys(divNumber2);
		divButton.click();
	
		driver.switchTo().frame("divResult");
		
		WebElement divOutputElement = driver.findElement(By.tagName("pre"));
		System.out.println("Division Result: " + divNumber1 + " + " + divNumber2 + " = " + divOutputElement.getText());
	
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
