package org.stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.baseclass.UtilClass;
import org.locters.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.pojoclasses.FbLoginPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends UtilClass {

	@Given("To user launch chrome browser")
	public void to_user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}

	@When("To user pass url")
	public void to_user_pass_url() {
		url("https://www.facebook.com/");
		maxi();
	}

	@When("To user pass {string} and {string}")
	public void toUserPassAnd(String user, String pass) {
		FbLoginPojoClass f = new FbLoginPojoClass();
		textPass(f.getTxtuser(), user);
		textPass(f.getTxtpass(), pass);

	}

	@Then("To user click continue button")
	public void toUserClickContinueButton() {
		FbLoginPojoClass f = new FbLoginPojoClass();
		elementClick(f.getLoginBTn());
	}
	
	@When("To user pass invaild username and invalid password")
	public void toUserPassInvaildUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
		//1D Map  withHeader
		Map<String, String> a = d.asMap(String.class, String.class);
		String username = a.get("username-1");
		String password = a.get("password-2");
		FbLoginPojoClass f = new FbLoginPojoClass();
		textPass(f.getTxtuser(), username);
		textPass(f.getTxtpass(), password);
	}
	@When("To user pass valid username and valid password")
	public void toUserPassValidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {
		//2D Map  withHeader
	   List<Map<String, String>> a = d.asMaps();
	   	String username = a.get(2).get("email");
	   	String password = a.get(0).get("password");
		FbLoginPojoClass f = new FbLoginPojoClass();
		textPass(f.getTxtuser(), username);
		textPass(f.getTxtpass(), password);
	}


	@Given("To user enter url")
	public void toUserEnterUrl() {
	 url("https://www.amazon.in/");
	}

	@When("To user enter valid emaild")
	public void toUserEnterValidEmaild() {
	  driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.id("ap_email")).sendKeys("greenstechnology@gmail.com");
	}

	@Then("To click continue butttton")
	public void toClickContinueButttton() {
		driver.findElement(By.id("continue")).click();

	}
}
