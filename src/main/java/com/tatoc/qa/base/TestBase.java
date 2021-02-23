package com.tatoc.qa.base;
import java.io.FileInputStream;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.tatoc.qa.page.CookieHandlingPage;
import com.tatoc.qa.page.DragAroundPage;
import com.tatoc.qa.page.FrameDungeonPage;
import com.tatoc.qa.page.GridGadePage;
import com.tatoc.qa.page.PopWindowPage;
import com.tatoc.qa.page.WelcomePage;
import com.tatoc.qa.util.TestUtil;


public class TestBase {
	 WebDriver driver;
	 protected WelcomePage welcomePage;
	 protected GridGadePage gridGadePage;
	 protected FrameDungeonPage framedungeon;
	 protected DragAroundPage draganddrop;
	 protected PopWindowPage popwindow;
	 protected CookieHandlingPage cookiehandling;
//	public Properties prep;
//	public TestUtil testutil;
	public TestBase(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();}
//		try {
//			prep=new Properties();
//			FileInputStream	ip = new FileInputStream("C:\\Users\\Rishabh\\eclipse-workspace\\TatocqaTest\\src\\main\\java\\com\\tatoc\\qa\\config\\config.properties");
//			prep.load(ip);}
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
		
	//}
	

	public void initialization() {
		welcomePage = new WelcomePage(driver);
		gridGadePage = new GridGadePage(driver);
		framedungeon =  new FrameDungeonPage(driver);
		draganddrop = new DragAroundPage(driver);
		popwindow = new PopWindowPage(driver);
		cookiehandling = new CookieHandlingPage(driver);}
	
	@BeforeClass
	public void setup() {
		driver.get("http://10.0.1.86/tatoc");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		initialization();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

