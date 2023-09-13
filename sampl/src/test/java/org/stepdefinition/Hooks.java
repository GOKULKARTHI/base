package org.stepdefinition;

import org.baseclass.UtilClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends UtilClass {

	@Before(order=1)
	public void tc1() {
		System.out.println("Before-1");
	}

	@Before(order=2)
	public void tc2() {
		System.out.println("Before-2");

	}

	@Before(order=3)
	public void tc3() {
		System.out.println("Before-3");
		datetime();
	}
	
	@After(order=3)
	public void tc4(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot t= (TakesScreenshot)driver;
			byte[] src = t.getScreenshotAs(OutputType.BYTES);
			s.embed(src, "image/png");
		
		}
		
		

	}
	@After(order=2)
	public void tc5() {
		System.out.println("After-2");
	}

	@After(order=1)
	public void tc6() {
		System.out.println("After-3");
		datetime();
	}


}
