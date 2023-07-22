package org.stepdefiniton;

import org.base.HelperClass;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateNewAccount extends HelperClass{

@Given("To launch chrome browser and url")
public void toLaunchChromeBrowserAndUrl() {
	launchChromeBrowser();
	url("https://www.facebook.com/");
    
}

@When("To user Click create new account and fill only firstname")
public void toUserClickCreateNewAccountAndFillOnlyFirstname() {
	implictwait();
    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    driver.findElement(By.name("firstname")).sendKeys("greens");
}

@When("To user click signup button")
public void toUserClickSignupButton() {
    driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
}
}
