package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import dataprovider.Configfilereader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	 public WebDriver driver=null;
	 Configfilereader a=PageFactory.initElements(driver, Configfilereader.class);
     @BeforeSuite
	public void initialize() throws InterruptedException
	{
		
	   //System.setProperty("webdriver.gecko.driver", a.getDriverPath());
	   WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
	   Thread.sleep(3000);
	   driver.get(a.getApplicationUrl());
	}

 	

}
