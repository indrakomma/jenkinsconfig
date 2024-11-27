package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	
	
	@Given("go to url and launch")
	public void go_to_url_and_launch() {
	
		System.out.println("printing: navigated to login page");
		
		
	}

	@When("login with valid cred")
	public void login_with_valid_cred() {
	    
		System.out.println("printing:entered username and password");
		
	}

	@Then("navigated to home page")
	public void navigated_to_home_page() {
	   
		System.out.println("printing:navigate to home page");
		
	}

	

}
