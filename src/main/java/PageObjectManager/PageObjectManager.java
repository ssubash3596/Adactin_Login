package PageObjectManager;

import org.openqa.selenium.WebDriver;

import fb.com.Baseclass.Base_Class;
import fb.com.Locators.Adactin_Login;
import fb.com.Locators.FB_Login;

public class PageObjectManager extends Base_Class {

	@SuppressWarnings("static-access")
	public PageObjectManager(WebDriver xdriver) {
		this.driver = xdriver;
	}

	private FB_Login LoginPage;

	public FB_Login getLoginPage() {
		if (LoginPage == null) {
			LoginPage = new FB_Login(driver);
		}
		return LoginPage;
	}
	
	private Adactin_Login Login_Page;

	public Adactin_Login getAdactin_Login() {
		if (Login_Page==null) {
			Login_Page= new Adactin_Login(driver);
		}
		return Login_Page;
	}

}
