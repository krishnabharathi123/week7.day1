package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ProjectSpecificMethods.BaseClass;
import ProjectSpecificMethods.SuperClass;

public class LoginPages extends SuperClass{

	public LoginPages(ChromeDriver driver) {
		this.driver=driver;
		System.out.println(driver);
	}
	public LoginPages enterUserNm() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return new LoginPages(driver);
		//return this;

	}
	public LoginPages enterPass() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	public HomePages clickLgn() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePages(driver);
	}
}
