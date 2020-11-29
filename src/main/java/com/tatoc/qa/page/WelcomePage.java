package com.tatoc.qa.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tatoc.qa.base.*;

public class WelcomePage {
		WebDriver driver;
//@FindBy(xpath="//a[@href='/tatoc/basic']")
//WebElement basicCourse; 
//
//	public WelcomePage()  {
//	PageFactory.initElements(driver,this);
//	}

	public WelcomePage(WebDriver driver) {
		this.driver=driver;
	}

	public void validateWelcomePageTitle() {
		String title=driver.getTitle();
		Assert.assertEquals(title,"Welcome - T.A.T.O.C");
	}
	public void baseCourseLink() {
		driver.findElement(By.xpath("//a[@href='/tatoc/basic']")).click();
	}

	
	
//	public GridGadePage  baseCourseLink() {
//		basicCourse.click();
//		return new GridGadePage();}
}
