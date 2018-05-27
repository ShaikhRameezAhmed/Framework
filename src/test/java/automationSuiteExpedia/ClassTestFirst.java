package automationSuiteExpedia;

import org.openqa.selenium.WebDriver;
import TestDataBank.TestDataValue;
import driverFactory.WebDriverFactory;
import driverFactory.WebDriverUtils;

public class ClassTestFirst {
    static WebDriver wb;
    static WebDriverUtils<WebDriver> webdriver = new WebDriverFactory();
    public static void main(String[] args) {
		
	wb = webdriver.loadFireFoxDriver();
	wb.get("https://stackoverflow.com/questions/5354068/shortcut-how-to-get-eclipse-to-go-to-the-only-implementation-of-an-interfaces");
	System.out.println(TestDataValue.GETNA);
	System.out.println(TestDataValue.CHARITY_NAME);
    }


}
