package test;

import org.testng.annotations.Test;

import soure.Homepage;
import soure.Loginpage;



public class Testcase2 extends Launchbrowser
{

	
	@Test

	public void login() throws InterruptedException {

		

		Homepage home = new Homepage(driver);

		home.accountandlists_hoverhover(driver);
		Thread.sleep(2000);
		home.signin_method();
		Loginpage login = new Loginpage(driver);
		login.email();
		login.continue_but();
		Thread.sleep(2000);
		login.password();
		login.submit();
		home.searching();
}
}
