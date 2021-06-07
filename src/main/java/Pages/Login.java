package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Login {

	WebDriver driver;
	public Login(WebDriver driver) {
		
	
		this.driver=driver;
	}
	
    @FindBy(id="email") WebElement Email;
    @FindBy(id="pass") WebElement password;
    @FindBy(id="loginbutton") WebElement loginbutton;
    
    public void setEmail(String strEmail){
    	Email.sendKeys(strEmail);
    }
    
    public void setPassword(String strPassword){
    	password.sendKeys(strPassword);
    }
    
	public void clickOnLoginButton(){
		loginbutton.click();
	}

    
}
