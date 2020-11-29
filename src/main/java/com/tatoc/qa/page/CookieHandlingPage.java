package com.tatoc.qa.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tatoc.qa.base.TestBase;

public class CookieHandlingPage {

	WebDriver driver;
//	@FindBy(xpath="//a[@onclick='generateToken();']")
//	WebElement generateToken;
//	
//	@FindBy(xpath="//span[@id=\\\"token\\\"]")
//	WebElement token;
//	
//	public CookieHandlingPage() throws IOException {
//		super();
//		PageFactory.initElements(driver,this);}
	
    public CookieHandlingPage(WebDriver driver) {
		this.driver=driver;
	}

	public String valiateCookieTitle() {
    	return driver.getTitle();
    }
    
    public void cookieHandling() {
    	driver.findElement(By.xpath("//a[@onclick='generateToken();']")).click();
		String value= driver.findElement(By.xpath("//span[@id=\"token\"]")).getText().substring(7);
		System.out.println(value);
		 driver.manage().addCookie(new Cookie("Token", value));
		 driver.findElement(By.cssSelector("body > div > div.page > a:nth-child(10)")).click();
	     driver.close();
}
}
