package org.stepdefiniton;

import org.base.HelperClass;
import org.pojoclasses.FbLoginPojoClass;

import io.cucumber.java.en.When;

public class LoginPageStepDef extends HelperClass{
	
	
	@When("To user enter {string} and {string}")
	public void toUserEnterAnd(String user, String pass) {
	   url("https://www.facebook.com/");
	   FbLoginPojoClass f=new FbLoginPojoClass();
	   textPass(f.getTxtuser(),user );
	   textPass(f.getTxtpass(), pass);
	}

	@When("To user Click loginbutton")
	public void toUserClickLoginbutton() {
		FbLoginPojoClass f=new FbLoginPojoClass();
		btnClick(f.getLoginBTn());
		System.out.println("Ravi-1");
	}
	
	//System.out.println(1st Update);

}
