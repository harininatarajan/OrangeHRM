package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnDriver;

public class DashboardPage extends LearnDriver {
	
	public ChromeDriver driver;
	
	public DashboardPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
/* public AdminPage clickAdminlink() {
	 
	 driver.findElementByLinkText("Admin").click();
	 return new AdminPage();
 }*/
 public Pimpage clickPIMlink()
 {
    driver.findElementByLinkText("PIM").click();
    return new Pimpage(driver); 
 }
}
