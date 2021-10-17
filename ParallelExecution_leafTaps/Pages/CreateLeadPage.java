package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ProjectSpecificMethods.BaseClass;
import ProjectSpecificMethods.SuperClass;

public class CreateLeadPage extends SuperClass {

	
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage enterCompanyNm() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}

	public CreateLeadPage enterFirstNm() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;

	}

	public CreateLeadPage enterLastNm() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;

	}
	public ViewLeadPage clickSubmitBttn() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
