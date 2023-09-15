package in.preschool.teststeps;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import in.preschool.pages.LandingPage;
import in.preschool.pages.findingpage;
import in.preschool.pages.loginpage;
import in.preschool.pages.searchingpage;
import in.preschool.pages.verifyingtext;

public class Driver extends Tools{
	protected static LandingPage landingpage;
	protected static loginpage lp;
	protected static searchingpage sp;
	protected static findingpage fp;
	protected static verifyingtext vt;
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.firstcry.com/");
		
		   landingpage = new LandingPage(driver);
		    lp = new loginpage(driver);
		    sp = new searchingpage(driver);
		    fp =new findingpage(driver);
		   vt = new verifyingtext(driver);
	}
}
