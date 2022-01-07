package TestNg_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Yahoo_Mail_Test {
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch Chrome");
		
	}
	@BeforeMethod
	public void login() {
		System.out.println("Login to APP");
		
	}
	@Test
	public void compose() {
		System.out.println("Compose Mail");

}
	
	@Test
	public void delete() {
		System.out.println("Delete Mail");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Log Out");
	}	
	
	@AfterClass
	public void quitBrowser() {
		System.out.println("Quit Browser");
	} 	
}
	
	
