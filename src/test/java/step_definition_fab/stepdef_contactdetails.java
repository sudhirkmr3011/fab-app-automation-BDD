package step_definition_fab;

import com.fab.onboarding.base.TestBase;
import com.fab.onboarding.pages.Contacts_Page;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef_contactdetails extends TestBase{

	Contacts_Page contacts;
	
	@Then("^i click city$")
	public void i_click_city() throws Throwable {
	    contacts=new Contacts_Page(driver);
	    contacts.city();
	}

	
}
