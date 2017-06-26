package generic;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Basepage 
{ 
	
	public WebDriver driver;
	//Properties p=new Properties();;
 
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
	
	public Properties getValue() 
	
	{FileInputStream f1=null;
	
	try {
		f1=new FileInputStream(new File("./src/objective/Objective.properies"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties p= new Properties();
	try {
		p.load(f1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return p;
	}
		
	
	
  public WebElement locators(String ele) throws Exception{
	  
	  
	 ele=ele.trim();
	 
	  WebElement ele1 = null;
	  if(getValue().getProperty(ele).equalsIgnoreCase("id")){
		  ele1=driver.findElement(By.id(getValue().getProperty(ele).substring(3).trim()));
		 
	  }
	  else if (getValue().getProperty(ele).equalsIgnoreCase("classname")) {
			  
			
		}
		  return ele1;
	  }
	  
	
	  
  }


