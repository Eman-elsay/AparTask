package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.PageBase;

public class Validate_Packages_Kuwait  extends PageBase{

	public Validate_Packages_Kuwait(WebDriver driver) {

		super(driver);
	}
	
	Common_Validations commonvalidation=new Common_Validations(driver);
	By Kuwait =By.id("kw");

	public void chooseKuwait()
	{
		clickButton((commonvalidation.countryname));
		clickButton(Kuwait);	
	}
	
	public void validate_Kuwaitpackageprice()
	{
		 Assert.assertTrue(driver.findElement(commonvalidation.lightcurrency).getText().contains("1.2"));
		 Assert.assertTrue(driver.findElement(commonvalidation.majotcurrency).getText().contains("2.5"));
		 Assert.assertTrue(driver.findElement(commonvalidation.perimumcurrency).getText().contains("4.8"));	
	}
	
	public void validate_KuwaitCurrency()
	{
		 Assert.assertTrue(driver.findElement(commonvalidation.lightcurrency).getText().contains("دينار كويتي"));
		 Assert.assertTrue(driver.findElement(commonvalidation.majotcurrency).getText().contains("دينار كويتي"));
		 Assert.assertTrue(driver.findElement(commonvalidation.perimumcurrency).getText().contains("دينار كويتي"));

		
	}


}
