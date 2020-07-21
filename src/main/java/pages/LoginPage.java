package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnDriver;

public class LoginPage extends LearnDriver {
	
	public ChromeDriver driver;
	
	public LoginPage(ChromeDriver driver) {
		this.driver =driver;
	}
	
	
	public LoginPage enterusername(String username) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		return this;
		
	}
	
	public LoginPage enterpassword(String password) {
		 driver.findElement(By.name("txtPassword")).sendKeys(password); 
		 
		 return this;
		
	}
	public DashboardPage clickbtn() {
		driver.findElement(By.name("Submit")).click();
		return new DashboardPage(driver);
		
	}
	
}