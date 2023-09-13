package org.pojoclasses;


import org.baseclass.UtilClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatAccountPojo extends UtilClass{
	
	public CreatAccountPojo() {
	PageFactory.initElements(driver, this);
	}
	
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="(//a[@role='button'])[]"),
		@FindBy(id="u_0_2_J")
	})
	private WebElement creataccount;

	@CacheLookup
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement signup;
	
	

	public WebElement getSignup() {
		return signup;
	}



	public WebElement getCreataccount() {
		return creataccount;
	}
	
	
	
	
	 
	
}
