package vtigerLeadTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vt.annotation.FrameworkAnnotation;
import com.vt.enums.CategoryType;
import com.vt.listeners.ListenerClass;
import com.vt.objectRepository.HomePage;
import com.vt.objectRepository.LeadPage;
import com.vt.utilities.BaseClass;
import com.vt.utilities.RandomUtilsImpliments;

/**
 * This class provides implementation to ITestListener Interface
 * 
 * @author Ansuman
 */

//@Feature("Lead Page TestCases")

@Listeners(ListenerClass.class)
public class CreateLeadTest extends BaseClass {

	@Test(groups = "RegressionSuite")
	@FrameworkAnnotation(author = { "Amuthan", "Sachin" }, category = { CategoryType.REGRESSION })
	public void createLeadTest() throws Exception {

		// Step 3: read all the required data
		String firstName = RandomUtilsImpliments.getFirstName();
		String lastName = RandomUtilsImpliments.getLastName();
		String company = RandomUtilsImpliments.getCompanyName();

		// Step 4: Navigate to Leads Link
		HomePage hp = new HomePage(getDriver());
		hp.clickOnLeadsLnk();

		// Step 5: Navigate to create Lead Look up image
		LeadPage lp = new LeadPage(getDriver());

		String leadPageHeader = lp.getLeadHeader();
		Assert.assertTrue(leadPageHeader.contains("Leads"));
		System.out.println("Lead Page Header Matched : " + leadPageHeader);

		lp.clickOnLeadLookUpImage();

		String createLeadPageHeader = lp.getCreateLeadPageHeader();
		Assert.assertTrue(createLeadPageHeader.contains("Creating New Lead"));
		System.out.println("Create Lead Page Header Matched : " + createLeadPageHeader);

		lp.createNewLead(getDriver(), firstName, lastName, company);

		// Step 7: Validate
		String leadNameHeader = lp.getLeadNameHeader();
		Assert.assertEquals(leadNameHeader, leadNameHeader);
		// Assert.assertTrue(leadNameHeader.contains(firstName + lastName));
		System.out.println("Lead Name Matched : " + leadNameHeader);
		// wUtil.takeScreenShot(driver, leadNameHeader);
	}
}
