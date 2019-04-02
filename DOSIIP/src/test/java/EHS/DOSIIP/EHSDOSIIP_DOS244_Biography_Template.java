package EHS.DOSIIP;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.Session;
import org.openqa.selenium.remote.server.handler.SubmitElement;
import org.testng.Assert;

import EHS.DOSIIP_PageObject.EHSDOSIIP_WPAdmin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EHSDOSIIP_DOS244_Biography_Template {
	
	WebDriver driver;
	EHSDOSIIP_WPAdmin OP;
	
@Given("^the user is \"([^\"]*)\" page having biography templete$")
public void the_user_is_page_having_biography_templete(String arg1) throws Throwable {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\faryan\\Desktop\\driver libraries\\chromedriver_win32\\chromedriver.exe");

	driver = new ChromeDriver();
	OP = new EHSDOSIIP_WPAdmin(driver);

	driver.get("https://live-ehsdosiip.pantheonsite.io/wp-admin/index.php");
	driver.manage().window().maximize();


	OP.getUserName().sendKeys("faryan");
	OP.getPassWord().sendKeys("Arash@2012");
	OP.getLoginSubmit().click();
	
	OP.getWPMenuPage().click();
	OP.getAddNewPage().click();
	
	String ExpactedPageURL = "https://live-ehsdosiip.pantheonsite.io/wp-admin/post-new.php?post_type=page";
	String ActualPageURL = driver.getCurrentUrl();
	Assert.assertEquals(ActualPageURL, ExpactedPageURL);
	
	
}

@When("^the user Insert Page Title in \"([^\"]*)\" edit box$")
public void the_user_Insert_Page_Title_in_edit_box(String arg1) throws Throwable {
	
	
    
}

@When("^insert Collection: Header Description edit box$")
public void insert_Collection_Header_Description_edit_box() throws Throwable {
   
}

@When("^select Breadcrumb from the dropown menu$")
public void select_Breadcrumb_from_the_dropown_menu() throws Throwable {
    
}

@When("^Select eleven personal from the Curated Biography list$")
public void select_eleven_personal_from_the_Curated_Biography_list() throws Throwable {
   
}

@When("^publish the page$")
public void publish_the_page() throws Throwable {
   
}

@When("^Click on \"([^\"]*)\" button for preview$")
public void click_on_button_for_preview(String arg1) throws Throwable {
  
}

@Then("^the biography page should have a Breadcrumb hyperlink$")
public void the_biography_page_should_have_a_Breadcrumb_hyperlink() throws Throwable {
 
}

@Then("^the page title$")
public void the_page_title() throws Throwable {
 
}

@Then("^the description$")
public void the_description() throws Throwable {
   
}

@Then("^ten personal selected$")
public void ten_personal_selected() throws Throwable {
   
}

@Then("^\"([^\"]*)\" hyperlink to navigate to next page$")
public void hyperlink_to_navigate_to_next_page(String arg1) throws Throwable {
   
}



}
