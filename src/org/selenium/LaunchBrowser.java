package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\sELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//To find the locator
		
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("saranya");
		
		String att1 = mail.getAttribute("class");
		System.out.println(att1);
		
		
		//To fill password
		
		WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pwd.sendKeys("345678");
		
		
		
		
		//To click button
		
		WebElement btn = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		btn.click();
		

		System.out.println("RAseem");
		System.out.println("Selenium ");
		

		
		System.out.println("New Code Added");
		System.out.println("New Code Added");
		System.out.println("New Code Added");

		
		
		
		
		
		
	}

}
