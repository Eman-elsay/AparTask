package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;


import base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.Common_Validations;
import pages.Validate_Packages_KSA;
import pages.Validate_Packages_Kuwait;
import pages.Validate_packages_bahrain;

public class Validate_Packages extends TestBase{
	Validate_Packages_KSA Validate_Packages_KSA ;
	Validate_Packages_Kuwait Validate_Packages_Kuwait;
	Validate_packages_bahrain  Validate_packages_bahrain ;
	Common_Validations Common_Validations;
	Faker FakerData= new Faker();
	String Mobile_Num= FakerData.number().digits(8).toString();


	@Test(priority = 1)
	@Description("Validate Packages(type -prcice- currency) in KSA")
	@Severity(SeverityLevel.NORMAL)
	public void validate_Packages_KSA()
	{
		Common_Validations = new Common_Validations(driver);
		Validate_Packages_KSA= new Validate_Packages_KSA(driver) ;
		Validate_Packages_KSA.chooseKsa();
		Common_Validations.FreeTrial(Mobile_Num);
		Common_Validations.validate_packageType();
		Validate_Packages_KSA.validate_KSApackageprice();
		Validate_Packages_KSA.validate_KSACurrency();
	}

	@Test(priority = 2)
	@Description("Validate Packages(type -prcice- currency) in KUwait")
	@Severity(SeverityLevel.NORMAL)
	public void validate_Packages_Kuwait()
	{
		Common_Validations = new Common_Validations(driver);
		Validate_Packages_Kuwait= new Validate_Packages_Kuwait(driver) ;
		Validate_Packages_Kuwait.chooseKuwait();
		Common_Validations.FreeTrial(Mobile_Num);
		Common_Validations.validate_packageType();
		Validate_Packages_Kuwait.validate_Kuwaitpackageprice();
		Validate_Packages_Kuwait.validate_KuwaitCurrency();
	}

	@Test(priority = 3)
	@Description("Validate Packages(type -prcice- currency) in Bahrain")
	@Severity(SeverityLevel.NORMAL)
	public void validate_Packages_Bahrain()
	{
		Common_Validations = new Common_Validations(driver);
		Validate_packages_bahrain= new Validate_packages_bahrain(driver) ;
		Validate_packages_bahrain.choosebahrain();
		Common_Validations.FreeTrial(Mobile_Num);
		Common_Validations.validate_packageType();
		Validate_packages_bahrain.validate_bahrainpackageprice();
		Validate_packages_bahrain.validate_bahrainCurrency();;
	}

}
