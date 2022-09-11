package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonFile) {
		// location of jvm report
		File loc = new File(System.getProperty(("user.dir")+ "src\\test\\resources\\Reports"));
		
		// Configuration
		Configuration con = new Configuration(loc, "Facebook Automation");
		
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "100");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Testing", "Regression");
		
		// List
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonFile);
		
		// Generate the report
		ReportBuilder builder = new ReportBuilder(jsonfiles, con);
		builder.generateReports();

	}

}
