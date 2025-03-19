package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public Logger logger;
	public Properties p;
	public static WebDriver driver;
	@BeforeClass
	public void setup(String br) throws IOException
	{
		//loading properties file
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		switch(br)
		{
		case "firefox":WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		case "chrome":WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();break;
		case "edge":WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();break;
		
		}
		logger=LogManager.getLogger(this.getClass());
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		
	}
}
