package Test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import Pages.Login;

public class LoginTest extends TestBase{
	@Test
	public void init() throws Exception{
	Login lo=PageFactory.initElements(driver, Login.class);
	DataDrivenTest lo1=PageFactory.initElements(driver, DataDrivenTest.class);

	 lo.setEmail(lo1.Read());
	 lo.setPassword("anjana123");
	 lo.clickOnLoginButton();
	 String abc=driver.getTitle();
	 
	}
	 

}
