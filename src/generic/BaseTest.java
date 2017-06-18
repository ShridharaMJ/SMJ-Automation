package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst
{
public WebDriver driver;
@BeforeMethod
public void openApplication()
{
System.setProperty(Chome_Key, Chrome_Value);
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize() ;

driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
}
@AfterMethod
public  void closeApplication()
{
	//driver.quit();
	}
}
