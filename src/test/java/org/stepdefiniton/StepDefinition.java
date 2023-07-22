package org.stepdefiniton;

import java.util.List;
import java.util.Map;

import org.base.HelperClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclasses.FbLoginPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends HelperClass{

	@Given("To user launch chrome browser")
	public void toUserLaunchChromeBrowser() {
	   launchChromeBrowser();
	   maxi();
	}

	@Given("To user pass valid url")
	public void toUserPassValidUrl() {
		url("https://www.facebook.com/");
	}

	@When("To user pass valid username and invalid password")
	public void toUserPassValidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
		//1D Map
		Map<String, String> a = d.asMap(String.class, String.class);
		
		String username = a.get("email");
		String pass = a.get("password");
		
		FbLoginPojoClass f= new FbLoginPojoClass();
		textPass(f.getTxtuser(), username);
		textPass(f.getTxtpass(), pass);
	}

	@When("To user click login button")
	public void toUserClickLoginButton() {
		FbLoginPojoClass f= new FbLoginPojoClass();
		btnClick(f.getLoginBTn());
	}

	@Then("To user verify valid")
	public void toUserVerifyValid() {
		
		WebElement output = driver.findElement(By.xpath("//a[contains(text(),'Find')]"));
		String text = output.getText();		
		Assert.assertTrue(text.contains("log in"));
	}
	@Given("To user enter valid url")
	public void toUserEnterValidUrl() {
		url("https://www.facebook.com/");
	}

	@When("To user pass invalid username and invalid password")
	public void toUserPassInvalidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
	   //2D Map
		List<Map<String, String>> a = d.asMaps(String.class, String.class);
		
		Map<String, String> m = a.get(2);
		String password = m.get("password");
		
		Map<String, String> m1 = a.get(1);
		String username = m1.get("email");
		
		FbLoginPojoClass f= new FbLoginPojoClass();
		textPass(f.getTxtuser(), username);
		textPass(f.getTxtpass(), password);
	}

	@Then("To user Close chrome browser")
	public void toUserCloseChromeBrowser() {
	    
	}

	
	
}