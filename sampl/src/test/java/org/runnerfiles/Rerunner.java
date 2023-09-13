package org.runnerfiles;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\files\\failed.txt",glue="org.stepdefinition",plugin= {
		"json:src\\test\\resources\\report\\jsonreport\\failed.json",	
		"rerun:src\\test\\resources\\files\\failed.txt"})
public class Rerunner {

	@AfterClass
	public static void report() {
		JvmReport.generateReport("src\\test\\resources\\report\\jsonreport\\failed.json");
		
	}
	
}
