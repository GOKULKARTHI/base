package org.runnerfiles;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	
	public static void generateReport(String path) {

		File f= new File("src\\test\\resources\\report\\jvmreport\\finalreport.jvm");
		
		Configuration c= new Configuration(f, "Amazon&FB");
		
		c.addClassifications("OS", "Windows10");
		c.addClassifications("Tool","Selenium");
		
		
		List<String>l=new LinkedList<String>();
		l.add(path);
		
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();	
		
		
	}
}
