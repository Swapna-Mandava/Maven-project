package firstpackage.maven.Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Fb 
{
	// Step 1
	@FindBy(id = "email")
	WebElement username;

	@FindBy(name = "pass")
	WebElement password;

	//@FindBy(xpath = "//button[@id='u_0_9_mF']")
	@FindBy(name = "login")
	
	WebElement loginbutton;

	// step 2
	public void un() 
	{
		username.sendKeys("khainat17@gmail.com");
	}

	public void pwd() {

		password.sendKeys("Swapna@2791");

	}

	public void login() {
		loginbutton.click();

	}
	
	public LoginPage_Fb(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
