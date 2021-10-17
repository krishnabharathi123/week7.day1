package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPages;
import ProjectSpecificMethods.SuperClass;

public class EditingLead extends SuperClass{

	@Test
	public void editingLead() throws InterruptedException {
		new LoginPages(driver)
		.enterUserNm()
		.enterPass()
		.clickLgn()
		.clickCrmsfLink()
		.clickLeadLink()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhNo()
		.clickFindLeadsBtn()
		.clickFirstLeadId()
		.clickEditBtn()
		.clearCompNameTextBx()
		.enterCompName("Testleaf1")
		.clickUpdateBtn()
		.verifyCompName();

	}

}
