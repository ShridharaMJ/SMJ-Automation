package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Basepage;

public class  RegisterPage extends Basepage {
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
//
//	@FindBy(id="menu-item-374")
//	private WebElement register;
//	
//	@FindBy(id="name_3_firstname")
//	private WebElement firstname;
//	
//	@FindBy(id="name_3_lastname")
//	private WebElement lastname;
//	
//	@FindBy(xpath="//input[@value='single']")
//	private WebElement mstatus;
//	
//	//input[@value='cricket ']
//	@FindBy(xpath="//input[@value='cricket ']")
//	private WebElement hobby;
//	
//	@FindBy(id="dropdown_7")
//	private WebElement 	country;
//	
//	@FindBy(id="mm_date_8")
//	private WebElement 	month;
//	
//	@FindBy(id="dd_date_8")
//	private WebElement 	date;
//	
//	@FindBy(id="yy_date_8")
//	private WebElement 	year;
//	
//	@FindBy(id="phone_9")
//	private WebElement phone;
//	
//	@FindBy(id="email_1")
//	private WebElement email;
//	
//	@FindBy(id="username")
//	private WebElement uname;
//	
//	@FindBy(id="profile_pic_10")
//	private WebElement fupload;
//	
//	@FindBy(id="description")
//	private WebElement about;
//	
//	@FindBy(id="password_2")
//	private WebElement pwd1;
//	
//	@FindBy(id="confirm_password_password_2")
//	private WebElement pwd2;
//	
//	@FindBy(xpath="//input[@value='Submit']")
//	private WebElement submit;
//	
//	public void reg()
//	{
//		register.click();
//	}
//	
//	public void details() throws Exception
//	{
//		firstname.sendKeys("shridhara");
//		lastname.sendKeys("mj");
//		mstatus.click();
//		hobby.click();
// 
//		org.openqa.selenium.support.ui.Select select=new org.openqa.selenium.support.ui.Select(country);
//		select.selectByVisibleText("India");
//		
//		Select select2=new Select(month);
//		select2.selectByIndex(3);
//		
//		Select select3=new Select(date);
//		select3.selectByIndex(24);
//		
//		Select select4=new Select(year);
//		select4.selectByVisibleText("1995");
//		
//		phone.sendKeys("9980098870");
//		uname.sendKeys("SMJ2504");
//		
//		email.sendKeys("shridharamj@gmail.com");
//		
//		fupload.sendKeys("C:/Users/RIL/Desktop/DSC_9G346");
//		about.sendKeys("NO comment");
//		
//		pwd1.sendKeys("Smj25041995*");
//		pwd2.sendKeys("Smj25041995*");
//		
//		submit.click();
		
	
	public void loc() throws Exception{
		
		WebElement ab = locators("webtest");
		System.out.println(ab);
	}
}

