package fb.com.Stepdefination;

import org.junit.Assert;
import PageObjectManager.PageObjectManager;
import fb.com.Baseclass.Base_Class;
import io.cucumber.java.en.Given;

public class Adactin_Step extends Base_Class {

	PageObjectManager obj = new PageObjectManager(driver);

	@Given("user Launch {string} Browser")
	public void User_launch_browser(String string) {
		browser_Launch(string);
	}

	@Given("User naviagte Url {string}")
	public void user_naviagte_url(String string) {
		url(string);
	}

	@Given("User Verify page land on login page")
	public void user_verify_page_land_on_login_page() {
		Assert.assertTrue(elementIsDisplayed(obj.getAdactin_Login().getAdactin_Logo()));
	}

	@Given("User Enter Login Details {string} and {string}")
	public void user_enter_login_details_and(String string, String string2) {
		elementSendKeys(obj.getAdactin_Login().getUsername(), string);
		elementSendKeys(obj.getAdactin_Login().getPassword(), string2);
	}

// @Given("User Enter UserName {string}")
//	public void user_enter_user_name(String string) {
//		elementSendKeys(obj.getAdactin_Login().getUsername(), string);
//	}
//
//	@Given("User Enter PassWord {string}")
//	public void user_enter_pass_word(String string) {
//		elementSendKeys(obj.getAdactin_Login().getPassword(), string);
//	}

	@Given("User click login button")
	public void user_click_login_button() {
		elementClick(obj.getAdactin_Login().getLogin_btn());
	}

	@Given("User Verify Error message {string}")
	public void user_verify_error_message(String string) {
		Assert.assertEquals(string, obj.getAdactin_Login().getError_message().getText());
	}
}
