package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

public class Configuration {
    private static final String EXECUTABLE_NOT_FOUND = "The driver executable or Config data not found or mentioned in src/test/Configuration";
    Properties pro;

    public Configuration() {
	try {
	    File src = new File("src/test/resources/Configuration/Config.property");
	    FileInputStream fis = new FileInputStream(src);
	    pro = new Properties();
	    pro.load(fis);
	} catch (Exception e) {
	    System.out.println("Exception====" + e.getMessage());
	}
    }

    public String getChromePath() {

	return getDataFromConfig("ChromeDriver");
    }

    public String getIEPath() {
	return getDataFromConfig("IEDriver");

    }

    public String getEdgePath() {

	return getDataFromConfig("EdgeDriver");
    }

    public String getFireFoxPath() {
	return getDataFromConfig("GeckoPath");
    }

    public String getApplicationUrl() {

	return getDataFromConfig("URL");

    }

    public String getExcelPath() {
	return getDataFromConfig("ExcelPath");

    }

    public String LogFile() {
	return getDataFromConfig("Log");

    }

    public String SnapShotPath() {
	return getDataFromConfig("ScreenShot");

    }

    public String GenerateReport() {
	return getDataFromConfig("ReportPath");

    }

    private String getDataFromConfig(String configName) {
	String path = null;
	if (Objects.nonNull(pro.getProperty(configName))) {
	    path = pro.getProperty(configName);
	} else {
	    System.out.println(EXECUTABLE_NOT_FOUND);
	    System.exit(1);
	}
	return path;
    }
}
