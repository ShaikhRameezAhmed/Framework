package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import Utils.Configuration;

public class WebDriverFactory implements WebDriverUtils<WebDriver>{
    static WebDriver wb;
    Configuration config = new Configuration();
    @Override
    public WebDriver loadFireFoxDriver() {
	System.setProperty("webdriver.gecko.driver", config.getFireFoxPath());
	wb = new FirefoxDriver();
	return wb;
    }

    @Override
    public WebDriver loadIEDriver() {
	return null;
    }

    @Override
    public WebDriver loadChromeDriver() {
	return null;
    }

    @Override
    public WebDriver loadEdgeDriver() {
	return null;
    }

    

}
