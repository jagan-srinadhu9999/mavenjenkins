package executetest.mavenjenkin;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchActi {

	
	@Parameters("Browser")
	@Test
	public void launchBrowser(String browserName)
	{
		
		//manage() method will do[ An interface for managing stuff you would do in a browser menu ]
String title="actiTIME - Login";
  // ChromeOptions opt=new ChromeOptions();
    WebDriver driver=null;
    if(browserName.equalsIgnoreCase("chrome"))
    {
		/*
		 * opt.addArguments("--remote-allow-origins=*"); // opt.setBinary(
		 * "C:\\Users\\HP\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		 */		 driver=new ChromeDriver();
    }
    else if(browserName.equalsIgnoreCase("gechko"))
    {
    	 driver=new FirefoxDriver();
    }
    else if(browserName.equalsIgnoreCase("edge"))
    {
    	 driver=new EdgeDriver();
    }
    else {
    	driver=new ChromeDriver();
    }
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, title);
		driver.close();
	}
}
