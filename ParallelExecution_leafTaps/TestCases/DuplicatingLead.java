package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPages;
import ProjectSpecificMethods.SuperClass;

public class DuplicatingLead extends SuperClass{

	@Test
	public void DuplicatingLead() throws InterruptedException {
	new LoginPages(driver).enterUserNm().enterPass().clickLgn()
	.clickCrmsfLink().clickLeadLink().clickFindLeads().clickFirstLeadId()
	.clickDuplicateLeadBtn().clickCreateLeadBtn().verifyFirstNm();

	}
}
