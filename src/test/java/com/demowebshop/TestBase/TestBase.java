package com.demowebshop.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputFilter.Config;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.Utilities.Util;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class TestBase {
	
	public WebDriver driver;
	public Properties prop, dataprop;
	public FileInputStream ip1, ip2;
	
	public TestBase() throws Exception {
		prop = new Properties(); 
		ip1 = new FileInputStream("src/test/java/com/demowebshop/Config/configData.properties");
		prop.load(ip1);
		
		dataprop = new Properties();
		ip2 = new FileInputStream("src/test/java/com/demowebshop/TestData/testData.properties");
		dataprop.load(ip2);
	}
	
	public WebDriver initializeBrowserAndOpenApplication(String browserName) {
		if(browserName.equals("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
			driver = new ChromeDriver(options);
			driver.get("https://demowebshop.tricentis.com/");
			
		}else if(browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}else if(browserName.equals("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			
		}else if(browserName.equals("Safari")) {
			driver = new SafariDriver();
			driver.manage().window().maximize();
		}else {
			System.out.println("Browser is NOT matching!");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Util.PAGELOAD_TIMEOUT));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Util.SCRIPT_TIMEOUT));
		return driver;
	}
	
	
	
}
