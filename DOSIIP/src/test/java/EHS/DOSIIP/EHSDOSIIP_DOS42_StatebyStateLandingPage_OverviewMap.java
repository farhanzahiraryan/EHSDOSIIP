package EHS.DOSIIP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import EHS.DOSIIP_PageObject.EHSDOSIIP_WPAdmin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EHSDOSIIP_DOS42_StatebyStateLandingPage_OverviewMap {
	
	WebDriver driver;
	EHSDOSIIP_WPAdmin OP;
	
	@Given("^the user is in state\\.gov$")
	public void the_user_is_in_state_gov() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faryan\\Desktop\\driver libraries\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		OP = new EHSDOSIIP_WPAdmin(driver);

		driver.get("https://live-ehsdosiip.pantheonsite.io/state-department-by-state/");
		driver.manage().window().maximize();
	   
	}

	@When("^the user is in United State Impact Overview page$")
	public void the_user_is_in_United_State_Impact_Overview_page() throws Throwable {
		
		String ActualURL = driver.getCurrentUrl();
		String ExpactedURL = "https://live-ehsdosiip.pantheonsite.io/state-department-by-state/";
		Assert.assertEquals(ActualURL, ExpactedURL);
	  
	}

	@Then("^the user shall be able to see the United State Impact Overview header$")
	public void the_user_shall_be_able_to_see_the_United_State_Impact_Overview_header() throws Throwable {
		
		
		 String ActualUSHeader = OP.getStateImpactOverviewUSHeader().getText();     
		 String ExpactedUSHeader = "United States Impact Overview";
		 Assert.assertEquals(ActualUSHeader, ExpactedUSHeader);
		
	}

	@Then("^the Select a State for State-Specific Impact title$")
	public void the_Select_a_State_for_State_Specific_Impact_title() throws Throwable {
		
		String ActualHeader = OP.getStateImpactOverviewSpecificImpact().getText();
		String ExpactedHeader = "SELECT A STATE FOR STATE-SPECIFIC IMPACT";
		Assert.assertEquals(ActualHeader, ExpactedHeader);
	  
	}

	@Then("^the Plain Text Version hyperlink$")
	public void the_Plain_Text_Version_hyperlink() throws Throwable {
		
		String ActualHyperlink = OP.getStateImpactOverviewPlainTextVersion().getText();
		String ExpactedHyperlink = "PLAIN TEXT VERSION";
		Assert.assertEquals(ActualHyperlink, ExpactedHyperlink);
				   
	}
	
	@When("^the user click on the Plain Text Version Hyperlink$")
	public void the_user_click_on_the_Plain_Text_Version_Hyperlink() throws Throwable {
	   
		OP.getStateImpactOverviewPlainTextVersion().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.close();
	}

	@Then("^the impact overview map shall disappear$")
	public void the_impact_overview_map_shall_disappear() throws Throwable {
	   
	
		
	}

	@Then("^the View Impact by State list shall appear$")
	public void the_View_Impact_by_State_list_shall_appear() throws Throwable {
	   
	}

	@Then("^the Interactive Map version hyperlink shall replace Plain Text Version hyperlink$")
	public void the_Interactive_Map_version_hyperlink_shall_replace_Plain_Text_Version_hyperlink() throws Throwable {
	    
	}

	@When("^the user click on Interactive Map Version hyperlink$")
	public void the_user_click_on_Interactive_Map_Version_hyperlink() throws Throwable {
	    
	}

	@Then("^the View Impact By State list shall disappear$")
	public void the_View_Impact_By_State_list_shall_disappear() throws Throwable {
	    
	}

	@Then("^the Impact Overviw map shall reappear$")
	public void the_Impact_Overviw_map_shall_reappear() throws Throwable {
	   
	}

	@When("^the user hover over the mouse to California in the map$")
	public void the_user_hover_over_the_mouse_to_California_in_the_map() throws Throwable {
	  
	}

	@Then("^the user shall be able to see the tooltip having the full State name$")
	public void the_user_shall_be_able_to_see_the_tooltip_having_the_full_State_name() throws Throwable {
	  
	}



}
