package fb.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {

	private WebDriver driver;

	public Adactin_Login(WebDriver xdriver) { // constructor
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "img[alt='AdactIn Group']")
	private WebElement Adactin_Logo;

	@FindBy(name = "username")
	private WebElement Username;

	@FindBy(name = "password")
	private WebElement Password;

	@FindBy(name = "login")
	private WebElement Login_btn;

	@FindBy(css = "[class='auth_error']")
	private WebElement error_message;

	public WebElement getError_message() {
		return error_message;
	}

	public WebElement getAdactin_Logo() {
		return Adactin_Logo;
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

}
