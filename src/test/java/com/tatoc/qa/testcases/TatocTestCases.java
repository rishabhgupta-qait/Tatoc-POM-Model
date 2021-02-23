package com.tatoc.qa.testcases;

import java.io.IOException;


//import org.testng.Assert;
import org.testng.annotations.Test;

import com.tatoc.qa.base.TestBase;

public class TatocTestCases extends TestBase {
	
	@Test(priority=0)
	public void welcomePageTitleTest() {
		welcomePage.validateWelcomePageTitle();
		welcomePage.baseCourseLink();
	}
	@Test(priority=1)
	public void clickOnRedBox() {
		gridGadePage.redBox();
	}
	
	@Test(priority=2)
	public void clickOnGreenBox() throws IOException {
		gridGadePage.greenBox();
	}
	
	@Test(priority=3)
	public void checkReprintAndProceedLink() throws IOException {
		framedungeon.validateProceedLink();
	}
	
	@Test(priority=4)
	public void dragAroungProceedLink() throws IOException {
		draganddrop.dragAndDrop();
	}
	
	@Test(priority=5)
	public void launchPopUpWindow() throws IOException {
		popwindow.popWindow();
	}
	@Test(priority=6)
	public void generateCookieToken() {
		cookiehandling.cookieHandling();
		//cookiehandling.cookieHandling();
	}

}
