package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath="(//span[.='Srivatsa'])[2]")
	private WebElement srivasta;
	@FindBy(xpath="(//span[.='Create post'])[4]")
	private WebElement createpost;
	@FindBy(xpath="(//div[@class='_1mf _1mj'])[1]")
	private  WebElement post_msg;
	
	@FindBy(xpath="//span[.='Post']")
	private  WebElement post;

	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
public void clicksrivasta()
{
	srivasta.click();
}

public void clickcreatepost()
{
	createpost.click();
}
public void sendpost_msg(String msg)
{
	post_msg.sendKeys(msg);
}

public void clickpost()
{
	post.click();
}

}
