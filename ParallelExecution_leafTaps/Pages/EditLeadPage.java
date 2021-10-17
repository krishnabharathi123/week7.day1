package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ProjectSpecificMethods.SuperClass;

public class EditLeadPage extends SuperClass{
	
	public EditLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public EditLeadPage clearCompNameTextBx() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}
	public EditLeadPage enterCompName(String compNm) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compNm);
		this.compNm=compNm;
		return this;
	}
	public ViewLeadPage clickUpdateBtn() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
