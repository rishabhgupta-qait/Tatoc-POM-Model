package com.tatoc.qa.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tatoc.qa.base.TestBase;

public class DragAroundPage  {
	//PopWindowPage popwindow;
	WebDriver driver;
	
//	@FindBy(xpath="//div[@id='dragbox']")
//	WebElement sourceElement;
//	
//	@FindBy(xpath="//div[@id='dropbox']")
//	WebElement targetElement;
//	
//	@FindBy(xpath="//a[@onclick=\"gonext();\"]")
//	WebElement proceedbtn;
//
//	public DragAroundPage() throws IOException {
//		super();
//		PageFactory.initElements(driver,this);
//		}
	
	public DragAroundPage(WebDriver driver) {
		this.driver=driver;
	}

//	public String validateDragAndDropTitle() {
//		return driver.getTitle();}
	
	public void dragAndDrop() throws IOException {
		Actions action = new Actions(driver);
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='dragbox']"));
		WebElement targetElement = driver.findElement(By.xpath("//div[@id='dropbox']"));
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		driver.findElement(By.xpath("//a[@onclick='gonext();']")).click();
		String actual = driver.getTitle();
		String expected ="Windows - Basic Course - T.A.T.O.C";
		Assert.assertEquals(actual, expected);
		}
}
