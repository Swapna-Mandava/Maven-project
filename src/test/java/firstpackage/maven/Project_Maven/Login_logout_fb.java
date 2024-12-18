package firstpackage.maven.Project_Maven;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Login_logout_fb {
	@Test
	public void login() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		LoginPage_Fb loginpage = new LoginPage_Fb(driver);
		loginpage.un();
		loginpage.pwd();
		loginpage.login();

	}
}
