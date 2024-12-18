package test;

import org.testng.annotations.Test;

import soure.Homepage;
import soure.Loginpage;
import soure.Searchpage;


public class Testcase3_paymentpage extends Launchbrowser
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
		
		login.password();
		login.submit();
		Thread.sleep(3000);
		home.searching();
		
		Searchpage s1= new Searchpage(driver);
		s1.product();
		s1.add(driver);
	}

}
