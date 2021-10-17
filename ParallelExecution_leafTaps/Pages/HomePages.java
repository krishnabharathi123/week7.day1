package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ProjectSpecificMethods.BaseClass;
import ProjectSpecificMethods.SuperClass;

public class HomePages extends SuperClass{
	
	public HomePages(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage clickCrmsfLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}
