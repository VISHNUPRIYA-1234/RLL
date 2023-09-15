package in.preschool.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	WebDriverWait wait;
	@FindBy(xpath = "(//span[contains(@class, 'anch poplogin_main poplogin R12_61')])")
	private WebElement login;

	@FindBy(id = "lemail")
	private WebElement emailtext;
	
	@FindBy(xpath = "(//div[contains(@class ,'B14_white comm-btn btn-login-continue btn-login-cont-otp')])")
	private WebElement continuebtn;
	
	
@FindBy(id ="verfiedbtn")
private WebElement submitbtn;
	

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		
		
	}
	public void clicklogin() {
		login.click();
	}

	public void clickemail(String email) {
		emailtext.sendKeys(email);
	}
	
	public void clickcontinue() {
		continuebtn.click();
	}
	
		 
public void clicksubmit() {		
    submitbtn.click();
	}
}
