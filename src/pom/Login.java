package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

@FindBy(id="email")
private WebElement ebox;
@FindBy(name="pass")
private WebElement pwdbox;
@FindBy(id="loginbutton")
private  WebElement Login;


	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
public void SetName(String n)
{
	ebox.sendKeys(n);
}

public void setPassword(String p)
{
	pwdbox.sendKeys(p);
}
public void clickLogin()
{
	Login.click();
}
}
