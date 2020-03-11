package test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.Login;

public class TestLogin {

	@Test 
	public void test1()
	{
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

	//	Then Add chrome switch to disable notification - "--disable-notifications"

		options.addArguments("--disable-notifications");

		//After that set path for driver exe

		System.setProperty("webdriver.chrome.driver","path/to/driver/exe");

	//	and then pass ChromeOptions instance to ChromeDriver Constructor

	//	WebDriver driver =new ChromeDriver(options);
		
		System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		Login l=new Login(driver);
		
		Homepage hp=new Homepage(driver);
		l.SetName("9620101314");
		l.setPassword("omsairam09*");
		l.clickLogin();
		
		hp.clicksrivasta();
		
		hp.clickcreatepost();
		
		hp.sendpost_msg("hello world");
		
		hp.clickpost();
	}

}
