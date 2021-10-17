package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ProjectSpecificMethods.SuperClass;

public class DuplicateLeadPage extends SuperClass{
	
	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ViewLeadPage clickCreateLeadBtn() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
