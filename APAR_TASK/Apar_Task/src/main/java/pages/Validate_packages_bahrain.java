package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.PageBase;

public class Validate_packages_bahrain  extends PageBase{

	public Validate_packages_bahrain(WebDriver driver) {
		super(driver);
		
	}
	
	Common_Validations commonvalidation=new Common_Validations(driver);
	By bahrain =By.id("bh");
	
	public void choosebahrain()
	{
		clickButton((commonvalidation.countryname));
		clickButton(bahrain);	
	}
	
	public void validate_bahrainpackageprice()
	{
		 Assert.assertTrue(driver.findElement(commonvalidation.lightcurrency).getText().contains("2"));
		 Assert.assertTrue(driver.findElement(commonvalidation.majotcurrency).getText().contains("3"));
		 Assert.assertTrue(driver.findElement(commonvalidation.perimumcurrency).getText().contains("6"));	
	}
	
	public void validate_bahrainCurrency()
	{
		 Assert.assertTrue(driver.findElement(commonvalidation.lightcurrency).getText().contains("دينار بحريني"));
		 Assert.assertTrue(driver.findElement(commonvalidation.majotcurrency).getText().contains("دينار بحريني"));
		 Assert.assertTrue(driver.findElement(commonvalidation.perimumcurrency).getText().contains("دينار بحريني"));

		
	}

}
