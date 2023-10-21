package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase   {
	public WebDriverWait wait;
    public static WebDriver driver ;
	
	public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageBase.driver =driver;
      
    }
	 protected static void clickButton (By button) {
	     (driver.findElement( button)).click();
	    }

	    protected static void setTextElementText(By textElement, String value) {
	  
	    	(driver.findElement (textElement)).sendKeys(value);
	    }
}
