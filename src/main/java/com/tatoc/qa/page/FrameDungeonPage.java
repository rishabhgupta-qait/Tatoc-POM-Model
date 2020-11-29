package com.tatoc.qa.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tatoc.qa.base.TestBase;

public class FrameDungeonPage  {
	WebDriver driver;
	//public DragAroundPage draganddrop;
	
//	@FindBy(xpath="//a[@onclick='reloadChildFrame();']")
//	WebElement RepaintBox;
//	
//	@FindBy(xpath="//a[@onclick='gonext();']")
//	WebElement Proceed;
//	
//	@FindBy(css="#main")
//	WebElement iframe1;
//	
//	@FindBy(css="#child")
//	WebElement iframe2;
//	
//	public FrameDungeonPage() throws IOException {
//		PageFactory.initElements(driver,this);
//	} 
	
	public FrameDungeonPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void validateProceedLink() throws IOException {
		WebElement iframe1=driver.findElement(By.cssSelector("#main"));
		driver.switchTo().frame(iframe1);
		String box1 = driver.findElement(By.xpath("//div[@id='answer']")).getAttribute("class");
		WebElement iframe2=driver.findElement(By.cssSelector("#child"));
		driver.switchTo().frame(iframe2);
		String  box2 =driver.findElement(By.cssSelector("#answer")).getAttribute("class");;
		while(!box1.equals(box2)){
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//a[@onclick='reloadChildFrame();']")).click();
			//RepaintBox.click();
			driver.switchTo().frame(iframe2);
			box2 = driver.findElement(By.cssSelector("#answer")).getAttribute("class");}
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@onclick='gonext();']")).click();
		String actual = driver.getTitle();
		String expected = "Drag - Basic Course - T.A.T.O.C";
		Assert.assertEquals(actual, expected,"Assertion failed:title:Drag - Basic Course - T.A.T.O.C is not found");
		}

	
	

}
