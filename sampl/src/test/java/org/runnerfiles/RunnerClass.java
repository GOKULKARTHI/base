package org.runnerfiles;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles",glue="org.stepdefinition",
snippets=SnippetType.CAMELCASE,dryRun=false,monochrome=true,strict=true,plugin= {"pretty",
		"html:src\\test\\resources\\report\\htmlreport",
		"json:src\\test\\resources\\report\\jsonreport\\amazonandfblogin.json",
		"junit:src\\test\\resources\\report\\junitreport\\login.xml",
		"rerun:src\\test\\resources\\files\\failed.txt"})
public class RunnerClass {

	@AfterClass
	public static void report() {
		JvmReport.generateReport("src\\test\\resources\\report\\jsonreport\\amazonandfblogin.json");
		
	}
	
	
	
}
