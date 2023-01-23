package fb.com.Stepdefination;

import org.junit.Assert;

import PageObjectManager.PageObjectManager;
import fb.com.Baseclass.Base_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step extends Base_Class {

	PageObjectManager obj = new PageObjectManager(driver);

	@Given("User Launch {string} Browser")
	public void user_launch_browser(String string) {
		browser_Launch(string);
	}

	@Given("User Naviagte Url {string}")
	public void user_naviagte_url(String string) {
		url(string);
	}

	@Given("User Verify Page land on login page")
	public void user_verify_page_land_on_login_page() {
		Assert.assertTrue(elementIsDisplayed(obj.getLoginPage().getFB_logo()));
	}

	@Given("User Enter Valid Username {string}")
	public void user_enter_valid_username(String string) {
		elementSendKeys(obj.getLoginPage().getUsername(), string);
	}

	@Given("User Enter Valid Password {string}")
	public void user_enter_valid_password(String string) {
		elementSendKeys(obj.getLoginPage().getPassword(), string);
	}

	@Given("User Click Login Button")
	public void user_click_login_button() {
		elementClick(obj.getLoginPage().getLogin_btn());
	}

	@Then("User Verify loged in Successfull")
	public void user_verify_loged_in_successfull() {

	}

}
