package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPages;
import ProjectSpecificMethods.SuperClass;

public class CreatingNewLead extends SuperClass{

	@Test
	public void creatLead() {
		new LoginPages(driver)
		.enterUserNm()
		.enterPass()
		.clickLgn()
		.clickCrmsfLink()
		.clickLeadLink()
		.clickCreatLead()
		.enterCompanyNm()
		.enterFirstNm()
		.enterLastNm()
		.clickSubmitBttn()
		.verifyFirstNm();
	}
}
