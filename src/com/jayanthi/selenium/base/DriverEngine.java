package com.jayanthi.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class DriverEngine {
	private static WebDriver driver;
	@Parameters("browser")
	@BeforeSuite
	public void openBrowser(@Optional("firefox")String browser)
	{
		switch(browser)
		{
		case "chrome":
			System.setProperty("webdriver.chromedriver.exe", "C:\\Program Files selenium\\chromedriver_win32\\chromedriver.exe");
			    driver=new ChromeDriver();
			    driver.manage().deleteAllCookies();
			   // driver.manage().window().maximize();
			    break;
		case "firefox":
			    System.setProperty("webdriver.geckodriver.exe","C:\\Program Files selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			    driver=new FirefoxDriver();
			    driver.manage().window().maximize();
			    break;
			    
		case "IE":
			   System.setProperty("webdriver.IEDriverServer.exe","C:\\Program Files selenium\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
			   driver=new InternetExplorerDriver();
			   driver.manage().window().maximize();
			   break;
	    default:
	    	  System.out.println("please select the driver");
		}
	}
		public  WebDriver getDriver()
		{
			return driver;
			   
		}
		

	}

