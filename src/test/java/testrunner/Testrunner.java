package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features=".//features",
           glue="stepdefinition",
		   monochrome=true,tags="@second",
		   plugin= {
				   "pretty","html:Reports/myreports.html",
				  
				   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				   }

		)
public class Testrunner {
	
	

}
