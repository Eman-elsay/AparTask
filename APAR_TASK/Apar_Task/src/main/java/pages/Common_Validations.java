package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.PageBase;

public class Common_Validations  extends PageBase{

	public Common_Validations(WebDriver driver) {
		super(driver);
		
	}

	
	protected By  countryname =By.id("country-name");
	By phone_num =By.id("email-mobile");
	protected By availble_packages =By.id("sub_form");
	By firsttype =By.id("name-لايت");
	By Secondtype =By.id("name-الأساسية");
	By thirdtype =By.id("name-بريميوم");
	protected By lightcurrency =By.id("currency-لايت");
	protected By majotcurrency =By.id("currency-الأساسية");
	protected By perimumcurrency =By.id("currency-بريميوم");
	
	public void FreeTrial( String Phone)
	{
		setTextElementText((phone_num), Phone);
		clickButton((availble_packages));
	}

	public void validate_packageType()
	{
		Assert.assertEquals(driver.findElement(firsttype).getText(),"لايت");
		Assert.assertEquals(driver.findElement(Secondtype).getText(),"الأساسية");
		Assert.assertEquals(driver.findElement(thirdtype).getText(),"بريميوم");

	}

}
