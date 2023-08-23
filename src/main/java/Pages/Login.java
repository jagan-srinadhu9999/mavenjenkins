package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy (css="input[type='password']")
	WebElement password;
	
	@FindBy (css="a[id='loginButton']")
	WebElement signinbtn;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
}
