package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Base {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@href='https://clinic.fitplush.com/']")
	WebElement Home;
	
	@FindBy(xpath="//a[@href='https://clinic.fitplush.com/hospitals']") 
	WebElement ForHospitals;
	
	@FindBy(xpath="//a[@href='https://clinic.fitplush.com/blogs']") 
	WebElement Blogs;
	
	@FindBy(xpath="//a[@href='https://clinic.fitplush.com/subscription']") 
	WebElement Pricing;
	
	@FindBy(xpath="//a[@href='https://www.clinicapp.fitplush.com/auth/signin']") 
	WebElement ClinicLogin;
	
	public void clickHome() {
		Home.click();
	}
	
	public void clickHospitals() {
		ForHospitals.click();
	}
	public void clickBlogs() {
		Blogs.click();
	}
	public void clickPricing() {
		Pricing.click();
	}
	public void clickLogin() {
		ClinicLogin.click();
	}

}

