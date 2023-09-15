package in.preschool.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	private Actions actions;
	WebDriver wait;

	@FindBy(xpath = "(//span[contains(@class,'R12_61')])[2]")
	private WebElement preschool;
	
	@FindBy(xpath ="/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/ul/li[2]/a/span")
	private WebElement findpreschool;
	
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		actions = new Actions(driver);
		   
	}

public void hoverOverschool() {
		actions.moveToElement(preschool).build().perform();
		}

public void clickfindpreschool() {
	findpreschool.click();
}


	}




