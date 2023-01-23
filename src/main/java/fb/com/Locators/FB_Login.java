package fb.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.Baseclass.Base_Class;

public class FB_Login extends Base_Class {

	@SuppressWarnings("static-access")
	public FB_Login(WebDriver xdriver) { // constructor
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "img[alt='Facebook']")
	private WebElement FB_logo;

	@FindBy(name = "email")
	private WebElement Username;

	@FindBy(name = "pass")
	private WebElement Password;

	@FindBy(name = "login")
	private WebElement Login_btn;

	@FindBy(linkText = "Create New Account")
	private WebElement CreateNewAccount;

	public WebElement getFB_logo() {
		return FB_logo;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin_btn() {
		return Login_btn;
	}

	public WebElement getCreateNewAccount() {
		return CreateNewAccount;
	}

}
