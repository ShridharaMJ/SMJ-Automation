package generic;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Basepage 
{ 
	
	public WebDriver driver;
 
	public Basepage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void verifyTitlle(String eTitle)
	{
		WebDriverWait wait =new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.titleIs(eTitle));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			}
	
	
		
	}
	


