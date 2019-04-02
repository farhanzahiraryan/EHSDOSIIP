package EHSDOSIIP_TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/EHS/DOSIIP/feature",
		glue = {"EHS.DOSIIP"},
		format 	= {"pretty", "html:target/Destination"},		
		tags = {"@InProgress"}
		
		
		
		)







public class EHSDOSIIP_RegressionTest {

}
