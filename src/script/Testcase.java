package script;

import generic.BaseTest;
import pom.RegisterPage;

public class Testcase extends BaseTest {
	@org.testng.annotations.Test
	public void test() throws Exception
	{
		RegisterPage mj=new RegisterPage(driver);
		mj.loc();
		
		
	}

}
