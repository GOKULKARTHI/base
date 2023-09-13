package org.locters;

import org.baseclass.UtilClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends UtilClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({
		@FindBy(id="nav-link-accountList"),
		@FindBy(xpath="//a[@data-nav-ref='nav_ya_signi']")
	})private WebElement accountBtn;
	
	
	@FindAll({
		@FindBy(xpath="//input[@type='email']"),
		@FindBy(id="ap_email")
	})private WebElement searchBox;
	
	@FindAll({
	
		@FindBy(id="continue")
	})private WebElement continueBtn;

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public WebElement getAccountBtn() {
		return accountBtn;
	}



	public WebElement getSearchBox() {
		return searchBox;
	}

	

	
	
	
}
