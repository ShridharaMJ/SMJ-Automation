package script;

import generic.BaseTest;
import pom.RegisterPage;

public class Testcase extends BaseTest {
	@org.testng.annotations.Test
	public void test()
	{
		RegisterPage mj=new RegisterPage(driver);
		mj.reg();
		mj.details();
		
	}

}
