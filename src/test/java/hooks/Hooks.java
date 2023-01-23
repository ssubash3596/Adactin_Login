package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import fb.com.Baseclass.Base_Class;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base_Class {

	@Before
	public void BeforeHooks() {
		System.out.println("Am before Hooks");
	}

	@After
	public void AfterHooks(Scenario scenario) {
//		if (scenario.isFailed()) {  //failed scenario is for only faild cases 
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "screenshot");
//		}
		driver.close();
	}

}
