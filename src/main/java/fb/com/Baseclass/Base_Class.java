package fb.com.Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;

	public static void browser_Launch(String browser) { // WebDriver driver declared to class variable

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				// System.setProperty("webdriver.chrome.driver",
				// ".\\src\\test\\resources\\chrome_driver\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", " ");
				driver = new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			// window_maximize(); // window_maximize method used in this browser_Launch
		} catch (Exception e) {
			System.out.println("browser not launched:" + e.getMessage());
		}

	}

	public static void window_maximize() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("unable to window_maximize:" + e.getMessage());
		}
	}

	public static void url(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println("url not launched:" + e.getMessage());
		}
	}

	public static void elementSendKeys(WebElement element, String value) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(30)); // Explicit wait used
			wb.until(ExpectedConditions.visibilityOfAllElements(element));
			if (elementIsDisplayed(element) && elementisEnabled(element)) {
				elementClear(element);
				element.sendKeys(value);
			} else {
				System.err.println("Unable to pass SendKeys");
			}
		} catch (Exception e) {
			System.out.println("unable to pass SendKeys:" + e.getMessage());
		}
	}

	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Element not displayed:" + e.getMessage());
		}
		return displayed;
	}

	public static boolean elementisEnabled(WebElement element) {
		boolean enabled = false;
		try {
			enabled = element.isEnabled();
		} catch (Exception e) {
			System.out.println("Element is not Enabled:" + e.getMessage());
		}
		return enabled;
	}

	public static void elementClear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			System.out.println("Element not cleared:" + e.getMessage());
		}
	}

	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Element not clicked:" + e.getMessage());
		}
	}

//	public static String get_Text(WebElement element) { // WebElement element declared to class variable
//		String text = null;
//		try {
//			text = element.getText();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return text; // text return String. so, void replaced to String
//	}

	public static void gettext(WebElement element) {
		try {
			String text = element.getText();
			System.out.println(text);
		} catch (Exception e) {
			System.out.println("text" + e.getMessage());
		}
	}

}
