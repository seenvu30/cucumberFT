package org.runnerclasses;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
		
	public static void generateReport(String path) {
		
		//Mention file location 
		File f= new File(System.getProperty("user.dir")+"\\reports\\JVMReport");
		//details

		Configuration c= new Configuration(f, "FaceBook Report");
		
		c.addClassifications("OS", "Window-10");
		c.addClassifications("Function", "Loginpage");
		c.addClassifications("Tool", "Selenium");
		
		List<String> l=new ArrayList<String>();
		l.add(path);
		
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();

		
	}
	
			
}
