package org.stepdefiniton;

import org.base.HelperClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends HelperClass {
	
	
	@Before()
	public void before1() {
		System.out.println("Before-3");
	}
	
	
	@After()
	public void after1(Scenario s) {
		
		if(s.isFailed()) {
		TakesScreenshot t=(TakesScreenshot)driver;
		byte[] ss = t.getScreenshotAs(OutputType.BYTES);
		s.embed(ss, "image/png");
	}
	}
	
	
	
	
}
