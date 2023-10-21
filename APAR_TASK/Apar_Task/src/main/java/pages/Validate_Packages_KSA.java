package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.PageBase;

public class Validate_Packages_KSA  extends PageBase{

	public Validate_Packages_KSA(WebDriver driver) {

		super(driver);
		
	}
	
	Common_Validations commonvalidation=new Common_Validations(driver);
	By KSA =By.id("sa");
	public void chooseKsa()
	{
		clickButton((commonvalidation.countryname));
		clickButton(KSA);	
	}
	
	public void validate_KSApackageprice()
	{
		 Assert.assertTrue(driver.findElement(commonvalidation.lightcurrency).getText().contains("15"));
		 Assert.assertTrue(driver.findElement(commonvalidation.majotcurrency).getText().contains("25"));
		 Assert.assertTrue(driver.findElement(commonvalidation.perimumcurrency).getText().contains("60"));	
	}
	
	public void validate_KSACurrency()
	{
		 Assert.assertTrue(driver.findElement(commonvalidation.lightcurrency).getText().contains("ريال سعودي"));
		 Assert.assertTrue(driver.findElement(commonvalidation.majotcurrency).getText().contains("ريال سعودي"));
		 Assert.assertTrue(driver.findElement(commonvalidation.perimumcurrency).getText().contains("ريال سعودي"));

		
	}


}
