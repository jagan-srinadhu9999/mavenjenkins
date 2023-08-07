package executetest.mavenjenkin;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchActi {

	@Test
	public void launchBrowser()
	{
		
		//manage() method will do[ An interface for managing stuff you would do in a browser menu ]
String title="actiTIME - Login";
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, title);
		driver.close();
	}
}
