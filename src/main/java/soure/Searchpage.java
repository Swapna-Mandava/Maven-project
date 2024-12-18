package soure;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage 
{
	WebDriver driver;
	@FindBy(xpath="(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]") WebElement product1;
	//@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]") WebElement addtocart;
	@FindBy(id="add-to-cart-button") WebElement addtocart;
	@FindBy(xpath="//form[@id='sw-ptc-form']") WebElement proceed;
	
	public void product() {
		
		product1.click();
	}
	
public void add(WebDriver driver) throws InterruptedException {
	this.driver=driver;
	
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> i1=s1.iterator();
	String parentid=i1.next();
	String childid=i1.next();
	driver.switchTo().window(childid);
	Thread.sleep(3000);
	addtocart.click();
	proceed.click();

		
	    
	}
	
	
	public Searchpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

