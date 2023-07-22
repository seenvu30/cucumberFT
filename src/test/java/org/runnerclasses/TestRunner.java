package org.runnerclasses;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Featurefiles",
glue="org.stepdefiniton",
					snippets=SnippetType.CAMELCASE,monochrome=true,strict=true,          
					dryRun=false,plugin= {
					"json:src\\test\\resources\\reports\\json\\login.json",
					"rerun:src\\test\\resources\\rerunfiles\\failed.txt"})

public class TestRunner {
	
	@AfterClass
	public static void report() {
		JvmReport.generateReport("src\\test\\resources\\reports\\json\\login.json");
	}

}
