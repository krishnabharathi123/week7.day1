package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ProjectSpecificMethods.BaseClass;
import ProjectSpecificMethods.SuperClass;

public class MyHomePage extends SuperClass{

	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadsPage clickLeadLink() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
}
