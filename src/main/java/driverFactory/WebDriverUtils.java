package driverFactory;

import org.openqa.selenium.WebDriver;

public interface WebDriverUtils<T> {
   
    /**
     * 
     * @param wb {load Firefox webdriver using the interface}
     * add the capabilities (if applicable) in the implemented method
     * @return Webdriver or any object as per requirement 
     */
    abstract T loadFireFoxDriver();
    
    
    /**
     * 
     * @param wb{load internet Explorer webdriver using the interface},
     * add the capabilities (if applicable) in the implemented method
     * @return
     */
    abstract T loadIEDriver();
    
    /**
     * 
     * @param wb
     * @return
     */
    abstract T loadChromeDriver();
    
    
    /**
     * 
     * @param wb
     * @return
     */
    abstract T loadEdgeDriver();
}
