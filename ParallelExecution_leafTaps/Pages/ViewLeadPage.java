package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import ProjectSpecificMethods.BaseClass;
import ProjectSpecificMethods.SuperClass;

public class ViewLeadPage extends SuperClass{

	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public void verifyFirstNm() {
		String firstName=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals("Hari", firstName);
	}
	public void verifyCompName() {
		String companyName=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(companyName.contains(compNm)) {
			System.out.println("company name edited");
		}
		else {
			System.out.println("company name not edited");
		}
	}
	public EditLeadPage clickEditBtn() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	public DuplicateLeadPage clickDuplicateLeadBtn() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);

	}
}
