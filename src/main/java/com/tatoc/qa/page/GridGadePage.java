package com.tatoc.qa.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tatoc.qa.base.TestBase;

public class GridGadePage {
	//public FrameDungeonPage framedungeon;
	WebDriver driver;
	
//	@FindBy(xpath="//div[@class='redbox']")
//	WebElement redSqure; 	
//	@FindBy(xpath="//div[@class='greenbox']")
//	WebElement greenSqure;
//	
//	public GridGadePage() {
//		//super();
//		PageFactory.initElements(driver, this);
//	}

	public GridGadePage(WebDriver driver) {
		this.driver=driver;
	}



//	public String validateGridGadePageTitle() {
//		return driver.getTitle();
//	}
	public void redBox() {
		driver.findElement(By.xpath("//div[@class='redbox']")).click();
		String actual=driver.getTitle();
		String expected = "Error - T.A.T.O.C";
		Assert.assertEquals(actual,expected, "Assertion Failed: Page title:Error - T.A.T.O.C not found");
	}
	
	public void greenBox() throws IOException {
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='greenbox']")).click();
		String actual=driver.getTitle();
		String expected = "Frame Dungeon - Basic Course - T.A.T.O.C";
		Assert.assertEquals(actual, expected,"Assertion Failed: Page title: Frame Dungeon - Basic Course - T.A.T.O.C not found");
	}
	

}
