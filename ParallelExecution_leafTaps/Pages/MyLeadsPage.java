package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ProjectSpecificMethods.BaseClass;
import ProjectSpecificMethods.SuperClass;

public class MyLeadsPage extends SuperClass {
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage clickCreatLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);

	}

}
