package EHS.DOSIIP;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import EHS.DOSIIP_PageObject.EHSDOSIIP_WPAdmin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EHSDOSIIP_DOS38_StateByState_ByTheNumber {
	
	WebDriver driver;
	EHSDOSIIP_WPAdmin OP;

	@Given("^a admin is in a state edit page$")
	public void a_admin_is_in_a_state_edit_page() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faryan\\Desktop\\driver libraries\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		OP = new EHSDOSIIP_WPAdmin(driver);

		driver.get("https://live-ehsdosiip.pantheonsite.io/wp-admin/index.php");

		driver.manage().window().maximize();

		OP.getUserName().sendKeys("faryan");
		OP.getPassWord().sendKeys("Arash@2012");
		OP.getLoginSubmit().click();
		
		OP.getVerticalToolbarStates().click();
		OP.getFlorida().click();
		
		String CurrentURL = driver.getCurrentUrl();
		String ExpectedURL = "https://live-ehsdosiip.pantheonsite.io/wp-admin/post.php?post=21219&action=edit";
		Assert.assertEquals(CurrentURL, ExpectedURL);

	}

	@When("^the admin insert Number and Label for Number into Numbers section$")
	public void the_admin_insert_Number_and_Label_for_Number_into_Numbers_section() throws Throwable {
	    
		OP.getByTheNumbersSectionTitle().clear();
		OP.getByTheNumbersSectionTitle().sendKeys("By The Numbers");
		OP.getByTheNumberAddRow().click();
		OP.getBytheNumberInsertNumberRow1().clear();
		OP.getBytheNumberInsertNumberRow1().sendKeys("253,468");
		OP.getByTheNumberLabelForNumberRow1().clear();
		OP.getByTheNumberLabelForNumberRow1().sendKeys("Population of Florida");
		OP.getBytheNumberInsertNumberRow2().clear();
	
		 OP.getBytheNumberInsertNumberRow2().sendKeys("57,002");
		 OP.getByTheNumberLabelForNumberRow2().clear();
		 OP.getByTheNumberLabelForNumberRow2().sendKeys("Adult");
		 OP.getBytheNumberInsertNumberRow3().clear();
		 OP.getBytheNumberInsertNumberRow3().sendKeys("12,455");
		 OP.getByTheNumberLabelForNumberRow3().clear();
		 OP.getByTheNumberLabelForNumberRow3().sendKeys("Infant");
		 
			
	}

	@When("^update the State$")
	public void update_the_State() throws Throwable {
		
		OP.getStateUpdate().submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}


	@Then("^the Number and Label for Number shall display in the state\\.gov page$")
	public void the_Number_and_Label_for_Number_shall_display_in_the_state_gov_page() throws Throwable {
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("View Post")).sendKeys(selectLinkOpeninNewTab);
				
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		OP.getClearCache().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().refresh();
		
		//Asserting State Name 
		String CurrentStateName= OP.getStatePageStateName().getText();
		String ExpectedStateName= "Florida";
		Assert.assertEquals(CurrentStateName, ExpectedStateName);
		
		//Asserting Number
		String CurrentNumber1 = OP.getStatePageNumber1().getText();
		String ExpectedNumber1 = "253,468";
		Assert.assertEquals(CurrentNumber1, ExpectedNumber1);
		
		String CurrentNumber2 = OP.getStatePageNumber2().getText();
		String ExpectedNumber2 = "57,002";
		Assert.assertEquals(CurrentNumber2, ExpectedNumber2);
		
		String CurrentNumber3 = OP.getStatePageNumber3().getText();
		String ExpectedNumber3 = "12,455";
		Assert.assertEquals(CurrentNumber3, ExpectedNumber3);
		
		//Asserting Label for Number
		String CurrentLabelforNumber1 = OP.getStatePageLabelforNumber1().getText();
		String ExpectedLabelforNumber1 = "Population of Florida";
		Assert.assertEquals(CurrentLabelforNumber1, ExpectedLabelforNumber1);
		
		String CurrentLabelforNumber2 = OP.getStatePageLabelforNumber2().getText();
		String ExpectedLabelforNumber2 = "Adult";
		Assert.assertEquals(CurrentLabelforNumber2, ExpectedLabelforNumber2);
		
		String CurrentLabelforNumber3 = OP.getStatePageLabelforNumber3().getText();
		String ExpectedLabelforNumber3 = "Infant";
		Assert.assertEquals(CurrentLabelforNumber3, ExpectedLabelforNumber3);
	
		
		driver.quit();
	}

		

}
			


	
