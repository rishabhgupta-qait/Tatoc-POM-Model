package com.tatoc.qa.page;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.tatoc.qa.base.TestBase;

public class PopWindowPage {
	//CookieHandlingPage cookiehandling;
	WebDriver driver;
//	public PopWindowPage() throws IOException {
//		super();
//		
//	}
	public PopWindowPage(WebDriver driver) {
		this.driver=driver;
	}
//	@FindBy(xpath="//a[@onclick='launchwindow();']")
//	WebElement LaunchPopWindowLink;
//	
//	@FindBy(css="#name")
//	WebElement name;
//	
//	@FindBy(css="#submit")
//	WebElement submit;
//	
//	@FindBy(xpath="//a[@onclick=gonext();]")
//	WebElement proceed;
//	
//	public String validatePopWindowTitle() {
//		return driver.getTitle();
//	}

	public void popWindow() throws IOException {
		driver.findElement(By.xpath("//a[@onclick='launchwindow();']")).click();
		switchWindow(1);
		 driver.findElement(By.cssSelector("#name")).sendKeys("rishabh");
		driver.findElement(By.cssSelector("#submit")).click();
		switchWindow(0);
		driver.findElement(By.xpath("//a[@onclick='gonext();']")).click();
		
		String actual = driver.getTitle();
		String expected = "Cookie Handling - Basic Course - T.A.T.O.C";
		Assert.assertEquals(actual, expected);
		}

	private void switchWindow(int i) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(i));
		
	}

}
