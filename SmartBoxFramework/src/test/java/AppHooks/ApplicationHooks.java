package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	// this is like base class for TestNG
	// hooks responsiblity to launch broiwser

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {

		configReader = new ConfigReader();
		prop = configReader.initProp();

	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.initDriver(browserName);
	}
	
	@After (order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After (order = 1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			//take screenshot
		String screenshotName	= scenario.getName().replaceAll(" ", "_");
		byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	
         //nie rozpoznaje attach()		
//		scenario.attach(sourcePath, "img/png",screenshotName);
		
		}
		
	}
}