package mypractice;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sample1 extends BaseClass 

{
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeclass");
		browserLaunch();
		maximizeWindow();
		enterApplnUrl("https://www.facebook.com/login/");
		implicitWait();
		}
	@AfterClass
	public static void afterclass() {
		System.out.println("Afterclass");
		}
@Before
public  void before() {
	System.out.println("after");
	long starttime = System.currentTimeMillis();
	System.out.println("starttime"+starttime);
}
@After
public  void after() {
	System.out.println("after");
	long endtime = System.currentTimeMillis();
	System.out.println("endoftime"+endtime);

}
@Test
public void tc1() throws IOException {
	WebElement username = findLocatorById("email");
	elementSendKeys(username, getCellData("Sheet1", 0, 0));
	WebElement password = findLocatorById("pass");
	elementSendKeys(password, getCellData("Sheet1",0,0));
	
	WebElement login = findLocatorByClassXpath("//button[@id='loginbutton']");
	login.click();

}
}
