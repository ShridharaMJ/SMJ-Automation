package pom;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class loginFromExcel {

	


	@FindBy(xpath="//div[@class='header_user_info']")
	private WebElement log;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pwd;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement submit;
	
	
	public void clickOnSignin()
	{

		//log.click();
	}
	
	public void sendUN(String un)
	{
		email.sendKeys(un);
	}
	
	public void sendPWD(String pw)
	{
		pwd.sendKeys(pw);
	}
	
	public void clickOnSubmit()
	{
		submit.click();
	}
}
