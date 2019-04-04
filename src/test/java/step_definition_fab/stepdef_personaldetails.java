package step_definition_fab;

import com.fab.onboarding.base.ScreenBase_BDD;
import com.fab.onboarding.base.TestBase;
import com.fab.onboarding.pages.Personal_Details;

//import com.fab.onboarding.pages.Personal_Details;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepdef_personaldetails extends TestBase {

	Personal_Details personal;
	
	@When("^I click on checkbox$")
	public void i_click_on_checkbox() throws Throwable {
		personal = new Personal_Details(driver);
		personal.error_title();
	}

	@Then("^i click on fullname$")
	public void i_click_on_fullname() throws Throwable {
		personal.error_title1();
		personal.fullname();
	}

	@Then("^i click on next button$")
	public void i_click_on_next_button() throws Throwable {
	    
		personal.nexbutton();
	}

	
}


