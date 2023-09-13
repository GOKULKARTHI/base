package org.pojoclasses;


import org.baseclass.UtilClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojoClass extends UtilClass{
	
	public FbLoginPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id="email")
	private WebElement txtuser;


@CacheLookup
@FindAll({
	@FindBy(id="pass"),
	@FindBy(name="pass"),
	@FindBy(xpath="//input[@type='password']")
})
private WebElement txtpass;
	
	
	public WebElement getTxtpass() {
	return txtpass;
}

	@CacheLookup
	@FindBy(xpath="//button[@name='logn']")
	private WebElement loginBTn;
	
	public WebElement getLoginBTn() {
		return loginBTn;
	}


	public WebElement getTxtuser() {
		return txtuser;
		
		
		
		
	}
	
	

	
	
}
