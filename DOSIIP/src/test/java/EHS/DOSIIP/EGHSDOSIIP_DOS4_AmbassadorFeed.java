package EHS.DOSIIP;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import EHS.DOSIIP_PageObject.EHSDOSIIP_WPAdmin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class EGHSDOSIIP_DOS4_AmbassadorFeed {

	WebDriver driver;
	EHSDOSIIP_WPAdmin OP;

	@Given("^the admin is in Country edit page$")
	public void the_admin_is_in_Country_edit_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faryan\\Desktop\\driver libraries\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		OP = new EHSDOSIIP_WPAdmin(driver);

		driver.get("https://live-ehsdosiip.pantheonsite.io/wp-admin/index.php");

		driver.manage().window().maximize();

		OP.getUserName().sendKeys("faryan");
		OP.getPassWord().sendKeys("Arash@2012");
		OP.getLoginSubmit().click();

		// Asserting Wp-Admin Page
		String currrentURL = driver.getCurrentUrl();
		String expactedURL = "https://live-ehsdosiip.pantheonsite.io/wp-admin/index.php";
		Assert.assertEquals(currrentURL, expactedURL);

	}

	@When("^the admin enter JSON Rest URL and Update$")
	public void the_admin_enter_JSON_Rest_URL_and_Update() throws Throwable {

//  Edit Country Page

		// Asserting Country Edit Page
		OP.getVerticalToolbarCountriesandAreas().click();
		OP.getBangladesh().click();
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://live-ehsdosiip.pantheonsite.io/wp-admin/post.php?post=20502&action=edit";
		Assert.assertEquals(currentURL, expectedURL);

		OP.getAmbassadorJsonRestAPIUrl().clear();
		OP.getAmbassadorJsonRestAPIUrl().sendKeys("https://bd.usembassy.gov/wp-json/wp/v2/pages/181");
		OP.getCountryUpdate().submit();

	}

	@Then("^the Country page in State\\.gov must have the Ambassador's Official Portrait,Name and Biography$")
	public void the_Country_page_in_State_gov_must_have_the_Ambassador_s_Official_Portrait_Name_and_Biography()
			throws Throwable {

		Thread.sleep(5000);

		OP.getCountryViewPost().click();

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		// driver.close();
		// driver.switchTo().window(tabs2.get(0));

		OP.getClearCache().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().refresh();

	
		 String CurrentURL = driver.getCurrentUrl(); 
		 String ExpectedURL ="https://live-ehsdosiip.pantheonsite.io/countries-areas/bangladesh/?message=pantheon-cleared-url-cache";
		 Assert.assertEquals(CurrentURL, ExpectedURL);
	
		// Asserting Ambassador Feed
		boolean CurrentAmbassador = OP.getAmbassadorName().isDisplayed();
		Assert.assertTrue("Ambassador Earl R. Miller", CurrentAmbassador);

		// Asserting Ambassador Page in usembassy.gov
		OP.getAmbassadorName().click();
		String currentURL = driver.getCurrentUrl();
		String expactedURL = "https://bd.usembassy.gov/our-relationship/our-ambassador/";
		Assert.assertEquals(currentURL, expactedURL);

		driver.quit();

	}

}
